package com.arlosoft.macrodroid.pageobjects.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.wrappers.MobileTestWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActionMobilePage extends AbstractMobilePage {
    private static final Logger logger = LogManager.getLogger(ActionMobilePage.class.getSimpleName());

    private static String loggingCategory = "//*[@resource-id=\"com.arlosoft.macrodroid:id/category_name\" and @text=\"Logging\"]";
    private static String clearLogItem = "//*[@resource-id=\"com.arlosoft.macrodroid:id/select_item_name\" and @text=\"Clear Log\"]";
    private static String systemLogOption = "//*[@resource-id=\"android:id/text1\" and @text=\"System Log\"]";
    private static String okButton = "//*[@resource-id=\"android:id/button1\"]";

    public ActionMobilePage(MobileTestWrapper mobileTestWrapper) {
        super(mobileTestWrapper);
    }

    public void tapOnLoggingCategory() throws AutomationException {
        logger.info("Tap on 'Logging' item");
        mobileTestWrapper.clickControl(loggingCategory);
    }

    public void tapOnClearLogItem() throws AutomationException {
        logger.info("Tap on 'Clear Log' item");
        mobileTestWrapper.clickControl(clearLogItem);
    }

    public void tapOnSystemLogOption() throws AutomationException {
        logger.info("Tap on 'System Log' option");
        mobileTestWrapper.clickControl(systemLogOption);
    }


}
