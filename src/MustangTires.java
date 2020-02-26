import java.util.Scanner;

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
		System.out.print("Welcome to Mustang Tires!");
		while(true)
		{
			menu_num = displayMenu();
			switch(menu_num)
			{
				case 1:	// Purchase tires
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
		
	}
	
	public static void displayInventory() {
		
	}
	
	public static double calculateTiresPrice(int inventoryNum, int quantity) {
		return 0;
	}
	
	public static int getDeliveryOption() {
		return 0;
	}
	
	public static double getDeliveryFee(int deliveryOption) {
		return 0;
	}
	
	public static void updateTotal(double amount) {
		
	}
	
	public static void displayInvoice() {
		
	}
	
	public static void scheduleTrieInstallation() {
		
	}	
	
}
