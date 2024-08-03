package adminView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorDeleting {
	
	WebDriver driver;
	private WebDriverWait wait;
	
	public MentorDeleting (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void clickMentors() 
	{
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Mentors']")));
		button.click();
	}
	
	public String clickDelete(String wordToCheck)  throws InterruptedException  
	{
		WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='"+wordToCheck+"']/following::button[2]")));
		delete.click();
		return wordToCheck;
	}
	
	public String getmentorDeleteAlert() 
    {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
    }
	
	 public void mentorDeleteAlert() 
	 {
	     Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	     String actualAlertMessage = alert.getText();
		 System.out.println("alert: ");
		 alert.accept();
	 }
	 
}
