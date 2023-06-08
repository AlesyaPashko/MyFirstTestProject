package org.example.steps;

import lombok.extern.log4j.Log4j2;
import org.example.pages.RegistrationFormChainPage;
import org.example.pages.RegistrationFormPage;
import org.openqa.selenium.WebDriver;
@Log4j2
public class RegistrationFormChainSteps {
    private RegistrationFormChainPage registrationFormChainPage;

    public RegistrationFormChainSteps(WebDriver driver){
        registrationFormChainPage = new RegistrationFormChainPage(driver);
    }
    public RegistrationFormChainSteps enterTextInputField(String firstText){
        log.info("Enter first text");
        registrationFormChainPage.getTextInputField().sendKeys(firstText);
        return this;
    }
    public RegistrationFormChainSteps enterPassword(String password) {
        log.info("Enter password");
        registrationFormChainPage.getPasswordField().sendKeys(password);
        return this;
    }

    public RegistrationFormChainSteps enterTextarea(String text) {
        log.info("Enter second text");
        registrationFormChainPage.getTextareaField().sendKeys(text);
        return this;
    }

    public RegistrationFormChainSteps clickDropdownSelect() {
        log.info("Click dropdown select");
        registrationFormChainPage.getDropdownSelect().click();
        return this;
    }

    public RegistrationFormChainSteps clickDropdownSelectOne() {
        log.info("Click dropdown select one");
        registrationFormChainPage.getDropdownSelectOne().click();
        return this;
    }

    public RegistrationFormChainSteps clickSubmitButton() {
        log.info("Click submit button");
        registrationFormChainPage.getSubmitButton().click();
        return this;
    }

    public String getFinishPageText(){
        log.info("Get finish page text");
        return registrationFormChainPage.getFinishPageText().getText();
    }

}
