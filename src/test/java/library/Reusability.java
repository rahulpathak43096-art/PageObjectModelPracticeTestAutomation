package library;
import java.io.File;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Reusability {
	public static void capturesscreenshot(WebDriver driver,String ScreenshotName) {
		try {
			TakesScreenshot ts =(TakesScreenshot) driver;
			File  source =ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./ScreenShots/"+ScreenshotName+ getCurrentDateTime() +".png"));
			System.out.println("Captured Screenshot-By selenium");
		} catch (Exception e) {
			System.out.println("Exception while taking the Screenshot" + e.getMessage());
			e.printStackTrace();
		
	}
}
	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_YYY_HH_mm_ss");
		Date currentdate=new Date();
		return customFormat.format(currentdate);
	}
}