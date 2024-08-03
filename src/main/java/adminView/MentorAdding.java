package adminView;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentorAdding {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public MentorAdding (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void Addmentors() 
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	WebElement mentor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Mentor Form']")));
	mentor.click();
	}
	
	public void setName(String name)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement mName=driver.findElement(By.xpath("//input[@id=':r2:']"));
		mName.sendKeys(name);
	}
	
	public void setEmail(String email)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement mEmail=driver.findElement(By.xpath("//input[@id=':r3:']"));
	mEmail.sendKeys(email);
	}
	
	public void setNumber(String number)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement phone=driver.findElement(By.xpath("//input[@id=':r4:']"));
		phone.sendKeys(number);
	}
	
	public void setPassword(String pass)
	{
	WebElement mPass=driver.findElement(By.xpath("//input[@id=':r5:']"));
	mPass.sendKeys(pass);
	}
	
	public void dropdownClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]"));
		dropdown.click();
	}
	
	public String topicSelecting(String wordToCheck) throws InterruptedException
	{
        Thread.sleep(5000);
        WebElement topic = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id=':r6:']/li[@data-value='"+ wordToCheck+"']")));
        topic.click();
        String actres = topic.getText();
        if (actres.contains(wordToCheck)) {
            System.out.println("The word '" + wordToCheck + "' is present on the page.");
        } else {
            System.out.println("The word '" + wordToCheck + "' is not present on the page.");
        }
        return actres;
	}
	
	
	public void submitClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement overlay = driver.findElement(By.xpath("//*[@id=\"menu-ProjectTopics\"]/div[1]")); // Replace with appropriate locator
		overlay.click();
	}
	
	public String getMentorAddingAlert() 
    {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert.getText();
    }
}
