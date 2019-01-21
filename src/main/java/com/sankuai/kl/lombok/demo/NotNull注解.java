package com.sankuai.kl.lombok.demo;

import lombok.NonNull;

/**
 * @description: 判空
 * @author: wangyue84
 * @date: 2019/1/21
 * @time: 下午5:39
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */
public class NotNull注解 {


    public static void main(String[] args) {
        NotNull注解.test(null);
//        当传入为null时 提示控制针
//        Exception in thread "main" java.lang.NullPointerException: arg is marked @NonNull but is null
//        at com.sankuai.kl.lombok.demo.NotNull注解.test(NotNull注解.java:20)
//        at com.sankuai.kl.lombok.demo.NotNull注解.main(NotNull注解.java:17)
    }

    private static void test(@NonNull String arg){
        System.out.println(arg);
    }
}
