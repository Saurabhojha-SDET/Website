package Module;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Websitelaunch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option= new ChromeOptions();
		option.setBinary("C:\\Users\\Bloxuser\\Website-Workspace\\Website\\myDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://blox.xyz/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		WebElement one = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[2]/div[1]"));
		//WebElement one = driver.findElement(By.className("WelcomeBanner_HomeBannerIntroTextCtn__m6bqw"));
		System.out.println(one.getText());
		System.out.println("assd");
		driver.close();

	}

}
