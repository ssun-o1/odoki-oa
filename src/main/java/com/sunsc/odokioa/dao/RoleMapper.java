package com.sunsc.odokioa.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunsc.odokioa.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RoleMapper extends BaseMapper<Role> {

}
