package com.theironyard.springdemo.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private LocalDateTime dt;

    public Time(LocalDateTime dt) {
        this.dt = dt;
    }

    public LocalDateTime getDateTime() {
        return dt;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(this.dt);
    }
}
