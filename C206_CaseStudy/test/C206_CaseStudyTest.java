import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Category c1;
	private Category c2;
	private Category c3;
	
	private ArrayList<Category> categoryList;
	
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		c1 = new Category("CC0011", "Nikon HDSLR");
		c2 = new Category("CC0012", "Sony DSC-RX100M7");
		c3 = new Category("CB0011", "My Google Chromebook 1st");
		

		categoryList= new ArrayList<Category>();
		
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
		public void testAddCategory() {
			//fail("Not yet implemented");
			// write your code here
			
			// Item list is not null, so that can add a new item
			assertNotNull("Test if there is valid Chromebook arraylist to add to", categoryList);
					
			//Given an empty list, after adding 1 item, the size of the list is 1
			C206_CaseStudy.addCategory(categoryList, c1);						
			assertEquals("Test if that Chromebook arraylist size is 1?", 1, categoryList.size());
			
			//The item just added is as same as the first item of the list
			assertSame("Test that Chromebook is added same as 1st item of the list?", c1, categoryList.get(0));
					
			//Add another item. test The size of the list is 2?
			C206_CaseStudy.addCategory(categoryList, c2);
			assertEquals("Test that Chromebook arraylist size is 2?", 2, categoryList.size());
		}
	
	}


