public class Main {
    public static void main(String[] args) {
        final String SCHOOL = "경복대학교";
        final String NAME = "김명범";
        final int AGE = 20;
        final char GENDER = '남';
        final double HEIGHT = 176.1;
        final double WEIGHT = 70.4;

        System.out.println("*********************");
        System.out.printf("학교 : %s\n", SCHOOL);
        System.out.printf("이름 : %s\n", NAME);
        System.out.printf("나이 : %d\n", AGE);
        System.out.printf("성별 : %c\n", GENDER);
        System.out.printf("신장 : %.1f Cm\n", HEIGHT);
        System.out.printf("체중 : %.1f Kg\n", WEIGHT);
        System.out.println("*********************");
    }
}