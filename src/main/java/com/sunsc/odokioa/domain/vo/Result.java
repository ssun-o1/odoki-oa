package com.sunsc.odokioa.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunshaocong
 * @date 2023/3/17
 */
@Data
@AllArgsConstructor
public class Result {
    private Integer respCode;
    private String msg;
}
