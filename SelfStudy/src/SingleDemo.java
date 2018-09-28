/**
 * @outhor ShawnYue
 * @create 2018-09-27 14:11
 *
 *
 * 设计模式:对问题的行之有效的解决方式 解决问题的思想
 *
 * 单例设计模式
 * 保证一个类在内存中的 对象 唯一性
 *
 * 什么时候需要一个类只有一个对象？
 * 对于多个程序使用一个配置信息对象的时候 就需要保证该对象的唯一性
 *
 * 如何保证对象唯一性？
 * 不能让其他类创建该类对象
 * 在该类中创建一个本类实例
 * 对外提供一个方法让其他类可以获取该对象
 *
 * 步骤：
 * 1.让所有构造函数私有化
 * 2.通过new在本类中创建一个对象
 * 3.定义一个公有的方法返回该对象
 */
public class SingleDemo {

  public static void main(String[] args) {
    Single s = Single.getSingle(); // 方法和实例指向的是同一个对象 这里新的对象不是通过new来创建的
    TestDemo2 testDemo1 = TestDemo2.getInstance();
    testDemo1.setNum(20);
    System.out.println(testDemo1.getNum());
  }

}

class Single{
  private Single(){}
  private static Single single = new Single();//成员变量

  public static Single getSingle(){
    //可以在调用获取该类实例的时候在函数中加入其它参数 如果参数值不匹配则无法调用 public static Single getSingle(String name)
    return single;
  }
}

class TestDemo2{
  private int num;
  private static TestDemo2 TestDemo2 = new TestDemo2();
  private TestDemo2(){}
  public static TestDemo2 getInstance(){
    return TestDemo2;
  }
  public void setNum(int num){
    this.num = num;
  }

  public int getNum(){
    return num;
  }

}
