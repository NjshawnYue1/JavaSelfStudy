public class GetSumDemo {

  public static void main(String[] args) {
    int i,j,sum=0;
    for(i=1;i<=100;i++){
      int jsum=0;//重新赋值为0  再次计算1+2+3.. 定义在上方会导致部分数字加不到
      for(j=1;j<=i;j++){
        jsum = jsum + j;
      }
      sum += jsum;
    }
    System.out.println(sum);
  }

}
