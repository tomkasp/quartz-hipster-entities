package com.tomkasp.entities.trigers;

import java.io.Serializable;


public class QuartzPausedTriggersId implements Serializable{

    private String schedulerName;
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

    public QuartzPausedTriggersId schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public QuartzPausedTriggersId triggerGroup(final String triggerGroup) {
        this.triggerGroup = triggerGroup;
        return this;
    }


}
