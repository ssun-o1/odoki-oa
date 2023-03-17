package com.sunsc.odokioa.domain.vo;

import com.sunsc.odokioa.enums.Gender;
import lombok.Data;

/**
 * 用户创建vo实体
 * @author sunshaocong
 * @date 2023/3/16
 */
@Data
public class AddUserInput {
    private String name;
    private String mobile;
}
