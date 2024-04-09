package testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import pagepkg.FbLoginPage;

public class Fblogin extends BaseClass{
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FbLoginPage ob=new FbLoginPage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.loginclick();
		driver.navigate().back();
	}

}
