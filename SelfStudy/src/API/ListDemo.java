package API;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShawnYue
 * @date 2018-10-28 11:27
 */
public class ListDemo {

  public static void main(String[] args) {
    List list = new ArrayList();
    function(list);
  }

  private static void function(List list) {
    //添加元素
    list.add("abc1");
    list.add("abc2");
    list.add("abc3");
    System.out.println(list);//[abc1, abc2, abc3]

    //插入元素
//    list.add(1,"abc9");[abc1, abc9, abc2, abc3]
    //删除元素
//    System.out.println("remove:"+list.remove(2));//remove:abc3 返回的是被删除的元素 也改变了长度
    //修改元素
//    System.out.println("set:"+list.set(1,"abc8"));//返回被修改的那个元素
    //获取元素
//    System.out.println("get:"+list.get(0)); 特有的获取方法，可以不借助迭代器
    //获取子列表
//    System.out.println("sublist:"+list.subList(0,2));//包含头不包含结尾
    System.out.println(list);

  }

}
