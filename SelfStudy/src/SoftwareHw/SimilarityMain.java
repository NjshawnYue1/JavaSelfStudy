package SoftwareHw;

import java.util.ArrayList;

/**
 * @author ShawnYue
 * @date 2018-11-12 21:12
 */
public class SimilarityMain {

  double getSimilarity(ArrayList<Float> arrayList1, ArrayList<Float> arrayList2) {
    // 如果向量维度不相等，则不能计算，函数退出
    if (arrayList1.size() != arrayList2.size()) {
      return 0;
    }

    int size = arrayList1.size();
    double simVal;

    //sim(va,vb) = (va * vb) / (|va| * |vb|)
    // 分子 = va.get(0)*vb.get(0) + va.get(1)*vb.get(1) +...+ va.get(size - 1)*vb.get(size - 1)
    // 分母 = va的模 * vb的模 = sqrt((va.get(0))的平方 + (va.get(1))的平方 + ... + va.get(size - 1)的平方) * sqrt((vb.get(0))的平方 + (vb.get(1))的平方 + ... + vb.get(size - 1)的平方)
    float num = 0;// numerator分子
    float den1 = 1;// denominator分母
    float den2 = 1;
    float den;

    /*作业，第三题*/
    //分子
    for (int i = 0; i < size; i++) {
      num += (arrayList1.get(i) * arrayList2.get(i));
    }
    //分母
    for (int j = 0; j < size; j++) {
      den1 += (float) Math.pow(arrayList1.get(j), 2);
      den2 += (float) Math.pow(arrayList2.get(j), 2);
    }
    den = (float) (Math.sqrt(den1) * Math.sqrt(den2));

    simVal = num / den;
    return simVal;
  }

  public static void main(String[] args) {
    String item[] = {"吃苹果", "逛商店", "看电视剧", "打羽毛球", "吃桔子"};
    float a[] = {(float) 3.5, 5, 5, 5, 0};
    float b[] = {2, 3, 4, 3, 3};
    ArrayList<String> stringArrayList = new ArrayList<>();
    ArrayList<Float> arrayList1 = new ArrayList<>();
    ArrayList<Float> arrayList2 = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      stringArrayList.add(item[i]);
      arrayList1.add(a[i]);
      arrayList2.add(b[i]);
    }
    System.out.print("兴趣");
    System.out.println(stringArrayList);
    System.out.print("小红");
    System.out.println(arrayList1);
    System.out.print("顾安");
    System.out.println(arrayList2);

    SimilarityMain sim = new SimilarityMain();

    double simVal = sim.getSimilarity(arrayList1, arrayList2);

    System.out.println("The sim value is:" + simVal);
  }

}