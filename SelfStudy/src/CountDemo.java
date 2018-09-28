public class CountDemo {

  public static void main(String[] args) {
    Count Tom = new Count();
    Count John = new Count();

    System.out.println(Tom.serialNumber);
    System.out.println(John.serialNumber);
    System.out.println(Count.getCounter());
  }

}

class Count{
  int serialNumber;
  private static int counter=0;

  public Count(){
    counter++;
    serialNumber = counter;
  }

  public static int getCounter() {
    return counter;
  }
}
