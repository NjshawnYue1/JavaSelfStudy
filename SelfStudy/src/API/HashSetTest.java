package API;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ShawnYue
 * @date 2018-10-29 21:39
 *
 *
 * �򼯺��д洢Person���� ���������������ͬ��Ϊͬһ��Ԫ��
 */
public class HashSetTest {

  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    /*
     * ���ݽṹ�ǹ�ϣ�� �洢Ԫ�ص�ʱ��ʹ�õ���Ԫ�ص�hashCode������ȷ��λ�ã����λ����ͬ��ͨ��Ԫ�ص�equals()��ȷ���Ƿ���ͬ
     * */

    hashSet.add(new Person("lisi4", 24));
    hashSet.add(new Person("lisi7", 27));
    hashSet.add(new Person("lisi1", 21));
    hashSet.add(new Person("lisi9", 29));
    hashSet.add(new Person("lisi7", 27));//���Ԫ�ػᱻ�浽hashSet����Ϊ���ǵ�equals�����жϵ��ǵ�ַ�Ƿ���ͬ����ʱ�����������������ǵĵ�ַ�ǲ�ͬ��

    Iterator iterator = hashSet.iterator();

    while (iterator.hasNext()) {
      Person person = (Person) iterator.next();
      System.out.println(person.getName() + "....." + person.getAge());
    }
  }

}
