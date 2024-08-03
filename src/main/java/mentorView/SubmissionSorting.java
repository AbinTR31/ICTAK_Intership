package mentorView;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmissionSorting {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public SubmissionSorting (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void Sorting()
	{
		WebElement sort= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='combobox']")));
		sort.click();
	}
	
	public String batchSelecting(String wordToCheck)  throws InterruptedException  
	{
		WebElement batch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-value='"+wordToCheck+"']")));
		batch.click();
		return wordToCheck;
	}
	
	public String getSortingText()
	{
     	 WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":r4:\"]")));
     	 return text.getText();
	}

}
