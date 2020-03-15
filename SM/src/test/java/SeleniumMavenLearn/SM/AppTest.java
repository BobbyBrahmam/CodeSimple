package SeleniumMavenLearn.SM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppTest 
{
	@Test
    public static void main( String[] args ) throws InterruptedException
    {
		System.setProperty("webdriver.chrome.driver", "F:\\Programming\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.quit();
    }

}
