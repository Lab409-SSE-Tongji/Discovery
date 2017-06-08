package com.lab409.Service;

import com.lab409.Domain.BaseResult;
import com.lab409.Domain.EventDomain;
/**
 * @author xianganying
 * @version v0.1 2017/5/19.
 */
public interface EventService {
    /**
     * 新建事件
     * @param eventDomain
     * @return
     */
    BaseResult<Object> postEvent(EventDomain eventDomain);

    /**
     * 根据事件id获取单个事件
     * @param eventId
     * @return
     */
    BaseResult<Object> getEventByEventId(Integer eventId);

}
