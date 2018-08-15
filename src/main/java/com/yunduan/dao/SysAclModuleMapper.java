package com.yunduan.dao;

import com.yunduan.model.SysAclModule;
import org.apache.ibatis.annotations.Param;

public interface SysAclModuleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysAclModule record);

    int insertSelective(SysAclModule record);

    SysAclModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAclModule record);

    int updateByPrimaryKeyWithBLOBs(SysAclModule record);

    int updateByPrimaryKey(SysAclModule record);
}