import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu> menuList = new ArrayList<Menu>();

		menuList.add(new Menu(1, "Monday"));
		menuList.add(new Menu(2, "Tuesday"));
		menuList.add(new Menu(3, "Wednesday"));
		menuList.add(new Menu(4, "Thursday"));
		menuList.add(new Menu(5, "Friday"));

		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

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
		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Create Monthly Menu");
		System.out.println("2. View Monthly Menu");
		System.out.println("3. Delete Monthly Menu");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static void createMenu(ArrayList<Menu> menuList, Menu d1) {

		menuList.add(d1);
		System.out.println("Menu created");
	}

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
