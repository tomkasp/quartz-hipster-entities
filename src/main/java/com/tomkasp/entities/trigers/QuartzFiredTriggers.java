package com.tomkasp.entities.trigers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name = "QRTZ_FIRED_TRIGGERS") @IdClass(QuartzFiredTriggersId.class)
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

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Long getFiredTime() {
        return firedTime;
    }

    public void setFiredTime(Long firedTime) {
        this.firedTime = firedTime;
    }

    public Long getScheduTime() {
        return scheduTime;
    }

    public void setScheduTime(Long scheduTime) {
        this.scheduTime = scheduTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public Boolean getIsNonConcurrent() {
        return isNonConcurrent;
    }

    public void setIsNonConcurrent(Boolean isNonConcurrent) {
        this.isNonConcurrent = isNonConcurrent;
    }

    public Boolean getRequestRecovery() {
        return requestRecovery;
    }

    public void setRequestRecovery(Boolean requestRecovery) {
        this.requestRecovery = requestRecovery;
    }
}
