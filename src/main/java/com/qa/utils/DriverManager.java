package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DriverManager {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();
    String env;// = "browserstack";//"headspinBYOD";
    String deviceID = "1";
    String androidAppUrl;

    public DriverManager() {

        androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator + "resources" + File.separator + "apps" + File.separator + "app-universal-preprod.apk";
    }

    public AppiumDriver getDriver(){
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
        if(System.getenv("CloudService")==null)
        {
            if(System.getProperty("runEnvironment")==null) {
                PropertyManager props = new PropertyManager();
                env = "headspinCloud";//"browserstack";//"headspinCloud";//props.getProps().getProperty("executionEnvironment");
            }
            else
            {
                env = "local";
            }
        }
        else {
            env = System.getenv("CloudService");
            System.out.println("Env from Jenkins" + env);
        }
        if(env.equals("local"))
        {
            System.out.println("Using local drivers");

            AppiumDriver driver = null;

            GlobalParams params = new GlobalParams();


            if (driver == null) {
                try {
                    switch (params.getPlatformName()) {
                        case "Android":
                            driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                            //  driver =new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                            break;
                        case "iOS":
                            driver = new IOSDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                            break;
                    }
                    if (driver == null) {
                        throw new Exception("driver is null. ABORT!!!");
                    }
                    this.driver.set(driver);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw e;
                }
            }
        }

        else if(env.equals("browserstack"))
        {
            System.out.println("Using browserstack drivers");
            AppiumDriver driver;
            String userName = "deepashreeh_Nz65RK";
            String accessKey = "Yy6yYUopzsmFoQoqX3LY";
            //String userName = System.getenv("BROWSERSTACK_USERNAME");
            // String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
            //    String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
            String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");
            //    String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
            String app = "bs://226160aa55c8176e05c2d60ddb5a3b69b8e9f067";//System.getenv("BROWSERSTACK_APP_ID");
            



            JSONObject deviceObj = new JSONObject(JsonParser.parse("Devices.json").getJSONObject(deviceID).toString());
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("device", deviceObj.getString("device"));
            caps.setCapability("os_version", deviceObj.getString("os_version"));
            caps.setCapability("project", "My First Project");
            caps.setCapability("build", buildName);
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            caps.setCapability("app", app);

            URL url = new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub");

            switch (deviceID){
                case "1":
                    driver = new AndroidDriver(url, caps);
                    break;
                case "2":
                    driver = new IOSDriver(url, caps);
                    break;
                default:
                    throw new IllegalStateException("invalid device id" + deviceID);
            }
            setDriver(driver);
        }

        else if(env.equals("headspinBYOD"))
        {
            System.out.println("Using headspin drivers");
            AppiumDriver driver;

            JSONObject deviceObj = new JSONObject(JsonParser.parse("Devices.json").getJSONObject(deviceID).toString());
            DesiredCapabilities caps = new DesiredCapabilities();


            caps.setCapability("device", "A7010a48");
            caps.setCapability("os_version", deviceObj.getString("os_version"));
            caps.setCapability("project", "My First Project");
            caps.setCapability("build", "test Headspin");
            caps.setCapability("name", "Sample Test");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
            caps.setCapability(MobileCapabilityType.UDID,"U8VOVCM7KJP7TCB6.Deepashrees-MacBook-Pro.dbc.headspin.io:64204");
            caps.setCapability("app", androidAppUrl);

            //URL url = new URL("https://dev-us-pao-3.headspin.io:7011/v0/c1c663c86b834faaafbdd54ff91f201e/wd/hub"); //Headspin device 2
            URL url = new URL("https://dev-in-bgl-1.headspin.io:3013/v0/2d1078b13b0a4b3b9e8476c0a0ad5dc4/wd/hub"); //Headspin device 1

            switch (deviceID){
                case "1":
                    driver = new AndroidDriver(url, caps);
                    break;
                case "2":
                    driver = new IOSDriver(url, caps);
                    break;
                default:
                    throw new IllegalStateException("invalid device id" + deviceID);
            }
            setDriver(driver);
        }

        else if(env.equals("headspinCloud"))
        {
            System.out.println("Using headspin Cloud drivers");
            AppiumDriver driver;
            String apkid;

            JSONObject deviceObj = new JSONObject(JsonParser.parse("Devices.json").getJSONObject(deviceID).toString());
            DesiredCapabilities caps = new DesiredCapabilities();


            caps.setCapability("device", "SM-G975F");
            caps.setCapability("os_version", deviceObj.getString("os_version"));
            caps.setCapability("project", "Android Automation");
            caps.setCapability("build", "Headspin Android Automation");
            caps.setCapability("name", "Sanity Tests");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
            caps.setCapability(MobileCapabilityType.UDID,"RZ8M2334ZAV"); //Headspin device 1
            //caps.setCapability(MobileCapabilityType.UDID,"RZ8M315209Y"); //Headspin device 2
            //Headspin performance sessions capture
            //caps.setCapability("headspin.capture","true");
            if(System.getProperty("apkid")!=null)
            {
                apkid = System.getProperty("apkid").replaceAll("^\"|\"$", "");
            }
            //use a static apk if the new apk is unavailable
            else
            {
                apkid = "3ff90db1-4129-4ebc-888a-9ddcd27d667d";
            }
            System.out.println("Apk id set : "+ apkid);
            caps.setCapability("headspin:appId",apkid);
            //caps.setCapability("appPackage","com.koo.app");
            //caps.setCapability("appActivity","com.android.settings.Settings");

            URL url = new URL("https://dev-in-bgl-1.headspin.io:3013/v0/2d1078b13b0a4b3b9e8476c0a0ad5dc4/wd/hub"); //Headspin device 1
            //URL url = new URL("https://in-del.headspin.io:7011/v0/2d1078b13b0a4b3b9e8476c0a0ad5dc4/wd/hub"); //Headspin device 2

            switch (deviceID){
                case "1":
                    driver = new AndroidDriver(url, caps);
                    break;
                case "2":
                    driver = new IOSDriver(url, caps);
                    break;
                default:
                    throw new IllegalStateException("invalid device id" + deviceID);
            }
            setDriver(driver);
        }


    }

}
