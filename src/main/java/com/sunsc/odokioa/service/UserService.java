package com.sunsc.odokioa.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunsc.odokioa.common.Constants;
import com.sunsc.odokioa.dao.UserMapper;
import com.sunsc.odokioa.domain.User;
import com.sunsc.odokioa.domain.vo.AddUserInput;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 *
 * @author sunshaocong
 * @date 2023/3/16
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

    public User addUserByInput(AddUserInput user) {
        User needAddUser = new User();
        BeanUtils.copyProperties(user, needAddUser);
        needAddUser.setPassword(BCrypt.hashpw(Constants.DEFAULT_PASSWORD, BCrypt.gensalt()));
        this.baseMapper.insert(needAddUser);
        return needAddUser;
    }
}
