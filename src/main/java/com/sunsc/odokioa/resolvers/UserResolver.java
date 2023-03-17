package com.sunsc.odokioa.resolvers;

import com.sunsc.odokioa.common.Constants;
import com.sunsc.odokioa.domain.User;
import com.sunsc.odokioa.domain.vo.AddUserInput;
import com.sunsc.odokioa.domain.vo.Result;
import com.sunsc.odokioa.service.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

/**
 * user resolver
 *
 * @author sunshaocong
 * @date 2023/3/17
 */
@Slf4j
@Component
public class UserResolver implements GraphQLMutationResolver, GraphQLQueryResolver {

    public UserResolver(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;

    public User addUserByInput(AddUserInput user) {
        return userService.addUserByInput(user);
    }

    public Result addUser(String mobile, String name) {
        User user = new User();
        user.setMobile(mobile);
        user.setName(name);
        user.setPassword(BCrypt.hashpw(Constants.DEFAULT_PASSWORD, BCrypt.gensalt()));
        userService.save(user);
        return new Result(200, "success");
    }

    public List<User> users() {
        log.info("Query Resolver ==> users");
        return userService.list();
    }
}
