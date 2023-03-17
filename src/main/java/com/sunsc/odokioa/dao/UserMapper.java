package com.sunsc.odokioa.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunsc.odokioa.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
