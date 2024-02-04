package Application;


import java.time.Duration;
import  PageObject.*;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.closeWindow;
import static org.junit.Assert.assertTrue;

public class Test {
    public LoginPage loginPage;
    public CartPage cartPage;
    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver= new ChromeDriver(chromeOptions);

    public void openBrowser() {
//        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//         WebDriver driver= new ChromeDriver(chromeOptions);
        loginPage = new LoginPage();
        cartPage = new CartPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        WebDriverRunner.setWebDriver(driver);
    }

    public void goToSauce() {
        System.out.println("Redirected! ");
    }

    public void enterCredential(String userName, String password) {
        loginPage.enterUserName().should(Condition.appear,Duration.ofSeconds(30)).sendKeys(userName);
        loginPage.enterPassword().sendKeys(password);
    }

    public void clickLoginButton() {
        loginPage.loginButton().should(Condition.appear, Duration.ofSeconds(5)).click();
    }

    public void dashboardOpen() {
        loginPage.goToDashboard().isDisplayed();
    }

    public static void closeBrowser() {
        closeWindow();
    }

    public void seeError() {
        loginPage.seeError().isDisplayed();
    }

    public void addItem() {
        cartPage.addItemButton().should(Condition.appear,Duration.ofSeconds(5)).click();
    }

    public void seeCart() {
        cartPage.seeCart().click();
        String itemName=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        assertTrue(itemName.contains("Sauce Labs Backpack"));
    }

    public void removeItem() {
        cartPage.removeItem().should(Condition.appear,Duration.ofSeconds(5)).click();
    }

    public void seeRemoved() {
        String butName=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).getText();
        assertTrue(butName.contains("ADD TO CART"));
    }


}
