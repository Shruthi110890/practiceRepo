package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="vehicle_data")
	public  Object[][] enterVehicleDataPage()
	{
		Object data[][]= {
				{"Audi", "Scooter", "12", "13", "06/06/2026", "4", "Yes", "2", "Petrol", "3", "598", "3000", "800", "124"}};
		System.out.println("print data "+ data);
		return data;
	}

}
