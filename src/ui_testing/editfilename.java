package ui_testing;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class editfilename {
	
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/namanbhola1888/sample_crc/blob/main/test.txt");

        driver.findElement(By.xpath("//button[@aria-label='Edit file']")).click();

        driver.findElement(By.xpath("//textarea")).sendKeys("\nUpdated content");

        driver.findElement(By.xpath("//button[contains(text(),'Commit changes')]")).click();

        driver.close();
    }
}