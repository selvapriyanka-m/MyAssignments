package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class LeafGroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title= driver.getTitle();
		if(title.equals("Dashboard"))
			System.out.println("Passed - Title of the page is "+ title);
		else
			System.out.println("Failed - Title of the page is "+ title);
		driver.navigate().back();
		Dimension di = driver.findElement(By.xpath("//h5[contains(text(),'height and width')]/following::span[text()='Submit']")).getSize();
		System.out.println("Width of the button is " + di.width);
        System.out.println("Height of the button is " + di.height);
        assert !driver.findElement(By.xpath("//h5[contains(text(),'disabled')]/following::button")).isEnabled();
        WebElement mouseOverButton = driver.findElement(By.xpath("//span[text()='Success']/parent::button"));
        System.out.println(mouseOverButton.getCssValue("style"));
        String colorOfButton = mouseOverButton.getCssValue("style");
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseOverButton).build().perform();
        String colorOfButtonMO = mouseOverButton.getCssValue("style");
        if(colorOfButton.equals(colorOfButtonMO))
        	System.out.println("Failed - Color is not changed");
        else
        	System.out.println("Passed - Color is changed");
        System.out.println(colorOfButton);
        System.out.println(colorOfButtonMO);
        Point button = driver.findElement(By.xpath("//h5[contains(text(),'position')]/following::button")).getLocation();
        System.out.println("The position of the button is "+button);
        String color= driver.findElement(By.xpath("//h5[contains(text(),'color')]/following::button")).getCssValue("color");
        System.out.println("The color of the Save button is "+Color.fromString(color).asHex());
        List<WebElement> buttons = driver.findElements(By.xpath("//h5[contains(text(),'rounded')]/following::button"));
      
        	
	}
	

}
