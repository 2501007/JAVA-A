import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int radius = 0;
        int squareArea = 0;
        double circleArea = 0.0;
        double redArea = 0.0;

        System.out.print("원의 반지름: ");
        radius = keyboard.nextInt();

        squareArea = 4 * radius * radius;     //(2*반지름)*(2*반지름) = 4*반지름*반지름
        circleArea = radius * radius * Math.PI;
        redArea = squareArea - circleArea;

        System.out.printf("정사각형 면적: %dcm²\n", squareArea);
        System.out.printf("원의 면적: %.2fcm²\n", circleArea);
        System.out.printf("구하는 면적: %.2fcm²\n", redArea);
    }
}