import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int lives = 3;
        String answer;

        while (lives > 0){
            System.out.println("What does  ");
            System.out.print("Answer: ");
            answer = s.nextLine();

            if(answer.equalsIgnoreCase("sun")) break;
            else lives--;
        }
        if(lives > 0) System.out.println("Big Brain");
        else System.out.println("BONAK!!");

    }
}