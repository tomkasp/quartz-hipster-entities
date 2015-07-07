package com.tomkasp.entities.trigers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "QRTZ_PAUSED_TRIGGER_GRPS")
@IdClass(QuartzPausedTriggersId.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class QuartzPausedTriggers {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    public QuartzPausedTriggers schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public QuartzPausedTriggers triggerGroup(final String triggerGroup) {
        this.triggerGroup = triggerGroup;
        return this;
    }


}
