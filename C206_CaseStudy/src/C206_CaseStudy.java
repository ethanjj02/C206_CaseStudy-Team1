import java.util.ArrayList;

public class C206_CaseStudy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 ArrayList<Item> itemList = new ArrayList<Item>();
		
		itemList.add(new Item("IT001", "Western","Spaghetti",3.50));
		itemList.add(new Item("IT002", "Asian", "Fride rice",3.50));
		itemList.add(new Item("IT003", "Vegetarian","Vegetarian Bee Hoon",3.00));
		
		int option = 0;

		while (option != 4) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.viewAllCamcorder(itemList);
			
			} else if (option == 2) {
				// Add a new item	
				Item i = inputItem();
				C206_CaseStudy.addItem(itemList, i);
			} else if (option == 3) {
				
				C206_CaseStudy.deleteItem(itemList);
				
				
				
			} else if (option == 5) {
					System.out.println("Bye!");
			} else {
					System.out.println("Invalid option");
				}
				
			}
				
		}

	private static void menu() {
		C206_CaseStudy.setHeader("Menu Bank App");
		System.out.println("1. Display Item");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Quit");
		Helper.line(80, "-");
		
	}


	public static Item inputItem() {
		String ItemID = Helper.readString("Enter Item ID > ");
		String Category = Helper.readString("Enter Category > ");
		String Name = Helper.readString("Enter a Set Meal > ");
		double Price = Helper.readDouble("Enter price > ");
		

		Item i = new Item(ItemID, Category, Name,Price);
		return i;
		
	}


	public static void addItem(ArrayList<Item> itemList, Item i) {
		// TODO Auto-generated method stub
		itemList.add(i);
		System.out.println("Item added");
		
	}


	
	public static String retrieveAllItem(ArrayList<Item> itemList) {
		String output = "";

		for (int i = 0; i < itemList.size(); i++) {

			output += String.format("%-10s %-10s %-10s %.2f\n", itemList.get(i).getItemID(),
					itemList.get(i).getCategory(), itemList.get(i).getName(),
					itemList.get(i).getPrice());
		}
		return output;
	}
	public static void viewAllCamcorder(ArrayList<Item> itemList) {
		C206_CaseStudy.setHeader("ITEM LIST");
		String output = String.format("%-10s %-10s %-10s %-10s\n", "ItemID", "Category",
				"Name", "Price");
		 output += retrieveAllItem(itemList);	
		System.out.println(output);
	}


	private static void setHeader(String header) {
			Helper.line(80, "-");
			System.out.println(header);
			Helper.line(80, "-");
		}
	
	public static void deleteItem(ArrayList<Item> itemList) {
		String Confirm = Helper.readString("Confirm do you want to delete menu items from the menu bank?(yes/no) >");
	    if (Confirm == "yes"){
		  itemList.clear();
		  System.out.println("Item deleted");
		  
	    }else {
	    	System.out.println("Thank you");
			
		}
			
		}
		
		
	}

