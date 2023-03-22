package firstframe;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sampleframe {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vimalraj M\\eclipse-workspace\\selnew\\driver\\chromedriver.exe");
		ChromeOptions mp = new ChromeOptions();
		mp.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(mp);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("Smart Tv\n");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Click the 3rd one
		
		List<WebElement> lists = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		lists.get(3).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Vimalraj M\\eclipse-workspace\\selnew\\screenshot\\amazon.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		

}
}