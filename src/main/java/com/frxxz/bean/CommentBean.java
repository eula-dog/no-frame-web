package com.frxxz.bean;

public class CommentBean {

    private int id;
    private String comment;
    private int type;
    private String time;
    private int questionId;

    public CommentBean() {
    }

    public CommentBean(String comment, String time) {
        this.comment = comment;
        this.time = time;
    }

    public CommentBean(int id, String comment, int type, String time, int questionId) {
        this.id = id;
        this.comment = comment;
        this.type = type;
        this.time = time;
        this.questionId = questionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    @Override
    public String toString() {
        return "CommentBean{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", type=" + type +
                ", time='" + time + '\'' +
                ", questionId=" + questionId +
                '}';
    }
}
