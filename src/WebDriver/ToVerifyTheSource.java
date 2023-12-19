package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheSource {

	public static void main(String[] args) {
		String expectedSource="Get";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.whatsapp.com/");
		String actualSource=driver.getPageSource();
		System.out.println(actualSource);
		if(actualSource.contains(expectedSource))
		{
			System.out.println("PASS: Here source code matches");
		}
		else
			System.out.println("FAIL: Here source code not matches");
	

	}

}
