package stepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefinition {

	LoginPage lp = new LoginPage();

	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
		lp.openBrowser();
	}

	@When("url of login page is {string}")
	public void url_of_login_page_is(String url) {
		String exURL = url;
		String acURL = lp.verifyURL();
		Assert.assertEquals(exURL, acURL);
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String email, String pass) {
		lp.enterCred(email, pass);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		lp.clickOnSignIn();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		String exTitle = "(20+) Facebook";
		String acTitle = lp.verifyHomePageTitle();
		Assert.assertEquals(exTitle, acTitle);
	}

	@Then("user clicks on marketplace")
	public void user_clicks_on_marketplace() {

		lp.clickOnMKTBtn();
	}

	@Then("user is on marketplace page")
	public void user_is_on_marketplace_page() {
		boolean flag = lp.verifyCNLBtn();
		Assert.assertTrue(flag);
	}

	@Then("user navigates to back page")
	public void user_navigates_to_back_page() {
		lp.navigating();
	}

	@Then("user quits the facebook")
	public void user_quits_the_facebook() {
		lp.quitting();
	}
}
