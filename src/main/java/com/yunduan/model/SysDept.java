package com.yunduan.model;

import java.util.Date;

public class SysDept {
    private Integer id;

    private String name;

    private String level;

    private String seq;

    private Integer parentId;

    private String operator;

    private Date operaterTime;

    private String operaterIp;

    private String remark;

    public SysDept(Integer id, String name, String level, String seq, Integer parentId, String operator, Date operaterTime, String operaterIp, String remark) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.seq = seq;
        this.parentId = parentId;
        this.operator = operator;
        this.operaterTime = operaterTime;
        this.operaterIp = operaterIp;
        this.remark = remark;
    }

    public SysDept() {
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq == null ? null : seq.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperaterTime() {
        return operaterTime;
    }

    public void setOperaterTime(Date operaterTime) {
        this.operaterTime = operaterTime;
    }

    public String getOperaterIp() {
        return operaterIp;
    }

    public void setOperaterIp(String operaterIp) {
        this.operaterIp = operaterIp == null ? null : operaterIp.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}