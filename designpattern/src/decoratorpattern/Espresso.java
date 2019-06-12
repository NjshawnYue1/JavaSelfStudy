package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 22:00
 **/

public class Espresso extends AbstractBeverage {

    @Override
    public String getDescription() {
        return description = "Espresso :";
    }

    @Override
    public double getCost() {
        return 0.65;
    }
}
