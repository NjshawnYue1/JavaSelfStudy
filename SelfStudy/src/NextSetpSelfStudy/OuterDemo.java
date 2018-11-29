package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-10 11:19
 */
interface OuterIFC {

  void method();
}

public class OuterDemo {

  public class Inner1 {

  }  //内部类1

  public static class Inner2 {

  }
  // 内部类2

  private OuterIFC o = new OuterIFC() {
    int i = 1;

    public void method() {
      i++;
    }
  };//匿名内部类 继承抽象类或者实现了接口

  OuterIFC getInstance() {//创建单例返回地址
    return o;
  }

  void outerMethod() {
    class Inner31 {

    }
    class Inner41 {

    }
    Inner31 in = new Inner31();
  }// 定义在方法里的两个内部类并且创建了一个对象

  void outerMethod1() {
    class Inner32 {

    }
    class Inner42 {

    }
    Inner32 in = new Inner32();
  }

  void outerMethod2() {
    class Inner33 {

    }
    class Inner43 {

    }

    Inner33 in = new Inner33();
  }
}//end of class Outer

