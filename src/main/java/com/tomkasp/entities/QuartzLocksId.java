package com.tomkasp.entities;

import java.io.Serializable;

public class QuartzLocksId implements Serializable{

    private String schedulerName;
    private String lockName;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }
}
