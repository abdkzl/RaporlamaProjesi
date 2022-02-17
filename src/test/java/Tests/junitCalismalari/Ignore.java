package Tests.junitCalismalari;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Ignore {

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void fail() {

        //Assertions.fail();
    }

    static boolean customCondition() {
        return true;
    }
}
