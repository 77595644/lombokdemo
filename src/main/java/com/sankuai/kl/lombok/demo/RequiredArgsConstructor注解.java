package com.sankuai.kl.lombok.demo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @description: 静态构造函数
 * @author: wangyue84
 * @date: 2019/1/21
 * @time: 下午5:50
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */
public class RequiredArgsConstructor注解 {

    public static void main(String[] args) {
        User5 user = User5.of();
        user.setAge(1);
        user.setName("user");
        System.out.println(user);
    }


}


@Data
@RequiredArgsConstructor(staticName = "of")
class User5 {
    private String name;
    private Integer age;
}