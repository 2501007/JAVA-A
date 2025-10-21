import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int l = 0;
        int p = 0;
        int sum = 0;
        double dc = 0.0;
        double vat = 0.0;
        double pay = 0.0;

        System.out.print("주유할 리터 수를 입력하세요: ");
        l = keyboard.nextInt();

        System.out.print("리터당 가격을 입력하세요: ");
        p = keyboard.nextInt();

        sum = l * p;

        if (sum >= 50000) {
            dc = sum * 0.07;
        }

        vat = (sum - dc) * 0.10;
        pay = (sum - dc) + vat;

        System.out.printf("총 금액: %d원\n", sum);
        System.out.printf("할인 금액: %.0f원\n", dc);
        System.out.printf("부가세: %.0f원\n", vat);
        System.out.printf("최종 결제 금액: %.0f원\n", pay);


    }
}