package com.tomkasp.entities.trigers;

import javax.persistence.*;

@Entity(name = "QRTZ_BLOB_TRIGGERS")
@IdClass(QuartzTriggersId.class)
public class QuartzBlobTriggers {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    @Lob
    @Column(name = "BLOB_DATA")
    private String blobData;

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

    public String getBlobData() {
        return blobData;
    }

    public void setBlobData(String blobData) {
        this.blobData = blobData;
    }
}


