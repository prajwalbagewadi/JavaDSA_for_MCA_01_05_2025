package testSeleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.InterruptedException;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bagew\\Downloads\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println("Enter to quit");
		Scanner sc=new Scanner(System.in);
		String var=sc.nextLine();
//		try {
//			Thread.sleep(10000);
//		}catch(InterruptedException e){
//			e.printStackTrace();
//		}
//		driver.close();
	}
}
