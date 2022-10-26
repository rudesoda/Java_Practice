import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] usernames = {"Chiyoko","Sunshine","Chumie"};
        String[] passwords = {"chiyoko01", "sunshine02", "chumie03"};

        System.out.print("Username: ");
        String username = s.nextLine();

        System.out.print("Password: ");
        String password = s.nextLine();

        boolean isExist = false;

        for (int i = 0; i < usernames.length; i++) {

            if(username.equalsIgnoreCase(usernames[i]) && password.equals(passwords[i])){
                isExist = true;
                break;
            }
        }
        if(isExist) System.out.println("Welcome, " + username);
        else System.out.println("Account not Found");
    }

}
