public class AnimalTest {

  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit(30);
    Tiger tiger = new Tiger("male");
    System.out.println(rabbit.getAge());
    System.out.println(rabbit.getColor());
    System.out.println(rabbit.getWeight());
    System.out.println(tiger.getTigerSex());
    System.out.println(tiger.getColor());
    System.out.println(tiger.getWeight());
  }

}
