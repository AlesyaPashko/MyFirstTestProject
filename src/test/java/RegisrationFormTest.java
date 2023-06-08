import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.pages.RegistrationFormPage;
import org.example.steps.RegistrationFormSteps;
import org.example.utils.JsonReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisrationFormTest extends BaseTest {

    protected WebDriver driver;
    private RegistrationFormSteps registrationFormSteps;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        registrationFormSteps = new RegistrationFormSteps(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void CheckRegistrationForm(UserData userData) {

        registrationFormSteps.enterTextInputField(userData.getText());
        registrationFormSteps.enterPassword(userData.getPassword());
        registrationFormSteps.enterTextarea(userData.getTextarea());
        registrationFormSteps.clickDropdownSelect();
        registrationFormSteps.clickDropdownSelectOne();
        registrationFormSteps.clickSubmitButton();


        Assert.assertTrue(registrationFormSteps.getFinishPageText().contains(userData.getFinishPageText()));


    }
}
