package cl.testing.main;

import cl.testing.cucumber.Belly;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(Integer int1) {
        Belly belly = new Belly();
        belly.eat(int1);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        System.out.println("Espero un total de: " + int1 + " Horas");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        System.out.println("Mi panza crece");
    }

}
