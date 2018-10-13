package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-12 13:47
 *
 * 创建一个class具备private　数据成员和private方法。 撰写一个内部类（inner class），使其方法修改外围类（outer
 * class）数据成员，并调用外围类（outer　class）方法。 请在第二个外围类（outer class）方法中产生内部类（inner class）对象，
 * 并调用其方法。试说明对外围类（outer class）对象的影响。
 */
public class OuterDemo2 {

  private int i, j, sum = 0;

//  OuterDemo2(int i, int j) {
//    this.i = i;
//    this.j = j;
//  }

  private void addNum(int i, int j) {
    sum = i + j;
    System.out.println(sum);
  }

  abstract class Inner {

    public abstract void show();

    public abstract void test();


  }

  public void method() {
    Inner inner = new Inner() {
      @Override
      public void show() {
        i = 4;
        j = 5;
        System.out.println(i + "........." + j);
      }

      @Override
      public void test() {
        addNum(3, 4);
      }

    };
    inner.show();
    inner.test();
  }

//  new Inner() {
//
//    public void show() {
//      i = 4;
//      j = 5;
//      System.out.println(i + "........." + j);
//    }
//
//    public void test() {
//      addNum(3, 4);
//    }
//
//    public void test1() {
//      class Inner1 {
//
//        void show() {
//          System.out.println("show run");
//        }
//      }
//      Inner1 in = new Inner1();
//      in.show();//创建外部类方法中的内部类对象 并调用本类中的show方法
//    }
//  }

  public static void main(String[] args) {
//    OuterDemo2.Inner inner = new OuterDemo2().new Inner();//创建内部类对象
//    inner.test();
//    inner.show();
//    inner.test1();
    /**使用匿名类修改上一题中的内部类（inner class）
     上述源程序，经编译后，有哪些.class文件，分别对应是那些类（或接口）
     */
    OuterDemo2 outerDemo2 = new OuterDemo2();
    outerDemo2.method();//匿名内部类的方法调用

  }
}
