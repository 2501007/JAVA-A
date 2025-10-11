import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int UNIT_PRICE = 56000;

        Scanner keyboard = new Scanner(System.in);

        int area = 0;
        int price = 0;

        System.out.print("주택지 면적(평)을 입력하세요: ");
        area = keyboard.nextInt();

        price = area * UNIT_PRICE;
        price = (price / 1000) * 1000;

        System.out.printf("총 주택지 가격은 %,d원입니다.\n", price);
    }
}