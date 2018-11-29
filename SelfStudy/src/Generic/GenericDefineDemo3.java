package Generic;

/**
 * @author ShawnYue
 * @date 2018-11-29 16:28
 */
public class GenericDefineDemo3 {

  public static void main(String[] args) {
    ShowInterfaceImplements showInterfaceImplements = new ShowInterfaceImplements();
    showInterfaceImplements.show("zhuzhaoyangsb");
    ShowInterfaceImplements2<Integer> showInterfaceImplements2 = new ShowInterfaceImplements2<>();
    showInterfaceImplements2.show(5);
  }

}

interface showInterface<E> {

  void show(E e);
}

class ShowInterfaceImplements implements showInterface<String>{

  @Override
  public void show(String s) {
    System.out.println("show :: " + s);
  }
}
class ShowInterfaceImplements2<Q> implements showInterface<Q>{

  @Override
  public void show(Q q) {
    System.out.println("show ::: " + q);
  }
}
