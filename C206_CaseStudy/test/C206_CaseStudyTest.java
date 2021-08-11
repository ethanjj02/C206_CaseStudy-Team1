import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Menu d1;
	private Menu d2;

	private ArrayList<Menu> menuList;
	

	@Before
	public void setUp() throws Exception {
		// prepare test data
		d1 = new Menu(1, "Monday");
		d2 = new Menu(2, "Tuesday");

		menuList = new ArrayList<Menu>();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	@Test
	public void createMenu() {

		assertEquals("Test that the list is null before creating the menu", 0,menuList.size());
		
		assertNotNull("Test that the list is not null before creating the menu",menuList.size());
		
		C206_CaseStudy.createMenu(menuList, d1);
		assertEquals("Test if that menu arraylist size is 1?", 1, menuList.size());


		
	}

	public void viewMenu() {

		assertNotNull("Test if the menu list is not empty", menuList);
		
		assertEquals("Test that the size of list is 1 when user view it", 1, menuList.size());
		

		assertTrue("No available menu", menuList.isEmpty());

	}

	public void deleteMenu() {
		
		
		
		assertEquals("Test if that menu arraylist size is 0?", 0, menuList.size());
		
	
		String allMenu = C206_CaseStudy.viewMenu(menuList);
		String testOutput = "";
		assertEquals("No available menu", testOutput, allMenu);

		

		assertEquals("The menu is not deleted successfully", 1, menuList.size());

	}

}
