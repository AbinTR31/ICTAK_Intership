package mentorView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReferenceMaterialsDelete {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public ReferenceMaterialsDelete (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public String referenceMaterialsDelete(String wordToCheck)  throws InterruptedException  
	{
		WebElement Rdelete= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='"+wordToCheck+"']//following::button[1]")));
		Rdelete.click();
		return wordToCheck;
	}
	
	 public String getreferenceMaterialsDeleteAlert() 
	    {
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        return alert.getText();
	    }
	
	public void referenceMaterialsDeleteAlert() 
		{
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        String actualAlertMessage = alert.getText();
		    System.out.println("alert: ");
		    alert.accept();
		}

}
