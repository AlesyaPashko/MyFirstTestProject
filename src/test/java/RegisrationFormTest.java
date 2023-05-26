import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisrationFormTest {

    @Test
    public void CheckRegistrationForm(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement textInputField = driver.findElement(By.id("my-text-id"));
        textInputField.sendKeys("Банана");

        WebElement passwordField = driver.findElement(By.name("my-password"));
        passwordField.sendKeys("НуОченьСекретныйПароль");

        WebElement textareaField = driver.findElement(By.xpath("//textarea[@rows=\"3\"]"));
        textareaField.sendKeys("Once Upon a Time...");

        WebElement dropdownSelect = driver.findElement(By.xpath("//*[@class=\"form-select\"]"));
        dropdownSelect.click();

        WebElement dropdownSelectOne = driver.findElement(By.xpath("//*[@value=\"1\"]"));
        dropdownSelectOne.click();

        driver.quit();



    }
}
