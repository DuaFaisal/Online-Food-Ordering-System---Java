package FinalProject;

class Restaurant {
	void menu() {
		System.out.println("\n\t\t\t\"MENU\"\n");
	}
	void order(char ch) {
		System.out.println("\t\t=======================================\n");
	}
}	
	class Mcdonalds extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Burgers");
	        System.out.println("\tb. Breakfast");
	        System.out.println("\tc. Snacks");
	        System.out.println("\td. Desserts");
	        System.out.println("\te. McFries");
	        System.out.println("\tf. Hot Drinks");
	        System.out.println("\tg. Cold Drinks");
			
		}
		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Beef Burger             PKR 520.00");
	            System.out.println("McRoyale Burger         PKR 620.00");
	            System.out.println("McChicken Burger        PKR 420.00");
	            System.out.println("Filet-o-Fish            PKR 350.00");
	            System.out.println("Big Mac                 PKR 600.00");
	            System.out.println("Double McCrispy Burger  PKR 715.00");
	            System.out.println("Chicken Mac             PKR 590.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Sausage McMuffin        PKR 349.00");
	            System.out.println("Sausage Egg McMuffin    PKR 399.00");
	            System.out.println("Chicken McMuffin        PKR 330.00");
	            System.out.println("Hash Brown              PKR 120.00");
	            System.out.println("Hotcakes                PKR 249.00");
	            System.out.println("Omlette N' Tomato Wrap  PKR 249.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Chicken McNuggets -6pcs   PKR 430.00");
	            System.out.println("Chicken McNuggets -9pcs   PKR 499.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Hot Fudge Sundae            PKR 290.00");
	            System.out.println("Strawberry Sundae           PKR 290.00");
	            System.out.println("Apple Pie                   PKR 220.00");
	            System.out.println("Strawberry Custard Pie      PKR 250.00");
	            System.out.println("McFlurry Oreo               PKR 420.00");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("Fries -Regular       PKR 230.00");
	            System.out.println("Fries -Medium        PKR 280.00");
	            System.out.println("Fries -Large         PKR 350.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("Tea                 PKR 200.00");
	            System.out.println("Cappuccino          PKR 290.00");
	            System.out.println("Latte               PKR 310.00");
	            System.out.println("Black Coffee        PKR 210.00");
	            System.out.println("Mocha               PKR 360.00");
	            System.out.println("Hot Chocolate       PKR 370.00");

	            break;
	        case 'g':
	            System.out.println("\n");
	            System.out.println("Coca-Cola           PKR 200.00");
	            System.out.println("Fanta-Orange        PKR 200.00");
	            System.out.println("Sprite              PKR 200.00");
	            System.out.println("Coca-Cola Zero      PKR 220.00");
	            System.out.println("Orange Juice        PKR 180.00");
	            System.out.println("Peach Juice         PKR 160.00");

	            break;
			}
	    }
	}
	
	class Kfc extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Everyday Value");
	        System.out.println("\tb. Make it a Meal");
	        System.out.println("\tc. Signature Boxes");
	        System.out.println("\td. Sharing");
	        System.out.println("\te. Snacks");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Krunch Burger             PKR 195.00");
	            System.out.println("Rice and Spice            PKR 265.00");
	            System.out.println("Zingeratha                PKR 270.00");
	            System.out.println("Chicken and Rice          PKR 270.00 ");
	            System.out.println("Krunch Combo              PKR 270.00");
	            System.out.println("Chicken and Chips         PKR 275.00");
	            System.out.println("3 pcs Chicken             PKR 425.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Twister               PKR 340.00");
	            System.out.println("Zinger                PKR 270.00");
	            System.out.println("Zinger Stacker        PKR 460.00");
	            System.out.println("Kentucky              PKR 470.00");
	            System.out.println("Mighty Zinger         PKR 595.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Crispy Box             PKR 495.00");
	            System.out.println("Boneless Box           PKR 540.00");
	            System.out.println("Wow Box                PKR 750.00");
	            System.out.println("Crispy Duo Box         PKR 950.00");
	            System.out.println("Xtreme Duo Box         PKR 1,150");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Value Bucket       PKR 1,250");
	            System.out.println("Family Bucket      PKR 1,675");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("Saucy Wings              PKR 390.00");
	            System.out.println("French Fries             PKR 190.00");
	            System.out.println("Hot Shots - 9 pcs        PKR 300.00");
	            System.out.println("Snack Bucket             PKR 4200.00");
	            System.out.println("Nuggets - 6 pcs          PKR 440.00");
	            System.out.println("Nuggets - 9 pcs          PKR 440.00");
	            System.out.println("Coleslaw                 PKR 50.00");
	            System.out.println("Corn on the cob          PKR 150.00");
	            System.out.println("Pepsi                    PKR 90.00");
	            System.out.println("7up                      PKR 90.00");
	            System.out.println("Mirinda                  PKR 90.00");
	            System.out.println("Aquafina                 PKR 50.00");

	            break;
	    }		
	}
}
	class OPTP extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Natural Hand Cut Fries");
	        System.out.println("\tb. Pizza");
	        System.out.println("\tc. Double Stack Beef Burgers");
	        System.out.println("\td. Chicken Burger");
	        System.out.println("\te. Fried Chicken – Broast Style");
	        System.out.println("\tf. Wings and Nuggets");
	        System.out.println("\tg. Beverages");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Plain Fries           PKR 149.00");
	            System.out.println("Masala Fries          PKR 149.00");
	            System.out.println("BBQ Fries             PKR 269.00");
	            System.out.println("Garlic Mayo Fries     PKR 269.00");
	            System.out.println("Cheddar Cheese Fries  PKR 339.00");
	            System.out.println("Peri Peri Fries       PKR 269.00");
	            System.out.println("Masala Tangy Fries    PKR 269.00");
	            System.out.println("Pizza Fries           PKR 349.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Large 13-inch Stuffed Crust Pizza     PKR 1,199.00");
	            System.out.println("Medium 9-inch Pan Style Pizza         PKR 599.00");
	            System.out.println("Fried Pizza Pie                       PKR 249.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Hybrid                       PKR 599.00");
	            System.out.println("Big Mouth                    PKR 699.00");
	            System.out.println("Cheddar Melt                 PKR 699.00");
	            System.out.println("Double Stack BBQ Philly      PKR 699.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Zing Burger                     PKR 399.00");
	            System.out.println("Premium Chicken Burger          PKR 399.00");
	            System.out.println("GMC Burger                      PKR 249.00");
	            System.out.println("Shotgun Burger                  PKR 249.00");
	            System.out.println("Chicken Supremo Burger          PKR 499.00");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("Chicken – Breast Quarter       PKR 449.00");
	            System.out.println("Chicken – Leg Quarter          PKR 349.00");
	            System.out.println("Chicken Buckets                 PKR 299.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("Wings                PKR 399.00");
	            System.out.println("Nuggets              PKR 399.00");

	            break;
	        case 'g':
	            System.out.println("\n");
	            System.out.println("Mineral Water        PKR 59.00");
	            System.out.println("Pepsi                PKR 99.00");
	            System.out.println("Sprite               PKR 99.00");
	            System.out.println("Coca-Cola Zero       PKR 99.00");
	            System.out.println("7up                  PKR 99.00");
	            System.out.println("Mirinda              PKR 99.00");

	            break;
			}
		}
	}
	class Broadway extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. (S) Pizza's");
	        System.out.println("\tb. (M) Pizza's");
	        System.out.println("\tc. (L) Pizza's");
	        System.out.println("\td. Appetizers");
	        System.out.println("\te. Sandwiches");
	        System.out.println("\tf. Pastas");
	        System.out.println("\tg. Dessert");
	        System.out.println("\th. Beverages");
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Wicked Blend		    PKR 399.00");
	            System.out.println("Chicago Bold Fold               PKR 399.00");
	            System.out.println("West Side Garlic                PKR 399.00");
	            System.out.println("Mamma Mia Classic               PKR 399.00");
	            System.out.println("Dancing Fajita		    PKR 399.00");
	            System.out.println("Tarzan Tikka		    PKR 399.00");
	            System.out.println("All cheese			    PKR 399.00");
	            System.out.println("The Beast			    PKR 399.00");
	            System.out.println("Habenaro Kick Pizza             PKR 399.00");
	            System.out.println("Martian Mint		    PKR 399.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Wicked Blend		    PKR 599.00");
	            System.out.println("Chicago Bold Fold               PKR 599.00");
	            System.out.println("West Side Garlic                PKR 599.00");
	            System.out.println("Mamma Mia Classic               PKR 599.00");
	            System.out.println("Dancing Fajita		    PKR 599.00");
	            System.out.println("Tarzan Tikka		    PKR 599.00");
	            System.out.println("All cheese			    PKR 599.00");
	            System.out.println("The Beast			    PKR 599.00");
	            System.out.println("Habenaro Kick Pizza             PKR 599.00");
	            System.out.println("Martian Mint		    PKR 599.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Wicked Blend		    PKR 1399.00");
	            System.out.println("Chicago Bold Fold               PKR 1399.00");
	            System.out.println("West Side Garlic                PKR 1399.00");
	            System.out.println("Mamma Mia Classic               PKR 1399.00");
	            System.out.println("Dancing Fajita		    PKR 1399.00");
	            System.out.println("Tarzan Tikka		    PKR 1399.00");
	            System.out.println("All cheese			    PKR 1399.00");
	            System.out.println("The Beast			    PKR 1399.00");
	            System.out.println("Habenaro Kick Pizza             PKR 1399.00");
	            System.out.println("Martian Mint		    PKR 1399.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Appetizer Platter Box           PKR 599.00");
	            System.out.println("Garlic Bread		    PKR 329.00");
	            System.out.println("Stuffed Potato Skins            PKR 379.00");
	            System.out.println("Tikka bread			    PKR 379.00");
	            System.out.println("Potato Wedges 180g              PKR 379.00");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("South Western Sandwich	PKR 599.00");
	            System.out.println("Zesty Habanero Sandwich	PKR 599.00");
	            System.out.println("Smokey Joe's Sandwich	PKR 599.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("BBQ Ranch Pasta		PKR 539.00");
	            System.out.println("Smokey Joe's Pasta		PKR 539.00");
	            System.out.println("Garlic Ranch Pasta		PKR 539.00");

	            break;
	        case 'g':
	            System.out.println("\n");
	            System.out.println("Molten Lava Cake		PKR 279.00");
	            System.out.println("Belgian Chocolate Chunk	PKR 579.00");

	            break;
	        case 'h':
	            System.out.println("\n");
	            System.out.println("Drink Small			PKR 79.00");
	            System.out.println("Drink Large			PKR 180.00");

	            break;
			}	
		}
	}
	class Dominos extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Favorite Crust");
	        System.out.println("\tb. Chicken Corner");
	        System.out.println("\tc. Sidelines");
	        System.out.println("\td. Dips");
	        System.out.println("\te. Dessert");
	        System.out.println("\tf. Beverages");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("PAN				PKR 1,299.00");
	            System.out.println("Hand Tossed			PKR 1,299.00");
	            System.out.println("Itallian Thin		PKR 1,399.00");
	            System.out.println("Crunchy Thin 		PKR 1,799.00");
	            System.out.println("Double Melt			PKR 2,299.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Chicken Wings 		    PKR 499.00");
	            System.out.println("Twisted Dough Balls             PKR 499.00");
	            System.out.println("Chicken Kickers		    PKR 499.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Cheesy Bread		    PKR 599.00");
	            System.out.println("Bread Sticks		    PKR 399.00");
	            System.out.println("Garlic Bread sticks             PKR 399.00");
	            System.out.println("Potato Wedges 180g              PKR 399.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("BBQ Sauce			PKR 89.00");
	            System.out.println("Ranch Sauce			PKR 89.00");
	            System.out.println("Marinara Sauce		PKR 89.00");
	            System.out.println("Hot Sauce			PKR 89.00");
	            System.out.println("Peri peri Sauce		PKR 89.00");
	            break;

	        case 'e':
	            System.out.println("\n");
	            System.out.println("Chocolate Lava Cake             PKR 499.00");
	            System.out.println("Cinna Stix			    PKR 399.00");
	            System.out.println("Choco Bread			    PKR 399.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("Drink Small			PKR 79.00");
	            System.out.println("Drink Large			PKR 180.00");

	            break;
			}	
		}
	}
	class JohnnyRockets extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Burgers");
	        System.out.println("\tb. Shakes");
	        System.out.println("\tc. Fan Favourites");
	        System.out.println("\td. Kids Meals");
	        System.out.println("\te. Melts");
	        System.out.println("\tf. Beverages");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("#12 Burger			PKR 495.00");
	            System.out.println("Route 66			PKR 495.00");
	            System.out.println("Rocket Single		PKR 495.00");
	            System.out.println("The Spicy Houston           PKR 495.00");
	            System.out.println("Crispy Rocket		PKR 495.00");
	            System.out.println("The Original 		PKR 495.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Original Shakes             PKR 325.00");
	            System.out.println("Deluxe Shakes		PKR 449.00");
	            System.out.println("Chicken Kickers		PKR 499.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Grilled Chicken Sandwich	PKR 299.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Chicken Tenders		    PKR 299.00");
	            System.out.println("Kids Burger 		    PKR 299.00");
	            System.out.println("Kids Original Shakes            PKR 299.00");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("Patty Melt			PKR 399.00");
	            System.out.println("Grilled Cheese		PKR 199.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("Drink Small			PKR 79.00");
	            System.out.println("Drink Large			PKR 180.00");

	            break;
			}		
		}
	}
	class CafeBistrovia extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Starters");
	        System.out.println("\tb. Meals & Grills");
	        System.out.println("\tc. Burgers & Sandwiches");
	        System.out.println("\td. Mocktails");
	        System.out.println("\te. New Arrivals");
	        System.out.println("\tf. Beverages");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Classic fries		    PKR 160.00");
	            System.out.println("Hotshots			    PKR 270.00");
	            System.out.println("Spicy Cheese Fries              PKR 240.00");
	            System.out.println("Cheese Fries		    PKR 220.00");
	            System.out.println("BBQ Wings			    PKR 270.00");
	            System.out.println("Chicken Cheese Fries            PKR 300.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Chicken Steak 		    PKR 590.00");
	            System.out.println("Deluxe Chicken Steak            PKR 690.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Bistrovia Beef Burger	PKR 380.00");
	            System.out.println("Mushroom Lovers Burger	PKR 160.00");
	            System.out.println("The Fire Cracker		PKR 400.00");
	            System.out.println("Smoking BBQ Burger		PKR 420.00");
	            System.out.println("Crispy Zinger		PKR 280.00");
	            System.out.println("Zinger with cheese		PKR 320.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Electric lemonade               PKR 180.00");
	            System.out.println("Strawberry Ice 		    PKR 200.00");
	            System.out.println("Pina Colada			    PKR 260.00");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("Singaporian Rice		PKR 350.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("Drink Small			PKR 79.00");
	            System.out.println("Drink Large			PKR 180.00");

	            break;
			}			
		}
	}
	class VintageCafe extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Starters");
	        System.out.println("\tb. Meals & Grills");
	        System.out.println("\tc. Burgers & Sandwiches");
	        System.out.println("\td. Mocktails");
	        System.out.println("\te. New Arrivals");
	        System.out.println("\tf. Beverages");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Classic fries		    PKR 160.00");
	            System.out.println("Hotshots			    PKR 270.00");
	            System.out.println("Spicy Cheese Fries              PKR 240.00");
	            System.out.println("Cheese Fries		    PKR 220.00");
	            System.out.println("BBQ Wings			    PKR 270.00");
	            System.out.println("Chicken Cheese Fries            PKR 300.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Chicken Steak 		    PKR 590.00");
	            System.out.println("Deluxe Chicken Steak            PKR 690.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Bistrovia Beef Burger	PKR 380.00");
	            System.out.println("Mushroom Lovers Burger	PKR 160.00");
	            System.out.println("The Fire Cracker		PKR 400.00");
	            System.out.println("Smoking BBQ Burger		PKR 420.00");
	            System.out.println("Crispy Zinger		PKR 280.00");
	            System.out.println("Zinger with cheese		PKR 320.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Electric lemonade               PKR 180.00");
	            System.out.println("Strawberry Ice 		    PKR 200.00");
	            System.out.println("Pina Colada			    PKR 260.00");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("Singaporian Rice		PKR 350.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("Drink Small			PKR 79.00");
	            System.out.println("Drink Large			PKR 180.00");

	            break;
			}		
		}
	}
	class Kababjees extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. B.B.Q Kabab");
	        System.out.println("\tb. Desserts");
	        System.out.println("\tc. Mocktails");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Chullu Kabab Beef		PKR 712.00");
	            System.out.println("Chicken Cheese Kabab	PKR 714.00");
	            System.out.println("Mutton Cheese Kabab 	PKR 799.00");
	            System.out.println("Ertugrul Kabab		PKR 639.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Nutella Brownie		PKR 280.00");
	            System.out.println("KababJees Coco Cake		PKR 239.00");
	            System.out.println("Ferrero Rocher Cake		PKR 260.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Lemon Mint Glacier		  PKR 199.00");
	            System.out.println("White Colada		  PKR 239.00");
	            System.out.println("Victoria's Secret Margarita	  PKR 658.00");

	            break;
			}		
		}
	}
	class UrbanTarka extends Restaurant{

		@Override
		public void menu() {
			super.menu();
			System.out.println("\ta. Starters");
	        System.out.println("\tb. Soups");
	        System.out.println("\tc. Chinese");
	        System.out.println("\td. BBQ Items");
	        System.out.println("\te. Rice");
	        System.out.println("\tf. Fast Food");
	        System.out.println("\tg. Desserts");
	        System.out.println("\th. Drinks");
	        System.out.println("\ti. Side Orders");
			
		}

		@Override
		public void order(char ch) {
			super.order(ch);
			switch (ch) {
	        case 'a':
	            System.out.println("\n");
	            System.out.println("Pizza fries			PKR 285.00");
	            System.out.println("Dynamite Wing		PKR 340.00");
	            System.out.println("Spicy Cheese Fries          PKR 240.00");
	            System.out.println("Zinger Stick		PKR 320.00");
	            System.out.println(" Crispy BBQ Wings           PKR 315.00");

	            break;
	        case 'b':
	            System.out.println("\n");
	            System.out.println("Chicken Corn Soup		PKR 160.00");
	            System.out.println("Hot & Spicy Soup		PKR 690.00");

	            break;
	        case 'c':
	            System.out.println("\n");
	            System.out.println("Szechuan Chicken		PKR 480.00");
	            System.out.println("Chicken Shashlik		PKR 460.00");
	            System.out.println("Dragon Chicken		PKR 530.00");
	            System.out.println("Chicken Manchurian		PKR 470.00");
	            System.out.println("Hawaiian Chicken		PKR 495.00");
	            System.out.println("Chicken Dry chilli		PKR 460.00");

	            break;
	        case 'd':
	            System.out.println("\n");
	            System.out.println("Chicken Tikka		PKR 250.00");
	            System.out.println("Rashmi Kabab Chicken	PKR 390.00");
	            System.out.println("Chicken Malai Botti		PKR 395.00");
	            System.out.println("Murgh Anakali		PKR 435.00");
	            System.out.println("Murgh Paneeri Kabab		PKR 485.00");
	            System.out.println("BBQ Platter			PKR 960.00");

	            break;
	        case 'e':
	            System.out.println("\n");
	            System.out.println("Plain Rice			PKR 150.00");
	            System.out.println("Singaporian Rice		PKR 250.00");

	            break;
	        case 'f':
	            System.out.println("\n");
	            System.out.println("Zinger Burger		PKR 280.00");
	            System.out.println("Chicken Double Decker	PKR 360.00");
	            System.out.println("Club Sandwich		PKR 340.00");
	            System.out.println("Beef Double Decker		PKR 390.00");
	            System.out.println("Beef Jalapeno Burger	PKR 300.00");
	            System.out.println("Cheese Broast Chest		PKR 370.00");

	            break;
	        case 'g':
	            System.out.println("\n");
	            System.out.println("Plain Rabri			PKR 150.00");
	            System.out.println("Pasta Rabri			PKR 170.00");

	            break;
	        case 'h':
	            System.out.println("\n");
	            System.out.println("Drink Small			PKR 79.00");
	            System.out.println("Drink Large			PKR 180.00");

	            break;
	        case 'i':
	            System.out.println("\n");
	            System.out.println("Salad			PKR 75.00");
	            System.out.println("Extra Sauce			PKR 60.00");
	            System.out.println("Raita			PKR 70.00");
	            System.out.println("Cheese Slice		PKR 30.00");

	            break;
			}		
		}
	}
