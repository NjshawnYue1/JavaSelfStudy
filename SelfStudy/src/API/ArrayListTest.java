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

    arrayList.add(new Person("lisi", 21));//�洢���Ƕ���ĵ�ַ
    arrayList.add(new Person("aa", 22));
    arrayList.add(new Person("bb", 23));
    arrayList.add(new Person("cc", 24));

    Iterator iterator = arrayList.iterator();
    while (iterator.hasNext()) {
//      System.out.println(((Person) iterator.next()).getName());
      /*
       * �ڴ洢�Զ�������ʱ����Ҫ�ѵ�����ȡ����next����ת��Ϊ��Ҫʹ�õĶ���
       * ��Ϊadd������ӵĶ�����Object ����̬ ����������������෽����ʱ��ر���
       * �������һ��ѭ�������ε���next() ��ᵼ�½��������Ϊ��һ��ѭ�����±�������������
       * ���ԾͲ��ٸ�����ȷ�Ľ�� ͬʱ���ܻ���Ϊ����������Ե�ԭ�����NoSuchElementException�쳣
       * */
      Person person = (Person) iterator.next();
      System.out.println(person.getAge() + "....." + person.getName());
    }

    arrayList.add(5);//�˴���5���Զ�װ���Ϊ�˶���
    // �������͵�ֵ�����������������͵�ʱ����Զ�װ��
    // ��������������������������ͽ����������ʱ��ز���

  }

}
