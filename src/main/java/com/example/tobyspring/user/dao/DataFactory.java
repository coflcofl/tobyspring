package com.example.tobyspring.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DataFactory {
    @Bean
    public UserDao userDao () {
        UserDao userDao = new UserDao();
        //userDao.setConnectionMaker(connectionMaker());
        userDao.setDataSource(dataSource());
        //userDao.setJdbcContext(jdbcContext());
        return userDao;
        //return new UserDao(connectionMaker());
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("qwqw1212");

        return dataSource;
    }

//    @Bean
//    public JdbcContext jdbcContext() {
//        JdbcContext jdbcContext = new JdbcContext();
//        jdbcContext.setDataSource(dataSource());
//        return jdbcContext;
//    }
}
