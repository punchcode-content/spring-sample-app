package com.theironyard.springdemo.controllers;

import com.theironyard.springdemo.entities.Time;
import com.theironyard.springdemo.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimeController {
    private TimeService timeService;

    @Autowired
    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    @ResponseBody
    public Time currentTime() {
        return timeService.getDateTime();
    }
}
