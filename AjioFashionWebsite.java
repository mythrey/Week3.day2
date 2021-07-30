package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioFashionWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Search bags
		WebElement element = driver.findElement(By.name("searchVal"));
		element.sendKeys("bags");
		element.sendKeys(Keys.ENTER);

		// Select Men under Gender
		WebElement menbags = driver.findElement(By.xpath("//label[@for='Men']"));
		menbags.click();
		Thread.sleep(2000);
		String bagcount = menbags.getText();
		System.out.println("Bag count for Men : " + bagcount);

		// Select fashion bags under category

		WebElement fashionbags = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
		fashionbags.click();
		// Thread.sleep(2000);
		String fashionbagcount = fashionbags.getText();
		System.out.println("Fashion bag count is : " + fashionbagcount);
		System.out.println("*************************************");

		// List brand names
		List<WebElement> findElement = driver.findElements(By.className("brand"));
		int size = findElement.size();
		System.out.println("Fashion Brand count : " + size);
		System.out.println("*************************************");
		System.out.println("Fashion brand names :");
		System.out.println("*************************************");

		for (WebElement br : findElement) {
			String brandname = br.getText();
			System.out.println(brandname);
		}

		// List name of bags

		List<WebElement> findElements = driver.findElements(By.className("name"));
		System.out.println("*************************************");
		System.out.println("Size : " + findElements.size());
		System.out.println("Name of bags : ");
		System.out.println("*************************************");
		for (WebElement br1 : findElements) {
			String bagname = br1.getText();
			System.out.println(bagname);
		}
	}

}
