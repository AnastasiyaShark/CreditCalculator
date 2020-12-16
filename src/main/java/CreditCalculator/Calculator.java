package CreditCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    public double monthlyPaymentCalculation(int creditAmount, int dueDateInMonths, int annualPercent) {
        final double months = 12.0;
        double percent = (annualPercent / months) / 100.0;
        double partOfFormula = Math.pow((1 + percent), dueDateInMonths);
        double monthlyPayment = creditAmount * ((percent * partOfFormula) / (partOfFormula - 1));
        return new BigDecimal(monthlyPayment).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double calculationOfTheTotalAmountToBeReturnedToTheBank(int creditAmount, int dueDateInMonths, int annualPercent) {
        double totalAmount = (monthlyPaymentCalculation(creditAmount, dueDateInMonths, annualPercent)) * dueDateInMonths;
        return new BigDecimal(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double overpaymentCalculationForTheEntirePeriod(int creditAmount, int dueDateInMonths, int annualPercent) {

        double overpayment = (calculationOfTheTotalAmountToBeReturnedToTheBank(creditAmount,
                dueDateInMonths, annualPercent)) - creditAmount;
        return new BigDecimal(overpayment).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
