package API;

import java.util.LinkedList;

/**
 * @author ShawnYue
 * @date 2018-10-29 17:33
 *
 *
 * ʹ��LinkedList��ģ��һ��ջ���ܶ������ݽṹ
 *
 * ջ  �Ƚ����
 *
 * ���� �Ƚ��ȳ�
 */
public class LinkedListTest {

  public static void main(String[] args) {
    QueueDemo q = new QueueDemo();
    q.add("abc1");
    q.add("abc2");
    q.add("abc3");
    q.add("abc4");

    while (!q.hasElement()) {
      System.out.println(q.get());
    }
  }

}

class QueueDemo {

  private LinkedList linkedList;

  QueueDemo() {
    linkedList = new LinkedList();
  }

  public void add(Object object) {
    linkedList.addLast(object);
  }

  public Object get() {
    return linkedList.removeFirst();
  }

  public boolean hasElement() {
    return linkedList.isEmpty();
  }
}
