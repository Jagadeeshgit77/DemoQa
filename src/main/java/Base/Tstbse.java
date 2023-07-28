package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tstbse {
	static public WebDriver driver;
	static public Properties prp;
	
	/*public Tstbse() throws FileNotFoundException {
		String path ="";
		prp = new Properties();
		//FileInputStream fis = new FileInputStream(path);
		try {
			FileInputStream fis = new FileInputStream(path);
			prp.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find File");
		}
		catch (IOException e) {
		System.out.println("Unable to load file");
		}
	}*/
	public void initial() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/");
		
	}
	public void fiinal() {
		driver.quit();
	}

}
