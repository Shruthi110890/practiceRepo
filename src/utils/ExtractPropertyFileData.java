package utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExtractPropertyFileData 
{
	FileInputStream file;
	Properties props= new Properties();
	
	public ExtractPropertyFileData()
	{
		try {
			 file= new FileInputStream("C:\\Users\\Shruthi\\Documents\\shruthi_notes_interview\\VehicleInsuranceRepo\\vehicleInsuranceTricentis\\src\\config\\EnvProp.properties");
			props.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getProperty(String propertyName)
	{
		return props.getProperty(propertyName);
	}

}
