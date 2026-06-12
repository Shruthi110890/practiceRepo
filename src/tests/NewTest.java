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
	
	 EnterVehicleDataPage vp;
	

  @Test(dataProviderClass=DataProviderClass.class,dataProvider="vehicle_data")
  public void enterDataWithDataProvider(String makeValue,String modelValue,String cylcapVal,String enginePerformVal,String dom, 
			String numberOfSeats, String RightHandRadioVal,String numberOfSeatsMotarCycleVal,String fuelType,String payload, String totalWeight, String listPrice, String licencePlateNumber, String annualMilage) {
	
	  if(driver!=null)
	  {
	  System.out.println("driver before calling vehicle page is "+ driver);
	  vp.EnterFormData(makeValue,modelValue,cylcapVal,enginePerformVal,dom, 
				numberOfSeats, RightHandRadioVal,numberOfSeatsMotarCycleVal,fuelType,payload,totalWeight,listPrice,licencePlateNumber,annualMilage);
	  } 
  }
  @BeforeMethod
  public void beforeTest() {
	 this.driver=utils.launchBrowser();
		 System.out.println("driver is "+ driver);
		 driver.get(prop.getProperty("url"));
		 vp= new EnterVehicleDataPage(driver);
	  
  }

}
