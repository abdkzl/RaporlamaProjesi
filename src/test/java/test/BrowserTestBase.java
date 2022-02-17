package test;

import com.github.javafaker.Faker;
import driver.DriverFactory;
import driver.DriverFactoryImplementation;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.AllElements;

import java.util.concurrent.TimeUnit;

//@SpringBootTest
//@ExtendWith(TestResultLoggerExtension.class)
public class BrowserTestBase {

    protected final Actions actions = new Actions(DriverFactoryImplementation.getInstance().getDriver());
    protected static final Logger LOG = LoggerFactory.getLogger(BrowserTestBase.class);
    protected final DriverFactory Driver = new DriverFactoryImplementation();
    protected SoftAssertions softAssertions = new SoftAssertions();
    protected Faker faker = new Faker();

//    @Autowired
//    protected PageFactory elements;

    protected  AllElements elements = new AllElements();
    @BeforeEach
    public void setup() {
       //LOG.info("before method initialized.. thread ID => " + Thread.currentThread().getId());
        Driver.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterEach
    public void tearDown () {
        LOG.info("tear down method worked.. thread ID =>  " + Thread.currentThread().getId());
        Driver.removeDriver();
    }
}
