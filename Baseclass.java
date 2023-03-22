package firstframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseclass {

 static WebDriver driver;
	
	public static void Browselaunch(String browser) {
		try {
			if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vimalraj M\\eclipse-workspace\\selnew\\driver\\chromedriver.exe");
		driver = new ChromeDriver();		}
			else if(browser.equals("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\Vimalraj M\\eclipse-workspace\\selnew\\driver\\chromedriver.exe");
				driver = new EdgeDriver();		}
					
		}catch(Exception e) {
		System.out.println("Unable to launch browser");
		}
				
	}		
	public static void Maximize() {
		

	
