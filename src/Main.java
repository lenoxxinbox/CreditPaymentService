public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("��� ����� ������� 1 000 000 � ������ �� 1 ��� ����������� ������������ ������ ����������: ");
        System.out.println(Math.round(service.calculate(9.99, 12, 1_000_000)) + " ������");
        System.out.println();
        System.out.println("��� ����� ������� 1 000 000 � ������ �� 2 ���� ����������� ������������ ������ ����������: ");
        System.out.println(Math.round(service.calculate(9.99, 24, 1_000_000)) + " ������");
        System.out.println();
        System.out.println("��� ����� ������� 1 000 000 � ������ �� 3 ���� ����������� ������������ ������ ����������: ");
        System.out.println(Math.round(service.calculate(9.99, 36, 1_000_000)) + " ������");

    }
}
