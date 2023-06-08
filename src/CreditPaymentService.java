public class CreditPaymentService {
    public int calculate(int numberOfMonths, int amountOfCredit, double percent) {
        double i = (percent / 100 / 12);
        double k = ((i * Math.pow((1 + i), numberOfMonths)) / (Math.pow((1 + i), numberOfMonths) - 1));
        int result = (int) (amountOfCredit * k);
        return result;
    }
}

