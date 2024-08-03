package adminView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectDelete {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public ProjectDelete (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	

	public String deleteBtnClick (String wordToCheck)  throws InterruptedException 
	{
		WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+ wordToCheck+"']/following::button[2]")));
		edit.click();
		return wordToCheck;
	}
	
	public String getdeleteAlert() 
	 {
	     Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	     return alert.getText();
	 }
	 
	public void deleteAlert() 
	{
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    String actualAlertMessage = alert.getText();
		System.out.println("alert: ");
		alert.accept();
	}
}