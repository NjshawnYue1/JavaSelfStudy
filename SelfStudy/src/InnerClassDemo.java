/**
 * @author ShawnYue
 * @date 2018-10-09 19:23
 *
 * 内部类可以直接访问外部类的成员 外部类要访问内部类 需要创建内部类的对象
 *
 * 如果要去描述一个事物 在这个事物中还包含了其他事物并且包含的事物还会访问到这个事物的一些数据
 *
 * 比如body中包含hear lung等 可以定义在外部 但最好定义在内部
 *
 * 内部类的逐级访问
 *
 * 但是如果内部类不是静态的 则里面不可以定义静态成员 反之则需要都是静态的
 *
 * 为什么内部类能直接访问外部类的成员？ 因为内部类持有外部类的引用 即 外部类.this
 */
public class InnerClassDemo {

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.method();
//    Outer.Inner inner = new Outer().new Inner();
//    inner.show(); 如果内部类被私有化 就无法通过这种方式创建对象
//    如果把内部类静态 那么在外部类加载的时候内部类就会存在 此时这个内部类就相当于一个外部类
    //但是此时需要访问的成员变量也需要静态才可以被这个静态的内部类访问
  }

}

class Outer {

  private static int num = 3;

  static class Inner {

    static void show() {
      System.out.println(" show run " + num);
    }
  }

  public void method() {
    Outer.Inner.show();
  }
}