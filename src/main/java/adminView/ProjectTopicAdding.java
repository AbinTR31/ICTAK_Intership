package adminView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectTopicAdding {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public ProjectTopicAdding (WebDriver driver)
	{
		this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	public void clickProject() 
	{
		 wait.until(ExpectedConditions.urlContains("https://quiet-dasik-c4c3a7.netlify.app/admin"));
	       String currentUrl = driver.getCurrentUrl();
	       if 
	        (currentUrl.contains("https://quiet-dasik-c4c3a7.netlify.app/admin")) 
	       {
	    	  // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	    	   WebElement project=driver.findElement(By.xpath("//h2[normalize-space()='Projects']"));
	    	   project.click();
	}
	       else 
      		{
      			System.out.println("Error: URL not changed to : http://64.227.132.106/admin ");
      		}
	}
	
	public void addProject()
    {
		WebElement addprj=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/button"));
		addprj.click();
    }
	
	public void setTopic(String topic)
    {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		WebElement prjT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl css-1bp1ao6']/input")));
        prjT.sendKeys(topic);
    }
	
	public void addClick()
    {
		WebElement addprj=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
		addprj.click();
    }
	
	public String getProjectAdddingAlert() 
    {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
    }
	
	public void projectAddingeAlert() 
	{
	     Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	     String actualAlertMessage = alert.getText();
		 System.out.println("alert: ");
		 alert.accept();
	}
}
