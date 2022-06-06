package Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fk {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		driver.findElement(By.className("_3704LK")).click();
		driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		driver.findElement(By.className("L0Z3Pu")).click();
		List<WebElement> list = driver.findElements(By.className("_13oc-S"));
		WebElement firstOption = list.get(0);
		firstOption.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(By.cssSelector("._2KpZ6l._2U9uOA._3v1-ww")).click();
		String A = driver.findElement(By.cssSelector("._1dqRvU")).getText();
		System.out.println("Single unit price is " + A.replaceAll("[^a-zA-Z0-9]", ""));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,5000)");
		driver.findElement(By.xpath("//div[@class='_3dY_ZR']/button[2]")).click();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.attributeContains(By.cssSelector("._253qQJ"), "value", "2"));
		String B = driver.findElement(By.cssSelector("._1dqRvU")).getText();
		System.out.println("Two unit price is: " + B.replaceAll("[^a-zA-Z0-9]", ""));
		driver.quit();

	}
}
