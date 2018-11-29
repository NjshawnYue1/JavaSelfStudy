package Experiment5;

/**
 * @author ShawnYue
 * @date 2018-11-09 13:29
 */

//此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。
//  排序的类中先写一个方法用来声明你想让你类中的属性根据什么规则来排序
  //现在我们创建了一个Person类，存了名字和年龄，我们也重写了toString方法来获取输出对象的年龄（age）和名字
public class Person implements Comparable<Person> {

  private Integer id;
  private String name;

  public Person() {
  }

  public Person(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [id：" + this.id + ",姓名是：" + this.name+"]";
  }

  @Override
  public int compareTo(Person p) {
    return p.getId() - this.getId();
  }
}
