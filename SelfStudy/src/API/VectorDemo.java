package API;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author ShawnYue
 * @date 2018-10-29 17:19
 */
public class VectorDemo {

  public static void main(String[] args) {
    Vector vector = new Vector();

    vector.addElement("abc1");
    vector.addElement("abc2");
    vector.addElement("abc3");

    Enumeration enumeration = vector.elements();
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }

    Iterator iterator = vector.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

  }

}
