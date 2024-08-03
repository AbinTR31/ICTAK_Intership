package mentorView;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignedProjectsChecking {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public AssignedProjectsChecking (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickShow() 
	{
		WebElement show = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']")));
		show.click();
	}
	
	public String getAssignedProjectsText()
	{
     	 WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[normalize-space()='Allotted Projects']")));
     	 return text.getText();
	}

}
