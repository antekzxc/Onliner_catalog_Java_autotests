import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends WebdriverSettings{

    @Test
    public void TestCase4() {
        WebElement EnterButton = driver.findElement(By.xpath("//*[@id=\"userbar\"]/div/div[1]"));
        EnterButton.click();
        WebElement LoginField = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[1]/input"));
        LoginField.sendKeys("klim-ant@mail.ru");
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[2]/input"));
        PasswordField.sendKeys("fynjy");
        WebElement EnterButtonAccess = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[3]/div/button"));
        EnterButtonAccess.click();
    }
    @Test
    public void TestCase5() {
        WebElement EnterButton = driver.findElement(By.xpath("//*[@id=\"userbar\"]/div/div[1]"));
        EnterButton.click();
        WebElement LoginField = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[1]/input"));
        LoginField.sendKeys("qqq@qqq.ru");
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[2]/input"));
        PasswordField.sendKeys("qqq");
        WebElement EnterButtonAccess = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[3]/div/button"));
        EnterButtonAccess.click();
    }
    @Test
    public void TestCase6() {
        WebElement EnterButton = driver.findElement(By.xpath("//*[@id=\"userbar\"]/div/div[1]"));
        EnterButton.click();
        WebElement LoginField = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[1]/input"));
        LoginField.sendKeys("klim-ant@mail.ru");
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[1]/div[2]/input"));
        PasswordField.sendKeys("qqq");
        WebElement EnterButtonAccess = driver.findElement(By.xpath("//*[@id=\"auth-container__forms\"]/div/div[2]/form/div[3]/div/button"));
        EnterButtonAccess.click();
    }
}