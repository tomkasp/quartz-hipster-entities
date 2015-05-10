package com.tomkasp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;


@Entity
@Table(name = "QRTZ_SCHEDULER_STATE")
public class SchedulerState {

    @Id
    @Column(name = "sched_name")
    private String schedulerName;

    @Column(name = "instance_name")
    private String instanceName;

    @Column(name = "last_checkin_time")
    private BigInteger lastCheckInTime;

    @Column(name = "checkin_interval")
    private BigInteger checkinInterval;


    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public BigInteger getLastCheckInTime() {
        return lastCheckInTime;
    }

    public void setLastCheckInTime(BigInteger lastCheckInTime) {
        this.lastCheckInTime = lastCheckInTime;
    }

    public BigInteger getCheckinInterval() {
        return checkinInterval;
    }

    public void setCheckinInterval(BigInteger checkinInterval) {
        this.checkinInterval = checkinInterval;
    }

    @Override
    public String toString() {
        return "SchedulerState{" +
                "schedulerName='" + schedulerName + '\'' +
                ", instanceName='" + instanceName + '\'' +
                ", lastCheckInTime=" + lastCheckInTime +
                ", checkinInterval=" + checkinInterval +
                '}';
    }
}