package Tests.UITests;

import Tests.junitCalismalari.SmokeRegressionTest;
import driver.DriverFactoryImplementation;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import test.BrowserTestBase;
import utilities.ReusableMethods;

public class Test1Fail extends BrowserTestBase {

    @BeforeEach
    public void url(){ DriverFactoryImplementation.getInstance().getDriver().get("https://www.google.com/");}

    @AfterEach
    public void takescreenshot(){
        ReusableMethods.takeScreenshot();
    }

    @SmokeRegressionTest
    @Test
    public void pass1() {

        Assertions.assertEquals("https://www.dfdsgoogle.com/",DriverFactoryImplementation.getInstance().getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    @Test
    public void pass2() {

        Assertions.assertEquals("https://wwfffw.google.com/",Driver.getDriver().getCurrentUrl());
    }

    @SmokeRegressionTest
    @Test
    public void pass3() {

        Assertions.assertEquals("https://wfffffww.google.com/",Driver.getDriver().getCurrentUrl());
    }

    @Tag("")
    @Test
    public void pass4() {

        Assertions.assertEquals("https://www.googlfffe.com/",Driver.getDriver().getCurrentUrl());
    }


}
