package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 21:59
 **/

public class DarkRoast extends AbstractBeverage {


    @Override
    public String getDescription() {
        return description = "DarkRoast :";
    }

    @Override
    public double getCost() {
        return 0.74;
    }
}
