package Tests.junitCalismalari;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@TestMethodOrder(OrderAnnotation.class)
public class Order_1 {


    @Test
    @Order(2)
    void name() {
        System.out.println("2. test");
    }

    @Test
    @Order(1)
    void name2() {

        System.out.println("1. test");
    }


    @Nested
    @Order(2)
    class ikincigroup {
        @Test
        void ilktest() {
            System.out.println("ben ikinin ilkiyim");
        }
    }
    @Nested
    @Order(1)
    class ilkgroup {
        @Test
        void ilktest() {
            System.out.println("ben ilkin ilkiyim");

        }
    }


}
