package basePackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FindElementClass {

	private WebDriver driver;
	private WebElement element1;
	private Select select; 
	private boolean status;
	private BaseClass objBaseClass;

	private Actions action;

	public FindElementClass(final WebDriver driver) {
		this.driver = driver;
		objBaseClass = new BaseClass();
		action = new Actions(driver); 
	}

	public void openBowser(String appURL) {
		objBaseClass.openBrowser(appURL, driver);
	}

	public WebElement findElementUsingID(String iDOfElement) {
		implicitWaitCommonMethod();
		element1 = driver.findElement(By.id(iDOfElement));
		return element1;
	}

	public WebElement findElementUsingClass(String classNameOfElement) {
		implicitWaitCommonMethod();
		element1 = driver.findElement(By.className(classNameOfElement));
		return element1;

	}

	public WebElement findElementUsingName(String nameOfElement) {
		implicitWaitCommonMethod();
		element1 = driver.findElement(By.name(nameOfElement));
		return element1;

	}

	public WebElement findElementUsingLinkText(String linkTextOfElement) {
		implicitWaitCommonMethod();
		element1 = driver.findElement(By.linkText(linkTextOfElement));
		return element1;
	}

	public WebElement findElementUsingPartialLinkText(String linkTextOfElement) {
		implicitWaitCommonMethod();
		element1 = driver.findElement(By.partialLinkText(linkTextOfElement));
		return element1;
	}

	public WebElement findElementUsingTagName(String tagNameOfElement) {
		implicitWaitCommonMethod();
		element1 = driver.findElement(By.tagName(tagNameOfElement));
		return element1;
	}

	public WebElement findElementUsingXPath(String xPathOfElement) {
		// implicitWaitCommonMethod();
		element1 = driver.findElement(By.xpath(xPathOfElement));
		return element1;
	}

	public void clickOnELement(WebElement elementTag) {
		implicitWaitCommonMethod();
		elementTag.click();
	}

	public void enterTextInTExtBox(WebElement textBoxPath, String textToEnter) {
		implicitWaitCommonMethod();
		textBoxPath.sendKeys(textToEnter);

	}

	public void implicitWaitCommonMethod() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	public boolean isElementDisplayed(WebElement elementToTest) {
		implicitWaitCommonMethod();
		status = elementToTest.isDisplayed();
		return status;
	}

	public boolean isElementEnabled(WebElement elementToTest) {
		implicitWaitCommonMethod();
		status = elementToTest.isEnabled();
		return status;
	}

	public String getTextMethod(WebElement elementToTest) {
		implicitWaitCommonMethod();
		String text = elementToTest.getText();
		return text;
	}

	public void mouseHoverAndClickonMainMenu(WebElement targetElement) {
		implicitWaitCommonMethod();
		action.moveToElement(targetElement).click().build().perform();
	}

	public void mouseHoverOnMainMenu(WebElement targetElement) {
		implicitWaitCommonMethod();
		action.moveToElement(targetElement).build().perform();
	}

	public void mouseHoverOnSubMenu(WebElement mainMenu, WebElement subMenu) {
		implicitWaitCommonMethod();
		action.moveToElement(mainMenu).moveToElement(subMenu).build().perform();
	}

	public void doubleClickOnELement(WebElement target) {
		implicitWaitCommonMethod();
		action.doubleClick(target).build().perform();
	}

	public void rightClickOnElement(WebElement target) {
		implicitWaitCommonMethod();
		action.contextClick(target).build().perform();
	}

	public void clickAndHoldMethod(WebElement target) {
		implicitWaitCommonMethod();
		action.clickAndHold(target).build().perform();
	}

	public void dragAndDropMethod(WebElement source, WebElement target) {
		implicitWaitCommonMethod();
		action.dragAndDrop(source, target).build().perform();
	}

	public void dragAndDropUsingRelease(WebElement source, WebElement target) {
		implicitWaitCommonMethod();
		action.clickAndHold(source).moveToElement(target).pause(5000).release().build().perform();
	}

	public void findElementsusingxPath(String xpathOfElement) {
		List<WebElement> listOfElement = driver.findElements(By.xpath(xpathOfElement));

	}
	public boolean isCheckboxSelected(String elementToCheck) {
		element1= findElementUsingXPath(elementToCheck); 
		status= element1.isSelected();
		return status; 
	}
	public void selectCheckBox(WebElement elementToCheck) {
		elementToCheck.click();
	}
	public void dropDownSelectionByIndex(WebElement dropDown, int index) {
		select = new Select(dropDown); 
		select.selectByIndex(index);
	}
	public void dropDownSelectionByVisibleText(WebElement dropDown, String text) {
		select = new Select(dropDown); 
		select.selectByVisibleText(text);;
	}
}
