package API;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ShawnYue
 * @date 2018-10-28 11:39
 */
public class ListDemo2 {

  public static void main(String[] args) {
    List list = new ArrayList();
//    method(list);
    list.add("abc1");
    list.add("abc2");
    list.add("abc3");

//    Iterator iterator = list.iterator();
//    while (iterator.hasNext()) {
//      Object o = iterator.next();//java.util.ConcurrentModificationException
//      // 并发修改异常 因为在使用迭代器进行迭代的时候又用了list去增加
//      //可以使用Iterator接口的子接口ListIterator来完成 在迭代中对元素进行操作
//      if (o == "abc2") {
//        list.add("abc5");
//      } else {
//        System.out.println(list);
//      }
//    }
    //使用列表迭代器 可以实现迭代过程中对元素的增删改查
    //只有List集合有这个迭代器
    ListIterator listIterator = list.listIterator();
    while (listIterator.hasNext()){
      Object o = listIterator.next();
      if(o.equals("abc2")){
        listIterator.add("abc6");
      }else {
        System.out.println(list);
      }
    }

  }

  private static void method(List list) {
    list.add("abc1");
    list.add("abc2");
    list.add("abc3");

    //因为有下标所以可以这样取出
    for (int i = 0; i < list.size(); i++) {
      System.out.println("get:" + list.get(i));
    }

  }


}
