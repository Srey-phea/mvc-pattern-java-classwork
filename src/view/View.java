package view;

import controller.UserController;
import model.User;

import java.util.Scanner;

public class View {
    private static final UserController userController
            = new UserController();
    public static void UI(){
        while (true){
            System.out.println("+++++| Menu |+++++");
            System.out.println("1. Show All User");
            System.out.println("2. Add New User");
            System.out.println("3. Remove User");
            System.out.println("4. Update User");
            System.out.println("5. Exit");
            System.out.println("++++++++++++++++++");
            System.out.println("Choose Option:");
            int op = new Scanner(System.in).nextInt();
            switch (op){
                case 1->{
                    System.out.println("+++++| Get All Users |+++++");
                    userController.getAllUsers().forEach(System.out::println);
                }
                case 2->{
                    System.out.println("+++++| Add New User |+++++");
                    int id = userController.getAllUsers().size() + 1;
                    System.out.println("Enter Name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Enter Email: ");
                    String email = new Scanner(System.in).nextLine();
                    userController.addewUser(new User(id,name,email));
                }
                case 3->{
                    System.out.println("+++++| Remove User |+++++");
                    System.out.println("Ënter ID to remove user: ");
                    int id  = new Scanner(System.in).nextInt();
                    userController.deleteUser(id);
                }
                case 4->{}
                case 5->{
                    System.exit(0);
                }
            }
        }
    }
}
