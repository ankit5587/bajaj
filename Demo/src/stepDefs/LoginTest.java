package stepDefs;

import cucumber.api.java.en.Given;

public class LoginTest {
	
	@Given("^I navigate to login page$")
	public void I_navigate_to_login_page() throws Throwable {
			System.out.println("hello");
	}
}
