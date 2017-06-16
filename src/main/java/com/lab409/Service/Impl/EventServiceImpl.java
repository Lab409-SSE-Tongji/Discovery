package com.lab409.Service.Impl;

import com.lab409.Service.EventService;
import com.lab409.Utilities.SaveFileUtil;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

import com.lab409.Domain.BaseResult;
import com.lab409.Domain.EventDomain;
import com.lab409.MySQL.Mapper.EventMapper;
import com.lab409.MySQL.Entity.EventDO;

/**
 * @author ad
 * @version v0.1 2017/5/19.
 */

@Service

public class EventServiceImpl implements EventService {
    @Autowired
    private EventMapper eventMapper;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public BaseResult<Object> postEvent(EventDomain eventDomain) {
        SaveFileUtil.getFileFromBytes(Base64.decodeBase64(eventDomain.getFile()), eventDomain.getPicPath());
        eventMapper.insertEvent(new EventDO(eventDomain));
        return new BaseResult<>();
    }
    public BaseResult<Object> getEventByEventId(Integer eventId) {
        EventDO eventDO = eventMapper.getEventByEventId(eventId);
        if(eventDO != null) {
            return new BaseResult<>(new EventDomain(eventDO, simpleDateFormat.format(eventDO.getTime())));
        }
        else {
            return new BaseResult<>(500, "No events found");
        }
    }

    public BaseResult<Object> getEvents() {

        EventDO[] eventDOS = eventMapper.getEvents();
        EventDomain[] eventDomains = new EventDomain[eventDOS.length];
        if (eventDOS.length != 0){
            for (int i = 0; i < eventDomains.length; i++){
//                String time = simpleDateFormat.format(eventDOS[0].getTime());
                eventDomains[i] = new EventDomain(eventDOS[i], simpleDateFormat.format(eventDOS[i].getTime()));
            }
            return new BaseResult<> (eventDomains);
        }
        return new BaseResult<>(500, "No events found");

    }
// eventDOS[i], simpleDateFormat.format(eventDOS[i].getTime())
}
