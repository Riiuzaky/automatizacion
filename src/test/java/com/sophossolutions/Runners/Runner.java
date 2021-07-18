package com.sophossolutions.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.sophossolutions.StepDefinitions",
        features = "./src/test/com/sophossolutions/resources/features/steps_screenplay.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false

)



public class Runner {
}
