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

    @FindBy(xpath = "//div[@class=\"col-12 py-2\"]")
    private WebElement finishPageText;

    public RegistrationFormPage (WebDriver driver) {
        super(driver);
    }

    public WebElement getTextInputField() {
        return textInputField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getTextareaField() {
        return textareaField;
    }

    public WebElement getDropdownSelect() {
        return dropdownSelect;
    }

    public WebElement getDropdownSelectOne() {
        return dropdownSelectOne;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getFinishPageText() {
        return finishPageText;
    }


}