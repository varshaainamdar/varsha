package Generic;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_capture {
	//private static final OutputType OutputType = null;
	//private static final String File = null;

	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo ="./photo/";
		Date d = new Date(0);
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "_");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(photo+d2+"./jpeg");
		FileUtils.copyFile(src, dst);
	
		
		
	}

}
