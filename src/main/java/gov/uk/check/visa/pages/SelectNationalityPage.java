package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownField;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonOnNationalitySelection;

public void selectNationality(String nationality){
    Reporter.log("select Nationality" + nationalityDropDownField.toString());
    sendTextToElement(nationalityDropDownField,nationality);
}
public void clickNextStepButton(){
    Reporter.log("click Next StepButton" + continueButtonOnNationalitySelection.toString());
    clickOnElement(continueButtonOnNationalitySelection);
}


}
