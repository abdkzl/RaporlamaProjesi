package Tests.UITests;

import Tests.junitCalismalari.SmokeRegressionTest;
import driver.DriverFactoryImplementation;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import test.BrowserTestBase;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

public class Test1Pass extends BrowserTestBase {
    @BeforeEach
    public void url(){ DriverFactoryImplementation.getInstance().getDriver().get("https://www.google.com/");}

    @AfterEach
    public void takescreenshot(){
        ReusableMethods.takeScreenshot();
    }

    @SmokeRegressionTest
    @Test
    public void pass1() {

        Assertions.assertEquals("https://www.google.com/",Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    @Test
    public void pass2() {

        Assertions.assertEquals("https://www.google.com/",Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    @Test
    public void pass3() {

        Assertions.assertEquals("https://www.google.com/",Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    @Test
    public void pass4() {

        Assertions.assertEquals("https://www.google.com/",Driver.getDriver().getCurrentUrl());
    }


}
