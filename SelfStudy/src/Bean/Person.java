package Bean;

import java.util.Objects;

/**
 * @author ShawnYue
 * @date 2018-11-29 11:05
 */
public class Person implements Comparable<Person> {

  /*
   * 对需要进行比较的类去实现这个接口然后在接口中指定具体的比较对象的类型
   * 如果不指定那么在接口中默认的类型是object
   * 那么在下面覆写compareTo方法是就需要把object重新再转回本类类型
   * 那么就应该在实现接口时直接指定需要比较的对象类型
   * */
  private String name;
  private int age;


  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "姓名是：" + name + "年龄是：" + age;
  }

  @Override
  public int compareTo(Person person) {
    return this.age - person.age;
  }

  /*这个方法来自于object类，而在object类中是没有定义泛型的所以没有办法改变函数中参数的类型
   * 如果要覆写则必须进行强制类型转换 直接用编译器生成吧...*/

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Person other = (Person) obj;
    return Objects.equals(this.name, other.name)
        && Objects.equals(this.age, other.age);
  }
}
