import java.util.Scanner;

public class OneFunctionCalculator {

    public static void main(String[] args) {

        float numOne;
        float numTwo;
        float result;

        Scanner s = new Scanner(System.in);

        System.out.print("First Number: ");
        numOne = s.nextFloat();

        System.out.print("Second Number: ");
        numTwo = s.nextFloat();

        result = numOne * numTwo;

        System.out.println();
        System.out.println(numOne + " * " + numTwo + " = " + result);


    }
}