package upskill.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;                               //Initializing Driver          //class label variable
	public static void setupDriver(){
//System.setProperty("webdriver.chrome.driver"," C:\\UpskillSoftware\\chromedriver.exe");  // Getting physical chrome driver
		WebDriverManager.chromedriver().setup();               //Getting driver from cloud
		ChromeOptions options = new ChromeOptions();          //Initializing ChromeOptions
		options.addArguments("--start-maximized");           //Adding arguments
	    options.addArguments("--disable-notifications");    //Adding arguments
        //options.addArguments("--headless");              //Adding arguments
	    driver = new ChromeDriver (options);              //Declaring Driver value  
        driver.get("https://www.yahoo.com");
	}
	
public static WebDriver getDriver(){
	return driver;                                      //returning driver to call
}

public static void tearDownDriver(){
	//driver.close();                                  //Closing current driver session
	driver.quit();                                    //Closing all driver session
}
}
