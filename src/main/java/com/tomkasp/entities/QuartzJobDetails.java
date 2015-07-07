package com.tomkasp.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.*;

@Entity(name = "QRTZ_JOB_DETAILS") @IdClass(QuartzJobDetailsId.class)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class QuartzJobDetails extends ResourceSupport {

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

}
