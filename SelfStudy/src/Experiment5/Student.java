package Experiment5;

/**
 * @author ShawnYue
 * @date 2018-11-14 22:04
 */
public class Student implements Comparable<Student> {

  private String name;
  private double score;

  public Student() {
  }

  public Student(String name, double score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "学生" + this.name + " 成绩为：" + this.score + "\n";
  }

  @Override
  public int compareTo(Student student) {
    return (int) (this.getScore() - student.getScore());
  }
}
