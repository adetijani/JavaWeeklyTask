package com.example.week6_task.Models;

import java.util.Date;

public class Comment {
    private int commentId;
    private String content;
    private Date timeStamp;

    //contructor

    public Comment(int commentId, String content, Date timeStamp) {
        this.commentId = commentId;
        this.content = content;
        this.timeStamp = timeStamp;
    }

    //Getters and Setters

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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
}
