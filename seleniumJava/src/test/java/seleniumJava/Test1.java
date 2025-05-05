package seleniumJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
		Properties prop=new Properties();
		
		FileInputStream fs;
		try {
			fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String browser=(String)prop.get("browser");
		System.out.println("Browser is: "+browser);
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			System.out.println("Chrome browser");
			ChromeOptions options=new ChromeOptions();
			String strHeadlessMode=prop.getProperty("headless");
			System.out.println("Headless mode: "+strHeadlessMode);
//			strHeadlessMode.equals("true") ?options.addArguments("--headless"):System.out.println("Not headless");
			if(strHeadlessMode.equals("true")) {
				options.addArguments("--headless");
			}else {
				System.out.println("Not headless");	
			}
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
		}else {
			System.out.println("Edge browser");
			EdgeOptions options=new EdgeOptions();
			String strHeadlessMode=prop.getProperty("headless");
			System.out.println("Headless mode: "+strHeadlessMode);
			options.addArguments("headless",strHeadlessMode);
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://yellowleafboutique.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(45));
		wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("menu-item-423")));
		
		
//		List<WebElement> elem= driver.findElements(By.xpath("//swap"));
//		System.out.println(elem.size());
//		System.out.println(elem.isEmpty());
		
		List<WebElement> lstLinks=driver.findElements(By.tagName("a"));
		System.out.println(lstLinks.size());
		
		WebElement footer=driver.findElement(By.tagName("footer"));
		List<WebElement> lstLinksFooter=footer.findElements(By.tagName("a"));
		System.out.println(lstLinksFooter.size());
		
		WebElement elem2= driver.findElement(By.xpath("//*[text()='View All']"));
		
		
		WebElement elem3=driver.findElement(By.xpath("//div[contains(@class,'recent')]"));
//		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		
//		js.executeScript("arguments[0].scrollIntoView()", elem3);
		
		
		
//		js.executeScript("window.scrollBy(0,10)","");
		
//		
//		System.out.println(elem2.getText());
//		elem2.click();
		
//		driver.findElement(RelativeLocator.with(By.xpath("//h2[contains(text(),'Hot This Week')]")).near(By.tagName("a"))).click();
		
		
		
		WebElement elem4=driver.findElements(By.xpath("//ul[@id='menu-header-menu']/li[contains(@id,'menu-item')]/a/span[@class='aux-menu-label']")).stream().filter(x->x.getText().equals("Pages")).collect(Collectors.toList()).get(0);
		Actions a=new Actions(driver);
		a.moveToElement(elem4).build().perform();
		a.scrollToElement(elem2).build().perform();
		
		WebElement elem=driver.findElements(By.xpath("//ul[@id='menu-header-menu']/li[contains(@id,'menu-item')]/a/span[@class='aux-menu-label']")).stream().filter(x->x.getText().equals("My Account")).collect(Collectors.toList()).get(0);
		elem.click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com/");
		WebElement searchBox=driver.findElement(By.xpath("//textarea[@title='Search']"));
		a.keyDown(Keys.SHIFT).sendKeys(searchBox, "Swapnil").keyUp(Keys.SHIFT).build().perform();
		
		
		System.out.println(driver.findElement(RelativeLocator.with(By.xpath("//a")).toRightOf(By.xpath("//a[text()='Gmail']"))).getText());
		
		
		
		driver.navigate().back();
		
		
		
		driver.close();
		driver.quit();
		
	}

}
