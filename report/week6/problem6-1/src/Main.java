import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int ticketprice = 0;
        int ticketcount = 0;
        int price = 0;
        double discount = 0.0;
        double damt = 0.0;
        double total = 0.0;

        System.out.print("식권 한 장의 가격을 입력하세요: ");
        ticketprice = keyboard.nextInt();

        System.out.print("구매할 식권의 개수를 입력하세요: ");
        ticketcount = keyboard.nextInt();

        if (ticketcount >= 30) {
            discount = 0.20;
        } else if (ticketcount >= 20) {
            discount = 0.15;
        } else if (ticketcount >= 10) {
            discount = 0.10;
        } else {
            discount = 0.0;
        }

        price = ticketprice * ticketcount;
        damt = price * discount;
        total = price - damt;

        System.out.printf("총 금액: %d원\n", price);
        System.out.printf("적용된 할인율: %.0f%%\n", discount * 100);
        System.out.printf("할인 금액: %.0f원\n", damt);
        System.out.printf("최종 결제 금액: %.0f원\n", total);
    }
}