package com.sunsc.odokioa.common;

import lombok.Data;

/**
 * 基础info
 *
 * @author sunshaocong
 * @date 2023/3/16
 */
@Data
public class BaseEntity {

    /**
     * 主键id
     */
    private String id;
    /**
     * 是否删除
     */
    private Boolean deleted;

    /**
     * 创建人id
     */
    private String creatorId;
    /**
     * 创建人名称
     */
    private String creatorName;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 更新人id
     */
    private String updaterId;
    /**
     * 更新人名称
     */
    private String updaterName;
    /**
     * 更新时间
     */
    private Long updateTime;
}
