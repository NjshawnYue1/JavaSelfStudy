package Generic;

/**
 * @author ShawnYue
 * @date 2018-11-29 16:08
 */
public class GenericDefineDemo2 {

  public static void main(String[] args) {
    Tool<String> tool = new Tool<>();
    tool.setE("aa");
    String string = tool.getE();
    System.out.println(string);
    tool.myPrint("bb");
    tool.show(6);
    Tool.method(4);
  }

}
