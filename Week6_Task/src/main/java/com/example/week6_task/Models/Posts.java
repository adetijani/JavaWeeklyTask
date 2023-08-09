package com.example.week6_task.Models;

import java.util.Date;

public class Posts {
    private int userId;
    private int postId;
    private String content;
    private Date timeStamp;
    private int likes;
    private String comments;

    //Contructor

    public Posts() {
    }

    public Posts(int userId, int postId, String content, Date timeStamp, int likes, String comments) {
        this.userId = userId;
        this.postId = postId;
        this.content = content;
        this.timeStamp = timeStamp;
        this.likes = likes;
        this.comments = comments;
    }

    public Posts(int userId, String content) {
        this.userId = userId;
        this.content = content;
    }
    //Getter and Setter


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
