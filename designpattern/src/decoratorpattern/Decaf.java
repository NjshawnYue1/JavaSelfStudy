package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 22:01
 **/

public class Decaf extends AbstractBeverage {


    @Override
    public String getDescription() {
        return description = "Decaf :";
    }

    @Override
    public double getCost() {
        return 0.45;
    }
}
