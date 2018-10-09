/**
 * @author ShawnYue
 * @date 2018-10-08 22:35
 */

interface USB {

  void work();

  void insert();
}

public class Mp3 implements USB {

  private String brand;

  public Mp3() {
    brand = "unknown";
  }

  public Mp3(String brand) {
    this.brand = brand;
  }

  public void work() {
    System.out.println(brand + " Mp3 is working.");
  }

  public void insert() {
    System.out.println(brand + " Mp3 is inserting");
  }

}
