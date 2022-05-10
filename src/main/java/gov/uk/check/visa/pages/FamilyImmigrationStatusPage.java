package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id  ="response-0")
    WebElement yesField;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement youNeedVisaField;

    public void clickOnYes(){
        Reporter.log("Clicking on login link " + yesField.toString());
        clickOnElement(yesField);
    }
    public void clickOnContinueButton(){
        Reporter.log("Clicking on login link " + continueButton.toString());
        clickOnElement(continueButton);
    }
    public String youNeedVisa(){
        Reporter.log("Clicking on login link " + youNeedVisaField.toString());
        return getTextFromElement(youNeedVisaField);
    }


}
