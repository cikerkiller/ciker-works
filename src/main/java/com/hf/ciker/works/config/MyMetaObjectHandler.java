package com.hf.ciker.works.config;

/**
 * @author ciker
 * @version 1.0
 * @date 2021/1/1 16:18
 */

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Supplier;

/**
 * 自动填充类
 * @author ciker
 * @version 1.0
 * @date 2021/1/1 16:07
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static String CREATE_TIME = "createdTime";
    private static String UPDATE_TIME = "updatedTime";

    /**
     * 插入使用
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        fillValue(metaObject, CREATE_TIME, () -> getDateValue(metaObject.getSetterType(CREATE_TIME)));
        fillValue(metaObject, UPDATE_TIME, () -> getDateValue(metaObject.getSetterType(UPDATE_TIME)));
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        fillValue(metaObject, "et."+UPDATE_TIME, () -> getDateValue(metaObject.getSetterType("et."+UPDATE_TIME)));
    }
    private void fillValue(MetaObject metaObject, String fieldName, Supplier<Object> valueSupplier) {
        if (!metaObject.hasGetter(fieldName)) {
            return;
        }
        Object sidObj = metaObject.getValue(fieldName);
        if (sidObj == null && metaObject.hasSetter(fieldName) && valueSupplier != null) {
            setFieldValByName(fieldName, valueSupplier.get(), metaObject);
        }
    }

    private Object getDateValue(Class<?> setterType) {
        if (Date.class.equals(setterType)) {
            return new Date();
        } else if (LocalDateTime.class.equals(setterType)) {
            return LocalDateTime.now();
        } else if (Long.class.equals(setterType)){
            return System.currentTimeMillis();
        }
        return null;
    }
}
