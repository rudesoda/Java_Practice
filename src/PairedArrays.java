import java.util.Scanner;

public class PairedArrays {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] emails = {"chiyoko@gmail.com", "sunshine@gmail.com", "chummies@gmail.com"};
        String[] usernames = {"Chiyoko","Sunshine","Chummies"};
        String[] passwords = {"chiyoko09","chiyoko22","chummies01"};

        int i;

        System.out.print("Enter Index:");
        i = s.nextInt();

        System.out.println("Index: " + i);
        System.out.println("Email: " + emails[i]);
        System.out.println("Username: " + usernames[i]);
        System.out.println("Password: " + passwords[i]);


    }


}