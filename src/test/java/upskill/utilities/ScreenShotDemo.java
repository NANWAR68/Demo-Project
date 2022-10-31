package upskill.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class ScreenShotDemo {

public void screenShot2() throws Exception{
	
    File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
	
    FileUtils.copyFile(screenshot, new File("C:\\Users\\Sana\\workspace\\DemoProject\\screenshotdemo"));

    System.out.println(" >>>>>>>>>>>>>>>>>>> Screenshot Taken");;

}


}
