package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        new WebDriverWait(driver, Duration.ofSeconds(30))
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstName']")));
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Selvapriyanka");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[contains(text(),'Lead List')]/following::a[@class='linktext'])[1]"))));
        driver.findElement(By.xpath("(//span[contains(text(),'Lead List')]/following::a[@class='linktext'])[1]")).click();
        String title = driver.getTitle();
        if(title.equals("View Lead | opentaps CRM"))
        	System.out.println("Passed - Title of the page is matching. Title "+title);
        else
        	System.out.println("Failed - Title of the page is not matching. Title "+title);
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Test");
	}
	
}
