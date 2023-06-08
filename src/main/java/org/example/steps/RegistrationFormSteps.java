package org.example.steps;

import lombok.extern.log4j.Log4j2;
import org.example.pages.RegistrationFormPage;
import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;

@Log4j2
public class RegistrationFormSteps {

    private RegistrationFormPage registrationFormPage;

    public RegistrationFormSteps(WebDriver driver){
        registrationFormPage = new RegistrationFormPage(driver);
    }
    public void enterTextInputField(String firstText) {
        Waiters.waitForVisibility(registrationFormPage.getTextInputField());
        registrationFormPage.getTextInputField().sendKeys(firstText);
    }

    public void enterPassword(String password) {
        registrationFormPage.getPasswordField().sendKeys(password);
    }

    public void enterTextarea(String text) {
        registrationFormPage.getTextareaField().sendKeys(text);
    }

    public void clickDropdownSelect() {
        registrationFormPage.getDropdownSelect().click();
    }

    public void clickDropdownSelectOne() {
        registrationFormPage.getDropdownSelectOne().click();
    }

    public void clickSubmitButton() {
        registrationFormPage.getSubmitButton().click();
    }

    public String getFinishPageText(){
        return registrationFormPage.getFinishPageText().getText();
    }
}
