import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class Find_Elements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		int count=0;
		driver.get("https://www.freepik.com/");	
	    List<WebElement> AllElements = driver.findElements(By.xpath("//div"));
	    for(WebElement i: AllElements) {
	    	String s=i.getText();
	    	System.out.println(s);
	    	count++;
	    }
	    System.out.println(count);
	}
}
