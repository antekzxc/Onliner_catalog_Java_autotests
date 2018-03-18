import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class SearchFieldTest extends WebdriverSettings {

    @Test
    public void TestCase1() {
        WebElement SearchField = driver.findElement(By.xpath("//*[@id=\"fast-search\"]/form/input[1]"));
        SearchField.sendKeys("Iphone");

    }

    @Test
    public void TestCase2() {
        WebElement SearchField = driver.findElement(By.xpath("//*[@id=\"fast-search\"]/form/input[1]"));
        SearchField.sendKeys("айфон");

    }

    @Test
    public void TestCase3() {
        WebElement SearchField = driver.findElement(By.xpath("//*[@id=\"fast-search\"]/form/input[1]"));
        SearchField.sendKeys("шзрщту");
    }
}
