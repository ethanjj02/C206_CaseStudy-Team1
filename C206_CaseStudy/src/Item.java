
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * G Durga Devi, 11 Aug 2021 11:27:37 am
 */

public class Item {
	private String itemID;
	private String mealType;
	private String drink;
	private String fruits;
	
	public Item(String itemID, String mealType, String drink, String fruits) {
		
		this.itemID = itemID;
		this.mealType = mealType;
		this.drink = drink;
		this.fruits = fruits;
	}

	public String getMealType() {
		return mealType;
	}

	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public String getItemID() {
		return itemID;
	}

}
