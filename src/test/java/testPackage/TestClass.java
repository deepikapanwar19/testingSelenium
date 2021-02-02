package testPackage;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import basePackage.HomePageClass;
import basePackage.MyAccountPage;

public class TestClass {
	private HomePageClass objHomePageClass;
	private MyAccountPage objMyAccountPage;
	private BaseClass ObjBaseClass; 
	private WebDriver driver;

	private boolean status;
	private String textToVerify;
	
	@BeforeClass
	@Parameters("browserName")
	public void initializeDriver(String browserName) throws AWTException {
		ObjBaseClass= new BaseClass(); 
		driver=ObjBaseClass.initializeDriver(browserName);
		objHomePageClass=  new HomePageClass(driver);
		objMyAccountPage = new MyAccountPage(driver);
	}
	@Test(priority = 0)
	@Parameters("appURL")
	public void openApplication(String appURL) {
		objHomePageClass.OpenBrowser(appURL);
	}

	@Test(priority = 1)
	public void verifyHomePageOfApplication() {
		status = objHomePageClass.verifyHomePage();
		Assert.assertEquals(status, true);
	}

	@Test(priority = 2)

	public void clickOnSignInLink() {
		objHomePageClass.clickSignInLinkHomePage();
	}

	@Test(priority = 3)
	public void verifySignInTabOpenedOnHomePage() {
		status = objHomePageClass.verifySignInTabIsOpenedOnMainPage();
		Assert.assertEquals(status, true);
	}

	@Test(priority = 4)
	@Parameters({ "eMailID", "passWord" })
	public void enterTextInEmailAndPasswordTextBoxHomePage(String emailID, String passWord) {
		objHomePageClass.enterTextInEmailAndPasswordTextBoxHomePage(emailID, passWord);
		objHomePageClass.clickSignInButtonSignInFormHomePage();
	}

	@Test(priority = 5)
	public void verifyMyAccountPageIsOpened() {
		status = objMyAccountPage.verifyMyAccountPageIsOpened();
		Assert.assertEquals(status, true);
	}
	@Test(priority = 6)
	public void moveAndClickOnWomenTabOnMyAccountPage() {
		objMyAccountPage.moveAndClickOnWomenTabOnMyAccountPage(); 
	}
	@Test(priority = 7)
	public void selectCategoriesCheckBoxOfCatalogOnWomenTabOnMyAccount() {
		objMyAccountPage.selectCategoriesCheckBoxOfCatalogOnWomenTabOnMyAccount(); 
	}
	@Test(priority = 8)
	public void enterTextInSearchBoxMyAcconutPage() {
		objMyAccountPage.enterTextInSearchBoxMyAcconutPage();
	}
	@Test(priority=9)
	public void selectSortDropDownMyAccountPage() {
		objMyAccountPage.selectSortDropDownMyAccountPage();
	}

}
