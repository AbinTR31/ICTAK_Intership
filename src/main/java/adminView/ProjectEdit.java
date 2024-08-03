package adminView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectEdit {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public ProjectEdit (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	

	public String editBtnClick (String wordToCheck)  throws InterruptedException 
	{
		WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='"+ wordToCheck+"']/following::button[1] ")));
		edit.click();
		return wordToCheck;
	}
	
	public void topicEdit(String topic)  throws InterruptedException
	{
		WebElement tName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq\"]")));
		tName.sendKeys(topic);
	}
	
	public void topicSave () 
	{
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save']")));
		save.click();
	}
	
	 public String getProjectAddingAlert() 
	 {
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        return alert.getText();
	 }
	
	public void saveAlert() 
	{
	     Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	     String actualAlertMessage = alert.getText();
		 System.out.println("alert: ");
		 alert.accept();
	}
}
