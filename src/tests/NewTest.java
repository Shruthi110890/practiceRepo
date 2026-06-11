package tests;

import org.testng.annotations.Test;

import pages.EnterVehicleDataPage;
import utils.BrowserUtils;
import utils.DataProviderClass;
import utils.ExtractPropertyFileData;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	WebDriver driver;
	 BrowserUtils utils=new BrowserUtils();
	ExtractPropertyFileData prop= new ExtractPropertyFileData();
	
	
	
/* @Test
  public void enterData() {
	  EnterVehicleDataPage vp= new EnterVehicleDataPage(driver);
	  if(driver!=null)
	  {
	  System.out.println("driver before calling vehicle page is "+ driver);
	  vp.EnterFormData("Audi", "Scooter", "12", "13", "06/06/2026", "4", "Yes", "2", "Petrol", "3", "598", "3000", "800", "124");
	  } 
  }*/
  @Test(dataProviderClass=DataProviderClass.class,dataProvider="vehicle_data")
  public void enterDataWithDataProvider(String makeValue,String modelValue,String cylcapVal,String enginePerformVal,String dom, 
			String numberOfSeats, String RightHandRadioVal,String numberOfSeatsMotarCycleVal,String fuelType,String payload, String totalWeight, String listPrice, String licencePlateNumber, String annualMilage) {
	  EnterVehicleDataPage vp= new EnterVehicleDataPage(driver);
	  if(driver!=null)
	  {
	  System.out.println("driver before calling vehicle page is "+ driver);
	  vp.EnterFormData(makeValue,modelValue,cylcapVal,enginePerformVal,dom, 
				numberOfSeats, RightHandRadioVal,numberOfSeatsMotarCycleVal,fuelType,payload,totalWeight,listPrice,licencePlateNumber,annualMilage);
	  } 
  }
  @BeforeMethod
  public void beforeMethod() {
	 this.driver=utils.launchBrowser();
		 System.out.println("driver is "+ driver);
		 driver.get(prop.getProperty("url"));
	  
  }

}
