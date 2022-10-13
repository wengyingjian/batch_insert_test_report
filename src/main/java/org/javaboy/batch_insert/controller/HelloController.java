package org.javaboy.batch_insert.controller;

import org.javaboy.batch_insert.model.User;
import org.javaboy.batch_insert.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
public class HelloController {
    private static final Logger logger = getLogger(HelloController.class);
    @Autowired
    UserService userService;

    /**
     * MyBatis Plus 批量插入
     */
    @GetMapping("/user3")
    //1526
    public void user3() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            User u = new User();
            u.setAddress("广州：" + i);
            u.setUsername("张三：" + i);
            u.setPassword("123：" + i);
            users.add(u);
        }
        long startTime = System.currentTimeMillis();
        userService.saveBatch(users);
        long endTime = System.currentTimeMillis();
        logger.info("MyBaits Plus 批量插入耗时 {}", (endTime - startTime));
    }

    /**
     * 一条一条插入
     */
    @GetMapping("/user2")
    public void user2(@RequestParam("num") Integer num) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User u = new User();
            u.setAddress("广州：" + i);
            u.setUsername("张三：" + i);
            u.setPassword("123：" + i);
            users.add(u);
        }
        userService.addUserOneByOne(users);
    }

    /**
     * 合并成一条 SQL 插入
     */
    @GetMapping("/user")
    public void hello(@RequestParam("num") Integer num) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User u = new User();
            u.setAddress("广州：" + i);
            u.setUsername("张三：" + i);
            u.setPassword("123：" + i);
            users.add(u);
        }
        userService.addByOneSQL(users);
    }


    /**
     * 一条一条插入
     */
    @GetMapping("/user_big2")
    public void userBig2(@RequestParam("num") Integer num) {
        List<User> users = build(num);
        userService.addUserOneByOneBig(users);
    }


    /**
     * 合并成一条 SQL 插入
     */
    @GetMapping("/user_big")
    public void userBig(@RequestParam("num") Integer num) {
        List<User> users = build(num);
        userService.addByOneSQLBig(users);
    }

    /**
     *
     */
    @GetMapping("/user_big_insert")
    public void userBigInsert(@RequestParam("num") Integer num) {
        List<User> users = build(num);
        userService.addUserOneInsert(users);
    }

    /**
     *
     */
    @GetMapping("/user_big_insert_trans")
    public void userBigInsertTrans(@RequestParam("num") Integer num) {
        List<User> users = build(num);
        userService.addUserOneInsertTrans(users);
    }


    private List<User> build(Integer num) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            User u = new User();
            u.setAddress("广州：" + i);
            u.setUsername("张三：" + i);
            u.setPassword("123：" + i);
            u.setName1("name:" + i);
            u.setName2("name:" + i);
            u.setName3("name:" + i);
            u.setName4("name:" + i);
            u.setName5("name:" + i);
            u.setName6("name:" + i);
            u.setName7("name:" + i);
            u.setName8("name:" + i);
            u.setName9("name:" + i);
            u.setName10("name:" + i);
            u.setName11("name:" + i);
            u.setName12("name:" + i);
            u.setName13("name:" + i);
            u.setName14("name:" + i);
            u.setName15("name:" + i);
            u.setName16("name:" + i);
            u.setName17("name:" + i);
            u.setName18("name:" + i);
            u.setName19("name:" + i);
            u.setName20("name:" + i);
            users.add(u);
        }
        return users;
    }
}
