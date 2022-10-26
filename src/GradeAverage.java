import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Math: ");
        float mathGrade = s.nextFloat();

        System.out.print("Science: ");
        float scienceGrade = s.nextFloat();

        System.out.print("History: ");
        float historyGrade = s.nextFloat();

        System.out.print("Geography: ");
        float geographyGrade = s.nextFloat();

        float average = (mathGrade + scienceGrade + historyGrade + geographyGrade) / 4;

        System.out.println();
        System.out.println("Average: " + average);

    }
}