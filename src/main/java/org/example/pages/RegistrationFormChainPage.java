package org.example.pages;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RegistrationFormChainPage extends BasePage {
    protected WebDriver driver;

    @FindBy(id = "my-text-id")
    private WebElement textInputField;

    @FindBy(name = "my-password")
    private WebElement passwordField;

    @FindBy(xpath = "//textarea[@rows=\"3\"]")
    private WebElement textareaField;

    @FindBy(xpath = "//select[@class=\"form-select\"]")
    private WebElement dropdownSelect;

    @FindBy(xpath = "//option[@value=\"1\"]")
    private WebElement dropdownSelectOne;

    @FindBy(xpath = "//button[@class=\"btn btn-outline-primary mt-3\"]")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class=\"col-12 py-2\"]")
    private WebElement finishPageText;

    public RegistrationFormChainPage (WebDriver driver) {
        super(driver);
    }

    public RegistrationFormChainPage enterTextInputField(String firstText){
        log.info("Enter first text");
        textInputField.sendKeys(firstText);
        return this;
    }
    public RegistrationFormChainPage enterPassword(String password) {
        log.info("Enter password");
        passwordField.sendKeys(password);
        return this;
    }

    public RegistrationFormChainPage enterTextarea(String text) {
        log.info("Enter second text");
        textareaField.sendKeys(text);
        return this;
    }

    public RegistrationFormChainPage clickDropdownSelect() {
        log.info("Click dropdown select");
        dropdownSelect.click();
        return this;
    }

    public RegistrationFormChainPage clickDropdownSelectOne() {
        log.info("Click dropdown select one");
        dropdownSelectOne.click();
        return this;
    }

    public RegistrationFormChainPage clickSubmitButton() {
        log.info("Click submit button");
        submitButton.click();
        return this;
    }

    public String getFinishPageText(){
        log.info("Get finish page text");
        return finishPageText.getText();
    }

}
