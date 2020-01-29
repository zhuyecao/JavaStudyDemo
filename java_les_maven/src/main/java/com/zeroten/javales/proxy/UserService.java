package com.zeroten.javales.proxy;

public class UserService {
    public static void noProxy(){
        User user1 = new User("张三", 17);
        UserDao ud = new UserDaoImpl();
        ud.save(user1);
        User user2 = new User("", 20);
        ud.save(user2);
        User user3 = new User("李四", -12);
        ud.save(user3);
    }

    public static void staticProxy(){
        UserDao udi = new UserDaoImpl();
        UserDao udsp = new UserDaoStaticProxy(udi);
        User user1 = new User("张三", 17);
        udsp.save(user1);
        User user2 = new User("", 20);
        udsp.save(user2);
        User user3 = new User("李四", -12);
        udsp.save(user3);
    }
    public static void main(String[] args){
//        无代理的情况
//        noProxy();

//        静态代理
        staticProxy();
    }
}
