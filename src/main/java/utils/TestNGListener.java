package utils;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static utils.WebDriverSingleton.getDriver;

public class TestNGListener implements ITestListener {
    private static final Logger LOG = Logger.getLogger(String.valueOf(TestNGListener.class));

    @Override
    public void onTestFailure(ITestResult result) {
        printScreenshot();
    }

    @Override
    public void onStart(ITestContext testContext) {
        LOG.info(String.format("Test Case started: %s", testContext.getName()));
    }

    @Override
    public void onFinish(ITestContext testContext) {
        LOG.info(String.format("Test Case ended: %s", testContext.getName()));
    }

    public void printScreenshot() {
        Date dateNow = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd__HH-mm-ss");
        String fileName = format1.format(dateNow) + ".png";
        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("D:\\Screenshots\\" + fileName));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


}
