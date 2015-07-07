package com.tomkasp.entities.trigers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "QRTZ_SIMPLE_TRIGGERS")
@IdClass(QuartzTriggersId.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class QuartzSimpleTriggers {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Id
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    @Column(name = "REPEAT_COUNT")
    private Long repeatCount;

    @Column(name = "REPEAT_INTERVAL")
    private Long repeatInterval;

    @Column(name = "TIMES_TRIGGERED")
    private Long timesTriggered;

    public QuartzSimpleTriggers schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public QuartzSimpleTriggers triggerName(final String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    public QuartzSimpleTriggers triggerGroup(final String triggerGroup) {
        this.triggerGroup = triggerGroup;
        return this;
    }

    public QuartzSimpleTriggers repeatCount(final Long repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }

    public QuartzSimpleTriggers repeatInterval(final Long repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }

    public QuartzSimpleTriggers timesTriggered(final Long timesTriggered) {
        this.timesTriggered = timesTriggered;
        return this;
    }
}
