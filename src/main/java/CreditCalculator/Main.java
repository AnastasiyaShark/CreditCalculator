package CreditCalculator;

public class Main {

    public static void main(String[] args) {

        final int creditAmount = 150000;
        final int dueDateInMonths = 24;
        final int annualPercent = 48;

        Calculator calculator = new Calculator();
        double monthlyPayment = calculator.monthlyPaymentCalculation(creditAmount, dueDateInMonths, annualPercent);
        System.out.printf("Месячная сумма платежа составит %.2f рублей %n", monthlyPayment);
        double totalAmount = calculator.calculationOfTheTotalAmountToBeReturnedToTheBank(creditAmount, dueDateInMonths, annualPercent);
        System.out.printf("Общая сумма к возврату в банк составит %.2f  рублей %n", totalAmount);
        double overpayment = calculator.overpaymentCalculationForTheEntirePeriod(creditAmount, dueDateInMonths, annualPercent);
        System.out.printf("Переплата за весь период составит %.2f  рублей %n", overpayment);

    }

}
