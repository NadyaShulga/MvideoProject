package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AllSalesPage {
    WebDriver driver;

    public AllSalesPage (WebDriver driver){
        this.driver = driver;
    }

    public void checkPromoCatalogLink(){
        Boolean button = driver.findElement(By.xpath("https://www.mvideo.ru/promo/promocatalog?from=hub")).isDisplayed();

        Assert.assertTrue(button);

    }



}
