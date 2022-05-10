package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "response-0")
    WebElement selectJobfield;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnNext;
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement youNeedVisaTextField;



    public void clikONNextButton(){
        Reporter.log("click ONNextButton" + clickOnNext.toString());
        clickOnElement(clickOnNext);
    }
    public void selectJob(){
        Reporter.log("select Job" + selectJobfield.toString());
        clickOnElement(selectJobfield);
    }
    public String youNeedVisaText(){
        Reporter.log("you Need Visa Text " + youNeedVisaTextField.toString());
        return getTextFromElement(youNeedVisaTextField);
    }


}
