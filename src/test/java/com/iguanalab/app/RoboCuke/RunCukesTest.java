package com.iguanalab.app.RoboCuke;

import org.robolectric.RobolectricTestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runners.model.InitializationError;

import java.io.IOException;
import java.lang.RuntimeException;

//@RunWith(Cucumber.class)
//@RunWith(RobolectricTestRunner.class)
@RunWith(RoboCucumber.class)
@CucumberOptions(monochrome = true)
public class RunCukesTest {
  @Test
  public void runcukestest(){
        Runner r;
        try {
            r = new Cucumber(RunCukesTest.class);
        } catch (InitializationError e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JUnitCore c = new JUnitCore();
        c.run(Request.runner(r));
    }
}
