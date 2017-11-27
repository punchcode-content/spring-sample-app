package com.theironyard.springdemo.services;

import com.theironyard.springdemo.entities.Time;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeService {
    public Time getDateTime() {
        return new Time(LocalDateTime.now());
    }
}


