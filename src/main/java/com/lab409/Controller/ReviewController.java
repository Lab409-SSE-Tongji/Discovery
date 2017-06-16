package com.lab409.Controller;

import com.lab409.Domain.ReviewDomain;
import com.lab409.Domain.BaseResult;
import com.lab409.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */
@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @RequestMapping(value = "/review", method = RequestMethod.POST)
    public BaseResult<Object> postReview(@RequestBody ReviewDomain reviewDomain) {
        return reviewService.postReview(reviewDomain);
    }

    @RequestMapping(value = "/review", method = RequestMethod.GET)
    public BaseResult<Object> getReviewByEventId(@RequestParam("eventId") int eventId) {
        return reviewService.getReviewByEventId(eventId);
    }
}
