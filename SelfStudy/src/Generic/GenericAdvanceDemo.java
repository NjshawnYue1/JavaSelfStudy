package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ShawnYue
 * @date 2018-11-29 16:44
 */
public class GenericAdvanceDemo {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();

    arrayList.add("aa");
    arrayList.add("bb");
    arrayList.add("cc");

    printCollection(arrayList);
  }

  private static void printCollection(Collection<String> arrayList) {
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }

}
