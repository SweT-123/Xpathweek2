package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.matcher.EqualityMatcher;

public class DeleteLead {

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
	      driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Swetha");
	      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	      driver.findElement(By.xpath("//a[text()='Swetha']")).click();
	      String data="Leaf taps - TestLeaf Automation  Platform";
	      String title = driver.getTitle();
	      
		if (title.equals(data)) {
			System.out.println("login");
		} else {
            System.out.println("Failed ");
		}
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.id("updateLeadForm_companyName")).clear();
		 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.name("submitButton")).click();
		 driver.close();
		 
	}
	      
}

