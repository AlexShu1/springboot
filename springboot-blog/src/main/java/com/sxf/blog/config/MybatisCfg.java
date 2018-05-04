package com.sxf.blog.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author shuxf
 * @Date 2018/5/4 17:10
 */
@Configuration
@EnableTransactionManagement
public class MybatisCfg {
    @Autowired
    private DataSource dataSource;

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //sql的xml文件的存放路径
        Resource[] mapperLocations = resolver.getResources("classpath:mapper/**/*.xml");
        sessionFactory.setMapperLocations(mapperLocations);
        //将数据查询的数据转成一个java的model对象，即对象所在的包路径
        sessionFactory.setTypeAliasesPackage("com.sxf.blog.entity");

        //mybatis的一些个性化的配置
        Resource configLocation = resolver.getResource("classpath:mybatis-setting.xml");
        sessionFactory.setConfigLocation(configLocation);
        //这边必须要这样写，如果不使用spring boot 的方式的话，是不需要这么写的，具体详见spring-mybatis的官方文档
        return sessionFactory.getObject();
    }
}
