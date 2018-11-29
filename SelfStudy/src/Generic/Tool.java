package Generic;

/**
 * @author ShawnYue
 * @date 2018-11-29 15:51
 */

//public class Tool {
//  private Object object;
//
//  public Object getObject() {
//    return object;
//  }
//
//  public void setObject(Object object) {
//    this.object = object;
//  }
//}
/*在jdk1.5后使用泛型接受要操作的引用数据类型 称之为泛型类
 * 当类中操作的引用数据类型不确定的时候使用泛型来表示
 * 没有泛型的时候使用的是object*/
public class Tool<E> {

  private E e;

  public E getE() {
    return e;
  }

  public void setE(E e) {
    this.e = e;
  }

  public <T> void show(T t) {
    System.out.println("show : " + t);
  }

  public void myPrint(E e) {
    System.out.println("myPrint : " + e);
  }

  //方法静态的时候没有办法访问声明在类上的泛型 如果静态方法需要使用泛型 则应该将泛型定义在静态方法上
  //泛型要放在返回值类型的前面 修饰符的后面
  public static <W> void method(W w){
    System.out.println("method : " + w);
  }
}
