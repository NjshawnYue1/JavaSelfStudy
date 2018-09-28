/*
 * 老虎类(Tigger)的特殊属性性别tiggerSex，特有的吃、睡及游泳行为。
 */

public class Tiger extends Animal {

  private String tigerSex;

  Tiger(String tigerSex) {
    super(30, "yellow");
    this.tigerSex = tigerSex;
  }

  @Override
  public void eat() {
    System.out.println("Tiger eat");
  }

  @Override
  public void sleep() {
    System.out.println("Tiger sleep");
  }

  @Override
  public void swim() {
    System.out.println("Tiger swim");
  }

  public String getTigerSex() {
    return tigerSex;
  }

  public void setTigerSex(String tigerSex) {
    this.tigerSex = tigerSex;
  }
}
