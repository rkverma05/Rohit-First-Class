import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Soumyansh\\eclipse-workspace\\RohitFirstClass\\Executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Rohit");
	}
}
