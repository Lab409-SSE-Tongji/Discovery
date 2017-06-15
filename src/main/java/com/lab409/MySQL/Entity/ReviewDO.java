package com.lab409.MySQL.Entity;

import com.lab409.Domain.AccountDomain;
import com.lab409.Domain.ReviewDomain;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
public class ReviewDO {
    private Integer review_id;
    private Integer event_id;
    private Integer eventreview_id;
    private Integer user_id;
    private String content;

    public ReviewDO() {
    }

    public ReviewDO(Integer review_id, Integer event_id, Integer eventreview_id, Integer user_id, String content) {
        this.review_id = review_id;
        this.event_id = event_id;
        this.eventreview_id = eventreview_id;
        this.user_id = user_id;
        this.content = content;
    }
    public ReviewDO(ReviewDomain reviewDomain) {
        this.event_id = reviewDomain.getEventId();
        this.user_id = reviewDomain.getUserId();
        this.content = reviewDomain.getContent();
    }

    public Integer getReview_id() {
        return review_id;
    }

    public void setReview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public Integer getEventreview_id() {
        return eventreview_id;
    }

    public void setEventreview_id(Integer eventreview_id) {
        this.eventreview_id = eventreview_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
