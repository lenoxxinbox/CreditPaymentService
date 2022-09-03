public class CreditPaymentService {
    public double calculate(double annualInterestRate, double numberOfPayments, double loanAmount) {
        double interestRatePerMonth = annualInterestRate / 12 / 100;
        double annuityCoefficient = interestRatePerMonth * Math.pow((1 + interestRatePerMonth), numberOfPayments) / (Math.pow((1 + interestRatePerMonth), numberOfPayments) - 1);
        double monthlyPayment = loanAmount * annuityCoefficient;
        return monthlyPayment;
    }

}
