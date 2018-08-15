package com.yunduan.dao;

import com.yunduan.model.SysLog;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}