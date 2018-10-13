package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-10 18:49
 *
 * 匿名内部类的前提 必须继承或者实现一个外部类或者接口
 *
 * 匿名子类对象 格式: new 父类(){覆盖父类的方法};
 */
public class InnerClassDemo {

  public static void main(String[] args) {

  }

}

abstract class FuncDemo {

  abstract void show();
}

class Outer {

  int num = 4;

  //  class Inner extends FuncDemo{
//
//    void show() {
//      System.out.println(" show run " + num);
//    }
//  }
  public void method() {
    new FuncDemo() {//匿名内部类
      void show() {
        System.out.println("show.." + num);
      }
    }.show();//上下两段代码完成了同一个动作 也就是所谓的子类对象
//    new Inner().show();//匿名对象 如果是匿名内部类就没法new这个类的对象
  }
}

