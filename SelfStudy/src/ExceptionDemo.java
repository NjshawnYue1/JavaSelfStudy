/**
 * Created by Admin on 2017/9/27.
 */
class FuShuIndexException extends Exception {

  FuShuIndexException(String msg) {
    super(msg);
  }
}

class Demo2 {

  int method(int[] arr, int index) throws FuShuIndexException {
    throw new FuShuIndexException(" 下标不能为负！！！！ ");

  }

}

public class ExceptionDemo {

  static int[] arr = new int[3];

  public static void main(String[] args) throws FuShuIndexException {
    Demo2 d = new Demo2();
    d.method(arr, -3);
  }

}
