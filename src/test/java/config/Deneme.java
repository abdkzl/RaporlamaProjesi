package config;

import org.springframework.beans.factory.annotation.Value;

public class Deneme {

    @Value("${browser}")
    public String browser;


}
