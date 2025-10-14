import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char ch = ' ';

        System.out.print("하나의 영문자 입력 ");
        ch = keyboard.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            char lower = (char)(ch + 32);
            System.out.printf("입력 문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.\n", ch, lower);
        } else if (ch >= 'a' && ch <= 'z') {
            char upper = (char)(ch - 32);
            System.out.printf("입력 문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.\n", ch, upper);
        } else {
            System.out.println("영문자가 아닙니다.");
        }
    }
}