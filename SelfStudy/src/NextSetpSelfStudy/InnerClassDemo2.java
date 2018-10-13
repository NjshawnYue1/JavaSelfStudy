package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-10 19:04
 *
 *
 */
public class InnerClassDemo2 {

  public static void main(String[] args) {

  }

  public static void show(Inter inter){

  }

}

interface Inter {

  void show1();

  void show2();
}

class Outer2 {
  //  class Inner implements Inter{
//    public void show1(){}
//    public void show2(){}
//  }
  public void method() {
//    Inner inner = new Inner();
//    inner.show1();
//    inner.show2();
    Inter inter = new Inter() {
      public void show1() {
      }

      public void show2() {
      }

    };
    inter.show1();
    inter.show2();
  }

}
