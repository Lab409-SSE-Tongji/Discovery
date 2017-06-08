package com.lab409.Service.Impl;

import com.lab409.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import com.lab409.Domain.BaseResult;
import com.lab409.Domain.EventDomain;
import com.lab409.MySQL.Mapper.EventMapper;
import com.lab409.MySQL.Entity.EventDO;

/**
 * @author xianganying
 * @version v0.1 2017/5/19.
 */

@Service

public class EventServiceImpl implements EventService {
    @Autowired
    private EventMapper eventMapper;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public BaseResult<Object> postEvent(EventDomain eventDomain) {
        eventMapper.insertEvent(new EventDO(eventDomain));
        return new BaseResult<>();
    }
    public BaseResult<Object> getEventByEventId(Integer eventId) {
        EventDO eventDO = eventMapper.getEventByEventId(eventId);
        if(eventDO != null) {
            return new BaseResult<>(new EventDomain(eventDO, simpleDateFormat.format(eventDO.getTime())));
        }
        else {
            return new BaseResult<>(500, "No attachment found");
        }
    }

}
