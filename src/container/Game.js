import React, { Component } from 'react';
import './MainView.css';
import ConetntList from "../component/contentList/ContentList.js";
import axios from 'axios';

export class Game extends Component  {

  state = {
    contents : []
  }

//컴포넌트 렌더링이 완료된 후 유튜브에서 데이터 불러옴
  componentDidMount() {
	//   this.fetchYoutube();
	  this.fetchSearch('games');
  }

  setContents = (data) => {
    let list = [];
    data.items.forEach((item) => {
      if (item.id.videoId) {
        list.push({ id: item.id.videoId, name: item.snippet.title });
      }
	});

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
			실행할 영상 리스트를 출력하는 컴포넌트
      	*/}
       	<ConetntList contents={this.state.contents}  />
      </div>
    );
  }
}

export default Game;
