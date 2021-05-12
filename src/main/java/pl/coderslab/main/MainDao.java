package pl.coderslab.main;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Arrays;

public class MainDao {

    public static void main(String[] args) {
//        User user = new User();
//        user.setUserName("Dominik");
//        user.setEmail("mdominn.molenda@gmail.com");
//        user.setPassword("mdominn");

        UserDao userDao = new UserDao();
//        userDao.create(user);
//        User user=userDao.read(2);
//        System.out.println(user.toString());
//        user.setUserName("piotrek");
//        userDao.update(user);
//        System.out.println(userDao.read(2).toString());
        userDao.delete(2);


    }


}
