package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadio {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[contains(text(),'favorite')]/following::label[text()='Chrome']")).click();
		String defaultSelection = driver
				.findElement(By.xpath(
						"//h5[contains(text(),'default')]/following::input[@checked='checked']/following::label"))
				.getText();
		System.out.println("The default select radio button :" + defaultSelection);
		List<WebElement> unSelectable = driver
				.findElements(By.xpath("//h5[contains(text(),'UnSelectable')]/parent::div//input"));
		for (WebElement radio : unSelectable)
			if (radio.isEnabled()) {
				System.out.println("Radio button " + radio.getAttribute("value") + " is selectbable");
			} else
				System.out.println("Radio button " + radio.getAttribute("value") + " is not selectbable");
		
		List<WebElement> ageGroup = driver
				.findElements(By.xpath("//h5[contains(text(),'age')]/parent::div//input"));
		boolean isSelected = false;
		for (WebElement age : ageGroup)
		{
			if (age.isSelected()) {
				System.out.println("Age group "+age.getAttribute("value")+" is already selected");
				isSelected = true;
				break;
			} 
		}
		if(!isSelected)
			driver.findElement(By.xpath("(//h5[contains(text(),'age')]/parent::div//label)[2]")).click();
	}

}
