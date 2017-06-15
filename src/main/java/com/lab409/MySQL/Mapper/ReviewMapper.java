package com.lab409.MySQL.Mapper;

import com.lab409.MySQL.Entity.ReviewDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ad
 * @version v0.1 2017/6/15.
 */

@Mapper
public interface ReviewMapper {
    /**
     * 插入评论
     * @param reviewDO
     * @return
     */
    @Insert("INSERT INTO review(event_id, user_id, content) " +
            "VALUES(#{event_id}, #{user_id}, #{content})")
    int insertReview(ReviewDO reviewDO);

    /**
     * 单个事件评论获取
     * @param event_id
     * @return
     */
    @Select("SELECT * FROM review WHERE event_id=#{event_id}")
    ReviewDO[] getReviewByEventId(@Param("event_id") Integer event_id);


}
