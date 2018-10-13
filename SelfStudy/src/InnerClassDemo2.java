/**
 * @author ShawnYue
 * @date 2018-10-09 21:24
 *
 * 内部类的位置是任意的
 * 内部类在局部位置上只能访问被final修饰的局部变量
 */
public class InnerClassDemo2 {

  public static void main(String[] args) {
//    Outer1 outer1 = new Outer1();
//    outer1.method();
    Outer1 outer1 = new Outer1();
    outer1.outerMethod();
  }

}

class Outer1 {

  Object object;

  public void outerMethod() {
    int x = 5;

    class Inner {

      public String toString() {
        System.out.println(x);

        return null;
      }
    }
    Inner inner = new Inner();
    inner.toString();

    object = inner;
  }
}
//class Outer1 {
//
//  int num = 1;
//
//  void method() {
//    final int  X = 9;// 如果没有被声明为final jdk会默认加上隐式的final
//    class Inner {
//
//      void show() {
//        System.out.println(" show run " + X);
//      }
//
//    }
//    Inner inner = new Inner();
//    inner.show();
//  }
//
//}
