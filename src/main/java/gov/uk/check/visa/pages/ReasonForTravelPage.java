package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "response-0")
    WebElement selectResonForTravelField;
    @FindBy(id = "response-1")
    WebElement getSelectResonForTravelFieldForChile;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonfieldOnReasonForTravelPage;
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement youNotNeedVisaTextField;
    @FindBy(id = "response-4")
    WebElement resonForTravelIsToStayWithFamily;

    public void selectReasonToTravelJoinFamily(){
        Reporter.log("selectReasonToTravelJoinFamily " + resonForTravelIsToStayWithFamily.toString());
        clickOnElement(resonForTravelIsToStayWithFamily);

    }
    public void selectReasonForTravel(){
        Reporter.log("selectReasonForTravel " + selectResonForTravelField.toString());
        clickOnElement(selectResonForTravelField);
    }
    public void clickOnContinueOnReasonFromTravelPage(){
        Reporter.log("clickOnContinueOnReasonFromTravelPage " + continueButtonfieldOnReasonForTravelPage.toString());
        clickOnElement(continueButtonfieldOnReasonForTravelPage);
    }
    public String youNotNeedVisaText(){
        Reporter.log("youNotNeedVisaText" + youNotNeedVisaTextField.toString());
        return getTextFromElement(youNotNeedVisaTextField);
    }
    public void getSelectResonForTravelForChile(){
        Reporter.log("getSelectResonForTravelForChile " + getSelectResonForTravelFieldForChile.toString());
        clickOnElement(getSelectResonForTravelFieldForChile);
    }
}
