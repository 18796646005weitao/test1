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
public class MyAspect1 {

    /**
     * TargetDataSource注解的方法前 执行
     */
    @Before(value = "@annotation(TargetDataSource)")
    public void before(TargetDataSource TargetDataSource){
        System.out.println("方法前执行 获取参数 " + TargetDataSource);
    }

    /**
     * TargetDataSource注解的方法后 执行
     */
    @After(value = "@annotation(TargetDataSource)")
    public void after(TargetDataSource TargetDataSource){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("方法后执行  获取参数 " + TargetDataSource);
    }

}
