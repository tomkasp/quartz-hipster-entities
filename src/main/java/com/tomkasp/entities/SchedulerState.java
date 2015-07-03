package com.tomkasp.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;


@Entity
@Table(name = "QRTZ_SCHEDULER_STATE")
@Document(indexName = "scheduler")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class SchedulerState extends ResourceSupport {

    @Id
    @Column(name = "sched_name")
    private String id;

    @Column(name = "instance_name")
    private String instanceName;

    @Column(name = "last_checkin_time")
    private BigInteger lastCheckInTime;

    @Column(name = "checkin_interval")
    private BigInteger checkinInterval;

    @Override
    public String toString() {
        return "SchedulerState{" +
                "id='" + id + '\'' +
                ", instanceName='" + instanceName + '\'' +
                ", lastCheckInTime=" + lastCheckInTime +
                ", checkinInterval=" + checkinInterval +
                '}';
    }
}