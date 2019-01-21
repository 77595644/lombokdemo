package com.sankuai.kl.lombok.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @description: 注解在类上，将类提供的所有属性都添加get、set方法，
 *               并添加、equals、canEquals、hashCode、toString方法
 * @author: wangyue84
 * @date: 2019/1/21
 * @time: 下午5:26
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */
public class Data注解 {

    public static void main(String[] args) {
        User user = new User();
        user.setAge(1);
        user.setName("123e4");

        System.out.println(user.getAge() + " " + user.getName());
        System.out.println("to String " + user);

        User1 user1 = new User1();
        user1.setAge(1);
        user1.setName("user1");
        System.out.println(user1.getAge() + " " + user1.getName());
        System.out.println("user1 to String " + user1);
    }
}


@Data
class User{
    private String name;
    private int age;

}

@Setter
@Getter
class User1 {
    private String name;
    private int age;
}