import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.AllSalesPage;
import pageobjects.Homepage;

public class PageObjectTest {

  WebDriver driver;
  Homepage homepage;

  AllSalesPage allSalesPage;

    @Test
    public void openHomePageTest(){
        String actualUrl = driver.getCurrentUrl();

       // Assert.assertEquals(actualUrl, "https://www.mvideo.ru/");
    }
    @Test
    public void OpenHomePageTest2(){
        homepage = new Homepage(driver);
        homepage.open();
    }

    @Test
    public void openAllSales() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='https://www.mvideo.ru/vse-akcii?from=under_search']")).click();
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, "https://www.mvideo.ru/vse-akcii?from=under_search");
    }
    @Test
    public void openAllSales2(){
        homepage = new Homepage(driver);
        homepage.open();
        AllSalesPage allSalesPage =homepage.openAllSales();

        allSalesPage.checkPromoCatalogLink();

    }

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.mvideo.ru/");
    }

    @AfterTest
    public void close(){
        driver.quit();
    }


}
