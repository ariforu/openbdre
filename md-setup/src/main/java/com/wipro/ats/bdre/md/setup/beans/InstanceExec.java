package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.*;
import java.util.Date;

/**
 * InstanceExec generated by hbm2java
 */
@Entity
@Table(name="INSTANCE_EXEC"
    ,schema="BDRE"
    ,catalog="BDRE"
)
public class InstanceExec  implements java.io.Serializable {


     private Long instanceExecId;
     private Integer processId;
     private Date startTs;
     private Date endTs;
     private Integer execState;

    public InstanceExec() {
    }

	
    public InstanceExec(Integer processId, Date startTs, Integer execState) {
        this.processId = processId;
        this.startTs = startTs;
        this.execState = execState;
    }
    public InstanceExec(Integer processId, Date startTs, Date endTs, Integer execState) {
       this.processId = processId;
       this.startTs = startTs;
       this.endTs = endTs;
       this.execState = execState;
    }
   
     @Id 
    
    @Column(name="INSTANCE_EXEC_ID", unique=true, nullable=false)
    public Long getInstanceExecId() {
        return this.instanceExecId;
    }
    
    public void setInstanceExecId(Long instanceExecId) {
        this.instanceExecId = instanceExecId;
    }
    
    @Column(name="PROCESS_ID", nullable=false)
    public Integer getProcessId() {
        return this.processId;
    }
    
    public void setProcessId(Integer processId) {
        this.processId = processId;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="START_TS", nullable=false, length=23)
    public Date getStartTs() {
        return this.startTs;
    }
    
    public void setStartTs(Date startTs) {
        this.startTs = startTs;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="END_TS", length=23)
    public Date getEndTs() {
        return this.endTs;
    }
    
    public void setEndTs(Date endTs) {
        this.endTs = endTs;
    }
    
    @Column(name="EXEC_STATE", nullable=false)
    public Integer getExecState() {
        return this.execState;
    }
    
    public void setExecState(Integer execState) {
        this.execState = execState;
    }




}

