package adminView;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLogout {

	WebDriver driver;
	private WebDriverWait wait;
	
	public AdminLogout (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void adminLogout() 
	{
		WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit css-b7766g']")));
		logout.click();
	}
	
	public String getLogoutText()
	{
     	 WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 MuiTypography-alignCenter MuiTypography-gutterBottom css-b0jfc8']")));
     	 return text.getText();
	}
	
}
