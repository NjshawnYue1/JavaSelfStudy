package API;

/**
 * @author ShawnYue
 * @date 2018-10-29 18:19
 */
public class Person {

  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
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
  public int hashCode() {
    return name.hashCode()+age;
  }

  @Override
  public boolean equals(Object obj) {

    Person person = (Person)obj;
    return this.name.equals(person.name)&&this.age == person.age;
  }
}
