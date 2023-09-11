package com.example.tobyspring.user.dao;

import com.example.tobyspring.user.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

class UserDaoDataFactoryTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataFactory.class);

        UserDao dao = applicationContext.getBean("userDao", UserDao.class);

        User user = new User();
        user.setId("whiteship");
        user.setName("한채리");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + "등록 성공");

        User user2 = dao.get(user.getId());

        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회 성공");


        System.out.println(dao.getCount());


        dao.deleteAll();

        System.out.println("삭제 성공");
    }

}