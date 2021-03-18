package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class basicTest {
	public static WebDriver driver;
	
	
	@BeforeSuite
	public static void initalize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cravver\\Desktop\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("http://peetzafurry.cravrr.com/");
		Thread.sleep(7000);
		System.out.println("zooming");


}
}