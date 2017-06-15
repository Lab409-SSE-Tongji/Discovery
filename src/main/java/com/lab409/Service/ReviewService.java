package com.lab409.Service;

import com.lab409.Domain.BaseResult;
import com.lab409.Domain.ReviewDomain;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
public interface ReviewService {
    /**
     * 新建评论
     * @param reviewDomain
     * @return
     */
    BaseResult<Object> postReview(ReviewDomain reviewDomain);

    /**
     * 根据事件id获取所有评论
     * @param eventId
     * @return
     */
    BaseResult<Object> getReviewByEventId(Integer eventId);
}
