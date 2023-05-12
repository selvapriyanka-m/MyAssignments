package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

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
        driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7904341989");
        System.out.println(driver.findElement(By.xpath("//input[@name='phoneNumber']")).getAttribute(""));
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
       .until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[contains(text(),'Lead List')]/following::a[@class='linktext'])[1]"))));
        //driver.findElement(By.xpath("(//span[contains(text(),'Lead List')]/following::a[@class='linktext'])[1]")).getText();
        WebElement firstLead = driver.findElement(By.xpath("(//span[contains(text(),'Lead List')]/following::a[@class='linktext'])[1]"));
        String leadID = firstLead.getText();
        System.out.println(leadID);
        firstLead.click();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Lead ID')]/following::input")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        WebElement info = driver.findElement(By.xpath("//span[contains(text(),'Lead List')]/following::div[contains(text(),'display')]"));
        String leadInfo = info.getText();
        if(leadInfo.equals("No records to display"))
        	System.out.println("Passed : \"No records to display\" Message displayed ");
        else
        	System.out.println("Failed : \"No records to display\" Message not displayed ");
        driver.close();
        
        
        

	}

}
