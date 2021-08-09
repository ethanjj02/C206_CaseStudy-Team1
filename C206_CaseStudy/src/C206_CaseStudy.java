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

}
