package Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ShawnYue
 * @date 2018-10-31 13:45
 */
public class GenericDemo {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();//集合中要存储什么类型的元素

    arrayList.add("hhz");
    // add如果没有指定存进去的类型 那么add方法默认的是存Object类型
    // 即引用数据类型都可以放进去 但是在取出的时候需要强制转换
    // 在如果存进去的数据不是强转的类型那么编译时虽然没有错误但是在运行时会提示ClassCastException
    // arrayList.add(4);//java.lang.ClassCastException  Integer  String
    // int[] array 数组是一个容器 之所以在存不匹配的类型的时候会直接报编译错误是因为在声明时就已经给出了要存放的元素的类型
    // 所以只需要对集合也声明要存放的元素的类型就可以把错误直接提前到编译时期
    arrayList.add("hhz");

    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      String string = iterator.next();//将集合中的元素取出可对他进行其他操作而不仅仅是打印
//      System.out.println(iterator.next());
      System.out.println(string);
    }
  }

}
