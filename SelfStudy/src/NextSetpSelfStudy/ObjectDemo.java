package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-09 22:18
 */
public class ObjectDemo {

  public static void main(String[] args) {
    Person person = new Person(20);

    Person person1 = new Person(30);

    Demo demo = new Demo();

    System.out.println(person.equals(demo));
  }

}

class Demo {

}

class Person {

  private int age;

  Person(int age) {
    this.age = age;
  }

  //比较Person的年龄是否相同
  public boolean equals(Object object) {
    if (object instanceof Person) {
      Person person = (Person) object;
      return this.age == person.age;
    }
    throw new ClassCastException("类型错误");

  }
}
