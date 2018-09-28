/*
* (1)动物(Animal)分为：兔子(Rabbit)、老虎(Tigger)。其中动物类(Animal)为抽象出来的动物父类，有表示动物的重量weight、颜色color；动物的吃(eat())、
* 睡(sleep())及游泳(swim())的抽象行为；以及相应的构造方法。
	(2)兔子类(Rabbit)有一个特殊属性年龄age，特有的吃、睡行为；老虎类(Tiger)的特殊属性性别tigerSex，特有的吃、睡及游泳行为。
	(3)编写一个测试类AnimalTest，要求:
以多态的方式，对各种动物进行测试。要依据不同的不同，进行相应的各种行为的测试。


*/

public abstract class Animal {

  private double weight;
  private String color;

  Animal(double weight, String color) {
    this.color = color;
    this.weight = weight;
  }

  public abstract void eat();


  public abstract void sleep();

  public abstract void swim();

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
