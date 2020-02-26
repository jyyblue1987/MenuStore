import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MustangTires {
	// static variables
	static Scanner scan = new Scanner(System.in);
	static double total = 0.0;
	static String invoice = "\nDescription\t\tQuantity\tAmount\n" + "-------------------------------------------------\n";
	static double focusTirePrice = 59.99;
	static double malibuTirePrice = 79.99;
	static double rav4TirePrice = 99.99;
	static double fiveSeriesTirePrice = 199.99;
	static double deliveryOption1 = 0.0;
	static double deliveryOption2 = 25.99;
	static double deliveryOption3 = 50.99;
	static double deliveryOption4 = 150.99;
	static double morningInstallation = 89.99;
	static double afternoonInstallation = 99.99;
	
	// main method
	public static void main(String[] args) {
		// welcome message
		int menu_num = -1;
		total = 0;
		System.out.print("Welcome to Mustang Tires!");
		while(true)
		{
			menu_num = displayMenu();
			switch(menu_num)
			{
				case 1:	// Purchase tires
					purchaseTires();
					break;
				case 2:	// Delivery Option
					break;	
				case 3:	// Schedule Option
					break;	
				case 4:	// View Invoice
					break;
				case 9:	// Exit Store
					System.out.println("You have successfully paid your invoice. Good-bye!");					
					break;
			}

			if( menu_num == 9 )
				break;
		}
    }
	
	public static int displayMenu()	{	
		int num = 0;
		
		while(true)
		{
			System.out.println();
			System.out.println("Choose from the following options:");
			System.out.println("1) Purchase tires");		
			System.out.println("2) Select a tire delivery option");
			System.out.println("3) Schedule a tire installation option");
			System.out.println("4) View invoice");
			System.out.println("9) Pay and Exit Store");
			
			System.out.print("option: ");
			
			String input = scan.nextLine();  // Read user input
			
			try {
				num = Integer.parseInt(input);
			} catch(Exception e) {
				System.out.println("Select an option from the following menu.");
				continue;
			}
			
			if( num == 1 || num == 2 || num == 3 || num == 4 || num == 9 )
				break;

			System.out.println("Select an option from the following menu.");
		}
		
		return num;
	}
	
	public static void purchaseTires() {
		int inventoryNum = -1, quantity = -1;
		String num_msg = "", qty_msg = "";
		while(true)
		{
			displayInventory();

			System.out.print("Enter the inventory number of the tires you want to purchase: ");			
			String num_str = scan.nextLine();  // Read user input

			System.out.print("Enter the quantity: ");			
			String qty_str = scan.nextLine();  // Read user input

			inventoryNum = -1; quantity = -1;
			num_msg = ""; qty_msg = "";
			
			try {
				inventoryNum = Integer.parseInt(num_str);				
			} catch(Exception e) {
				num_msg = "Inventory number should be 1, 2, 3, or 4";				
			}

			try {
				quantity = Integer.parseInt(qty_str);				
			} catch(Exception e) {
				qty_msg = "Qunatity should be number";				
			}
			
			if( inventoryNum < 0 || inventoryNum > 4 )
				num_msg = "Inventory number should be 1, 2, 3, or 4";				

			if( quantity < 1 )	
				qty_msg = "Quantity should be greater than 0.";				

			if( num_msg != "" || qty_msg != "" )
			{
				System.out.println("Incorrect Input");	
				if( qty_msg != "" )
					System.out.println(qty_msg);
				
				if( num_msg != "" )
					System.out.println(num_msg);	

				continue;	
			}

			double amount = calculateTiresPrice(inventoryNum, quantity);
			
			updateTotal(amount);

			invoice += "\t" + quantity + "\t$" + amount + "\n";
			break;
		}
	}
	
	public static void displayInventory() {
		System.out.println();
		System.out.println("Inventory Number\tDescription\tPrice Per Tire");
		System.out.println("1\tFord Focus Tires\t$" + focusTirePrice);
		System.out.println("1\tChevy Malibu Tires\t$" + malibuTirePrice);
		System.out.println("1\tToyota RAV4 Tires\t$" + rav4TirePrice);
		System.out.println("1\tBMW 5 Series Tires\t$" + fiveSeriesTirePrice);

	
	}
	
	public static double calculateTiresPrice(int inventoryNum, int quantity) {
		double unit_price = 0;

		switch(inventoryNum)
		{
			case 1:
				unit_price = focusTirePrice;
				break;
			case 2:
				unit_price = malibuTirePrice;
				break;
			case 3:
				unit_price = rav4TirePrice;
				break;
			case 4:
				unit_price = fiveSeriesTirePrice;
				break;			
		}

		return unit_price * quantity;
	}
	
	public static int getDeliveryOption() {
		return 0;
	}
	
	public static double getDeliveryFee(int deliveryOption) {
		return 0;
	}
	
	public static void updateTotal(double amount) {
		total += amount;		

		NumberFormat myFormat = NumberFormat.getInstance();
		myFormat.setGroupingUsed(true); // this will also round numbers, 3		
		System.out.println("Your current total is: $" + myFormat.format(total));
	}
	
	public static void displayInvoice() {
		
	}
	
	public static void scheduleTrieInstallation() {
		
	}	
	
}
