import java.util.ArrayList;

public class C206_CaseStudy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ArrayList<Category> categoryList = new ArrayList<Category>();
	
	
		categoryList.add(new Category("CC001", "Western"));
		categoryList.add(new Category("CC002", "Asian"));
		categoryList.add(new Category("CC003", "Vegetarian"));
		
		

	}

	
	public static Category inputCategory() {
		String ID = Helper.readString("Enter asset tag > ");
		String Name = Helper.readString("Enter description > ");
		

		Category cc= new Category(ID, Name);
		return cc;
		
	}
	public static void addCamcorder(ArrayList<Category> camcorderList, Category cc) {
		
		camcorderList.add(cc);
		System.out.println("Category added");
	}

	public static void addCategory(ArrayList<Category> categoryList, Category c1) {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @param categoryList
	 * @return
	 */
	public static String retrieveAllCategory(ArrayList<Category> categoryList) {
		// TODO Auto-generated method stub
		String output = "";

		for (int i = 0; i < categoryList.size(); i++) {

			output += String.format("%-10s %-10s\n", categoryList.get(i).getCategoryID(),
					categoryList.get(i).getCategoryName());
		}
		return output;
	}
	public static void viewAllCategory(ArrayList<Category> camcorderList) {
		C206_CaseStudy.setHeader("Category List");
		String output = String.format("%-10s  %-10s \n", "Category ID", "Name",
				"AVAILABLE", "DUE DATE","OPTICAL ZOOM");
		 output += retrieveAllCategory(camcorderList);	
		System.out.println(output);
	}
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

}
