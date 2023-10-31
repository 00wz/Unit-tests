package seminars.first.Calculator;

public class Calculator {
    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount<0) {
            throw new ArithmeticException("Стоимость не может быть меньше нуля");
        }
        var correctDiscountAmount=Math.clamp(discountAmount,0,100)/100;
        return purchaseAmount*(1-correctDiscountAmount); // Метод должен возвращать сумму покупки со скидкой
    }
}