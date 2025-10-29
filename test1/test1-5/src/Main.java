import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final double PI = 3.141592;
        int r;
        double volume, surfaceArea;

        System.out.print("구의 반지름을 입력하세요: ");
        r = keyboard.nextInt();

        volume = (4.0 / 3.0) * PI * r * r * r;
        surfaceArea = 4 * PI * r * r;

        System.out.println("================================");
        System.out.printf("반지름: %d\n", r);
        System.out.printf("구의 부피: %.6f\n", volume);
        System.out.printf("구의 표면적: %.6f\n", surfaceArea);
        System.out.println("================================");
    }
}
