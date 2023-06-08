package org.example.steps;

import io.qameta.allure.Step;
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

    @Step("Enter first text")
    public void enterTextInputField(String firstText) {
        Waiters.waitForVisibility(registrationFormPage.getTextInputField());
        registrationFormPage.getTextInputField().sendKeys(firstText);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        registrationFormPage.getPasswordField().sendKeys(password);
    }

    @Step("Enter textarea")
    public void enterTextarea(String text) {
        registrationFormPage.getTextareaField().sendKeys(text);
    }

    @Step("Click DropdownSelect")
    public void clickDropdownSelect() {
        registrationFormPage.getDropdownSelect().click();
    }

    @Step("Click DropdownSelectOne")
    public void clickDropdownSelectOne() {
        registrationFormPage.getDropdownSelectOne().click();
    }

    @Step("Click Submit Button")
    public void clickSubmitButton() {
        registrationFormPage.getSubmitButton().click();
    }

    @Step("Get Finish Page Text")
    public String getFinishPageText(){
        return registrationFormPage.getFinishPageText().getText();
    }
}
