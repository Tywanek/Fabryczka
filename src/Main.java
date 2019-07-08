public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");


        MathExam mathExam = new MathExam(new PrimarySchoolFactory());
        mathExam.createTest();

        mathExam = new MathExam(new HighSchoolFactory());
        mathExam.createTest();

    }
}
