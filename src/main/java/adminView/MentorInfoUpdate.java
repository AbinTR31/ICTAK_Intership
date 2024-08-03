package adminView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorInfoUpdate {
	
	WebDriver driver;
	private WebDriverWait wait;
	
	public MentorInfoUpdate (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void clickMentors() 
	{
		WebElement update = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Mentors']")));
		update.click();
	}

	public String clickUpdate(String wordToCheck)  throws InterruptedException  
	{
		WebElement update = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='"+ wordToCheck+"']/following::button[1]")));
		update.click();
		return wordToCheck;
	}
	
	public void infoUpdate(String upemail) throws InterruptedException
	{
		WebElement nemail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":r4:\"]")));
		nemail.sendKeys(upemail);
	}
	
	public void clickSubmit()  
	{
		WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
		submit.click();
	}
	
	 public String getEditAlert() 
	 {
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        return alert.getText();
	 }
	 
	 public void EditAlert() 
	 {
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    String actualAlertMessage = alert.getText();
		System.out.println("alert: ");
		alert.accept();
	 }
}
