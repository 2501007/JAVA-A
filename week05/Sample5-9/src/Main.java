import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        char gender;
        float weight;
        float weight1;
        String result;

        System.out.print("당신의 성별은(남성 = 남, 여성 = 여)? ");
        gender = keyboard.next().charAt(0);
        System.out.print("당신의 키는(m)? ");
        height = keyboard.nextFloat();

        weight = gender == '남' ? height * height * 22 : height * height * 21;

        weight1 = height * height * 20;

        result = gender == '여' ? String.format("키가 %.2fm인 여성의 미용 체중은 %.2fkg 입니다.\n", height, weight1) :
                String.format("");
        System.out.printf("키가 %.2fm인 %c성의 표준 체중은 %.2fkg 입니다.\n", height, gender, weight);
        System.out.println(result);
    }
}