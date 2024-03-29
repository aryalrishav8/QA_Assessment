package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;


public class LoginPage {
    public SelenideElement enterUserName() {
        return $x("//input[@id='user-name']");
    }

    public SelenideElement enterPassword() {
        return $x("//input[@id='password']");
    }

    public SelenideElement loginButton() {
    return $x("//input[@id='login-button']");
    }

    public SelenideElement goToDashboard() {
        return $x("//*[@id='inventory_container']");
//        return $x("//p[text()='Nemo : New Era Medical Operation']");
    }

    public SelenideElement seeError() {
        return $x("//*[@id=\"login_button_container\"]/div/form/h3");
    }



}
