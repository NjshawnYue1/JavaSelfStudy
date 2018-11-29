package Lesson;

/**
 * @author ShawnYue
 * @date 2018-11-28 9:52
 */
public class TemperatureTestDemo {

  public static void main(String[] args) {
    double[][] array = new double[12][2];
    getTemperature(array);

  }

  private static void getTemperature(double[][] array) {
    int k = 0;
    double[] array1 = getData();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < 2; j++) {
        array[i][j] = array1[k];
        k++;
      }

    }
    double heightAverage = averageHeight(array);
    System.out.println("该年最高气温的平均值是： " + heightAverage);

    double lowAverage = averageLow(array);
    System.out.println("该年最低气温的平均值是： " + lowAverage);

    System.out.print("该年最高温在数组中的索引是:  ");
    indexHighTemp(array);
    indexLowTemp(array);


  }

  private static double[] getData() {
    double[] array = {1, 5.3, 2, 6, 6, 10, 10.2, 15, 16.5, 20, 20.2, 25, 26, 32, 24, 33, 18, 22, 16,
        21, 6, 12, 3, 8};
    return array;
  }

  private static double averageHeight(double[][] array) {
    double sum = 0;
    double average = 0;
    for (int i = 1; i < array.length; i++) {
      sum += array[i][1];
    }
    average = sum / 12;
    return average;
  }

  private static double averageLow(double[][] array) {
    double sum = 0;
    double average = 0;
    for (int i = 1; i < array.length; i++) {
      sum += array[i][0];
    }
    average = sum / 12;
    return average;
  }

  private static void indexHighTemp(double[][] array) {
    int i;
    int j=0;
    double temp = array[0][1];
    for (i = 0; i < array.length; i++) {
      if (temp < array[i][1]) {
        temp = array[i][1];
        j = i;
      }
    }
    System.out.println("最高温在数组中的下标是: ["+j+"]"+"[1]");
  }

  private static void indexLowTemp(double[][] array) {
    int i;
    int j=0;
    double temp = array[0][0];
    for (i = 0; i < array.length; i++) {
      if (temp > array[i][0]) {
        temp = array[i][0];
        j = i;
      }
    }
    System.out.println("最低温在数组中的下标是: ["+j+"]"+"[0]");
  }
}