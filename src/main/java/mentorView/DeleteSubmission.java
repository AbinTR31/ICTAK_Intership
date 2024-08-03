package mentorView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteSubmission {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public DeleteSubmission (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public String Delete(String wordToCheck)  throws InterruptedException  
	{
	WebElement del= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='"+wordToCheck+"']//following::button[1]")));
	del.click();
	return wordToCheck;
	}
	
	 public String getdeleteSubmissionAlert() 
	    {
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        return alert.getText();
	    }
	
	 public void deleteSubmissionAlert() 
	 {
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        String actualAlertMessage = alert.getText();
		    System.out.println("alert: ");
		    alert.accept();
	 }

}
