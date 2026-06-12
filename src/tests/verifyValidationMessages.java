package tests;

import org.testng.annotations.Test;

import pages.EnterVehicleDataPage;
import utils.BrowserUtils;
import utils.ExtractPropertyFileData;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class verifyValidationMessages {
	 WebDriver driver;
	 BrowserUtils utils=new BrowserUtils();
	ExtractPropertyFileData prop= new ExtractPropertyFileData();
	 EnterVehicleDataPage vp= new EnterVehicleDataPage(driver);
  @BeforeMethod
  public void beforeMethod() {
	  this.driver=utils.launchBrowser();
		 System.out.println("driver is "+ driver);
		 driver.get(prop.getProperty("url"));
	  
		
  }
  @Test
  public void enterDataOnFirstPage() {
	 
	  if(driver!=null)
	  {
	  System.out.println("driver before calling vehicle page is "+ driver);
	  vp.EnterFormData("Audi", "Scooter", "12", "13", "06/06/2026", "4", "Yes", "2", "Petrol", "3", "598", "3000", "800", "124");
	  }
  }
  @Test
  public void verifyIfMandtoryFieldsArePicked()
  {
	  Assert.assertEquals(true, vp.verifyIfTickMarkIsPresentAfterSuccessfulValidation(),"all mandatory fields are filled");
  }

}
