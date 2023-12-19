package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheURL {

	public static void main(String[] args) {
		String actualURL="https://www.ibm.com/in-en";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ibm.com/in-en");
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		if(currentURL.equals(actualURL))
		{
		System.out.println("It is same ");
		}
		else
			System.out.println("It is not same");
		
		
		

	}

}
