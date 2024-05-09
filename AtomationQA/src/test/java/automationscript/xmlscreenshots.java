package automationscript;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class xmlscreenshots {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/")).click();
		
		Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\LENOVO\\Pictures\\Screenshots\\fullpage screenshots");
		driver.navigate().back();
		
		driver.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		
		Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\LENOVO\\Pictures\\Screenshots\\fullpage screenshots");
		driver.navigate().back();
		
		driver.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		
		Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\LENOVO\\Pictures\\Screenshots\\fullpage screenshots");
		driver.navigate().back();
		
		driver.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		
		Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\LENOVO\\Pictures\\Screenshots\\fullpage screenshots");
		driver.navigate().back();
		
		driver.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		
		Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\LENOVO\\Pictures\\Screenshots\\fullpage screenshots");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
