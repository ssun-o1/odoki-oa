package com.sunsc.odokioa.custom;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import java.time.Instant;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author sunshaocong
 * @date 2023/3/17
 */
@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", Instant.now().toEpochMilli(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", Instant.now().toEpochMilli(), metaObject);
    }
}
