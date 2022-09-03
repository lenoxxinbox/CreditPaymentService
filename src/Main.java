public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("При сумме кредита 1 000 000 р сроком на 1 год ежемесячный аннуитентный платеж составляет: ");
        System.out.println(Math.round(service.calculate(9.99, 12, 1_000_000)) + " рублей");
        System.out.println();
        System.out.println("При сумме кредита 1 000 000 р сроком на 2 года ежемесячный аннуитентный платеж составляет: ");
        System.out.println(Math.round(service.calculate(9.99, 24, 1_000_000)) + " рублей");
        System.out.println();
        System.out.println("При сумме кредита 1 000 000 р сроком на 3 года ежемесячный аннуитентный платеж составляет: ");
        System.out.println(Math.round(service.calculate(9.99, 36, 1_000_000)) + " рублей");

    }
}
