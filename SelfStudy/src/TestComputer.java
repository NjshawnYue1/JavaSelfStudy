/**
 * @author ShawnYue
 * @date 2018-10-08 22:43
 */
class Computer {

  void useUSB(USB usb) {
    usb.work();
    usb.insert();
  }

}

public class TestComputer {

  public static void main(String[] args) {
    Mp3 mp3 = new Mp3("ipod");
    Printer printer = new Printer("hq");
    Computer computer = new Computer();
    computer.useUSB(mp3);
    computer.useUSB(printer);
  }
}