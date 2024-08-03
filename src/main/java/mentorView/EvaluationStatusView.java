package mentorView;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EvaluationStatusView {
	
	WebDriver driver;
	private WebDriverWait wait;

	
	public EvaluationStatusView (WebDriver driver)
	{
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void checkEvaluationStatus() 
	{
		List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
        By.xpath("//td[contains(@class, 'css-q34dxg') and (text() = 'completed' or text() = 'pending')]")));
		
		System.out.println("Elements with 'completed' or 'pending' found on the page.");
	}
	
	public String getEvaluationStatusText()
	{
     	 WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//th[normalize-space()='Evaluation Status']")));
     	 return text.getText();
	}

}
