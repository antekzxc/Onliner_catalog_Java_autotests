import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchPhoneWithHendsTest extends WebdriverSettings {
    @Test
    public void TestCase7() {
        WebElement PhonePageButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/ul/li[1]/a"));
        PhonePageButton.click();
        WebElement AppleButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[3]/div[2]/ul/li[4]/label/span[2]"));
        AppleButton.click();
        WebElement MinPriceButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[1]/input"));
        MinPriceButton.sendKeys("100");
        WebElement MaxPriceButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[2]/input"));
        MaxPriceButton.sendKeys("1000");
    }
    @Test
    public void TestCase8() {
        WebElement PhonePageButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/ul/li[1]/a"));
        PhonePageButton.click();
        WebElement AppleButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[3]/div[2]/ul/li[4]/label/span[2]"));
        AppleButton.click();
        WebElement MinPriceButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[1]/input"));
        MinPriceButton.sendKeys("0");
        WebElement MaxPriceButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[2]/input"));
        MaxPriceButton.sendKeys("100");
    }
    @Test
    public void TestCase9() {
        WebElement PhonePageButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/ul/li[1]/a"));
        PhonePageButton.click();
        WebElement AppleButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[3]/div[2]/ul/li[4]/label/span[2]"));
        AppleButton.click();
        WebElement MinPriceButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[1]/input"));
        MinPriceButton.sendKeys("3000");
        WebElement MaxPriceButton = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[1]/div[4]/div[2]/div/div[2]/input"));
        MaxPriceButton.sendKeys("1000");
    }

}
