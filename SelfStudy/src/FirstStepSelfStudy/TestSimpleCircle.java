package FirstStepSelfStudy;

/**
 * Created by Admin on 2017/7/3.
 */
public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of rradius " + circle1.radius + " is " + circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of rradius " + circle2.radius + " is " + circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of rradius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of rradius " + circle2.radius + " is " + circle2.getArea());

    }
}


class SimpleCircle{
    double radius;

    SimpleCircle(){

        radius = 1;
    }

    SimpleCircle(double newRadius)
    {
        radius = newRadius;
    }

    double getArea()
    {

        return radius * radius * Math.PI;
    }

    void setRadius(double newRadius)
    {

        radius = newRadius;
    }
}