package API;

/**
 * @author ShawnYue
 * @date 2018-10-26 10:42
 */
public class WrapperDemo2 {

  public static void main(String[] args) {
    int num = 4;

    Integer i = 4;//i = new Integer(4) 自动装箱

    /*操作可以和int 一样 Integer中封装的对象，但是如果封装的对象数值在一个字节之内那么下一次创建同样的数时会直接共享该数据二部重新开辟空间*/
    Integer x = 127;
    Integer y = 127; //共享了一个数据 地址相同

    Integer a = 128;
    Integer b = 128;//两个不同的地址
    System.out.println(x==y);//true
    System.out.println(a==b);//false
  }

}
