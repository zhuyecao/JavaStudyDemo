package com.zeroten.javales.proxy;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(User user){
        System.out.println("save success, name: " + user.getName() + ", age: " + user.getAge());
        return true;
    }
}
