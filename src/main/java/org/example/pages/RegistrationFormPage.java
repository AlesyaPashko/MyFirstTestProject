package org.example.pages;

import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFormPage extends BasePage {

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

    public RegistrationFormPage (WebDriver driver) {
        super(driver);
    }

    public void enterTextInputField(String firstText) {
        Waiters.waitForVisibility(textInputField);
        textInputField.sendKeys(firstText);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterTextarea(String text) {
        textareaField.sendKeys(text);
    }

    public void clickDropdownSelect() {
        dropdownSelect.click();
    }

    public void clickDropdownSelectOne() {
        dropdownSelectOne.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}