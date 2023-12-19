package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitle {

	public static void main(String[] args) {
		String expectedTitle="instagram";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		 String actualTitle=driver.getTitle();
		 System.out.println(actualTitle);
		 if(actualTitle.contains(expectedTitle))
		 {
			 System.out.println("Pass: Here title matches");
		 }
		 else
			 System.out.println("FAIL: Here title doesnt match");
	

	}

}
