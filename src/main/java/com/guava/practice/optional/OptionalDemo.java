package com.guava.practice.optional;

import com.google.common.base.Optional;

/**
 * @author zhangqingxing
 * @create 2017-05-12 14:15
 **/
public class OptionalDemo {

    public static void main(String [] args){
        Optional<String> optional = Optional.of("demo");
        String value = optional.get();
        log(value);
        boolean isPresent = optional.isPresent();
        log(isPresent);

    }
    public static void log(Object obj){
        System.out.println(obj +"===:"+obj);
    }
}
