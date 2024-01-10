package com.frxxz.bean;

public class ScheduleBean {
    private int id;
    private String schedule;
    private String detail;
    private String dateTime;
    private String status;

    public ScheduleBean() {
    }

    public ScheduleBean(String schedule, String detail, String dateTime) {
        this.schedule = schedule;
        this.detail = detail;
        this.dateTime = dateTime;
    }

    public ScheduleBean(int id, String schedule, String detail, String dateTime, String status) {
        this.id = id;
        this.schedule = schedule;
        this.detail = detail;
        this.dateTime = dateTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "ScheduleBean{" +
                "id=" + id +
                ", schedule='" + schedule + '\'' +
                ", detail='" + detail + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
