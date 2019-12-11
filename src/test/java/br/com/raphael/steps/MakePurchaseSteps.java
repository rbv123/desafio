package br.com.raphael.steps;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MakePurchaseSteps {

	private WebDriver driver;

	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\burga\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^I'm accessing e-commerce$")
	public void iMAccessingECommerce() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\burga\\drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
	}

	@And("^I click on Sign in$")
	public void iClickOnSignIn() throws Throwable {
		driver.findElement(By.cssSelector(".header_user_info > a")).click();
	}

	@When("^I enter the email \"([^\"]*)\"$")
	public void iEnterTheEmail(String arg1) throws Throwable {
		driver.findElement(By.cssSelector("#email")).sendKeys(arg1);
	}

	@And("^the password \"([^\"]*)\"$")
	public void thePassword(String arg1) throws Throwable {
		driver.findElement(By.cssSelector("#passwd")).sendKeys(arg1);
	}

	@And("^I select Sign in$")
	public void iSelectSignIn() throws Throwable {
		driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
	}

	@Then("^I view the logged user page$")
	public void iViewTheLoggedUserPage() throws Throwable {
		String loggedUser = driver.findElement(By.cssSelector("nav > div:nth-child(1) > a > span")).getText();
		assertEquals("Raphael Burgarelli", loggedUser);
	}

	@When("^I select T-Shirts from the menu$")
	public void iSelectTShirtsFromTheMenu() throws Throwable {
		driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a")).click();
	}

	@And("^I add a product to the cart$")
	public void iAddAProductToTheCart() throws Throwable {
		// select product
		driver.findElement(By.cssSelector("div.right-block > h5 > a")).click();

		// add product
		driver.findElement(By.cssSelector("#add_to_cart > button")).click();
	}

	@And("^do the whole validation process$")
	public void doTheWholeValidationProcess() throws Throwable {

		// proceed to order
		driver.findElement(By.cssSelector("div.button-container > a > span")).click();
		// proceed to checkout in Summary section
		driver.findElement(By.cssSelector(".standard-checkout.button-medium > span")).click();

		// proceed to checkout in Address section
		driver.findElement(By.cssSelector("p > button > span")).click();

		// Agree Terms of service
		driver.findElement(By.cssSelector("#cgv")).click();

		// proceed to checkout in Shipping section
		driver.findElement(By.cssSelector("p > button > span")).click();

		// Click on Pay by bank wire
		driver.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a")).click();

		// Confirm order
		driver.findElement(By.cssSelector("#cart_navigation > button > span")).click();
	}

	@Then("^I make the purchase$")
	public void iMakeThePurchase() throws Throwable {
		String successMessage = driver.findElement(By.cssSelector("p > strong")).getText();
		assertEquals("Your order on My Store is complete.", successMessage);
	}
	
	@After(order = 1)
	public void screenshot(Scenario scenario) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/"+scenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After(order = 0)
	public void closeBrowser() {
		driver.quit();
	}
}
