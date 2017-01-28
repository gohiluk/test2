package com.patronage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/patronage/home.feature", format = "json:target/cucumber.json", glue = "com.patronage.Steps.Home")
public class TestRunnerHome {


}
