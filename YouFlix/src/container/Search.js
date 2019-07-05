import React, { Component } from "react";
import axios from "axios";
import ContentList from "../component/contentList/ContentList";

export default class Search extends Component {
  state = {
    contents: [],
    keyword: ""
  };

  handleInputChange = e => {
    this.setState({ keyword: e.target.value });
  };

  handleSubmit = e => {
    this.fetchSearch(this.state.keyword);
    e.preventDefault();
  };

  setContents = data => {
    let list = [];
    data.items.forEach(item => {
      if (item.id.videoId) {
        list.push({ id: item.id.videoId, name: item.snippet.title });
      }
    });
    return list;
  };

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

      this.setState({ contents: this.setContents(data) });
    } catch (e) {
      console.log(e);
    } finally {
      console.log("end");
    }
  }

  render() {
    const { keyword } = this.state;
    return (
      <div>
        <form onSubmit={this.handleSubmit}>
          <label>검색 </label>
          <input
            type="text"
            onChange={this.handleInputChange}
            value={keyword}
          />
        </form>
        <ContentList contents={this.state.contents} />
      </div>
    );
  }
}