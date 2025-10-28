import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        String timeType;
        double fare = 10000;
        double discountRate = 0.0;

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();

        System.out.print("관람 시간을 입력하세요 (조조/일반): ");
        timeType = keyboard.next();

        if (timeType.equals("조조")) {
            discountRate += 0.2;

            if (age >= 8 && age <= 18) {
                discountRate += 0.3;
            } else if (age >= 65) {
                discountRate += 0.4;
            }
        } else {
            if (age >= 8 && age <= 18) {
                discountRate += 0.3;
            } else if (age >= 65) {
                discountRate += 0.4;
            }
        }

        double finalFare = fare * (1 - discountRate);

        System.out.printf("최종 요금은 %.0f원 입니다.\n", finalFare);
    }
}
