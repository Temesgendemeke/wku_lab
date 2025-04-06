import java.util.Scanner;
public class lostandfound{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   int choice = 0;
    while (true) { 
       MainMenu();
       choice = input.nextInt ();
       switch(choice){
        case 1:
          loginScreen(input);
           break;
        case 2:
           System.out.println("Exiting........godbye");
           System.exit(0);
           break;
        default:
        System.out.println("invalid choice,please enter 1 or 2");
       }
    }}
    
    public static void DisplayMenu(){
        System.out.println("==========================================");
        System.out.println("| LOST AND FOUND MANAGEMNET SYSTEM/t|");
        System.out.println("======================================");
        System.out.println("1. LOGIN");
        System.out.println("2. EXIT");
        System.out.println("Enter your choice");
    }
    private static void loginScreen(Scanner input){
        System.out.println("enter your Username: ");
        String username = input.next();
        System.out.println("enter your password: ");
        String password = input.next();

        // we have two database users US =admin,pwd=1234, US=student,pwd=4321

        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")){
            AdminMenu(input);
        }
        else if(username.equalsIgnoreCase("student") && password.equalsIgnoreCase("4321")){
            studentMenu(input);
        }
        else{
            System.out.println("Invalid username or password");
        }
    }
    public static void studentMenu(Scanner input){
            System.out.println("1. report a lost items");
            System.out.println("2. report a found item");
            System.out.println("3. search for an item");
            System.out.println("4. view all lost and found items");
            System.out.println("5. claim a lost item");
            System.out.println("6. view found items & owners");
            System.out.println("7. notifications");
            System.out.println("8. Exit");
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
public static void AdminMenu(Scanner input){
    System.out.println("1. view all lost and found items");
    System.out.println("2. manage reported lost items");
    System.out.println("3. manage reported found items");
    System.out.println("4. process claims");
    System.out.println("5. claim a lost item");
    System.out.println("6. generate reports");
    System.out.println("7. exit");
    int admin_choice =input.nextInt();
            switch(admin_choice){
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
                
            }
}
public static void searchforanitem(Scanner input){
    System.out.println("1. type");
    System.out.println("2. date");
    System.out.println("3. description");
    System.out.println("4. location");
    int search_choice =input.nextInt();
            switch(search_choice){
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
public static void claimalostItem(Scanner input){
    System.out.println("1. owner information");
    System.out.println("2. item desciption");
    System.out.println("3. verify claim before approval");
    int claim_choice =input.nextInt();
            switch(claim_choice){
                case 1:
                  break;
                case 2:
                  break;
                case 3:
                  break;
                
            }

}
}