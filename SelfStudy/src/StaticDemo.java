public class StaticDemo {

  public static void main(String[] args) {
    PersonDemo3 p = new PersonDemo3();
    p.name = "qq";
    p.show();


  }

}

class PersonDemo3{
  String name;
  static String conuntry = "CN";
  /*static修饰的变量先于对象存在  因为不知道会存在什么样的对象但是country是共有的 对象里的变量是特有的
  可以没有对象但是有类
  同时也可以直接被类名调用这个变量 不用创建对象就可以调用  即Person.country 类名.静态成员
1  生命周期不同
成员变量又叫做实例变量，随着对象的出现而存在 或 消失
静态变量是随着类的加载而存在的 随着类的消失而消失

2  调用方式不同
成员变量只能被对象调用
而静态变量可以被对象和类名调用  最好使用类名调用 这样调用可以直接看出这个变量是静态成员


3  别名不同
成员变量叶成文实例变量
静态变量称为类变量

4  数据的存储位置不同
成员变量中的数据存储在堆（放实体）内存的对象中 对象的特有数据
静态变量数据存储在 方法区（的静态区）  寄存器 本地方法区 堆 栈  五个内存区


注意：

静态方法只能访问静态变量
静态内容事先加载的
非静态既可以访问静态又可以访问非静态

静态方法中不可以使用this super关键字

主函数是静态的

如果主函数调用了其他函数且被调函数是非静态的那么就需要通过创建对象来访问该方法

静态什么时候用

1.静态变量
对象所具备的成员变量的值都是“相同的” 那么这个成员就可以被静态修饰
2.静态函数
函数是否用静态修饰，该函数功能是否有访问到对象中的特有数据
看该功能是否需要访问非静态的成员变量
*/
  public void show(){
    System.out.println(name+":"+PersonDemo3.conuntry); //省略的是类名 而成员变量name前面省略的是this
  }
  // 如果把这个方法改为静态方法，则无法访问name
  // 无法从静态上下文中访问非静态变量

}