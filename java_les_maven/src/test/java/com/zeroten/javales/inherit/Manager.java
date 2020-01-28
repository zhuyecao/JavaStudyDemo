package com.zeroten.javales.inherit;

import java.util.Date;

public class Manager extends Employee{
    private Integer bonus;

    public Manager(){
        System.out.println("调用了Manager无参构造器");
    }

    public Manager(String name, Date hireDay, Integer salary){
        super(name, hireDay, salary);
        System.out.println("调用了Manager有参构造器，调用了父类有参构造器");
    }

    public Manager(String name, Date hireDay, Integer salary, Integer bonus){
        System.out.println("调用了Manager有参构造器");
        this.setName(name);
        this.setHireDay(hireDay);
        this.setSalary(salary);
        this.setBonus(bonus);
    }

    public Integer getBonus() {
        if (bonus == null)
            return 0;
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    public Integer getSalary(){
        if(getBonus() == null)
            return super.getSalary();
        return super.getSalary() + bonus;
    }

    @Override
    public String printInfo(){
        StringBuilder info = new StringBuilder();
        info.append("员工姓名：");
        info.append(getName());
        info.append("，入职时间：");
        info.append(getHireDay());
        info.append("，奖金：");
        info.append(getBonus());
        info.append("，本月总薪水：");
        info.append(getSalary());

        return info.toString();
    }
}
