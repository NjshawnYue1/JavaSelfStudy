/**
 * @author ShawnYue
 * @date 2018-10-07 20:04
 *
 *
 * 提高了代码的扩展性，多态性使得后来产生的继承他的新类在方法中都可以使用父类的类型去接受新来的数据 抽象类中定义的内容不能调用子类特有的内容
 * 在本例中就是不可以使用Animal类型的对象去使用Cat类里的其他方法 如果需要使用将会被强制转换成子类类型的对象去使用
 *
 * 多态的前提： 类与类之间必须要有关系 继承 实现 方法之间会存在覆盖
 */
public class AnimalTestDemo {

  public static void main(String[] args) {
    CatDemo cat = new CatDemo();
    DogDemo dog = new DogDemo();
    PigDemo pig = new PigDemo();
    //AnimalDemo cat1 = new CatDemo();向上转型  继承为这个语句提供了前提 猫对象提升为了动物类型
    //类型提升后动作就会受到局限性 就无法访问子类的特有功能
    //作用就是可以限制对子类特有功能的访问 如果想要使用子类的特有功能 就需要该对象
    //进行向下转型 （CatDemo）cat1 ;((CatDemo) cat1).catchMouse();
    //其实就是 这个对象可以使用父类中的各种方法 如果子类重写了父类中的部分方法也可以调用 但是如果需要使用子类的特有方法 就需要向下转型
    //转型都是子类对象在改变类型
    method(cat);
    method(dog);
    method(pig);


  }

  public static void method(AnimalDemo animal) {//接受了所有继承了它的类的类型的对象
    animal.eat();
    if (animal instanceof CatDemo) {//用于判断对象的具体类型 只能用于引用数据类型的判断
      CatDemo c = (CatDemo) animal;
      c.catchMouse();
    } else if (animal instanceof DogDemo) {
      DogDemo d = (DogDemo) animal;
      d.bark();
    }
    /**
     * 如果需要使用子类特有方法，
     * 那么在向下转型之前应该判断一下该对象的类型
     *
     * */
  }

}

abstract class AnimalDemo {

  abstract void eat();

}

class CatDemo extends AnimalDemo {

  @Override
  void eat() {
    System.out.println("吃鱼");
  }

  void catchMouse() {
    System.out.println("抓老鼠");
  }
}

class DogDemo extends AnimalDemo {

  @Override
  void eat() {
    System.out.println("吃骨头");
  }

  void bark() {
    System.out.println("汪汪");
  }

}

class PigDemo extends AnimalDemo {

  @Override
  void eat() {
    System.out.println("吃饲料");
  }
}