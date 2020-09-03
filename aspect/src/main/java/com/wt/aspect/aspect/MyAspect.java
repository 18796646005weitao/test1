package com.wt.aspect.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切片逻辑类
 * @Aspect作用是把当前类标识为一个切面供容器读取
 */
@Aspect
@Component
public class MyAspect {
    //匹配com.wt.aspect.service下所有类
    @Before("execution(* com.wt.aspect.service.*.*(..))")
    public void before(){
        System.out.println("方法前执行");
    }

    //匹配com.wt.aspect.service下所有类
    //不管是抛出异常或者正常退出都会执行
    @After("execution(* com.wt.aspect.service.*.*(..))")
    public void after(){
        System.out.println("方法后执行");
    }
}
