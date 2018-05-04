package com.sxf.blog.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author shuxf
 * @Date 2018/5/4 17:12
 */
@Configuration
//注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
// see http://blog.csdn.net/isea533/article/details/50359390
@AutoConfigureAfter(MybatisCfg.class)
public class MyBatisMapperScannerConfig {
    @Bean(name = "mapperScannerConfigurer")
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        //具体查询的dao的目录
        configurer.setBasePackage("com.sxf.blog.mapper");
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return configurer;
    }
}
