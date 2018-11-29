/**
 * @author uthor ShawnYue
 * @date 2018-10-02 20:32
 *
 *
 * 接口的定义不是class而是interface 但抽象类中可以有抽象方法也可以有非抽象的方法 接口中的权限必须是最大的
 * interface编译之后还是class文件
 *
 * interface Demo{}
 *
 * 接口中常见的成员 而且这些成员都有固定的修饰符 如果没有写这些修饰符 编译时会自动加上 全局常量 public static final 抽象方法 public abstract
 *
 * 类与类之间是继承关系 类与接口之间是实现关系 接口不可以实例化
 *
 * 只能有实现了接口的子类并且覆盖了所有接口中的抽象方法后 该子类才可以实例化 否则这个子类就是一个抽象类
 *
 * 一个类在继承另一个类的同时还可以实现多个接口 避免了单继承的局限性
 *
 * 接口与接口之间是继承关系 并且 接口可以多继承 因为接口还是没有具体的方法体 而之所以不能多继承就是因为方法体之间的调用局限性;
 */
public class InterfaceDemo {

  public static void main(String[] args) {
    InterfaceImpl interfaceImpl = new InterfaceImpl();
    interfaceImpl.show();
    System.out.println(interfaceImpl.NUM);
    //    InterfaceDemo interfaceDemo = new InterfaceDemo();

  }

}

class InterfaceImpl implements InterTest {

  public void show() {
    System.out.println("aa");
  }
}

interface InterTest {

  int NUM = 100;

  void show();
}
