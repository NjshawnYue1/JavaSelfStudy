/**
 * @outhor ShawnYue
 * @create 2018-09-28 9:24
 *
 * 如果一个子类定义了一个和父类静态方法中相同的方法（即方法名，参数和返回类型相同），则该类隐藏了父类中的这个方法。
 * 而该隐藏的静态方法是否被调用，取决于是父类（引用）还是子类（引用）调用了该静态方法
 *
 * 静态的都不能覆盖，要么全静态，要么全非静态。
 *
 * 方法定义成静态的时候没法通过创建该类对象访问？
 * 静态方法不依赖于对象的创建，应直接使用类名点方法名访问函数,可以通过创建对象访问
 * 但如果没有访问特定的数据那么创建对象等于浪费空间
 *
 * 而对于非静态方法，在对象创建的时候程序才会为其分配内存，
 * 然后通过类的对象去访问非静态方法。因此在对象未存在时非静态方法也不存在，而静态方法自然不能调用一个不存在的方法。
 *
 * 如果类中只有静态方法那么应当将构造函数私有化
 *
 * 如果在静态方法中调用非静态方法，那么需要先创建对象，再通过对象名.方法名（）
 * 在非静态方法中，可以使用静态方法和静态变量
 *
 *
 *
 */

class Fu{
  Fu(){
    System.out.println("Fu run");
  }
  public static void show(){
    System.out.println("Fu show");
  }
}

class Zi extends Fu{
  Zi(){
    /**
     * 子类构造函数的第一行有一句隐式调用的super(); 执行父类的空参构造函数
     * 如果父类中的构造函数是有参数的 可以使用super(param);调用
     * 构造函数虽然没有继承但是是用super访问的
     * 子类中所有的构造函数都会去访问父类中的空参构造函数super();
     *
     * 为什么子类要访问父类中的构造函数？
     *
     * 子类继承了父类，获取到了父类中的内容（属性） 所以在使用父类内容之前要先看父类是如何对自己的内容进行初始化的
     * 所以子类在构造对象时必须访问父类的构造函数
     *
     * super语句必须定义在子类构造函数的第一行 因为父类的初始化动作要先完成
     * 如果在子类构造函数中使用this调用了本类的构造函数，那初始化的super就没有了
     * 因为this和super都必须在第一行初始化，但是在调用本类的空参构造函数时，本类的空参构造函数的第一行是有super的
     * 所以还是相当于先初始化了父类
     */
    System.out.println("zi run");
  }
  public static void show(){
    System.out.println("Zi show");/*子类如果要覆写父类的方法，该方法的访问权限应该和父类一样或者大于父类*/
  }
}
public class ExtendsDemo {

  public static void main(String[] args) {
//    Zi zi = new Zi();
//    zi.show();
    NewPhone newphone = new NewPhone();
    newphone.show();
    new Zi();
  }

}
/**什么时候使用覆盖?
 *
 * 初始的手机只具备显示号码的功能 那么后来新增的功能怎么增加呢
 * 显然修改源代码是不合适的
 * 此时可以在子类中覆写父类中的方法
 *
 * 当对一个类进行子类的扩展时，子类要保留父类的功能声明（方法名相同）
 * 但要定义子类中该功能的特有内容（重写方法的内容）
 *
 * */
class Phone{
  void show(){
    System.out.println("number");
  }
}

class NewPhone extends Phone{
  void show(){
    super.show();
    System.out.println("pic");
    System.out.println("name");
  }
}
