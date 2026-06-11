package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EnterVehicleDataPage extends BasePage{
	
public EnterVehicleDataPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

WebDriver driver;


		
	


By btnRequestDemo=By.xpath("//a[text()='Request Demo']");
By btnNext=By.xpath("//button[text()='Next »']");
By makeDropdown=By.xpath("//select[@id='make']");
By modelDropdown=By.xpath("//select[@id='model']");
By cylinderCapacityText=By.xpath("//input[@id='cylindercapacity']");
By engPerformText=By.xpath("//input[@id='engineperformance']");
By dateOfManTxtField=By.xpath("//input[@id='dateofmanufacture']");
By datePickerCalenderTable=By.xpath("//table[@class='ui-datepicker-calendar']");
By datePickerCalRows=By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr");
By datePickerCalCols=By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td");
By datePickerYear=By.xpath("//span[@class='ui-datepicker-year']");
By datePickerMonth=By.xpath("//span[@class='ui-datepicker-month']");
By nextBtn=By.xpath("//a[@title='Next']");
By numOfSeats=By.xpath("//select[@id='numberofseats']");
By radioBtnYesId=By.xpath("//input[@type='radio' and @id='righthanddriveyes']/../span");
By radioBtnNoId=By.xpath("//input[@type='radio' and @id='righthanddriveno']/../span");
By numOfSeatsForMotarCycle=By.xpath("//Select[@id='numberofseatsmotorcycle']");
By fuelTypeDrpDwm=By.xpath("//select[@id='fuel']");
By payloadField=By.xpath("//input[@id='payload']");
By totalWeightField=By.xpath("//input[@id='totalweight']");
By listPriceField=By.xpath("//input[@id='listprice']");
By licencePlateNumField=By.xpath("//input[@id='licenseplatenumber']");
By annualMilageField=By.xpath("//input[@id='annualmileage']");
	
	public void EnterFormData(String makeValue,String modelValue,String cylcapVal,String enginePerformVal,String dom, 
			String numberOfSeats, String RightHandRadioVal,String numberOfSeatsMotarCycleVal,String fuelType,String payload, String totalWeight, String listPrice, String licencePlateNumber, String annualMilage)
	{
		System.out.println("inside form data");
		if(verifyIfHomePageIsLoaded(btnNext))
		{
			System.out.println("page is loaded successfully");
		}
		else
		{
			System.out.println("page is not fully loaded yet");
		}
	selectValueFromDropdown(makeDropdown,makeValue);
		selectValueFromDropdown(modelDropdown,modelValue);
		enterTextData(cylinderCapacityText,cylcapVal);
		enterTextData(engPerformText,enginePerformVal);
		enterTextData(dateOfManTxtField,dom);
		selectValueFromDropdown(numOfSeats,numberOfSeats);
		if(RightHandRadioVal.equalsIgnoreCase("Yes"))
		{
			selectOptionForRadioButtonYes(radioBtnYesId);
		}
		else
		{
		selectOptionForRadioButtonNo(radioBtnNoId);
		}
		selectValueFromDropdown(numOfSeatsForMotarCycle, numberOfSeatsMotarCycleVal);
		selectValueFromDropdown(fuelTypeDrpDwm, fuelType);
		enterTextData(payloadField, payload);
		enterTextData(totalWeightField, totalWeight);
		enterTextData(listPriceField,listPrice);
		enterTextData(licencePlateNumField,licencePlateNumber);
		enterTextData(annualMilageField, annualMilage);
	}

}
