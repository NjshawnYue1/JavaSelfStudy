package NextSetpSelfStudy;

import NextSetpSelfStudy.OuterDemo.Inner2;

/**
 * @author ShawnYue
 * @date 2018-10-10 11:26
 */
public class TestOuterDemo {

  public static void main(String[] args) {
    OuterDemo outerDemo = new OuterDemo();
    OuterDemo.Inner1 inner1 = new OuterDemo().new Inner1();
    Inner2 inner2 = new Inner2();
    OuterIFC outerIFC = new OuterIFC() {
      @Override

      public void method() {
        System.out.println("rr");

      }
    };
    outerIFC.method();
    OuterIFC outerIFC1 = outerDemo.getInstance();
    outerDemo.outerMethod();
    outerDemo.outerMethod1();
    outerDemo.outerMethod2();
  }

}
