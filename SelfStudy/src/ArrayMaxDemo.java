public class ArrayMaxDemo {

  public static void main(String[] args) {
//    int[] array = new int[] {5,6,7,202020,30,50,6698,45,123,456,888};
//    int temp;
//    temp = array[0];
//    for (int i=0;i<array.length;i++){
//      if(temp<array[i]){
//        temp = array[i];
//      }
//    }
//    System.out.println(temp);
    int[] array = new int[]{20,12,30,50,60,8080,40,4040,555};
    int i;
    i = getMaxArray(array);
    System.out.println(i);
  }
  private static int getMaxArray(int[] array){
    int max,i;
    for(i=0,max=array[0];i<array.length;i++){
      if(max<array[i]){
        max = array[i];
      }
    }
    return max;
  }

}
