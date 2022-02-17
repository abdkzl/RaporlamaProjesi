package Tests.junitCalismalari;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Nested_1 {

    @Nested
    class group1 {
        @Test
        void test1() {
            System.out.println("1");
        }

        @Test
        void test2() {
            System.out.println("2");
        }

        @Test
        void test3() {
            System.out.println("3");
        }

        @Test
        void test4() {
            System.out.println("4");
        }
    }

    @Nested
    class group2 {
        @Test
        void test1() {
            System.out.println("1");
        }

        @Test
        void test2() {
            System.out.println("2");
        }

        @Test
        void test3() {
            System.out.println("3");
        }

        @Test
        void test4() {
            System.out.println("4");
        }
    }


}
