/**
 * @author ShawnYue
 * @date 2018-10-08 21:39
 *
 * 多态中 成员的特点： 1 成员变量
 *
 * 两个变量虽然名称相同但是作用域是不同的而且覆盖只会发生在方法之间 变量是不会覆盖的 可以理解成  在多态定义对象的前提下不同类里的变量都是特有的 要是想访问都必须先转型
 *
 * 2 成员函数（非静态） 编译时会看父类有没有该成员函数如果有则编译通过 没有则编译失败 但是在运行时 如果编译通过会运行子类的方法 因为子类重写了父类的方法
 *
 * 3 静态函数 静态方法在类加载的时候就存在了，所以即使对象有多态性但是却和他创建的究竟是什么对象无关 而只和他的多态上的另一个类型有关。并且调用静态方法是不需要使用对象的
 */
public class PolymorMemberCharacterDemo {

  public static void main(String[] args) {
    Num1 num1 = new Num2();
//    System.out.println(num1.num);
    num1.method();
  }
}

class Num1 {

  int num = 10;

  public static void method() {
    System.out.println("Fu static method");
  }
}

class Num2 extends Num1 {

  int num = 20;

  public static void method() {
    System.out.println("Zi static method");
  }
}
