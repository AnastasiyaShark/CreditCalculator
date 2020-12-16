package CreditCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {

    final int creditAmount = 150000;
    final int dueDateInMonths = 24;
    final int annualPercent = 48;
    Calculator calculator = new Calculator();

    @Test
    public void testMonthlyPaymentCalculation() {
        final double result = 9838.02;
        final double monthlyPayment = calculator.monthlyPaymentCalculation(creditAmount, dueDateInMonths, annualPercent);
        Assertions.assertEquals(result, monthlyPayment);

    }

    @Test
    public void testCalculationOfTheTotalAmountToBeReturnedToTheBank() {
        final double result = 236112.48;
        final double totalAmount = calculator.calculationOfTheTotalAmountToBeReturnedToTheBank(creditAmount,
                dueDateInMonths, annualPercent);
        Assertions.assertEquals(result, totalAmount);
    }

    @Test
    public void testOverpaymentCalculationForTheEntirePeriod() {
        final double result = 86112.48;
        final double overpayment = calculator.overpaymentCalculationForTheEntirePeriod(creditAmount, dueDateInMonths,
                annualPercent);
        Assertions.assertEquals(result, overpayment);
    }

}
