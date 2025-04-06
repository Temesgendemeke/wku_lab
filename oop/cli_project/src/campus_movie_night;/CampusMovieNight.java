package campus_movie_night;

import java.util.Scanner;
public class CampusMovieNight{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (true){
            MainMenu();
            choice = input.nextInt();
            switch(choice){
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

    public static void MainMenu(){
        System.out.println("==========================================");
        System.out.println("| 📺 WELCOME TO CAMPUS MOVIE NIGHT\t📺|");
        System.out.println("======================================");
        System.out.println("1. LOGIN");
        System.out.println("2. EXIT");
        System.out.println("Enter your choice");
    }
    private static void loginScreen(Scanner input){
        System.out.print("enter your Username: ");
        String username = input.next();
        System.out.print("enter your password: ");
        String password = input.next();

        //we have two database users US=admin,pwd=1234, us=student,pwd=4321



        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")){
            adminMenu(input);
        }
        else if(username.equalsIgnoreCase("student") && password.equalsIgnoreCase ("4321")){
            studentMenu(input);
        }
        else{
            System.out.println("Invalid username or password!");
        }
    }

    public static void studentMenu(Scanner input){
        System.out.println("1.view Available Movies");
        System.out.println("2. Vote for movie|");
        System.out.println("3. RSVP for movie night");
        System.out.println("4. view schedule movie night");
        System.out.println("5. proved feedback andratings");
        System.out.println("6. suggest a movie");
        System.out.println("7. search a movie");
        System.out.println("8. Exit");
        System.out.println("enter your choice:");
        int stud_choice =input.nextInt();
        switch(stud_choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
    }
    public static void adminMenu(Scanner input){
        System.out.println("1. view Available Movies");
        System.out.println("2. manage movies");
        System.out.println("3. schedule a movie night");
        System.out.println("4. manage RSVPs");
        System.out.println("5. approve/reject movie suggation");
        System.out.println("6. view feedback reports");
        System.out.println("7. send notifications");
        System.out.println("8. generate reports");
        System.out.println("9. exit");
        System.out.println("enter your choice:");
        int admin_choice =input.nextInt();

        switch(admin_choice){
            case 1:
                break;
            case 2:
                ManageMovie(input);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
    }
    public static void ManageMovie(Scanner input){
        System.out.println("1. add a new movie");
        System.out.println("2. update movie details");
        System.out.println("3. delete a movie");
        System.out.println("4. go back");
        System.out.println("enter your choice:");
        int manage_choice =input.nextInt();

        switch(manage_choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }
    }
}