package Testing.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
WebDriver k =new ChromeDriver();
k.get("https://www.Facebook.com/");
WebElement val = k.findElement(By.id("month"));
Select s = new Select(val);
s.selectByValue("6");

List<WebElement> op = s.getOptions();
System.out.println(op.size());

for (int i = 0; i < op.size(); i++) {
	WebElement x = op.get(i);
	String text = x.getText();
	System.out.println(text);
	
}
for (WebElement x : op) {
	String att = x.getAttribute("value");
	System.out.println(att);
}



}
}