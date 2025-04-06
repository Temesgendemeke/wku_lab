package campus_movie_night;

import java.util.Scanner;

public class AdminMenu {
    public void displayMenu(Scanner input){
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
    public  void ManageMovie(Scanner input){
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