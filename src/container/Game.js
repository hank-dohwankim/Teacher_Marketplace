import React, { Component } from 'react';
import './MainView.css';
import ConetntList from "../component/contentList/ContentList.js";
import FullContent from '../component/fullcontent/FullContent.js';
import axios from 'axios';

export class Game extends Component  {
	constructor(props) {
	  super(props);
	  
      this.state = {
      	fullContent: {},// 메인화면에 가장 큰 영상 플레이어 콘텐츠를 가지는 state
	  	contents : [] // 하단의 리스트에 들어갈 콘텐츠를 가지는 state
	  };

	}

//컴포넌트 렌더링이 완료된 후 유튜브에서 데이터 불러옴
  componentDidMount() {
	//   this.fetchYoutube();
	  this.fetchSearch('games');
  }

//메인화면에서 영상을 실행하는 플레이어를 제어하는 함수
//이 함수를 이용해서 영상을 변경 한다.
  handleFullContentChange = (content) => {
    this.setState({
      fullContent:content
    })
  }

//유튜브에 ajax 통신을 해서 데이터를 불러 오는 함수
  fetchYoutube = () => {
  	//axios를 이용해서 유튜브에 영상 목록을 달라고 요청
    axios.get('https://www.googleapis.com/youtube/v3/videos?part=snippet&chart=mostPopular&key=AIzaSyC-v1sIG2Wn3YnoD_7_bBS4zPDceDLKmLY&maxResults=21')
    .then(({data}) => {//유튜브로 부터 요청한 데이터를 전달 받으면 then으로 데이터를 받음
    					//디스트럭쳐링을 통해서 유튜브로부터 받은 데이터중에서 data만 가져옴 

	    const list = this.setContents(data)//받아온 데이터를 내가 원하는 형태로 가공

	    this.setState({// 가공한 데이터로 지금 바로 실행할 데이터와, 목록에 보여줄 데이터를 state에 저장
	        contents:list.slice(1,list.length),//slice 함수는 배열형 데이터를 첫번째인자부터 두번째인자 전까지를 반환해주는 함수 입니다.
	        fullContent:list[0]//가져온 데이터중 첫번째 데이터를 화면에서 실행 시킵니다.
	    })
    })
  } 


  setContents = (data) => {
    let list = [];
    data.items.forEach((item) => {
      if (item.id.videoId) {
        list.push({ id: item.id.videoId, name: item.snippet.title });
      }
	});
	
	// console.log(list);
	this.setState({
		fullContent:list[0]
	})
    return list;
  };

  //function for showing the result by the search key

  async fetchSearch(keyword) {
    let maxResults = 30;
    let token = "AIzaSyC-v1sIG2Wn3YnoD_7_bBS4zPDceDLKmLY";

    try {
      const { data } = await axios.get(
        "https://www.googleapis.com/youtube/v3/search?q=" +
          keyword +
          "&part=snippet&key=" +
          token +
          "&maxResults=" +
          maxResults
      );

	  this.setState({ 
			contents: this.setContents(data),			
		});
    } catch {
      console.log('');
    } finally {
      console.log("end");
    }
  }


  render() {
    return (
      <div className="Game">
      	{/*
			영상을 실행 시키는 컴포넌트 
      	*/}
      	<FullContent content={this.state.fullContent}/>
      	{/*
			실행할 영상 리스트를 출력하는 컴포넌트
      	*/}
       	<ConetntList contents={this.state.contents} onClick={this.handleFullContentChange} />
      </div>
    );
  }
}

export default Game;
