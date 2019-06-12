package decoratorpattern;

/**
 * @author ShawnYue
 * @date 2019-06-12 22:04
 **/

public class Mocha extends AbstractCondimentDecorator {

    AbstractBeverage bverage;

    public Mocha(AbstractBeverage bverage) {
        this.bverage = bverage;
    }


    @Override
    public String getDescription() {
        return bverage.getDescription() + "Mocha";
    }

    @Override
    public double getCost() {
        return 0.12 + bverage.getCost();
    }
}
