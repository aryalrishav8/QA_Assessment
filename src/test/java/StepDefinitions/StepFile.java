package StepDefinitions;

import Application.Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepFile {
    Test app;

    @Given("^User have opened the browser$")
    public  void openBrowser() {
        app=new Test();
        app.openBrowser();
    }

    @When("^User opens the website$")
    public void goToSauce(){app.goToSauce();}

    @And("^User enters valid username (.*) and password (.*)$")
    public void enterCredential(String userName,String password) {
        app.enterCredential(userName, password);
    }

    @And("^User clicks the login button$")
    public void clickLoginButton() {
        app.clickLoginButton();
    }

    @Then("^User should navigate to dashboard$")
    public void dashboardOpen() {
     app.dashboardOpen();
    }

    @And("^User enters valid username (.*) and wrong password (.*)$")
    public void enterInvalidCredential(String uname,String pass) {
        app.enterCredential(uname, pass);
    }

    @Then("^User should see an error message$")
    public void errorMessage() {
        app.seeError();
    }

    @And("^User adds an item to cart$")
    public void addItem() {
        app.addItem();
    }

    @Then("^item should be added to cart$")
    public void seeCart() {
        app.seeCart();
    }

    @And("^User removes the item from cart$")
    public  void removeItem() {app.removeItem();}

    @Then("^item should be removed from cart$")
    public void seeRemoved() {
        app.seeRemoved();
    }
    

}
