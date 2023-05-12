package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBoxes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Basic']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'toggle')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
        String text=driver.findElement(By.xpath("//div[contains(@class,'growl')]/span")).getText();
        System.out.println(text);
        assert !driver.findElement(By.xpath("//div[contains(@class,'disabled')]")).isEnabled();
        driver.findElement(By.xpath("//label[text()='Java']")).click();
        driver.findElement(By.xpath("//label[text()='Python']")).click();
        driver.findElement(By.xpath("//ul[contains(@class,'multiple')]")).click();
        driver.findElement(By.xpath("//li[@data-item-value='Paris']/label")).click();
        driver.findElement(By.xpath("//li[@data-item-value='Berlin']/label")).click();
        driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
	}

}
