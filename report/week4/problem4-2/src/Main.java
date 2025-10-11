import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int vat = 0;
        int amount = 0;

        System.out.print("판매금액을 입력하세요: ");
        total = input.nextInt();

        amount = (int)(total / 1.1);
        vat = total - amount;

        System.out.printf("판매 금액: %,d원\n", total);
        System.out.printf("금액: %,d원\n", amount);
        System.out.printf("세금: %,d원\n", vat);

    }
}