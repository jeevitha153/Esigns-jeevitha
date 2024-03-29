package Pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {

		this.driver = driver;

	}

	public void Signin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Ex: johnwesley@abc.com']"))
				.sendKeys("jeevithapatnana06@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Nimble#2023");
		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();
	

	}

	public boolean VerifyLoginSucess() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));

		WebElement name = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@class='fw-large blue-dark mb-3 fs-10']")));
		System.out.println("Login Sucessfull");
		return name.isDisplayed();

	}
}
