package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "email")
	WebElement emailContainer;

	@FindBy(id = "pass")
	WebElement passContainer;

	@FindBy(name = "login")
	WebElement signInBtn;

	@FindBy(xpath = "//span[contains(text(),'Marketplace')]")
	WebElement mktBtn;

	@FindBy(xpath = "//span[contains(text(),'Create new listing')]")
	WebElement createBtn;
	
	@FindBy(xpath = "//div[@role='banner']//div[4]/div[1]/span")
	WebElement acBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Log Out')]")
	WebElement lgoBtn;
	
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumCopy\\SeleniumJars_Copy\\geckodriver.exe");
		driver = new FirefoxDriver();

		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	public String verifyURL() {
		return driver.getCurrentUrl();
	}

	public void enterCred(String s1, String s2) {
		emailContainer.sendKeys(s1);
		passContainer.sendKeys(s2);
	}

	public void clickOnSignIn() {
		signInBtn.click();
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnMKTBtn() {
		mktBtn.click();
	}
	
	public boolean verifyCNLBtn() {
	return	createBtn.isDisplayed();
	}
	
	public void navigating() {
		driver.navigate().back();
	}
	
	public void quitting() {
		acBtn.click();
		lgoBtn.click();
	}

}
