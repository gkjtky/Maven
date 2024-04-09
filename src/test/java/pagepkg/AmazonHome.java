package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"glow-ingress-line2\"]")
	WebElement pincode;
	
	public AmazonHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
