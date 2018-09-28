public class PersonDemo {

  public static void main(String[] args) {
    PersonDemo2 p = new PersonDemo2(12);
    PersonDemo2 p2 = new PersonDemo2(13,"Lily");
    p2.speak();
    p.speak();

  }
}
class PersonDemo2{
  //构造函数在另一个类中 变量定义为私有可以用对象的方法获取变量

  /*
  构造函数调用构造函数 用括号就可以代表是哪一个构造函数
  因为不同的构造函数中的参数是不一样的
  对this调用 “ 构造函数 ” 必须放在第一行  因为初始化的动作要先执行
  如：this.name = name;
  this("haha");
  初始化的时候避免递归调用
  会导致初始化的姓名变成哈哈 而不是自己传进去的参数
  可以用this调用其他构造函数
  */
  private int age;
  private String name;

  PersonDemo2(int age,String name){

    this(age);
    this.name = name;
  }
  PersonDemo2(int age){
    this.age = age;
  }
  public void speak(){
    System.out.println(this.name+" "+this.age+" "+": Hello");

}
/*  判断是否为同龄人
 * 调用这个方法的对象的年龄  和    传递进来的人的年龄进行比较  封装思想 上升到对象
 */

  public boolean compare(Person p){
    if(this.age == p.age)
      return true;
    else
      return false;
  }

}
