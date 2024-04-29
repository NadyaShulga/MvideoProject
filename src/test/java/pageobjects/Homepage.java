package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
WebDriver driver;
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("https://www.mvideo.ru/");
    }
    public AllSalesPage openAllSales(){
        driver.findElement(By.xpath("//a[@href='https://www.mvideo.ru/vse-akcii?from=under_search']")).click();
        return new AllSalesPage(driver);
    }
}
