package stepdefinitions;

import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashBoardPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private DashBoardPage dashboardPage;

    @Given("User successfully login into dashboard page")
    public void user_successfully_login_into_dashboard_page() throws InterruptedException {
        DriverFactory.getDriver().get(ConfigReader.initProp().getProperty("qa_url"));
        Thread.sleep(6000);
        dashboardPage = loginPage.doLogin(ConfigReader.initProp().getProperty("username"), ConfigReader.initProp().getProperty("password"));
    }

    @Then("dashboard module icon is visible")
    public void dashboard_module_icon_is_visible() throws InterruptedException {
        Assert.assertTrue(dashboardPage.isDashboardIconVisible());
    }

}