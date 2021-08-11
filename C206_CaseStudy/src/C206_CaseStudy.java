import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		ArrayList<Menu> menuList = new ArrayList<Menu>();
=======
	 
	 ArrayList<Item> itemList = new ArrayList<Item>();
		
		itemList.add(new Item("IT001", "Western","Spaghetti",3.50));
		itemList.add(new Item("IT002", "Asian", "Fride rice",3.50));
		itemList.add(new Item("IT003", "Vegetarian","Vegetarian Bee Hoon",3.00));
		
		int option = 0;
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git

<<<<<<< HEAD
		menuList.add(new Menu(1, "Monday"));
		menuList.add(new Menu(2, "Tuesday"));
		menuList.add(new Menu(3, "Wednesday"));
		menuList.add(new Menu(4, "Thursday"));
		menuList.add(new Menu(5, "Friday"));
=======
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
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git

<<<<<<< HEAD
		int option = 0;
=======

	public static Item inputItem() {
		String ItemID = Helper.readString("Enter Item ID > ");
		String Category = Helper.readString("Enter Category > ");
		String Name = Helper.readString("Enter a Set Meal > ");
		double Price = Helper.readDouble("Enter price > ");
		
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git

<<<<<<< HEAD
		while (option != 5) {
=======
		Item i = new Item(ItemID, Category, Name,Price);
		return i;
		
	}
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git

<<<<<<< HEAD
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
=======

	public static void addItem(ArrayList<Item> itemList, Item i) {
		// TODO Auto-generated method stub
		itemList.add(i);
		System.out.println("Item added");
		
	}
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git

<<<<<<< HEAD
			if (option == 1) {
				createMenu(menuList, null);
			} else if (option == 2) {
				viewMenu(menuList);
			} else if (option == 3) {
				deleteMenu(menuList, null);
			} else if (option == 4)
				System.out.println("Bye!");
			else {
				System.out.println("Invalid option");
			}
=======

	
	public static String retrieveAllItem(ArrayList<Item> itemList) {
		String output = "";

		for (int i = 0; i < itemList.size(); i++) {

			output += String.format("%-10s %-10s %-10s %.2f\n", itemList.get(i).getItemID(),
					itemList.get(i).getCategory(), itemList.get(i).getName(),
					itemList.get(i).getPrice());
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git
		}

	}
<<<<<<< HEAD

	public static void menu() {
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Create Monthly Menu");
		System.out.println("2. View Monthly Menu");
		System.out.println("3. Delete Monthly Menu");
		System.out.println("4. Quit");
		Helper.line(80, "-");

=======
	public static void viewAllCamcorder(ArrayList<Item> itemList) {
		C206_CaseStudy.setHeader("ITEM LIST");
		String output = String.format("%-10s %-10s %-10s %-10s\n", "ItemID", "Category",
				"Name", "Price");
		 output += retrieveAllItem(itemList);	
		System.out.println(output);
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git
	}
<<<<<<< HEAD

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
=======
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git

	public static void createMenu(ArrayList<Menu> menuList, Menu d1) {

<<<<<<< HEAD
		menuList.add(d1);
		System.out.println("Menu created");
=======
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
		
		
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git
	}

<<<<<<< HEAD
	public static void addCategory(ArrayList<Category> categoryList, Category c1) {
		// TODO Auto-generated method stub

	}

	public static String viewMenu(ArrayList<Menu> menuList) {
		// TODO Auto-generated method stub

		String output = "";

		for (int i = 0; i < menuList.size(); i++) {

			output += String.format("%-10s %-10s\n", menuList.get(i).getMonth(), menuList.get(i).getName());
		}
		return output;
	}

	public static boolean deleteMenu(ArrayList<Menu> menuList, String name) {
		boolean isFound = false;

		String checkName = Helper.readString("Enter name of the menu: ");
		for (int i = 0; i < menuList.size(); i++) {
			String menuName = menuList.get(i).getName();
			if (checkName.equalsIgnoreCase(menuName)) {
				isFound = true;
				menuList.remove(i);
				System.out.println(menuName + "menu has been deleted successfully.");
			}

		}
		if (isFound == false) {
			System.out.println("Invalid name");
		}
		return isFound;
	}

}// end of class
=======
>>>>>>> branch 'master' of https://github.com/ethanjj02/C206_CaseStudy-Team1.git
