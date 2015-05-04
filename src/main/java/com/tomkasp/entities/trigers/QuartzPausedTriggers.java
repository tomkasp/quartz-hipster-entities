package com.tomkasp.entities.trigers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "QRTZ_PAUSED_TRIGGER_GRPS")
@IdClass(QuartzPausedTriggersId.class)
public class QuartzPausedTriggers {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
}




//CREATE TABLE QRTZ_PAUSED_TRIGGER_GRPS (
//        SCHED_NAME VARCHAR(120) NOT NULL,
//    TRIGGER_GROUP VARCHAR (200)  NOT NULL
//);