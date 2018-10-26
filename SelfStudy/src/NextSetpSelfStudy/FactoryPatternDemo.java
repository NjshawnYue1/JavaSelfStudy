package NextSetpSelfStudy;

/**
 * @author ShawnYue
 * @date 2018-10-19 14:50
 */
public class FactoryPatternDemo {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    //��ȡ Circle �Ķ��󣬲��������� draw ����
    Shape shape1 = shapeFactory.getShape("circle");

    //���� Circle �� draw ����
    shape1.draw();

    //��ȡ Rectangle �Ķ��󣬲��������� draw ����
    Shape shape2 = shapeFactory.getShape("rectangle");

    //���� Rectangle �� draw ����
    shape2.draw();

    //��ȡ Square �Ķ��󣬲��������� draw ����
    Shape shape3 = shapeFactory.getShape("square");

    //���� Square �� draw ����
    shape3.draw();
  }

}
