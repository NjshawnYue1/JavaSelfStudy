/*
* 静态代码块
*hh
show run
虽然没有调用 但是因为是静态代码块 在创建对象时类被加载
而静态方法随着类的加载而加载所以也会运行

但是第二次创建对象的时候 类已经被加载了
只加载一次

用于给类进行初始化
如果类里的方法也是静态的 那么就不需要创建该类对象
直接使用类名.方法就可以调用了

如果是静态变量
就使用静态代码块去初始化这个变量

* */

class StaticCode{
  static
  {
    System.out.println("hh");
  }
  void show(){
    System.out.println("show run");
  }

}
public class StaticCodeDemo {

  public static void main(String[] args) {
    new StaticCode().show();
  }

}
