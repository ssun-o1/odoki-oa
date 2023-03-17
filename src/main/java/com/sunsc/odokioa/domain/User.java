package com.sunsc.odokioa.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sunsc.odokioa.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户表
 *
 * @author sunshaocong
 * @date 2023/3/16
 */
@Data
@TableName(value = "user")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity{

    private Long code;
    private String name;
    private String mobile;
    private String avatar;
    private String gender;
    private String birthday;
    @JSONField(serialize = false)
    @TableField(select = false)
    private String password;
}
