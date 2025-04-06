package campus_movie_night;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (true) {
            DisplayMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    loginScreen(input);

                    break;
                case 2:
                    System.out.println("Exiting........godbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please enter 1 or 2");
            }
        }
    }

    public static void DisplayMenu() {
        System.out.println("==========================================");
        System.out.println("| 📺 WELCOME TO CAMPUS MOVIE NIGHT\t📺|");
        System.out.println("======================================");
        System.out.println("1. LOGIN");
        System.out.println("2. EXIT");
        System.out.println("Enter your choice");
    }

    private static void loginScreen(Scanner input) {
        System.out.print("enter your Username: ");
        String username = input.next();
        System.out.print("enter your password: ");
        String password = input.next();

        //we have two database users US=admin,pwd=1234, us=student,pwd=4321

checkUser(username,password);
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
            AdminMenu aMenu = new AdminMenu();
            aMenu.displayMenu(input);

        } else if (username.equalsIgnoreCase("student") && password.equalsIgnoreCase("4321")) {
            StudentMenu.displayMenu(input);
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    private static void checkUser(String username, String password) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src\\campus_movie_night\\users.txt"));
             String line = reader.readLine();
            System.out.println("first user information -->"+line);

            while(line!=null){
                System.out.println("user information->"+line);
                line = reader.readLine();
            }

        }
        catch(Exception e){}
    }
}