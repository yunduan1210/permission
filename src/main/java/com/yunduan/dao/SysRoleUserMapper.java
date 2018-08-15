package com.yunduan.dao;

import com.yunduan.model.SysRoleUser;
import org.apache.ibatis.annotations.Param;

public interface SysRoleUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}