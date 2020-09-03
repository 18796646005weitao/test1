package com.wt.aspect.aspect;

import java.lang.annotation.*;

/**
 * 动态数据源注解类
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    /**
     * 数据源key值
     */
    String value();
}
