package Tests.junitCalismalari;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Meta_annotations {
//ucu de ayni isi yapiyor
    @Test
    @Tag(value = "Fast")
    void nam(){

    }

    @Test
    @Regression
    void name() {
        System.out.println("I am fast");
    }

    @RegressionTest
    void name2(){

    }
}



