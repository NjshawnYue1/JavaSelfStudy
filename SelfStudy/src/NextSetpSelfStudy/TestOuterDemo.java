package NextSetpSelfStudy;

import NextSetpSelfStudy.OuterDemo.Inner2;

/**
 * @author ShawnYue
 * @date 2018-10-10 11:26
 */
public class TestOuterDemo {

  public static void main(String[] args) {
    OuterDemo outerDemo = new OuterDemo();
    OuterDemo.Inner1 inner1 = new OuterDemo().new Inner1(); //创建内部类对象
    Inner2 inner2 = new Inner2();//静态内部类相当于外部类
    OuterIFC outerIFC = new OuterIFC() {
      @Override

      public void method() {
        System.out.println("覆写了匿名内部类中的方法");

      }
    };//创建匿名内部类对象并重写类中的方法
    outerIFC.method();
    OuterIFC outerIFC1 = outerDemo.getInstance();//单例设计模式，对象可以被所有类使用且只被实例化一次 返回了他在内存中的地址
    outerDemo.outerMethod();
    outerDemo.outerMethod1();
    outerDemo.outerMethod2();//通过调用类中的方法创建了定义在方法中的局部内部类对象
    System.out.println(outerIFC1);
  }

}
