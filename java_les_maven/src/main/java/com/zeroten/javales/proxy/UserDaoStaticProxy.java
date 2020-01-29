package com.zeroten.javales.proxy;

public class UserDaoStaticProxy implements UserDao{
    private UserDao userDao;

    public UserDaoStaticProxy(UserDao userDao){
        this.userDao = userDao;

    }

    @Override
    public boolean save(User user){
        if(user.getName() == null ||user.getName() == ""){
            System.out.println("用户姓名不能为空");
            return false;
        }
        if(user.getAge() <= 0){
            System.out.println("用户年龄不规范");
            return false;
        }
        return userDao.save(user);
    }
}
