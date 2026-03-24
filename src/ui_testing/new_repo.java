package ui_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_repo {
	
	public static void main(String[] args) { 
		ChromeDriver dr2 = new ChromeDriver();
		
        dr2.get("https://github.com/login");

        dr2.findElement(By.id("login_field")).sendKeys("namanbhola1888");
        dr2.findElement(By.id("password")).sendKeys("my_pass");

        dr2.findElement(By.name("commit")).click();
		
		dr2.get("https://github.com/new");
		
		dr2.findElement(By.id("repository-name-input")).sendKeys("sample_crc");
		dr2.findElement(By.xpath("//input[@value='private']")).click();
		dr2.findElement(By.xpath("/html/body/div[1]/div[6]/main/react-app/div/form/div[4]/button/span/span")).click();
		
		dr2.manage().window().maximize();
		dr2.close();
	
	}
}
