package com.example.demo;

import com.example.demo.dao.MyBatisUserDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class Chapter6Application {


    @Autowired
    private SqlSessionFactory sqlSessionFactory = null;


    @Bean
    public MapperScannerConfigurer mapperScannerConfig() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.example.demo.*");
        mapperScannerConfigurer.setAnnotationClass(Repository.class);
        return mapperScannerConfigurer;
    }


    public static void main(String[] args) {
        SpringApplication.run(Chapter6Application.class, args);
    }

}

