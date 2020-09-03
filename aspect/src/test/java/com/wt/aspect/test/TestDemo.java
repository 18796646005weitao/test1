package com.wt.aspect.test;

import com.wt.aspect.dao.TestDao;
import com.wt.aspect.service.TestAspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {

    @Autowired
    TestAspect testAspect;

    @Autowired
    private TestDao testDao;

    /**
     * 注解方法前后加切面
     * testDao方法执行完了 执行 @after 最后执行 打印 Name
     */
    @Test
    public void annotion() {
        System.out.println(testDao.getHero().get(0).getName());
    }
    /**
     * 方法前后加切面
     */
    @Test
    public void method() {
        testAspect.say();
    }


}
