package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("http://leaftaps.com/opentaps/control/main");
	      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	      driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
	      driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Leads")).click();
	      driver.findElement(By.linkText("Find Leads")).click();
	      driver.findElement(By.xpath("//span[text()='Phone']")).click();
	      driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5555555555");
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	      driver.findElement(By.xpath("//a[text()='Delete']")).click();
	      driver.findElement(By.linkText("Find Leads")).click();
	      driver.findElement(By.xpath("//input[@name='id']")).sendKeys("");
	}
	
}
