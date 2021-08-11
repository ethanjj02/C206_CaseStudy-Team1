import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	
	private Item i1;
	private Item i2;
	private Item i3;
	
	
	private ArrayList<Item> itemList;
	
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		
		i1 = new Item("IT001", "Western","Spaghetti",3.50);
		i2 = new Item("IT002", "Asian", "Fride rice",3.50);
		i3 = new Item("IT003", "Vegetarian","Vegetarian Bee Hoon",3.00);
		
		
		itemList = new ArrayList<Item>();
		
	}



	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
		
		
		
	
		@Test
		public void testAddItem() {
			
			assertNotNull("Test if there is valid category arraylist to add to", itemList);
					
			
			C206_CaseStudy.addItem(itemList, i1);						
			assertEquals("Test if that category arraylist size is 1?", 1, itemList.size());
			
			
			assertSame("Test that category is added same as 1st item of the list?", i1, itemList.get(0));
					
			
			C206_CaseStudy.addItem(itemList, i2);
			assertEquals("Test that category arraylist size is 2?", 2, itemList.size());
		}
		
		
		
		public void testRetrieveAllItem() {
			
			assertNotNull("Test if there is valid Camcorder arraylist to add to", itemList);
			
			
					String allItem = C206_CaseStudy.retrieveAllItem(itemList);
					String testOutput = "";
					assertEquals("Check that ViewAllItemList", testOutput, allItem);
					
			
			C206_CaseStudy.addItem(itemList, i1);
			C206_CaseStudy.addItem(itemList, i2);
			assertEquals("Test if that Camcorder arraylist size is 2?", 2, itemList.size());
			
			
			allItem= C206_CaseStudy.retrieveAllItem(itemList);

			testOutput = String.format("%-10s %-10s %-10s %-20d\n","IT001", "Western","Spaghetti",3.50);
			testOutput += String.format("%-10s %-10s %-10s %-20d\n", "IT002", "Asian", "Fride rice",3.50);
		
			assertEquals("Check that ViewAllCamcorderlist", testOutput, allItem);
			
		}
		
          public void testDeleteAllCategory() {
			
			assertNotNull("Test if there is valid Camcorder arraylist to add to", itemList);
			
			
					String allCategory= C206_CaseStudy.retrieveAllItem(itemList);
					String testOutput = "";
					assertEquals("Check that ViewAllCamcorderlist", testOutput, allCategory);
					
			
			assertEquals("Test if that Camcorder arraylist size is 0?", 0, itemList.size());
			
			
			allCategory= C206_CaseStudy.retrieveAllItem(itemList);
		
			assertEquals("Check that DeletAllCategory", testOutput, allCategory);
			
		}
	}


