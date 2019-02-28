package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
//        return new RandomRule();//Ribbon默认是轮询，
        return new RandomRule_YP();//我自定义为每个机器被访问5次
    }
}


