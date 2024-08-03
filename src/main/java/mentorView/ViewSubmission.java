package mentorView;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewSubmission {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public ViewSubmission (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String clickView(String wordToCheck)  throws InterruptedException  
	{
		WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[normalize-space()='"+wordToCheck+"']/following::a[text()='VIEW']")));
		view.click();
		return wordToCheck;
	}
	
	public String verifySubmissionPageUrl()
	 {
	        String actualUrl = driver.getCurrentUrl();
	        return actualUrl;
	 }



}
