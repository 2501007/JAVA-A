import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENTS = 10;

        String[] stunum = new String[NUM_STUDENTS];
        String[] name = new String[NUM_STUDENTS];
        int[] mid = new int[NUM_STUDENTS];
        int[] fin = new int[NUM_STUDENTS];
        int[] quiz = new int[NUM_STUDENTS];
        int[] report = new int[NUM_STUDENTS];
        int[] attend = new int[NUM_STUDENTS];
        double[] weightedScore = new double[NUM_STUDENTS];

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("학번 입력: ");
            stunum[i] = sc.next();

            System.out.print("이름 입력: ");
            name[i] = sc.next();

            System.out.print("중간: ");
            mid[i] = sc.nextInt();

            System.out.print("기말: ");
            fin[i] = sc.nextInt();

            System.out.print("퀴즈: ");
            quiz[i] = sc.nextInt();

            System.out.print("레포트: ");
            report[i] = sc.nextInt();

            System.out.print("출석: ");
            attend[i] = sc.nextInt();

            weightedScore[i] = mid[i] * 0.15 + fin[i] * 0.15 + quiz[i] * 0.10
                    + report[i] * 0.40 + attend[i] * 0.20;
        }

        for (int i = 0; i < NUM_STUDENTS - 1; i++) {
            for (int j = i + 1; j < NUM_STUDENTS; j++) {
                if (weightedScore[i] < weightedScore[j]) {
                    double tempScore = weightedScore[i];
                    weightedScore[i] = weightedScore[j];
                    weightedScore[j] = tempScore;

                    int temp;
                    temp = mid[i]; mid[i] = mid[j]; mid[j] = temp;
                    temp = fin[i]; fin[i] = fin[j]; fin[j] = temp;
                    temp = quiz[i]; quiz[i] = quiz[j]; quiz[j] = temp;
                    temp = report[i]; report[i] = report[j]; report[j] = temp;
                    temp = attend[i]; attend[i] = attend[j]; attend[j] = temp;

                    String tempStr;
                    tempStr = stunum[i]; stunum[i] = stunum[j]; stunum[j] = tempStr;
                    tempStr = name[i]; name[i] = name[j]; name[j] = tempStr;
                }
            }
        }

        System.out.println("*************************************************");
        System.out.println("학번 이름 중간 기말 퀴즈 레포트 출석 점수");
        System.out.println("*************************************************");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.printf("%s %s %d %d %d %d %d %.2f\n",
                    stunum[i], name[i], mid[i], fin[i], quiz[i], report[i], attend[i], weightedScore[i]);
        }
        System.out.println("*************************************************");
    }
}
