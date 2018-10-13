package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-11 18:05
 *
 * 编译时被检测异常 除了RunTimeException
 *
 * 运行时异常 RunTimeException和其子类 继承他的异常不需要再声明抛出
 *
 *
 * 异常类包含的函数都是构造函数 抛出异常就是抛出构造函数的信息
 */
public class ExceptionDemo2 {

  public static void main(String[] args) {
    int[] array = new int[3];
    method(array, -3);//java.lang.ArrayIndexOutOfBoundsException
  }

  private static int method(int[] array, int index) {
//    if (index >= array.length || index < 0) {
//      throw new ArrayIndexOutOfBoundsException(index);//抛出对象 抛出异常 异常是个对象
//    }
    if (index < 0) {
      throw new NegativeIndexException("负数下标");
    }

    return array[index];
  }

}

class NegativeIndexException extends RuntimeException {

  NegativeIndexException() {
  }

  NegativeIndexException(String msg) {
    super(msg);
  }
}
