package com.iguanalab.app.RoboCuke;

import org.robolectric.RobolectricTestRunner;
import cucumber.api.junit.Cucumber;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import java.io.IOException;


public class RoboCucumber extends RobolectricTestRunner {

    public RoboCucumber(Class clazz) throws InitializationError, IOException {
        super(clazz);
    }

  protected HelperTestRunner getHelperTestRunner(Class bootstrappedTestClass) {
    try {
      return new MyHelperTestRunner(bootstrappedTestClass);
    } catch (InitializationError initializationError) {
      throw new RuntimeException(initializationError);
    }
  }

  public class MyHelperTestRunner extends HelperTestRunner {
    private  Cucumber cu;
    public MyHelperTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        try {
            cu = new Cucumber(testClass);
        } catch (InitializationError e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override protected Object createTest() throws Exception {
        return super.createTest();
    }

    @Override public Statement classBlock(RunNotifier notifier) {
      return super.classBlock(notifier);
    }

    @Override public Statement methodBlock(FrameworkMethod method) {
        return super.methodBlock(method);
    }

  }

}
