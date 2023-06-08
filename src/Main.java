public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int numberOfMonths = 36; //Количество месяцев
        int amountOfCredit = 1_000_000;  //Сумма кредита
        double percent = 9.99;   //Процентная ставка

        int payment = service.calculate(numberOfMonths, amountOfCredit, percent);
        System.out.println(payment);
    }
}