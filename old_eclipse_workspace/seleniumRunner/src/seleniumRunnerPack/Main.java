package seleniumRunnerPack;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bagew\\Downloads\\Testing\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("detach", true); 

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.geeksforgeeks.org/");
		
		wd.close();
		
	}
}
