/*(2)兔子类(Rabbit)有一个特殊属性年龄age，特有的吃、睡行为；
	(3)编写一个测试类AnimalTest，要求:
以多态的方式，对各种动物进行测试。要依据不同的不同，进行相应的各种行为的测试。
*/

public class Rabbit extends Animal {

  private int age;

  Rabbit(int age) {
    super(30, "white");
    this.age = age;

  }

  @Override
  public void eat() {
    System.out.println("Rabbit eat");
  }

  @Override
  public void sleep() {
    System.out.println("Rabbit sleep");
  }

  @Override
  public void swim() {
    System.out.println("Rabbit cannot swim");
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

