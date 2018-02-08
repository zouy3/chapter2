package com.smart.service;


import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


@ContextConfiguration("classpath*:/smart-context.xml")
public class UserServiceText extends AbstractTransactionalTestNGSpringContextTests {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void hasMatchUser() {
        boolean b1 = userService.hasMatchUser("admin","123456");
        boolean b2 = userService.hasMatchUser("admin","11111");
        Assert.assertTrue(b1);
        Assert.assertTrue(!b2);
}

    @Test
    public void findUserByUserName() {
        User user = userService.findUserByUserName("admin");

        Assert.assertEquals(user.getUserName(), "admin");
    }

}
