import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double c = 0.0;
        double f = 0.0;

        System.out.print("섭씨 온도를 입력하세요: ");
        c = input.nextDouble();

        f = c * (9 / 5) + 32;

        System.out.printf("섭씨 %.1f도는 화씨 %.1f도입니다.\n", c, f);
    }
}