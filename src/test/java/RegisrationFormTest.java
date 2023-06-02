import org.example.driver.DriverManager;
import org.example.pages.RegistrationFormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisrationFormTest extends BaseTest {

    protected WebDriver driver;
    private RegistrationFormPage registrationFormPage;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        registrationFormPage = new RegistrationFormPage(driver);
    }

    @Test
    public void CheckRegistrationForm() {

        registrationFormPage.enterTextInputField("Банана");
        registrationFormPage.enterPassword("НуОченьСекретныйПароль");
        registrationFormPage.enterTextarea("Once Upon a Time...");
        registrationFormPage.clickDropdownSelect();
        registrationFormPage.clickDropdownSelectOne();
        registrationFormPage.clickSubmitButton();


        WebElement finishPage = driver.findElement(By.xpath("//div[@class=\"col-12 py-2\"]"));


        Assert.assertTrue(finishPage.getText().contains("Received!"));


    }
}
