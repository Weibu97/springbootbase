package com;


import com.dao.UserMapper;
import com.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
public class serviceTest {

    @Autowired
    UserMapper userMapper;
    @Test
    public  void test(){
//        System.out.println(userMapper);
//        List<User> list = userMapper.alluser();
//        for(User s:list){
//            System.out.println(s);
//        }
        User user=new User();
        user.setUsername("ddd");
        BCryptPasswordEncoder bCryptPasswordEncoder =new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode("123"));
        userMapper.adduser(user);
        System.out.println("插入成功");
    }
}
