package ui_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class crc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://github.com/login");

		dr.findElement(By.id("login_field")).sendKeys("naman02@gmail.com");

		dr.findElement(By.id("password")).sendKeys("my_pass");

		dr.findElement(By.name("commit")).click();

		dr.manage().window().maximize();
		dr.close();
	}

}

