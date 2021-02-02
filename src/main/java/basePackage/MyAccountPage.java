package basePackage;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class MyAccountPage {
	WebDriver driver;
	private FindElementClass objFindElementClass;
	private RoboClass objRoboClass; 
	private WebElement element1;
	private WebElement element2;
	private Actions action;
	private boolean status;
	private String shoppingCartTabMyAccountPage = "//div[@class='shopping_cart']//following::b[contains(text(),'Cart')]";
	private String orderTablelinkMyAccountPage = "//ul[@class='myaccount-link-list']//following::a[@title='Orders']";
	private String womenTabMyAccountPage = "//div[@id='block_top_menu']//a[@title='Women']";
	private String categoryDescriptionWomenImageOnWomenPage = "//div[@class='cat_desc']//span[contains(text(),'Women')]";
	private String categoriesCheckBoxOfWomenTabOfMyAccountPage="//input[@id='layered_category_4']";
	private String searchBox = "search_query_top"; 
	private String sortDropDownMyAccountPage = "selectProductSort";

	public MyAccountPage(WebDriver driver) throws AWTException {
		this.driver = driver;
		objFindElementClass = new FindElementClass(driver);
		objRoboClass= new RoboClass(); 
	}

	public boolean verifyMyAccountPageIsOpened() {
		element1 = objFindElementClass
				.findElementUsingXPath("//ul[@class='myaccount-link-list']//following::a[@title='Orders']");
		status = objFindElementClass.isElementDisplayed(element1);
		return status;
	}

	public void moveAndClickOnWomenTabOnMyAccountPage() {
		element1 = objFindElementClass.findElementUsingXPath(womenTabMyAccountPage);
		objFindElementClass.mouseHoverAndClickonMainMenu(element1);
		element2 = objFindElementClass.findElementUsingXPath(categoryDescriptionWomenImageOnWomenPage);
		status = element2.isDisplayed();
	}

	public void selectCategoriesCheckBoxOfCatalogOnWomenTabOnMyAccount() {
		status= objFindElementClass.isCheckboxSelected(categoriesCheckBoxOfWomenTabOfMyAccountPage); 
		if(status) {
			element1= objFindElementClass.findElementUsingXPath(categoriesCheckBoxOfWomenTabOfMyAccountPage); 
			objFindElementClass.selectCheckBox(element1);
		}
		else {
			Reporter.log("Element is not found!");
		}
	}
	
	public void enterTextInSearchBoxMyAcconutPage() {
		element1= objFindElementClass.findElementUsingID(searchBox); 
		element1.click();
		objRoboClass.pressAndReleaseNumbersOnKeyBoard(1);
	
	}
	public void selectSortDropDownMyAccountPage() {
		element1= objFindElementClass.findElementUsingID(sortDropDownMyAccountPage); 
		objFindElementClass.dropDownSelectionByVisibleText(element1, "Price: Highest first");
	}

}
