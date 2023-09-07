package Motique;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Vinayak");
		driver.findElement(By.name("email")).sendKeys("vksrt707@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Vksrt@707");
		driver.findElement(By.id("exampleCheck1")).click();
		
	
		
		Select sc=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		sc.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).click();
		
		
		driver.findElement(By.name("bday")).sendKeys("07-10-1997");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String successmsg = driver.findElement(By.xpath("//strong[contains(text(),\"Success!\")]")).getText();
		
		if(successmsg.equalsIgnoreCase("Success!")) {
			System.out.println("submitted");
		}
		
		driver.quit();
		

	}

}
