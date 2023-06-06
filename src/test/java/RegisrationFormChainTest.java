import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.pages.RegistrationFormChainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RegisrationFormChainTest extends BaseTest {
    protected WebDriver driver;
    private RegistrationFormChainPage registrationFormPage;

    @BeforeClass
    public void startPage() {
        driver = DriverManager.getDriver();
        registrationFormPage = new RegistrationFormChainPage(driver);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][]{
                {new UserData("Банана")},
                {new UserData("Бумшакалака")}
        };
    }

    @Test(dataProvider = "data-provider")
    public void checkRegistrationFormDataChain(UserData userData){
        String textInput = registrationFormPage
                .enterTextInputField(userData.getText())
                .enterPassword("НуОченьСекретныйПароль")
                .enterTextarea("Once Upon a Time...")
                .clickDropdownSelect()
                .clickDropdownSelectOne()
                .clickSubmitButton()
                .getFinishPageText();
        Assert.assertTrue(textInput.contains("Received!"));
    }
}
