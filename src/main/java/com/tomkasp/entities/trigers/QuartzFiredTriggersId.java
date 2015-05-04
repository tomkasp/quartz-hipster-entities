package com.tomkasp.entities.trigers;


import java.io.Serializable;

public class QuartzFiredTriggersId implements Serializable{

    private String schedulerName;
    private String entryId;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }
}
