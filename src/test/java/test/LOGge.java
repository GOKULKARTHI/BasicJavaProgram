package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.messages.types.JavaStackTraceElement;

public class LOGge {

	@Test(priority = 1)
	public void user_provides_valid_credentials() {

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://heraldpoc.mpslimited.com/PHTestView/Account/Index");

		WebElement welcomeMgs = driver.findElement(By.xpath(
				"//h2[normalize-space()=\"Welcome to HighWire! Please enter your credentials to access your account.\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", welcomeMgs);

		String welcomeNote = welcomeMgs.getText();

		Assert.assertTrue(
				welcomeNote.contains("Welcome to HighWire! Please enter your credentials to access your account."));

		driver.findElement(By.id("inpusername")).sendKeys("darshan.p");

		driver.findElement(By.id("inppassword")).sendKeys("herald@123");

		driver.findElement(By.id("btnsignin")).click();

		WebElement dashboard = driver.findElement(By.xpath("//div[@class='user-div']/parent::div/h1"));

		String dashboardTesxt = dashboard.getText();

		js.executeScript("arguments[0].style.border='5px solid red'", dashboard);

		Assert.assertTrue(dashboardTesxt.contains("Dashboard"));

		// driver.quit();

	}

	@Test(priority = 2)
	public void user_provides_invalid_credentials() {

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://heraldpoc.mpslimited.com/PHTestView/Account/Index");

		driver.findElement(By.id("inpusername")).sendKeys("validUserName");

		driver.findElement(By.id("inppassword")).sendKeys("validPassword");

		driver.findElement(By.id("btnsignin")).click();

		WebElement invalidCredentialWarning = driver.findElement(By.xpath("//form//div//child::div[1]/div//child::p"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='2px solid red'", invalidCredentialWarning);

		Assert.assertTrue(invalidCredentialWarning.getText()
				.contains("Incorrect username/email id. Please enter your registered username/email id to login."));

		driver.quit();

	}

	@Test(priority = 3)
	public void user_provides_valid_usernameOremail_and_invalid_password() {

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://heraldpoc.mpslimited.com/PHTestView/Account/Index");

		driver.findElement(By.id("inpusername")).sendKeys("darshan.p");

		driver.findElement(By.id("inppassword")).sendKeys("invalidPassword");

		driver.findElement(By.id("btnsignin")).click();

		WebElement invalidCredentialWarning = driver.findElement(By.xpath("//form//div//child::div[1]/div//child::p"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='2px solid red'", invalidCredentialWarning);

		Assert.assertTrue(invalidCredentialWarning.getText()
				.contains("Incorrect password. Please check & enter correct password to login."));
		driver.quit();

	}

	@Test(priority = 4)
	public void user_provides_invalid_usernameOremail_and_valid_password() {

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://heraldpoc.mpslimited.com/PHTestView/Account/Index");

		driver.findElement(By.id("inpusername")).sendKeys("validUserName");

		driver.findElement(By.id("inppassword")).sendKeys("herald@123");

		driver.findElement(By.id("btnsignin")).click();

		WebElement invalidCredentialWarning = driver.findElement(By.xpath("//form//div//child::div[1]/div//child::p"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='2px solid red'", invalidCredentialWarning);

		Assert.assertTrue(invalidCredentialWarning.getText()
				.contains("Incorrect username/email id. Please enter your registered username/email id to login."));

		driver.quit();

	}

	@Test(priority = 5)
	public void user_provides_only_valid_UsernameOremail_information() {

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://heraldpoc.mpslimited.com/PHTestView/Account/Index");

		driver.findElement(By.id("inpusername")).sendKeys("darshan.p");

		driver.findElement(By.id("inppassword")).sendKeys("");

		driver.findElement(By.id("btnsignin")).click();

		WebElement invalidCredentialWarning = driver.findElement(By.xpath("//form//div//child::div[1]/div//child::p"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='2px solid red'", invalidCredentialWarning);

		Assert.assertTrue(invalidCredentialWarning.getText()
				.contains("Password cannot be left blank. Please enter your registered password to login."));

		driver.quit();

	}

	@Test(priority = 6)
	public void user_provides_only_valid_password_information() {

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://heraldpoc.mpslimited.com/PHTestView/Account/Index");

		driver.findElement(By.id("inpusername")).sendKeys("");

		driver.findElement(By.id("inppassword")).sendKeys("herald@123");

		driver.findElement(By.id("btnsignin")).click();
		
		WebElement invalidCredentialWarning = driver.findElement(By.xpath("//form//div//child::div[1]/div//child::p"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='2px solid red'", invalidCredentialWarning);

		Assert.assertTrue(invalidCredentialWarning.getText()
				.contains("Username cannot be left blank. Please enter your registered username/email id to login."));


		 driver.quit();

	}

	@Test(priority = 7)
	public void user_provides_no_login_information() {

		WebDriver driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://heraldpoc.mpslimited.com/PHTestView/Account/Index");

		driver.findElement(By.id("inpusername")).sendKeys("");

		driver.findElement(By.id("inppassword")).sendKeys("");

		driver.findElement(By.id("btnsignin")).click();
		
		WebElement invalidCredentialWarning = driver.findElement(By.xpath("//form//div//child::div[1]/div//child::p"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='2px solid red'", invalidCredentialWarning);

		Assert.assertTrue(invalidCredentialWarning.getText()
				.contains("Username and Password cannot be left blank. Please enter your registered username/email id and password to login."));

		 driver.quit();

	}

}
