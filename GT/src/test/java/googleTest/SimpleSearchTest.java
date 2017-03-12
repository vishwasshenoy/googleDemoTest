package googleTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleSearchTest {

	WebDriver googleDriver;
	
	@Test
	public void searchTest(){
		
		File file = new File("C:/Selenium/JarFiles/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		googleDriver = new ChromeDriver();
		googleDriver.get("https://www.google.com/");
		WebElement searchTxt = googleDriver.findElement(By.name("q"));
		searchTxt.sendKeys("vishwas");
	}
	
}
