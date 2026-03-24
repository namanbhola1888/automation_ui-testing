package ui_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logouttest {
	public static void main(String[] args) throws InterruptedException {

	        ChromeDriver driver = new ChromeDriver();

	        driver.get("https://github.com/namanbhola1888");
	        
	        driver.findElement(By.xpath("//summary[@aria-label='View profile and more']")).click();

	        driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
	        
	        driver.manage().window().maximize();
	        driver.close();
	}
}
