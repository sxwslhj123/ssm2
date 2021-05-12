package com.edu.test;

import com.edu.pojo.User;
import com.edu.service.UserService;
import com.edu.util.DESUTIL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyTest {
    @Resource
    UserService userService;
    @Test
    public void method(){
        User user = new User();
        user.setName("王禹");
        user.setPassword(DESUTIL.encode("abcdefg"));
        user.setLoginId("admin");
        user.setPhone("15620263150");
        user.setSex(1);
        user.setCreateDate(new Date());
        user.setEmail("abc@qq.com");
        System.out.println(userService.add(user));
    }
}
