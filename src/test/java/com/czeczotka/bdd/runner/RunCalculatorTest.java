package com.czeczotka.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "json:target/cucumber.json" },
        glue = "com.czeczotka.bdd.steps",
        features = "classpath:cucumber/1_AUTO-87.feature"
)
public class RunCalculatorTest {
}
