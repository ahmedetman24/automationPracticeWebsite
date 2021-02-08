package runner;

import io.cucumber.testng.CucumberOptions;
import testCases.TestBase;

// "features" is the path of features files, glue is the package of step definitions, and plugin to make reports
@CucumberOptions(features="src/test/java/features", glue= {"stepDefinitions"}, plugin= {"pretty","html:target/Report.html"})
public class TestRunner extends TestBase
{

}
