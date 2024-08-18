package Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static String Browser = "chrome";
	public static String methodname = "login";
	public static WebDriver driver;

	public void onboarding() throws InterruptedException {
		setupWebDriver();
		checkonboarding();

		driver.quit();

		// public void checkonboarding()

		// public void setupWebDriver()

		// public static void login()

		// public static void signup()

	}

	public void checkonboarding() throws InterruptedException {
		if (methodname.equals("login")) {
			login();
		} else if (methodname.equals("signup")) {
			signup();
		} else {
			System.out.println("Incorrect method call");
		}
	}

	public void setupWebDriver() {
		if (Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new IllegalArgumentException("Invalid browser specified");
		}
	}

	public void login() throws InterruptedException {
		driver.get("https://blox.xyz");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='HeaderNav']/div[1]/span/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HeaderNav\"]/div[2]/div[1]/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
	}

	public void signup() throws InterruptedException {
		driver.get("https://blox.xyz");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='HeaderNav']/div[1]/span/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HeaderNav\"]/div[2]/div[1]/div[3]/div[2]/div/div")).click();
		Thread.sleep(2000);

	}

}
