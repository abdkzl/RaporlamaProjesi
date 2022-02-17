package base_url_setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class UrbanicFarmBaseUrl {

    protected static RequestSpecification spec;

    public static void urbanicSetup() {
        spec = new RequestSpecBuilder().setBaseUri("https://test.urbanicfarm.com").build();
    }
}
