package com.tomkasp.entities;

import javax.persistence.*;

@Entity(name = "QRTZ_JOB_DETAILS") @IdClass(QuartzJobDetailsId.class)
public class QuartzJobDetails {

    @Id
    @Column(name = "SCHED_NAME")
    private String schedulerName;

    @Id
    @Column(name = "JOB_NAME")
    private String jobName;

    @Id
    @Column(name = "JOB_GROUP")
    private String jobGroup;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "JOB_CLASS_NAME")
    private String jobClassName;

    @Column(name = "IS_DURABLE")
    private Boolean isDurable;

    @Column(name = "IS_NONCONCURRENT")
    private Boolean isNonConcurent;

    @Column(name = "IS_UPDATE_DATA")
    private Boolean isUpdateDataBoolean;

    @Column(name = "REQUESTS_RECOVERY")
    private Boolean requestsRecovery;

    @Lob
    @Column(name = "JOB_DATA")
    private byte[] jobData;


    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public Boolean getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(Boolean isDurable) {
        this.isDurable = isDurable;
    }

    public Boolean getIsNonConcurent() {
        return isNonConcurent;
    }

    public void setIsNonConcurent(Boolean isNonConcurent) {
        this.isNonConcurent = isNonConcurent;
    }

    public Boolean getIsUpdateDataBoolean() {
        return isUpdateDataBoolean;
    }

    public void setIsUpdateDataBoolean(Boolean isUpdateDataBoolean) {
        this.isUpdateDataBoolean = isUpdateDataBoolean;
    }

    public Boolean getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(Boolean requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }
}

//JOB_DATA IMAGE NULL