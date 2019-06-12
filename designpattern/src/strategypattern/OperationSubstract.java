package strategypattern;

/**
 * @author ShawnYue
 * @date 2019-06-09 22:06
 **/

public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
