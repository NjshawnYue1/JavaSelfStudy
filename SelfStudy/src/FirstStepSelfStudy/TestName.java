package FirstStepSelfStudy;

/**
 * Created by Admin on 2017/9/22.

 * 声明Pet类，包含：
 属性name，值为“pet”；属性weight。
 方法say()，方法中打印输出“I’m a ” + name。
 分别编写Dog类和Cat类来继承 Pet类，相应 的name 属性值变为“dog”和“cat”，覆盖say()方法。
 */


 abstract class Pet {
     String name = "pet";
     double weight = 10;

    abstract void say();

}

 class Dog extends Pet{
    String name = "dog";

    Dog(){
        super();
    }
    void say(){
        System.out.println("I'm a " + name + " : " + weight);
    }
}

class Cat extends Pet{
    String name = "cat";
    Cat(){
        super();
    }
    void say(){
        System.out.println("I'm a " + name + " : " + weight);
    }
}
/**
 * 继续使用上一章的Pet、Dog和Cat类。
 编写Test类：
 包含test方法，方法接收的参数为Pet类型。在方法中判断参数所传入对象的真实类型，并将其还原，同时打印输出相应的提示信息。
 在main方法中分别创建Pet、Dog和Cat实例，并分别以这些实例调用 test()方法。
 */

class Test{
    Pet pet1 = new Cat();
    Pet pet2 = new Dog();
    public void Identify(Pet p){
        if (p == pet1){
            pet1.say();
        }
        else if(p == pet2){
            pet2.say();
        }
    }
}
/*

*  编写Test类，包含main方法。在方法中实例 Dog和Cat，并调用 say()方法打印输出

*  */
public class TestName{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
//        t.Identify(d);
//        t.Identify(c);
        d.say();
        c.say();
    }
}
