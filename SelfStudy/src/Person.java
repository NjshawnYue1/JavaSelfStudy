/**
 * Created by Admin on 2017/9/20.
 * 编写一个Person类，此类包含name、age属性，在此类中写main方法，并且在main方法中创建Person类型的对象为声明的Person类型的变量赋值。编译并执行程序。
 *
 * 编写一个Person类，此类包含name, age属性，为name属性赋初始值“Mark”，初始化age为27。
 * 在此类中写main方法，并且在main方法中声明Person类型的变量，创建Person类型的对象，通过打印语句把Person类的name属性值打印出来。 编译并执行程序。
 */
public class Person {
    String name;
    int age;

    public static void main(String[] args) {

        Person p = new Person();
        p.name="Mark";
        p.age=27;
        System.out.println(p.name+" : " + p.age);

    }
}
