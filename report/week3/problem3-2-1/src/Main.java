import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String school = "";
        String name = "";
        int age = 0;
        String gender = "";
        double height = 0.0;
        double weight = 0.0;

        System.out.print("학교 이름을 입력하세요: ");
        school = keyboard.nextLine();

        System.out.print("이름을 입력하세요: ");
        name = keyboard.nextLine();

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("성별을 입력하세요 (남 또는 여): ");
        gender = keyboard.nextLine();

        System.out.print("신장(cm)을 입력하세요: ");
        height = keyboard.nextDouble();

        System.out.print("체중(kg)을 입력하세요: ");
        weight = keyboard.nextDouble();

        System.out.println("*********************");
        System.out.printf("학교 : %s\n", school);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %s\n", gender);
        System.out.printf("신장 : %.1f Cm\n", height);
        System.out.printf("체중 : %.1f Kg\n", weight);
        System.out.println("*********************");
    }
}