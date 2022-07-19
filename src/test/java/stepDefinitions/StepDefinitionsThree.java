package stepDefinitions;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsThree {
	@Given("I navigate to form")
	public void i_navigate_to_form() {
	 System.out.println("I navigate to form");
	}

	@When("I enter the following data")
	public void i_enter_the_following_data(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		Map<String, String> m = dataTable.asMap();
	    Iterator<Entry<String, String>> i = 	m.entrySet().iterator();
	    while(i.hasNext())
	    {
	    	Entry<String, String >next = i.next();
	    	System.out.println("Key " + next.getKey() + " has value " + next.getValue() );
	    }
	    
		
	   
	}

	@Then("data is populated correctly")
	public void data_is_populated_correctly() {
	   System.out.println("Data is populated correctly");
	}


}
