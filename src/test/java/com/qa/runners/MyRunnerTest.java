package com.qa.runners;

import com.qa.utils.DriverManager; 
import com.qa.utils.GlobalParams;
import com.qa.utils.ServerManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber/report.html"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports"}
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=false 
        ,monochrome=true
        ,strict=true
        ,tags = "@Testcase37&47"
//        ,tags = "@koocreationfull or @HomeScreen or @KooDetailView or @Search or @TrendingHashtags or @Notification or @HashTagDetails"//"@koocreationfull"//"@HomeScreen"//"@allTests" //"@HomeScreen"//"@KooDetailView"//"@search"//"@koocreationfull"// or @HomeNewUser"//"@allTests"
        //,tags = "@TrendingHashtags or @HashTagDetails"
        //,tags = "@HomeScreen"//"@KooDetailView"//"@EditProfile or @HomeNewUser or @KooDetailView"//"@allTests"//"@KooDetailView"////"@EditProfile"//"@allTests"//"@koocreationfull"//"@KooDetailView"//"@ProfileSection"
        ,publish = true
 
)

public class MyRunnerTest {	

   /* @BeforeClass
    public static void initialize() throws Exception {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();


        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        new DriverManager().initializeDriver();
    }

    @AfterClass
    public static void quit(){
        DriverManager ;'/
?getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
    }*/
}
