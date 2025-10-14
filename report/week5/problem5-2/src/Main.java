import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int score;
        String grade;

        System.out.print("당신의 JAVA 점수 입력 : ");
        score = keyboard.nextInt();

        if (score >= 95 && score <= 100) {
            grade = "A+";
        } else if (score >= 90 && score <= 94) {
            grade = "A0";
        } else if (score >= 85 && score <= 89) {
            grade = "B+";
        } else if (score >= 80 && score <= 84) {
            grade = "B0";
        } else if (score >= 75 && score <= 79) {
            grade = "C+";
        } else if (score >= 70 && score <= 74) {
            grade = "C0";
        } else if (score >= 65 && score <= 69) {
            grade = "D+";
        } else if (score >= 60 && score <= 64) {
            grade = "D0";
        } else if (score < 60) {
            grade = "F";
        } else {
            grade = "점수 오류";
        }

        System.out.printf("입력 점수 : %d\n", score);
        System.out.printf("학점 : %s\n", grade);
    }
}