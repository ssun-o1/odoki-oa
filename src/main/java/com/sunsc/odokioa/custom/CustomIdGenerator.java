package com.sunsc.odokioa.custom;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.sunsc.odokioa.util.ObjectId;
import org.springframework.stereotype.Component;

/**
 * mybatis-plus自定义id生成器，使用ObjectId
 *
 * @author chenruiyi
 */
@Component
public class CustomIdGenerator implements IdentifierGenerator {

    @Override
    public Number nextId(Object entity) {
        return null;
    }

    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    @Override
    public String nextUUID(Object entity) {
        return ObjectId.get();
    }
}
