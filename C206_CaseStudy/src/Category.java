
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * G Durga Devi, 8 Aug 2021 7:50:12 pm
 */

public class Category {
	private String CategoryID;
	private String CategoryName;
	
	
	public Category(String categoryID, String categoryName) {

		CategoryID = categoryID;
		CategoryName = categoryName;
	}

	public String getCategoryID() {
		return CategoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		this.CategoryName = categoryName;
	}

}
