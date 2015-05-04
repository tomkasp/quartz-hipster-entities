package com.tomkasp.entities;

import java.io.Serializable;

public class QuartzCalendarsId implements Serializable{

    private String schedulerName;
    private String calendarName;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }
}
