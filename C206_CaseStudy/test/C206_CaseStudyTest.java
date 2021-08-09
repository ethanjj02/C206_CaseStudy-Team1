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
		c1 = new Category("CC001", "Western");
		c2 = new Category("CC002", "Asian");
		c3 = new Category("CC003", "Vegetarian");
		
		

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
			
			assertNotNull("Test if there is valid category arraylist to add to", categoryList);
					
			
			C206_CaseStudy.addCategory(categoryList, c1);						
			assertEquals("Test if that category arraylist size is 1?", 1, categoryList.size());
			
			
			assertSame("Test that category is added same as 1st item of the list?", c1, categoryList.get(0));
					
			
			C206_CaseStudy.addCategory(categoryList, c2);
			assertEquals("Test that category arraylist size is 2?", 2, categoryList.size());
		}
		
		
		
		public void testRetrieveAllCategory() {
			
			assertNotNull("Test if there is valid Camcorder arraylist to add to", categoryList);
			
			
					String allCategory= C206_CaseStudy.retrieveAllCategory(categoryList);
					String testOutput = "";
					assertEquals("Check that ViewAllCamcorderlist", testOutput, allCategory);
					
			
			C206_CaseStudy.addCamcorder(categoryList, c1);
			C206_CaseStudy.addCamcorder(categoryList, c2);
			assertEquals("Test if that Camcorder arraylist size is 2?", 2, categoryList.size());
			
			
			allCategory= C206_CaseStudy.retrieveAllCategory(categoryList);

			testOutput = String.format("%-10s  %-10s \n","CC001", "Western");
			testOutput += String.format("%-10s  %-10s \n","CC002", "Asian");
		
			assertEquals("Check that ViewAllCamcorderlist", testOutput, allCategory);
			
		}
	}


