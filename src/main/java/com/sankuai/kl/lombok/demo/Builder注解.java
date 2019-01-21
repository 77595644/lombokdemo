package com.sankuai.kl.lombok.demo;

import lombok.Builder;
import lombok.Data;

/**
 * @description: 使用builder模式创建对象
 * @author: wangyue84
 * @date: 2019/1/21
 * @time: 下午5:46
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */
public class Builder注解 {

    public static void main(String[] args) {
        User4 user = User4.builder().age(1).name("USER").build();
        System.out.println(user);

    }
}

@Data
@Builder
class User4 {
    private String name;
    private int age;
}
