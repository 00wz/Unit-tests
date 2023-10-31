package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

//import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        testPurchase(100.0,10);
        testPurchase(100.0,1000);
        testPurchase(100.0,-10);

        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-100.0, 10)
        ).isInstanceOf(ArithmeticException.class);

    }

    private  static void testPurchase(double purchaseAmount, int discountAmount){
        var discountedPrice=Calculator.calculatingDiscount(purchaseAmount,discountAmount);
        assert 0<=discountedPrice&&discountedPrice<=purchaseAmount;
    }
}