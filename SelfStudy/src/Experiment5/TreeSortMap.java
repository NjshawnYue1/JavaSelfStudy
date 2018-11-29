package Experiment5;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author ShawnYue
 * @date 2018-11-14 21:57
 *
 * Tree系列会自己根据键值排序，需要重写compare方法
 */
public class TreeSortMap implements Comparator<Integer> {

  private TreeMap<Integer, Person> treeMap;

  public TreeSortMap() {
  }

  public TreeSortMap(TreeMap<Integer, Person> treeMap) {
    this.treeMap = treeMap;
  }

  @Override
  public int compare(Integer o1, Integer o2) {//传入的是键值类型的变量
    return treeMap.get(o1).getId() - treeMap.get(o2).getId();
  }


}
