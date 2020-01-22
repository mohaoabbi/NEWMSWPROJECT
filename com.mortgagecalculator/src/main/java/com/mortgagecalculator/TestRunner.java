package com.mortgagecalculator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"com.mortgagecalculator"},
    monochrome = true,
    plugin = {"pretty","html:test-output"},
    dryRun = false,
    tags= {"@smoke,@regression"}
            )

public class TestRunner {

}
