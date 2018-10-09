/**
 * @author ShawnYue
 * @date 2018-10-08 22:40
 */
public class Printer implements USB {
  private String brand;
  public Printer(){
    brand = "unknown";
  }
  public Printer(String brand){
    this.brand = brand;
  }
  public void work(){
    System.out.println(brand + " Printer is working");
  }
  public void insert(){
    System.out.println(brand + " Printer is inserting");
  }

}
