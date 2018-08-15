package com.yunduan.dao;

import com.yunduan.model.SysDept;
import org.apache.ibatis.annotations.Param;

public interface SysDeptMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKeyWithBLOBs(SysDept record);

    int updateByPrimaryKey(SysDept record);
}