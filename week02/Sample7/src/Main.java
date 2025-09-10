import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name, address = "";
        int age = 0;

        System.out.print("당신의 이름은? ");
        name = keyboard.nextLine();
        System.out.printf("%s의 나이는? ", name);
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s의 주소는? ", name);
        address = keyboard.nextLine();



        System.out.printf("\n%s님의 나이는 %d살 입니다\n", name, age);
        System.out.printf("%s님의 주소는 %s 입니다.", name, address);
        }
    }
