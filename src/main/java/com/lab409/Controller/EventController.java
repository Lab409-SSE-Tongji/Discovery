package com.lab409.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lab409.Service.EventService;
import com.lab409.Domain.BaseResult;
import com.lab409.Domain.EventDomain;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ad
 * @version v0.1 2017/5/19.
 */
@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    public BaseResult<Object> postEvent(@RequestBody EventDomain eventDomain){
        return eventService.postEvent(eventDomain);
    }

    @RequestMapping(value = "/events/{eventId}", method = RequestMethod.GET)
    public BaseResult<Object> getEventByEventId(@PathVariable("eventId") Integer eventId){
        return eventService.getEventByEventId(eventId);
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
        public BaseResult<Object> getEvents(){
            return eventService.getEvents();
    }
}
