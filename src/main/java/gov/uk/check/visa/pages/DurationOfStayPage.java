package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;
    @FindBy (id = "response-1")
    WebElement moreThanSixMonths;

    public void selectLessThanSixMonth(){
        Reporter.log("Select less than six month " + lessThanSixMonths.toString());
        clickOnElement(lessThanSixMonths);
    }
    public void selectMoreThanSixMonth(){
        Reporter.log("Select More than six month " + moreThanSixMonths.toString());
        clickOnElement(moreThanSixMonths);
    }
    public void selectContinue(){
        Reporter.log("Select Continue " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }



}
