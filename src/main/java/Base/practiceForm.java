package Base;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class practiceForm extends Tstbse {
	public void form(String fn, String ln, String ue, String un,String ca) throws InterruptedException {
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");  
		driver.findElement(By.xpath("//h5[text()='Forms']")).click();
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		driver.findElement(By.id("firstName")).sendKeys(fn);
		driver.findElement(By.id("lastName")).sendKeys(ln);
		driver.findElement(By.id("userEmail")).sendKeys(ue);
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys(un);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement yr = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1 = new Select(yr);
		s1.selectByValue("1999");
		WebElement mnth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s2 = new Select(mnth);
		s2.selectByValue("8");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--020']")).click();
		
		
		/*driver.findElement(By.xpath("dateOfBirthInput")).clear();
		
		WebElement rndm = driver.findElement(By.xpath("dateOfBirthInput"));
		Select sel = new Select(rndm);
		sel.selectByValue("21 Sep 1999");*/
		
		
		js.executeScript("scrollBy(0,5000)", "");
		/*WebElement r =driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"))
		;
		r.sendKeys("h");
		Select sel = new Select(r);
		sel.selectByValue("Maths");*/

		
		
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		Thread.sleep(3000);
		
		String file ="C:\\Users\\Krishnachaithanya\\Downloads\\sampleFile.jpeg";
		driver.findElement(By.id("uploadPicture")).sendKeys(file);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(ca);
		
		

	}

}
