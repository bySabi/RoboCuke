package com.iguanalab.app.RoboCuke;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.Scenario;
import cucumber.api.PendingException;

import android.app.Activity;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertTrue;

public class HelloAndroidActivityStepdefs {

  @Given("^I have a test$")
  public void i_have_a_test() throws Throwable {
    Activity activity = Robolectric.setupActivity(HelloAndroidActivity.class);
    System.out.println("title="+activity.getTitle().toString());
    assertTrue(activity.getTitle().toString().equals("RoboCuke"));
  }

/*
  @Then("^title is correct$")
  public void title_is_correct() throws Exception {
    System.out.println("title="+activity.getTitle().toString());
    assertTrue(activity.getTitle().toString().equals("RoboONE"));
  }

  @Before({"~@foo"})
  public void before() {
    System.out.println("Runs before scenarios *not* tagged with @foo");
  }

  @After
  public void after(Scenario scenario) {
    // result.write("HELLLLOO");
  }
*/
}
