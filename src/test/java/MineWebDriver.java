import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class MineWebDriver
{
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-cms.cefile-app.com");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input"));
		username.sendKeys("opsmanager");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("clerkfull");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/table/tbody/tr/td/div/table/tbody/tr/td/input"));
		loginBtn.click();

		Thread.sleep(2000);
		driver.quit();
	}
}
