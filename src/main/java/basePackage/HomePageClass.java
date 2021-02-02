package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class HomePageClass {

	private FindElementClass objFindElementClass;
	private WebElement element1, element2;
	private boolean status;
	
	private String homePageTitle = "//a[@title='My Store']"; 
	private String signInLinkHomePage = "login"; 
	private String signInFormHomePage = "login_form"; 
	private String eMailTextBoxHomePage = "email"; 
	private String passWordTextBoxHomePage = "passwd"; 
	private String SignInButtonSignInFormHomePage="SubmitLogin"; 
	
	public HomePageClass(WebDriver driver) {
		objFindElementClass = new FindElementClass(driver);
	}

	public void OpenBrowser(String appURL) {
		objFindElementClass.openBowser(appURL);
	}

	public boolean verifyHomePage() {

		element1 = objFindElementClass.findElementUsingXPath(homePageTitle);
		status = objFindElementClass.isElementDisplayed(element1);
		if (status) {
			Reporter.log("Element is displayed on screen!");
		} else {
			Reporter.log("Element is not displayed on screen!");
		}
		return status;
	}

	public void clickSignInLinkHomePage() {
		element1 = objFindElementClass.findElementUsingClass(signInLinkHomePage);
		objFindElementClass.clickOnELement(element1);
	}
	
	public boolean verifySignInTabIsOpenedOnMainPage() {
		element1 = objFindElementClass.findElementUsingID(signInFormHomePage); 
		status = objFindElementClass.isElementDisplayed(element1); 
		if (status) {
			Reporter.log("Element is displayed on screen!");
		} else {
			Reporter.log("Element is not displayed on screen!");
		}
		return status; 
	}
	public void enterTextInEmailAndPasswordTextBoxHomePage(String email, String passWord) {
		element1= objFindElementClass.findElementUsingID(eMailTextBoxHomePage); 
		objFindElementClass.enterTextInTExtBox(element1, email);
		element2= objFindElementClass.findElementUsingID(passWordTextBoxHomePage); 
		objFindElementClass.enterTextInTExtBox(element2, passWord);
	}
	public void clickSignInButtonSignInFormHomePage() {
		element1 = objFindElementClass.findElementUsingID(SignInButtonSignInFormHomePage); 
		objFindElementClass.clickOnELement(element1);
	}
	public String getTextFromEMailBoxOnHomePage() {
		element1= objFindElementClass.findElementUsingID(eMailTextBoxHomePage);
		String text= objFindElementClass.getTextMethod(element1); 
		return text; 
	}


}
