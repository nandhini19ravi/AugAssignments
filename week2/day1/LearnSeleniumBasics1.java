package week2.day1;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics1 {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driv =new FirefoxDriver();
	driv.get("http://leaftaps.com/opentaps");
	driv.manage().window().maximize();
	driv.close();
}
}
