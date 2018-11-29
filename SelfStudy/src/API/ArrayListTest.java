package API;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ShawnYue
 * @date 2018-10-29 18:17
 */
public class ArrayListTest {

  public static void main(String[] args) {

    ArrayList arrayList = new ArrayList();

    arrayList.add(new Person("lisi", 21));//存储的是对象的地址
    arrayList.add(new Person("aa", 22));
    arrayList.add(new Person("bb", 23));
    arrayList.add(new Person("cc", 24));

    Iterator iterator = arrayList.iterator();
    while (iterator.hasNext()) {
//      System.out.println(((Person) iterator.next()).getName());
      /*
       * 在存储自定义对象的时候需要把迭代器取出的next对象转型为需要使用的对象
       * 因为add方法添加的对象是Object 即多态 所以在下面调用子类方法的时候回报错
       * 而如果在一个循环中两次调用next() 则会导致结果出错因为在一次循环内下标往后走了两次
       * 所以就不再给出正确的结果 同时可能会因为对象具体属性的原因产生NoSuchElementException异常
       * */
      Person person = (Person) iterator.next();
      System.out.println(person.getAge() + "....." + person.getName());
    }

    arrayList.add(5);//此处的5被自动装箱成为了对象
    // 基本类型的值赋给了引用数据类型的时候回自动装箱
    // 当引用数据类型与基本数据类型进行运算你的时候回拆箱

  }

}
