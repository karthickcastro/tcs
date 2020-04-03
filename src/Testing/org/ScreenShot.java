package Testing.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");

WebDriver dr=new ChromeDriver();
 dr.get("https://www.ibm.com/in-en");
 TakesScreenshot tk=(TakesScreenshot)dr;
 File src = tk.getScreenshotAs(OutputType.FILE);
 System.out.println(src);
 File des= new File("C:\\Users\\hp\\eclipse-workspace\\Test\\image\\ibm.png");
FileUtils.copyFile(src, des);
	}

}
