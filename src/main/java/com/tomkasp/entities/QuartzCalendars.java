package com.tomkasp.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

@Entity(name = "QRTZ_CALENDARS")
@IdClass(QuartzCalendarsId.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
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


}
