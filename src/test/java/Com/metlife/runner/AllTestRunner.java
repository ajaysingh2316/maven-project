package Com.metlife.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true,features={"src/test/java/Com/metlife/features"},glue = "com.metlife.stepdefination",
plugin = {"html:TestOutput.html"})
public class AllTestRunner {


}
