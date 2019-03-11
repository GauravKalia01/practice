package com.LaunchFeautre;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author Clearstream
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features =
        { "src/test/resources/Jagdish.feature" },
        glue ={"com.steps"})
public class LaunchFeature
{

}