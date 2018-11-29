package FirstStepSelfStudy;

public class ArraySortDemo {

  public static void main(String[] args) {
    int[] array = new int[]{3, 5, 1, 2, 9, 7};
    int[] a = sortArray(array);//操作后数组a的首地址指向了返回的数组的首地址 所以此时就是同一个数组
    for (int i : a) {
      System.out.println(i);
    }

  }

  private static int[] sortArray(int[] array) {
    int i, j;
    for (i = 0; i < array.length-1; i++) { //控制比较的次数 从第一个元素开始比较到倒数第二个 最后一个便已经被排好序
      for (j = i; j < array.length; j++) {//对数组中每个元素进行遍历来比较 如果让j每次都从0开始遍历 就会让倒序的元素再次倒序
        if (array[i] < array[j]) {
          int temp;
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }
}