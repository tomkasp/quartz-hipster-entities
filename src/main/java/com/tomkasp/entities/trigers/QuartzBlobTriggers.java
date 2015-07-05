package com.tomkasp.entities.trigers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

@Entity(name = "QRTZ_BLOB_TRIGGERS")
@IdClass(QuartzTriggersId.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
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

}


