package com.zeroten.javales.inherit;

import org.testng.annotations.Test;

public class AbstractTest {
//    抽象类：在⽗类中只进⾏功能定义⽽不实现它，具体的实现由⼦类来实现，类和方法都要用abstract进行修饰
//    1、包含⼀个或多个抽象⽅法的类必须被声明为抽象类
//    2、继承抽象类的⼦类也可以被定义为抽象类，这时可以不用实现⽗类中的抽象⽅法；如果未被定义为抽象类，则
//      ⼦类必须实现⽗类中所有的抽象⽅法。
//    3、抽象类不能被实例化，也就是不能⽤于 new 操作符。
    @Test
    public void testAbstract(){
        Person t = new Teacher();
        System.out.println(t.getDesc());
        Person s = new Student();
        System.out.println(s.getDesc());
    }
}
