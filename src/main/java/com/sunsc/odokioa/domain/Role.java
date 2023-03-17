package com.sunsc.odokioa.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.sunsc.odokioa.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色
 *
 * @author sunshaocong
 * @date 2023/3/16
 */
@Data
@TableName(value = "role")
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {

    private String name;
    private Long code;
}
