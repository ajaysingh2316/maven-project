package Com.metlife.stepdefenation;

import Com.metlife.pageobjects.Homepage;
import Com.metlife.utilities.WebdriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketBookingDefn {

    @Given("I log into redbus .in as a user")
    public void i_log_into_redbus_in_as_a_user() {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtils.initalize();
        WebdriverUtils.navigate("http://redbus.in");
    }
    @When("I update the source as {string}")
    public void i_update_the_source_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtils.type(Homepage.src_ip,string);
    }
    @When("I update the destination as {string}")
    public void i_update_the_destination_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtils.type(Homepage.dest_ip,string);
    }
    @When("I choose the date as 4th of next month")
    public void i_choose_the_date_as_4th_of_next_month() {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtils.Click(Homepage.date_4);
    }
    @When("I click on Search Busses")
    public void i_click_on_search_busses() {
        // Write code here that turns the phrase above into concrete actions
        WebdriverUtils.Click(Homepage.search_btn);
    }
    @Then("I should see one bus Available")
    public void i_should_see_one_bus_available() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
