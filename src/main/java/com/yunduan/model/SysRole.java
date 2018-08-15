package com.yunduan.model;

import java.util.Date;

public class SysRole {
    private Integer id;

    private String name;

    private Integer type;

    private Integer status;

    private String operator;

    private Date operatorTime;

    private String operatorIp;

    private String remark;

    public SysRole(Integer id, String name, Integer type, Integer status, String operator, Date operatorTime, String operatorIp, String remark) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.operator = operator;
        this.operatorTime = operatorTime;
        this.operatorIp = operatorIp;
        this.remark = remark;
    }

    public SysRole() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}