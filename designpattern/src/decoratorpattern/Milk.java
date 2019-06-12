package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 22:07
 **/

public class Milk extends AbstractCondimentDecorator {

    AbstractBeverage bverage;

    public Milk(AbstractBeverage bverage) {
        this.bverage = bverage;
    }

    @Override
    public String getDescription() {
        return bverage.getDescription() + "Milk";
    }

    @Override
    public double getCost() {
        return 0.23 + bverage.getCost();
    }
}
