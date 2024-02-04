package PageObject;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {
    public SelenideElement addItemButton() {
        return $x("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
    }

    public SelenideElement seeCart() {
        return $x("//*[@id=\"shopping_cart_container\"]/a");
    }

    public SelenideElement removeItem() {
        return $x("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
    }
}
