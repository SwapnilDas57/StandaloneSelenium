package seleniumJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksTest {

	public static void main(String[] args) throws IOException, URISyntaxException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		List<WebElement> lstLinks= footer.findElements(By.xpath("//div[@id='gf-BIG'] //a[contains(@href,'http')]"));
		
		System.out.println(lstLinks.size());
		
		WebElement linkBroken=		driver.findElement(By.partialLinkText("Broken Link"));
		
		System.out.println(new BrokenLinksTest().getResponseCode(linkBroken));
		for(WebElement link: lstLinks) {
			System.out.println(link.getText());
			System.out.println(link.getDomAttribute("href"));
			System.out.println(new BrokenLinksTest().getResponseCode(link));
		}
		
	}
	
	public int getResponseCode(WebElement link) throws IOException, URISyntaxException {
		int responseCode=0;
		
		String strUrl=link.getDomAttribute("href");
		URI uri=new URI(strUrl);
		HttpURLConnection conn=(HttpURLConnection)  uri.toURL().openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		responseCode=conn.getResponseCode();
		
		return responseCode;
	}

}
