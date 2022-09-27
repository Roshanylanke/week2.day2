package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).sendKeys("Ramya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jonaa");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9123345678");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rams");
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("12");
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd1 = new Select(dropdown1);
		dd1.selectByVisibleText("Jan");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select dd2 = new Select(dropdown2);
		dd2.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();

		




			
}
}