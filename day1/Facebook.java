package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://en-gb.facebook.com/");
	      driver.findElement(By.xpath("//a[text()='Create New Account']")).click()	;
	      driver.findElement(By.xpath("//a[text()='Create New Account']")).click()	;
	      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swetha");
	      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("VN");
	      driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6379380944");
	      driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcdefs");
	      WebElement drop = driver.findElement(By.id("day"));
	      Select op=new Select(drop);
	      op.selectByVisibleText("Day");
	      WebElement drop1 = driver.findElement(By.id("month"));
	      Select op1=new Select(drop1);
	      op1.selectByVisibleText("Month");
	      WebElement drop2 = driver.findElement(By.id("year"));
	      Select op2=new Select(drop2);
	      op2.selectByVisibleText("year");
	      driver.findElement(By.className("_8esa")).click();
	      driver.close();
	      
	      
	      
	      
	      }

}
