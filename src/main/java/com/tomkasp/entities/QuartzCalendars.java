package com.tomkasp.entities;

import javax.persistence.*;

@Entity(name = "QRTZ_CALENDARS")
@IdClass(QuartzCalendarsId.class)
public class QuartzCalendars {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "CALENDAR_NAME")
    private String calendarName;

    @Lob
    @Column(name = "CALENDAR")
    private byte[] calendar;


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

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}
