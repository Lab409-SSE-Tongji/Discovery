package com.lab409.Domain;


import com.lab409.MySQL.Entity.EventDO;

/**
 * @author ad
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
    private String type;
    private String title;
    private String file;

    public EventDomain(Double positionX, Double positionY, String content, Integer studentId, String type, String title, String picPath, String file) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.content = content;
        this.studentId = studentId;
        this.type = type;
        this.picPath = picPath;
        this.title = title;
        this.file = file;
    }

    public EventDomain(EventDO eventDO, String file, String createTime) {
        this.eventId = eventDO.getEvent_id();
        this.positionX = eventDO.getPosition_x();
        this.positionY = eventDO.getPosition_y();
        this.content = eventDO.getContent();
        this.studentId = eventDO.getStudent_id();
        this.file = file;
        this.time = createTime;
        this.type = eventDO.getType();
        this.title = eventDO.getTitle();
    }

    public EventDomain(EventDO eventDO, String createTime) {
        this.eventId = eventDO.getEvent_id();
        this.positionX = eventDO.getPosition_x();
        this.positionY = eventDO.getPosition_y();
        this.content = eventDO.getContent();
        this.studentId = eventDO.getStudent_id();
        this.time = createTime;
        this.type = eventDO.getType();
        this.title = eventDO.getTitle();
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

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}