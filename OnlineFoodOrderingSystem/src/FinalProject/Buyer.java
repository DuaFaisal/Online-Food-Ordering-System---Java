package FinalProject;

import java.util.Scanner;

import FinalProject.AvailableResturant.Node;

class Buyer {
	Node head;
	static class FoodNode {

        String food;
        String combo;
        FoodNode fprev;
        FoodNode fnext;

        public FoodNode(String food) {
            this.food = food;
        }
    }
	
	FoodNode fhead, ftail = null;
	//adding food items to order list

    void order_items(String food) {
        FoodNode add_order = new FoodNode(food);

        if (fhead == null) {
            fhead = add_order;
            return;
        }
        FoodNode ftemp = fhead;
        
        while (ftemp.fnext != null) {
            ftemp = ftemp.fnext;
           
        }
       
        
        ftemp.fnext = add_order;
        System.out.println(ftemp.fnext.food  + "\n\t\t\tFood added! \n" );
       
    }
    
    void printOrder() {
        FoodNode temp = fhead;
        System.out.println("Your Order Items are:  ");
        while (temp != null) {
            System.out.println(temp.food + " ");
            temp = temp.fnext;
        }
        System.out.println();
    }
    
    public void selectResturant(String resname){
    	
		Scanner sc = new Scanner(System.in);
    	Restaurant restaurant = null;
    	switch(resname){
    	case "a":
    		restaurant = new Mcdonalds();
    		break;
    	case "b":
    		restaurant = new Kfc();
    		break;
    	case "c":
    		restaurant = new OPTP();
    		break;
    	case "d":
    		restaurant = new Broadway();
    		break;
    	case "e":
    		restaurant = new Dominos();
    		break;
    	case "f":
    		restaurant = new JohnnyRockets();
    		break;
    	case "g":
    		restaurant = new CafeBistrovia();
    		break;
    	case "h":
    		restaurant = new VintageCafe();
    		break;
    	case "i":
    		restaurant = new Kababjees();
    		break;
    	case "j":
    		restaurant = new UrbanTarka();
    		break;
    	default:
    		System.out.println("\n\t\t\"Restaurant not found!!!\"");
    		
    	}
    	
    	if(restaurant != null){
    		restaurant.menu();
    		System.out.print("\nEnter any food item you want(type in the character): ");
    		char ch = sc.next().charAt(0);
    		restaurant.order(ch);
    	}
    	else{
    		System.out.println("\n\t\t\"You did something wrong!!!\"");
    	}	
    }
    public void bill(String f_name,String l_name) {
    	System.out.println("\n\t\t\t****** BILL ******\n");
    	double FoodCost = 400;
    	double tax = 0.0675 * FoodCost;
    	double TotalCost = FoodCost + tax;
    	double DeliveryCharges = 0.2 * TotalCost;
    	double TotalBill = TotalCost + DeliveryCharges;
    	System.out.println("Name: "+f_name+" "+l_name);
    	System.out.println("Cost of meal:        Rs."+FoodCost);
    	System.out.println("Tax:                 Rs."+tax);
    	System.out.println("DeliveryCharges:     Rs."+DeliveryCharges);
    	System.out.println("\n==================================\n");
    	System.out.println("TOTAL AMOUNT:        Rs."+TotalBill);
    	System.out.println("\n==================================\n");
    	System.out.println("\n\t\t\t****** THANKYOU ******\n");
    }
  }


