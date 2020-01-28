package com.zeroten.javales.inherit;

import java.util.Date;
import org.testng.annotations.Test;

//⼦类在构造的时候，执⾏⼦类构造器之前必定会先执⾏⽗类的构造器，
// 如果⼦类的构造器中没有显式的调⽤⽗类的构造器，系统将⾃动调⽤⽗类的没有参数的默认构造器，
// ⼦类调⽤⽗类构造器时使⽤ super 关键字，且语句只能出现在⼦类构造器⽅法中的第⼀句

//如果类中没有定义有参构造器，则程序会默认创建无参构造器，
// 但类一旦定义了有参构造器时，如果没有显式定义无参构造器，则创建子类或创建类的实例时使用无参构造会报错

public class EmployeTest {
    @Test
    public void testInherit(){
        Employee gs1 = new Employee();
        gs1.setName("温小八");
        gs1.setHireDay(new Date());
        gs1.setSalary(4000);
        System.out.println(gs1.printInfo());
        System.out.println("-----------------------");
        Employee gs2 = new Employee("小七", new Date(), 4500);
        System.out.println(gs2.printInfo());
        System.out.println("-----------------------");

        Manager mg1 = new Manager();
        mg1.setName("问小二");
        mg1.setHireDay(new Date());
        mg1.setBonus(2000);
        mg1.setSalary(7000);
        System.out.println(mg1.printInfo());
        System.out.println("-----------------------");
        Manager mg2 = new Manager("小六", new Date(), 5700);
        System.out.println(mg2.printInfo());
        System.out.println("-----------------------");
        Manager mg3 = new Manager("小六", new Date(), 5700, 3000);
        System.out.println(mg3.printInfo());
        System.out.println("-----------------------");

        System.out.println("----------多态-----------");
        Employee ey;
        ey = gs1;
        System.out.println(ey.printInfo());

        ey = mg1;
        System.out.println(ey.printInfo());
    }

    @Test
    public void testTypeConversion(){
        Manager mg1 = new Manager();
        Employee ey = mg1;
        Manager mg2 = (Manager) ey;

        if(mg2 instanceof Manager){
            System.out.println("mg2是个Manager类");
        }else if(mg2 instanceof Employee){
            System.out.println("mg2是个Employee类");
        }
    }

    @Test
    public void testObjectMethod(){
        Employee employee = new Employee();
        System.out.println(employee.getClass());
        System.out.println(employee.getClass().getName());
        System.out.println(employee.getClass().getSimpleName());
        System.out.println(employee.hashCode());
        System.out.println(Integer.toHexString(employee.hashCode()));
        System.out.println(employee.toString());

        int[] arr = new int[0];
        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getName());
        System.out.println(arr.getClass().getSimpleName());
        System.out.println(arr.hashCode());
        System.out.println(Integer.toHexString(arr.hashCode()));
        System.out.println(arr.toString());

//        employee2虽然是用Employee声明，但是其指向的是Manager
        Employee employee2 = new Manager();
        System.out.println(employee2.getClass());
        System.out.println(employee2.getClass().getName());
        System.out.println(employee2.getClass().getSimpleName());
        System.out.println(employee2.hashCode());
        System.out.println(Integer.toHexString(employee2.hashCode()));
        System.out.println(employee2.toString());
    }
}
