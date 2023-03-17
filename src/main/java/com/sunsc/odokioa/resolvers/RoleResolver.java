package com.sunsc.odokioa.resolvers;

import com.sunsc.odokioa.domain.Role;
import com.sunsc.odokioa.domain.vo.Result;
import com.sunsc.odokioa.service.RoleService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author sunshaocong
 * @date 2023/3/17
 */
@Service
public class RoleResolver implements GraphQLMutationResolver, GraphQLQueryResolver {

    private final RoleService roleService;

    public RoleResolver(RoleService roleService) {
        this.roleService = roleService;
    }

    public Result addRole(String name) {
        Role role = new Role();
        role.setName(name);
        roleService.save(role);
        return new Result(200, "success");
    }

    public List<Role> roles() {
        return roleService.list();
    }

}
