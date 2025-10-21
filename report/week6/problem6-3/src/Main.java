import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age = 0;
        char card = ' ';
        int hour = 0;
        int fare = 0;
        double finalfare = 0.0;

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();

        System.out.print("교통카드를 사용하십니까? (Y/N): ");
        card = keyboard.next().charAt(0);

        System.out.print("탑승 시간을 입력하세요 (0~23시): ");
        hour = keyboard.nextInt();

        if (age >= 20) {
            if (card == 'Y' || card == 'y') {
                fare = 1250;
            } else {
                fare = 1350;
            }
        } else if (age >= 14) {
            if (card == 'Y' || card == 'y') {
                fare = 750;
            } else {
                fare = 850;
            }
        } else {
            fare = 450;
        }

        finalfare = fare;

        if (hour >= 22 || hour <= 5) {
            finalfare = fare * 1.2;
        }

        System.out.printf("최종 요금은 %.0f원입니다.\n", finalfare);
    }
}