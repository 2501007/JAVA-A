import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int CIGA = 7;
        int life;
        float ga;

        float minute;
        float year;
        float day;
        float hour;
        float temp;

        System.out.print("당신은 몇 년 동안 담배를 피웠나요?");
        life = keyboard.nextInt();
        System.out.print("하루에 평균 몇 개피를 피웠나요?");
        ga = keyboard.nextFloat();

        minute =  life * 365 * ga * CIGA;
        year = (float) minute / 60 / 24 / 365;
        day = (float) (minute / 60 / 24) % 365;
        hour = (float) (minute / 60) % 24;
        temp = minute % 60;


        System.out.printf("담배 1개피는 %d분의 생명을 단축합니다.\n", CIGA);
        System.out.printf("%d년 동안 %.0f개피의 담배를 피우면 %,.0f분의 생명이 단축됩니다.\n", life, ga, minute);
        System.out.printf("%,.0f분은 %.0f년 %.0f일 %.0f시간 %.0f분 입니다.\n", minute, year, day, hour, temp);
    }
}