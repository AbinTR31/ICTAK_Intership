package mentorView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReferenceMaterialsAdding {

	WebDriver driver;
	private WebDriverWait wait;

	
	public ReferenceMaterialsAdding (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void referenceMaterialsClick()
	{
		WebElement Rmaterials= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Reference Material']")));
		Rmaterials.click();
	}
	
	public void addMaterial()
	{
		WebElement Rmaterials= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add Material']")));
		Rmaterials.click();
	}
	
	public void materialTitle(String title)
	{
		WebElement Rtitle= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":r3:\"]")));
		Rtitle.sendKeys(title);
	}
	
	public void materialDescription(String description)
	{
		WebElement des= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":r4:\"]")));
		des.sendKeys(description);
	}
	
	public void materialLink(String Link)
	{
		WebElement Rlink= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":r5:\"]")));
		Rlink.sendKeys(Link);
	}
	
	public void referenceAdd()
	{
		WebElement materialadd= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]")));
		materialadd.click();
	}
	
	 public String getReferenceAddAlert() 
	    {
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        return alert.getText();
	    }
	
	public void referenceAddAlert() 
		{
	        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	        String actualAlertMessage = alert.getText();
		    System.out.println("alert: ");
		    alert.accept();
		}
}
