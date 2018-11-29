package Experiment5;

/**
 * @author ShawnYue
 * @date 2018-11-16 21:17
 */
public class Athletes implements Comparable<Athletes> {

  private Integer index;
  private String name;
  private double time;

  public Athletes() {
  }

  public Athletes(String name, double time) {
    this.name = name;
    this.time = time;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  @Override
  public String toString() {
    return "第" + this.index + "：    运动员：" + this.name + "的成绩为：" + this.time + "秒";
  }


  @Override
  public int compareTo(Athletes athletes) {
    return (int) (athletes.getTime() - this.getTime());
  }
}
