package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.zoho.com/");
     driver.manage().window().fullscreen();
     driver.findElement(By.linkText("Sign In")).click();
     Thread.sleep(4000);
     driver.findElement(By.id("login_id")).sendKeys("rjkiran1619@gmail.com");
     Thread.sleep(4000);
     driver.findElement(By.id("nextbtn")).click();
     //driver.quit();
	}

}
