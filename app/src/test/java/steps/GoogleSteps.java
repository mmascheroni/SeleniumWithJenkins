package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;

public class GoogleSteps {
    private static GooglePage googlePage;

    @BeforeAll
    public static void setUp() {
        googlePage = new GooglePage();
    }

    @AfterAll
    public static void close() {
        googlePage.close();
    }
    @Given("I am on the Google search page")
    public void navigateToGoogle() {
        googlePage.navigateToGoogle();

    }

    @When("I enter a search criteria")
    public void searchCriteria() {
        googlePage.enterSearchCriteria();
    }

    @And("Click on the search button")
    public void clickSearchButton() {
        googlePage.search();
    }

    @Then("The results match the criteria")
    public void compareResults() {
        googlePage.verifyFirstSearchTitle();
    }
}
