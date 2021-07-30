package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSorting {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

//Select "sort on date" check box
		WebElement findElement = driver.findElement(By.id("chkSelectDateOnly"));
		findElement.click();
		if (findElement.isSelected()) {
			System.out.println("Sort on date Check box is toggled on");
		} else
			System.out.println("Sort on date Check box is toggled off");
		// Thread.sleep(2000);
		// Clear and type Source and destination location in "From" and "To"

		System.out.println("**************************");
		WebElement findElement2 = driver.findElement(By.id("txtStationFrom"));
		findElement2.clear();
		findElement2.sendKeys("New Delhi");
		Thread.sleep(2000);

		WebElement findElement3 = driver.findElement(By.id("txtStationTo"));
		findElement3.clear();
		findElement3.sendKeys("Mumbai Central");
		// Thread.sleep(2000);

		// getting train names
		List<WebElement> findElements = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a"));
		int size = findElements.size();
		System.out.println("Size : " + size);
		System.out.println("Train names are : ");

		// Use Java Collections sort to sort it and then print it
		List<String> trainnames = new ArrayList<String>();

		for (WebElement x : findElements) {
			String train = x.getText();
			System.out.println(train);
			trainnames.add(train);
		}
		Collections.sort(trainnames);
		System.out.println("**********************************");
		System.out.println("Sorted Train names: ");
		for (String sortedtrains : trainnames) {
			System.out.println(sortedtrains);
		}

	}

}
