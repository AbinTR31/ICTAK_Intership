package mentorView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarkCommentEditing {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public MarkCommentEditing (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public String clickView(String wordToCheck)  throws InterruptedException  
	{
	WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='"+wordToCheck+"']/following::a[text()='VIEW']")));
	view.click();
	return wordToCheck;
	}
	
	public void clickDropdown() 
	{
	WebElement dropdown= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=':r4:']")));
	dropdown.click();
	}
	
	public String clickMark(String wordToCheck)  throws InterruptedException  
	{
	WebElement mark = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-value='"+wordToCheck+"']")));
	mark.click();
	return wordToCheck;
	}
	
	public void commentUpdate(String ucomment) 
	{
	WebElement comment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMultiline css-u36398']")));
	comment.clear();
	comment.sendKeys(ucomment);
	}
	
	public void clickUpdate() 
	{
	WebElement update= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
	update.click();
	}
	
	public String getmarkCommmentUpdateAlert() 
    {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
    }
	
	public void markCommmentUpdateAlert() 
	{
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        String actualAlertMessage = alert.getText();
		    System.out.println("alert: ");
		    alert.accept();
	}
}
