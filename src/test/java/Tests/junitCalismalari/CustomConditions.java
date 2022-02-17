package Tests.junitCalismalari;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class CustomConditions {
    @Test
    @EnabledIf("customConditionSameClass")
    void enabled() {
        System.out.println("I am enabled");    }


    @Test
    @DisabledIf("customConditionSameClass")
    void disabled() {
        System.out.println("I am disabled");    }


    @Test
    @EnabledIf("Tests.junitCalismalari.Ignore#customCondition")
    void enabled_from_different_class() {
        System.out.println("I am enabled");    }


    boolean customConditionSameClass() {
        return true;
    }
}
