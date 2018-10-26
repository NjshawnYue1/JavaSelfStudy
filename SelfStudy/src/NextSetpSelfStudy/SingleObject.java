package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-19 14:59
 */
public class SingleObject {

  private static SingleObject instance = new SingleObject();

  private SingleObject() {
  }

  public static SingleObject getInstance() {
    return instance;
  }

  public void showMessage() {
    System.out.println("Hello");

  }

}
