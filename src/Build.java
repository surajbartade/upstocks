import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Build {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");	
		WebElement element = driver.findElement(By.xpath("//a[@class='gb_d']"));
		Actions a=new Actions(driver);
        a.moveToElement(element).contextClick().click().build().perform();
}
}