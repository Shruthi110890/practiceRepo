package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;
public	BasePage(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("driver in base page is "+ driver);
	}
public WebDriver getDriver()
{
	return driver;
}

public boolean verifyIfHomePageIsLoaded(By ele)
{
	boolean status=false;
	
	if(driver.findElement(ele).isDisplayed())
	{
		status=true;
	}
	return status;
}
//select class and select by value
public void selectValueFromDropdown(By selectIdLocator, String value)
{
	Select sel=new Select(driver.findElement(selectIdLocator));
	sel.selectByValue(value);
	
}
//enter input field values
public void enterTextData(By textFieldLocator, String value)
{
	if(driver.findElement(textFieldLocator).isEnabled())
	{
		driver.findElement(textFieldLocator).sendKeys(value);
	}
	else
	{
		System.out.println("field is not enabled to enter value");
	}
}
//datepicker calender
public void selectDateFromCalender(By datePickerBtn,By dateTableName, By dateTableYear, By dateTableMonth,By nextBtn,By tabCols,String targetDay, String targetMonth, String targetYear)
{
	driver.findElement(datePickerBtn).click();
	while(true)
	{
	if(driver.findElement(dateTableYear).getText().equalsIgnoreCase(targetYear) && driver.findElement(dateTableMonth).getText().equalsIgnoreCase(targetMonth))
	{
		break;
	}
	else
	{
		driver.findElement(nextBtn).click();
	}
	}
	if(driver.findElement(dateTableName).isEnabled())
	{
		
		List<WebElement> cols=driver.findElements(tabCols);
		for(WebElement col:cols)
		{
			String day=col.getText();
			if(day.equalsIgnoreCase(targetDay))
			{
				col.click();
			}
		}
	}
	else
	{
		System.out.println("table disabled");
	}
	
}

public void selectOptionForRadioButtonYes(By radioButtonYes)
{
	driver.findElement(radioButtonYes).click();
}
public void selectOptionForRadioButtonNo(By radioButtonNo)
{
	driver.findElement(radioButtonNo).click();
}
public boolean verifyMandatoryFieldsByCheckingBlueTick(By blueTickMark)
{
	boolean flag=false;
	if(driver.findElement(blueTickMark).isDisplayed())
	{
		flag=true;
	}
	return flag;
}

}
