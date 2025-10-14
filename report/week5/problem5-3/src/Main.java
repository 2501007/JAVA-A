import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;

        System.out.print("초를 입력하세요: ");
        total = keyboard.nextInt();

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        System.out.printf("%d 초 = %d 시간 %d 분 %d 초\n", total, h, m, s);
    }
}