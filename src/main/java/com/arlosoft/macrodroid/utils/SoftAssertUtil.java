package com.arlosoft.macrodroid.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

public class SoftAssertUtil {

    private static final Logger logger = LogManager.getLogger(SoftAssertUtil.class.getSimpleName());

    private static SoftAssert softAssert;

    public static SoftAssert createInstance() {
        if (softAssert == null) {
            softAssert = new SoftAssert();
        }
        return softAssert;
    }

    public static void validateTextEquals(String actualText, String expectedText) {
        logger.info("Validating text equals: Expected [{}], Actual [{}]", expectedText, actualText);

        boolean isMatch = actualText.equals(expectedText);
        if (isMatch) {
            ExtentManager.log("Text matched: " + actualText);
        } else {
            ExtentManager.fail("Text mismatch! Expected: " + expectedText + ", Actual: " + actualText, null);
            softAssert.fail("Text mismatch! Expected: " + expectedText + ", Actual: " + actualText);
        }
    }

    public static void assertAll() {
        logger.info("Executing assertAll()");
        softAssert.assertAll();
    }

}
