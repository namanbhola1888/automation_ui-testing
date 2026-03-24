package ui_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class deletefiletest {
	public static void main(String[] args) {

	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://github.com/namanbhola1888/sample_crc/blob/main/test.txt");

	        driver.findElement(By.xpath("//button[@aria-label='Delete file']")).click();

	        driver.findElement(By.xpath("//button[contains(text(),'Commit changes')]")).click();

	        driver.close();
	}
}
