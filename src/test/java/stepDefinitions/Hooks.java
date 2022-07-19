package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeTest() {
	  System.out.println("Actions to be performed  before testing each scenario");
	  System.out.println("=====================================================");
	}
	
	@After
	public void afterTest() {
      System.out.println("=====================================================");
	  System.out.println("Actions to be performed  after testing each scenario");
	}

}
