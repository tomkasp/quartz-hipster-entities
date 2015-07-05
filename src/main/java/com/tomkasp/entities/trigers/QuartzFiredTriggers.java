package com.tomkasp.entities.trigers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "QRTZ_FIRED_TRIGGERS") @IdClass(QuartzFiredTriggersId.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class QuartzFiredTriggers {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "ENTRY_ID")
    private String entryId;

    @Column(name = "TRIGGER_NAME")
    private String triggerName;

    @Column(name = "TRIGGER_GROUP")
    private String triggerGroup;

    @Column(name = "INSTANCE_NAME")
    private String instanceName;

    @Column(name = "FIRED_TIME")
    private Long firedTime;

    @Column(name = "SCHED_TIME")
    private Long scheduTime;

    @Column(name = "PRIORITY")
    private Integer priority;

    @Column(name = "STATE")
    private String state;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "IS_NONCONCURRENT")
    private Boolean isNonConcurrent;

    @Column(name = "REQUESTS_RECOVERY")
    private Boolean requestRecovery;

}
