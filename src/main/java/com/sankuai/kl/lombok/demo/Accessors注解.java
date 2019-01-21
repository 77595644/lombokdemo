package com.sankuai.kl.lombok.demo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description: 链式创建
 * @author: wangyue84
 * @date: 2019/1/21
 * @time: 下午5:42
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */
public class Accessors注解 {

    public static void main(String[] args) {
        User2 user = new User2();
        user.setAge(1).setName("user");
        System.out.println(user);
    }
}


@Data
@Accessors(chain = true)
class User2 {
    private String name;
    private Integer age;
}
