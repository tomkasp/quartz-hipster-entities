package com.tomkasp.entities.trigers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.tomkasp.validation.ValidateString;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;

@Entity(name = "QRTZ_TRIGGERS")
@IdClass(QuartzTriggersId.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class QuartzTriggers extends ResourceSupport {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Id
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NEXT_FIRE_TIME")
    private Long nextFireTime;

    @Column(name = "PREV_FIRE_TIME")
    private Long prevFireTime;

    @Column(name = "PRIORITY")
    private Integer priority;

    @ValidateString(acceptedValues = {"NONE", "NORMAL", "PAUSED", "COMPLETE", "ERROR", "BLOCKED"}, message = "Invalid trigger state")
    @Column(name = "TRIGGER_STATE")
    private String triggerState;

    @Column(name = "TRIGGER_TYPE")
    private String triggerType;

    @Column(name = "START_TIME")
    private Long startTime;

    @Column(name = "END_TIME")
    private Long endTime;

    @Column(name = "CALENDAR_NAME")
    private String calendarName;

    @Column(name = "MISFIRE_INSTR")
    private Integer misfireInstr;

    @Lob
    @Column(name = "JOB_DATA")
    private byte[] jobDate;


    public QuartzTriggers schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public QuartzTriggers triggerName(final String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    public QuartzTriggers triggerGroup(final String triggerGroup) {
        this.triggerGroup = triggerGroup;
        return this;
    }

    public QuartzTriggers jobName(final String jobName) {
        this.jobName = jobName;
        return this;
    }

    public QuartzTriggers jobGroup(final String jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }

    public QuartzTriggers description(final String description) {
        this.description = description;
        return this;
    }

    public QuartzTriggers nextFireTime(final Long nextFireTime) {
        this.nextFireTime = nextFireTime;
        return this;
    }

    public QuartzTriggers prevFireTime(final Long prevFireTime) {
        this.prevFireTime = prevFireTime;
        return this;
    }

    public QuartzTriggers priority(final Integer priority) {
        this.priority = priority;
        return this;
    }

    public QuartzTriggers triggerState(final String triggerState) {
        this.triggerState = triggerState;
        return this;
    }

    public QuartzTriggers triggerType(final String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    public QuartzTriggers startTime(final Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public QuartzTriggers endTime(final Long endTime) {
        this.endTime = endTime;
        return this;
    }

    public QuartzTriggers calendarName(final String calendarName) {
        this.calendarName = calendarName;
        return this;
    }

    public QuartzTriggers misfireInstr(final Integer misfireInstr) {
        this.misfireInstr = misfireInstr;
        return this;
    }

    public QuartzTriggers jobDate(final byte[] jobDate) {
        this.jobDate = jobDate;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuartzTriggers)) return false;

        QuartzTriggers that = (QuartzTriggers) o;

        if (!schedulerName.equals(that.schedulerName)) return false;
        if (!triggerName.equals(that.triggerName)) return false;
        if (!triggerGroup.equals(that.triggerGroup)) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (triggerState != null ? !triggerState.equals(that.triggerState) : that.triggerState != null) return false;
        if (triggerType != null ? !triggerType.equals(that.triggerType) : that.triggerType != null) return false;
        if (calendarName != null ? !calendarName.equals(that.calendarName) : that.calendarName != null) return false;
        return !(misfireInstr != null ? !misfireInstr.equals(that.misfireInstr) : that.misfireInstr != null);

    }

    @Override
    public int hashCode() {
        int result = schedulerName.hashCode();
        result = 31 * result + triggerName.hashCode();
        result = 31 * result + triggerGroup.hashCode();
        return result;
    }
}
