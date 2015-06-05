package com.tomkasp.entities.trigers;


import java.io.Serializable;

public class QuartzTriggersId implements Serializable{

    private String schedulerName;
    private String triggerName;
    private String triggerGroup;

    public QuartzTriggersId schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public QuartzTriggersId triggerName(final String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    public QuartzTriggersId triggerGroup(final String triggerGroup) {
        this.triggerGroup = triggerGroup;
        return this;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }
}
