package com.lab409.Domain;


import com.lab409.MySQL.Entity.EventDO;

/**
 * @author xianganying
 * @version v0.1 2017/5/19.
 */
public class EventDomain {
    private Integer eventId;
    private Double positionX;
    private Double positionY;
    private String picPath;
    private String content;
    private Integer studentId;
    private String time;

    public EventDomain(Double positionX, Double positionY, String content, Integer studentId) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.content = content;
        this.studentId = studentId;
    }
    public EventDomain(EventDO eventDO, String createTime) {
        this.eventId = eventDO.getEvent_id();
        this.positionX = eventDO.getPosition_x();
        this.positionY = eventDO.getPosition_y();
        this.content = eventDO.getContent();
        this.studentId = eventDO.getStudent_id();
        this.time = createTime;
    }

    public EventDomain() {
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Double getPositionX() {
        return positionX;
    }

    public void setPositionX(Double positionX) {
        this.positionX = positionX;
    }

    public Double getPositionY() {
        return positionY;
    }

    public void setPositionY(Double positionY) {
        this.positionY = positionY;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}