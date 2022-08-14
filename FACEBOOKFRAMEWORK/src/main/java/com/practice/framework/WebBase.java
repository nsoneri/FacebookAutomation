package com.practice.framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebBase {

	private static WebDriver driver;

	public void createDriver(String browserName) {
		try {

			String osName = System.getProperty("os.name");
			browserName = browserName.toLowerCase();
			if (osName.toLowerCase().contains("windows".toLowerCase())) {
				if (browserName.toLowerCase().contains("chrome".toLowerCase())) {
					ChromeOptions option = new ChromeOptions();
					option.addArguments("--disable-notifications");
					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					driver = new ChromeDriver(option);
					
				
				} else if (browserName.contains("Mozila firefox".toLowerCase())
						|| browserName.contains("FF".toLowerCase())) {
					System.setProperty("webdriver.gecko.driver", ".//Drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				} else if (browserName.contains("Edge".toLowerCase())) {
					System.setProperty("webdriver.edge.driver", ".//Drivers/msedgedriver.exe");
					driver = new EdgeDriver();
				}
			} else if (browserName.equals("Safari".toLowerCase())) {
				System.setProperty("webdriver.safari.driver", ".//Drivers/chromedriver.exe");
				// driver = new

			} else if (browserName.equals("Chrome".toLowerCase())) {
				System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", ".//Drivers/geckodriver.exe");
			}
		} catch (Exception e) {
			System.out.println("Seems like there is some issue with opening browser");
		}
	}

	public void openWebsite(String URL) {
		try {
			driver.get(URL);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Error occured while opening website");
		}
	}

	protected boolean clickOnElement(By locator, String elementName, long waitTime) {
		boolean isClicked = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
			WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleClick.click();
			isClicked = true;
		} catch (Exception e) {
			System.out.println("Unable to click on element :" + elementName);
		}
		return isClicked;
	}
	
	protected WebElement enterTextInTextbox(By locator,String text, String elementName, long waitTime ) {
		WebElement eleEnterText = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));
			eleEnterText = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleEnterText.click();
			eleEnterText.clear();
			eleEnterText.sendKeys(text);
			System.out.println("Succefffully verified page");
		} catch (Exception e) {
			System.out.println("Unable to enter text in textbox");
		}
		return eleEnterText;
	}
	
	protected boolean verifyPage(By locator, String elementName, long waitTime) {
		boolean isVerified = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			isVerified = true;
			System.out.println("Successfully verify the page");

		} catch (Exception e) {
			System.out.println("Unable to verify page");
		}
		return isVerified;
	}

	public void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Unable to close browser");
		}
	}
}
