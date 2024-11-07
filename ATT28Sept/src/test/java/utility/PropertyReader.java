package utility;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertyReader {
		
		
		
		public static String readPropData(String propTobeRead) throws IOException
		{
			
			String path =  System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties";
					
			Properties prop = new Properties();
			
			FileInputStream fis = new FileInputStream(path);
			
			prop.load(fis);
			
			String value = prop.getProperty(propTobeRead);
			
			System.out.println(value);
			
			return value;
			
		}
		

		
		

	}


