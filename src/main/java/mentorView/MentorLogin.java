package mentorView;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorLogin {
	
		WebDriver driver;
		private WebDriverWait wait;

		
		public MentorLogin (WebDriver driver)
		{
			this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		}
		

	public void loginPage() 
	{
		WebElement button=driver.findElement(By.xpath("//a[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit') and contains(@class, 'css-z8gdmv') and @href = '/login']\r\n"+ ""));
		button.click();
	}
	public void setUsername(String uname)
	{
		WebElement usrName=driver.findElement(By.xpath("//input[@id=':r0:']"));
		usrName.sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
	WebElement usrPass=driver.findElement(By.xpath("//input[@id=':r1:']"));
	usrPass.sendKeys(pass);
	}
	
	public void loginClick() 
	{
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
	}
	
	public String getMentorText()
	{
     	WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='Welcome, !!!']")));
     	return text.getText();
	}
}
