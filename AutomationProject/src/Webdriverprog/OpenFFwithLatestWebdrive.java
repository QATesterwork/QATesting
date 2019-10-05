package Webdriverprog;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFFwithLatestWebdrive {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");	
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}
