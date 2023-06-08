import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.pages.RegistrationFormChainPage;
import org.example.steps.RegistrationFormChainSteps;
import org.example.utils.JsonReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RegisrationFormChainTest extends BaseTest {
    protected WebDriver driver;
    private RegistrationFormChainSteps registrationFormChainSteps;

    @BeforeClass
    public void startPage() {
        driver = DriverManager.getDriver();
        registrationFormChainSteps = new RegistrationFormChainSteps(driver);
    }


    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void checkRegistrationFormDataChain(UserData userData){
        String textInput = registrationFormChainSteps
                .enterTextInputField(userData.getText())
                .enterPassword(userData.getPassword())
                .enterTextarea(userData.getTextarea())
                .clickDropdownSelect()
                .clickDropdownSelectOne()
                .clickSubmitButton()
                .getFinishPageText();
        Assert.assertTrue(textInput.contains(userData.getFinishPageText()));
    }
}
