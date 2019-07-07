package com.zz.demo.temp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConfigurationProperties(prefix = "test")
// PropertySource默认取application.properties
@PropertySource(value = "classpath:test.properties")
public class test {

    private static final Logger logger = LoggerFactory.getLogger(test.class);

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @PostConstruct//在servlet初始化的时候加载，并且只加载一次，和构造代码块的作用类似
    private void init(){
        logger.info("load env.properties start!");
        System.out.println("---------name：" + getName());
        System.out.println("---------age："+ getAge());
        logger.info("load env.properties end!");
    }
}
