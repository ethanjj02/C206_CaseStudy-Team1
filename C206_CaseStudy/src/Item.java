
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * G Durga Devi, 11 Aug 2021 11:27:37 am
 */

public class Item {
	private String ItemID ;
	private String Category;
	private String Name;
	private double Price;
	
	public Item(String itemID, String category, String name, double price) {
		
		ItemID = itemID;
		Category = category;
		Name = name;
		Price = price;
		
	}

	
	public String getItemID() {
		return ItemID;
	}

	
	public void setItemID(String itemID) {
		ItemID = itemID;
	}


	public String getCategory() {
		return Category;
	}

	
	public void setCategory(String category) {
		Category = category;
	}

	public String getName() {
		return Name;
	}

	
	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	
	
	
	
	
	
}
