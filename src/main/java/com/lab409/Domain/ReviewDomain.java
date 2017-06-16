package com.lab409.Domain;

import com.lab409.MySQL.Entity.ReviewDO;
/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
public class ReviewDomain {
    private Integer reviewId;
    private Integer eventId;
    private Integer eventreviewId;
    private Integer userId;
    private String content;

    public ReviewDomain(Integer reviewId, Integer eventId, Integer eventreviewId, Integer userId, String content) {
        this.reviewId = reviewId;
        this.eventId = eventId;
        this.eventreviewId = eventreviewId;
        this.userId = userId;
        this.content = content;
    }

    public ReviewDomain(Integer eventId, Integer userId, String content) {
        this.eventId = eventId;
        this.userId = userId;
        this.content = content;
    }

    public ReviewDomain(ReviewDO reviewDO) {
        this.reviewId = reviewDO.getReview_id();
        this.userId = reviewDO.getUser_id();
        this.content = reviewDO.getContent();
    }

    public ReviewDomain() {
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getEventreviewId() {
        return eventreviewId;
    }

    public void setEventreviewId(Integer eventreviewId) {
        this.eventreviewId = eventreviewId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}