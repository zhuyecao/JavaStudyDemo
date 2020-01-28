package com.zeroten.javales.inherit;

import java.util.Date;

public class Employee {
    private String name;
    private Date hireDay;
    private Integer salary;

    public Employee(){
        System.out.println("调用了Employee无参构造器");
    }

    public Employee(String name, Date hireDay, Integer salary){
        System.out.println("调用了Employee有参构造器");
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String printInfo(){
        StringBuilder info = new StringBuilder();
        info.append("员工姓名：");
        info.append(getName());
        info.append("，入职时间：");
        info.append(getHireDay());
        info.append("，薪水：");
        info.append(getSalary());
        return info.toString();
    }
}
