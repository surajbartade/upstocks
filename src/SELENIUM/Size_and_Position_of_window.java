package SELENIUM;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_and_Position_of_window{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
	//	Dimension d=new Dimension(100,200);
	//	driver.manage().window().setSize(d);
		
		Point p=new Point(400, 500);
		driver.manage().window().setPosition(p);
}
}
