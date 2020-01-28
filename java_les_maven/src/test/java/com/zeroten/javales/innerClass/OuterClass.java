package com.zeroten.javales.innerClass;

public class OuterClass {
    private Integer age;
    private String name;

    public OuterClass(Integer age, String name){
        this.age = age;
        this.name = name;
    }
//    内部类：定义在另一个类中的类
    class InnerClass{
//        成员内部类中不能存在任何 static 的变量和⽅法，但可以定义常量
//        private static Integer age;
        private final  int id = 100;
        private String name;

        public InnerClass(String name){
            this.name = name;
        }
        public String printInfo(){
//            内部类的⽅法可以访问该类定义所在的作⽤域中的数据，包括私有数据。
//            在内部类中使⽤外围类引⽤的正规语法：OuterClass.this 表示外围类引⽤；
//            如果未使⽤此前缀时，默认访问内部类定义的属性和⽅法，内部类不存在相同的属性和⽅法时则访问外围类的属性和⽅法
            StringBuilder info = new StringBuilder();
            info.append("我是 ");
            info.append(OuterClass.this.name);
            info.append(" ,我今年 ");
            info.append(age);
            info.append(" 岁了，我的小名叫 ");
            info.append(name);
            return info.toString();

        }
    }

//    局部内部类：定义在方法或者代码块中的类
    public String printInfo(){
//        局部内部类不能使⽤ public、protected 或 private 访问修饰符进⾏声明，
//        因为它的作⽤域被限定在声明这个局部类的块中。跟方法中变量一样不能被public、protected 或 private修饰
//        如public String name会报错，public class LocalInnerClass{}同样会报错
        String name = "xiaoba";
//
        class LocalInnerClass{
            int height = 157;
//            局部内部类访问⽅法中的局部变量，java8之前必须要用final修饰，java8开始，可以不用加，默认会用final修饰
//            height = 160;     //这句会编译报错,java8开始，默认final修饰，不能修改
            public String getInfos(){
                StringBuilder info = new StringBuilder();
                info.append("我是 ");
                info.append(OuterClass.this.name);
                info.append(" ,我今年 ");
                info.append(age);
                info.append(" 岁了，我的小名叫 ");
                info.append(name);
                return info.toString();
            }
        }
        StringBuilder infos = new StringBuilder();
        infos.append("局部内部类，定义在方法中的类，具体信息：");
        infos.append((new LocalInnerClass().getInfos()).toString());
        return infos.toString();
    }

//    匿名内部类：对于局部内部类，如果只创建这个类的⼀个实例对象，那么就没必要给它命名了。这种没有名字的内
//    部类，我们称为匿名内部类

//    继承接口的匿名内部类
    public String eatFood(String food){
        String eatInfo = new EatInterface(){
            @Override
            public String eat(String foodName){
                StringBuilder infos = new StringBuilder();
                infos.append(OuterClass.this.age);
                infos.append("岁的");
                infos.append(OuterClass.this.name);
                infos.append("正在吃");
                infos.append(foodName);
                return infos.toString();
            }
        }.eat(food);
        return eatInfo;
    }

//    继承抽象类的匿名内部类
    public String buySomething(String thing){
        String buyInfos = new buyAbstract(){
            @Override
            public String buy(String thing){
                StringBuilder infos = new StringBuilder();
                infos.append(OuterClass.this.name);
                infos.append("正在买");
                infos.append(thing);
                return infos.toString();
            }
        }.buy(thing);
        return buyInfos;
    }


    public void printOther(){
        //    以下说明是否匿名内部类：
        new PrintClass().print();   //非匿名内部类，匿名内部类是会间接定义一个新类的，这里没有创建新的类
        new PrintClass(){}.print(); //是匿名内部类，带上{}表明PrintClass被继承且重写了，只是这里没有重写而已，有创建新的类
    }

    public static void main(String[] args){
//        1. 在包含它的作⽤域范围内，直接使⽤ new 操作符来构造⼀个实例，和普通类的构造⽅式⼀样。
//        2. 在包含它的作⽤域范围外，使⽤ 外围类对象.new 内部类类名() 语法来创建；在作⽤域范围
//        外，我们这样来引⽤内部类：OuterClass.InnerClass，即创建内部类格式如下：
//        外部类类名.内部类类名 变量名 = 外部类具体对象.new 内部类();
        OuterClass oc = new OuterClass(26, "温晓陈");
        OuterClass.InnerClass ic = oc.new InnerClass("小八");
        System.out.println(ic.printInfo());

        System.out.println("---------局部内部类：方法中的类---------");
        OuterClass oc1 = new OuterClass(19, "纪晓岚");
        System.out.println(oc1.printInfo());

        System.out.println("---------匿名内部类：没有类名的类，接口---------");
        System.out.println(oc1.eatFood("watermalen"));

        System.out.println("---------匿名内部类：没有类名的类，抽象类---------");
        System.out.println(oc1.buySomething("<<三国演义>>"));
    }
}
