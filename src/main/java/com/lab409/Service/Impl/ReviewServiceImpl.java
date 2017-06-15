package com.lab409.Service.Impl;

import com.lab409.Domain.BaseResult;
import com.lab409.Domain.ReviewDomain;
import com.lab409.MySQL.Entity.ReviewDO;
import com.lab409.MySQL.Mapper.ReviewMapper;
import com.lab409.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */

@Service

public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewMapper reviewMapper;

    public BaseResult<Object> postReview(ReviewDomain reviewDomain) {
        reviewMapper.insertReview(new ReviewDO(reviewDomain));
        return new BaseResult<>();
    }
    public BaseResult<Object> getReviewByEventId(Integer eventId) {
        ReviewDO[] reviewDOS = reviewMapper.getReviewByEventId(eventId);
        ReviewDomain[] reviewDomains = new ReviewDomain[reviewDOS.length];
        if (reviewDOS.length != 0){
            for (int i = 0; i < reviewDomains.length; i++){
                reviewDomains[i] = new ReviewDomain(reviewDOS[i]);
            }
            return new BaseResult<> (reviewDomains);
        }
        return new BaseResult<>(500, "No reviews found");
    }

}
