package com.yunduan.model;

import java.util.Date;

public class SysLog {
    private Integer id;

    private Integer type;

    private Integer targetId;

    private String oldValue;

    private String newValue;

    private String operator;

    private Date operatorTime;

    private String operatorIp;

    public SysLog(Integer id, Integer type, Integer targetId, String oldValue, String newValue, String operator, Date operatorTime, String operatorIp) {
        this.id = id;
        this.type = type;
        this.targetId = targetId;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.operator = operator;
        this.operatorTime = operatorTime;
        this.operatorIp = operatorIp;
    }

    public SysLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue == null ? null : oldValue.trim();
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue == null ? null : newValue.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }
}