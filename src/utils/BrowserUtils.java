package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtils {
	ExtractPropertyFileData prop;
	WebDriver driver;
	public BrowserUtils()
	{
		
		prop=new ExtractPropertyFileData();
	}
	public WebDriver launchBrowser()
	{
		this.driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		return driver;
		
	}
	public void enterURL()
	{
		String url=prop.getProperty("url");
		driver.get(url);
	}

}
