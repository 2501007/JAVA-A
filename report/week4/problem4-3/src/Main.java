import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dollar, half, quarter, dime, nickel, penny;
        int total;
        int totaldollar, totalcent;

        System.out.print("달러 개수 입력: ");
        dollar = input.nextInt();

        System.out.print("하프(50 cent) 개수 입력: ");
        half = input.nextInt();

        System.out.print("쿼터(25 cent) 개수 입력: ");
        quarter = input.nextInt();

        System.out.print("다임(10 cent) 개수 입력: ");
        dime = input.nextInt();

        System.out.print("니켈(5 cent) 개수 입력: ");
        nickel = input.nextInt();

        System.out.print("페니(1 cent) 개수 입력: ");
        penny = input.nextInt();

        total = dollar * 100 + half * 50 + quarter * 25 + dime * 10 + nickel * 5 + penny;

        totaldollar = total /100;
        totalcent = total % 100;

        System.out.printf("총 금액은 %d센트입니다.\n", total);
        System.out.printf("달러로 변환한 금액은 %d달러 %d센트입니다.\n", totaldollar, totalcent);
    }
}