package com.tomkasp.entities;

import java.io.Serializable;

public class QuartzJobDetailsId implements Serializable {

    private String schedulerName;
    private String jobName;
    private String jobGroup;

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

    public QuartzJobDetailsId schedulerName(final String schedulerName) {
        this.schedulerName = schedulerName;
        return this;
    }

    public QuartzJobDetailsId jobName(final String jobName) {
        this.jobName = jobName;
        return this;
    }

    public QuartzJobDetailsId jobGroup(final String jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }


}
