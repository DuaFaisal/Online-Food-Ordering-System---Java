package FinalProject;

import java.util.Scanner;

import FinalProject.Buyer.FoodNode;

public class OnlineFoodOrdering {
		FoodNode head;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t\t<<<< WELCOME TO FOOD SPACE >>>>");
        System.out.println("\n");
        System.out.println("1. Login as buyer");
        System.out.println("2. Login as admin");
        int n = sc.nextInt();
        
        Buyer buy = new Buyer(); //object for buyer class
        AvailableResturant availableResturant = new AvailableResturant(); //object for available restaurant class

        switch (n) {
            case 1:
                System.out.println("\t\t<<<Sign in>>>\n");
                System.out.print("Enter first name: ");
                String f_name = sc.next();
                System.out.print("\nEnter last name: ");
                String l_name = sc.next();
                System.out.print("\nEnter Email: ");
                String email = sc.next();
                System.out.print("\nEnter Contact Number: ");
                double number = sc.nextDouble();
                System.out.println("\n\t\tCongratulations! " + f_name + " " + l_name);
                System.out.println("\n\t\tYou've successfully signed in\n");
                System.out.println("\n\t======================================\n");
                
                System.out.println("\t\t\tRESTAURANTS");
                System.out.println("\n");
                availableResturant.print(); //printing the restaurants
                System.out.println("\n\t======================================\n");
                System.out.print("\nWhich restaurant you want to choose (press alphabet infront of it): ");
                String resname = sc.next();
                availableResturant.search(resname); //searching the restaurant name
                buy.selectResturant(resname);
                
                System.out.print("\nEnter the food you want to order or type 'exit' : ");
                String food = sc.next();
                if (food.equalsIgnoreCase("exit")) {
                    System.out.println("\n\t======================================\n");
                    System.out.println("\n\t\t\"Thankyou for visiting\"");
                } 
                else {
                	buy.order_items(food);
                    System.out.println("\n\t======================================\n");
                    buy.printOrder();
                    char add01;
                    String combo;
                    System.out.print("\nDo you want to add anything else?(y/n) ");
                    add01= sc.next().charAt(0);
                    if (add01 == 'y'){
                    	System.out.println("\n\t\t\t\"COMBOS AVAILABLE\"\n");
                        System.out.println("\n* Mineral Water");
                        System.out.println("\n* Soft Drink");
                        System.out.println("\n* Orange Juice");
                        System.out.println("\n* Fries");
                        System.out.println("\n* Salad");

                        System.out.print("\nEnter your option here: ");
                        combo = sc.next();
           
                        buy.order_items(combo);
                        buy.printOrder();
                        System.out.println("\n\t======================================\n");
                    }
                    System.out.print("Place Order? (y/n) ");
                    char order= sc.next().charAt(0);
                    
                    if(order == 'y') {
                    	buy.bill(f_name, l_name);
                    }
                    else if(order == 'n') {
                    	System.out.println("\nOops! Seems like your order was not placed!");
                    }
                    else {
                    	System.out.println("\nSomething went wrong. Please try again!");
                    }
                }
                break;
            case 2:
                System.out.println("\t\tLogin\n");
                System.out.print("Enter username: ");
                String username = sc.next();
                System.out.print("\nEnter password: ");
                String password = sc.next();
                if(password.equalsIgnoreCase("admin123")) {
                	System.out.println("\nYou've successfully logged in");
  
                System.out.println("\na. Deletion of Restaurant");
                System.out.println("\nb. Restaurants available");
                System.out.println("\n\t======================================\n");
                System.out.print("\nEnter your option: \n");
                char option = sc.next().charAt(0);
                
                if(option == 'a') {
                	availableResturant.print(); //printing the restaurants
                	System.out.print("\nEnter the restaurant you wish to delete: ");
                	char delete = sc.next().charAt(0);
                	System.out.println("\n\t\t\tSuccessfully deleted!!\n");
                	availableResturant.deleteNodeAtGivenPos(delete);
                	availableResturant.AfterDelete();
                }
                else if(option == 'b') {
                	availableResturant.print(); //printing the restaurants
                }
                }
                else {
                	System.out.println("\nPassword is incorrect!!");
                }
                break;
            default:
                System.out.println("\nTry again!");
                break;
        }
    }
} //main class