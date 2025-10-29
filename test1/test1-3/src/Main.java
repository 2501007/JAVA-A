import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double time;
        int days, hours, minutes, seconds;

        System.out.print("시간을 입력하세요: ");
        time = keyboard.nextDouble();

        days = (int)(time / 24);
        time = time % 24;
        hours = (int)time;
        minutes = (int)((time - hours) * 60);
        seconds = (int)((((time - hours) * 60) - minutes) * 60);

        System.out.println("==============================");
        System.out.printf("입력한 시간: %.2f시간\n", time + days * 24);
        System.out.printf("%d일 %d시간 %d분 %d초\n", days, hours, minutes, seconds);
        System.out.println("==============================");
    }
}
