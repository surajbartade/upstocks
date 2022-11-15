package SELENIUM;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
}
}