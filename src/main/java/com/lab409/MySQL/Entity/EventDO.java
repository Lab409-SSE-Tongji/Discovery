package com.lab409.MySQL.Entity;

import com.lab409.Domain.EventDomain;

import java.sql.Timestamp;

/**
 * @author xianganying
 * @version v0.1 2017/5/19.
 */
public class EventDO {
    private Integer event_id;
    private Double position_x;
    private Double position_y;
    private String pic_path;
    private String content;
    private Integer student_id;
    private Timestamp time;

    public EventDO(Integer event_id, Double position_x, Double position_y, String pic_path, String content, Integer student_id, Timestamp time) {
        this.event_id = event_id;
        this.position_x = position_x;
        this.position_y = position_y;
        this.pic_path = pic_path;
        this.content = content;
        this.student_id = student_id;
        this.time = time;
    }

    public EventDO(EventDomain eventDomain) {
        this.position_x = eventDomain.getPositionX();
        this.position_y = eventDomain.getPositionY();
        this.content = eventDomain.getContent();
        this.student_id = eventDomain.getStudentId();
    }

    public EventDO() {
    }

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public Double getPosition_x() {
        return position_x;
    }

    public void setPosition_x(Double position_x) {
        this.position_x = position_x;
    }

    public Double getPosition_y() {
        return position_y;
    }

    public void setPosition_y(Double position_y) {
        this.position_y = position_y;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
