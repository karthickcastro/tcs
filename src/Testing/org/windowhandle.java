package Testing.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch browser
		driver.get("https://www.snapdeal.com/");
		Object by;
		WebElement search=driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]"));
		search.sendKeys("iphone6");
		WebElement icon=driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button"));
		icon.click();
		Thread.sleep(3000);
		WebElement iphone=driver.findElement(By.xpath("(//img[@class='product-image '])[1]")); 
		iphone.click();
        String par=driver.getWindowHandle();
		Set<String> All = driver.getWindowHandles();
		System.out.println(par+"\n"+All);
		for (String x:All){
		if (!x.equals(par)){
		driver.switchTo().window(x);
		}
		}
		WebElement add= driver.findElement(By.xpath("//span[text()='add to cart']"));
		add.click();
	}

}
