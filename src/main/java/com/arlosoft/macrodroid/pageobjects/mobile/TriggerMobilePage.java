package com.arlosoft.macrodroid.pageobjects.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.wrappers.MobileTestWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriggerMobilePage extends AbstractMobilePage {

    private static final Logger logger = LogManager.getLogger(TriggerMobilePage.class.getSimpleName());

    private static String applicationsCategory = "//*[@resource-id=\"com.arlosoft.macrodroid:id/category_name\" and @text=\"Applications\"]";
    private static String appInstallRemovalUpdateItem = "//*[@resource-id=\"com.arlosoft.macrodroid:id/select_item_name\" and @text=\"App Install/Remove/Update\"]";
    private static String applicationRemovedOption = "//*[@resource-id=\"android:id/text1\" and @text=\"Application Removed\"]";
    private static String anyApplicationOption = "//*[@resource-id=\"android:id/text1\" and @text=\"Any Application\"]";

    public TriggerMobilePage(MobileTestWrapper mobileTestWrapper) {
        super(mobileTestWrapper);
    }

    public void tapOnApplicationsCategory() throws AutomationException {
        logger.info("Tap on 'Applications' category");
        mobileTestWrapper.clickControl(applicationsCategory);
    }

    public void tapOnAppInstallRemovalUpdateItem() throws AutomationException {
        logger.info("Tap on 'App Install/Removal/Update' item");
        mobileTestWrapper.clickControl(appInstallRemovalUpdateItem);
    }

    public void tapOnApplicationRemovedOption() throws AutomationException {
        logger.info("Tap on 'Application Removed' option");
        mobileTestWrapper.clickControl(applicationRemovedOption);
    }

    public void tapOnAnyApplicationOption() throws AutomationException {
        logger.info("Tap on 'Any Application' item");
        mobileTestWrapper.clickControl(anyApplicationOption);
    }

}
