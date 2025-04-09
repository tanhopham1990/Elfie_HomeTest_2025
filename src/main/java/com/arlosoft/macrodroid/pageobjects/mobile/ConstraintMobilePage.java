package com.arlosoft.macrodroid.pageobjects.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.wrappers.MobileTestWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstraintMobilePage extends AbstractMobilePage {
    private static final Logger logger = LogManager.getLogger(ActionMobilePage.class.getSimpleName());

    private static String deviceStateCategory = "//*[@resource-id=\"com.arlosoft.macrodroid:id/category_name\" and @text=\"Device State\"]";
    private static String airplaneModeItem = "//*[@resource-id=\"com.arlosoft.macrodroid:id/select_item_name\" and @text=\"Airplane Mode\"]";
    private static String airplaneModeDisabledOption = "//*[@resource-id=\"android:id/text1\" and @text=\"Airplane Mode Disabled\"]";

    public  ConstraintMobilePage(MobileTestWrapper mobileTestWrapper) {
        super(mobileTestWrapper);
    }

    public void tapOnDeviceStateCategory() throws AutomationException {
        logger.info("Tap on 'Device State' category");
        mobileTestWrapper.clickControl(deviceStateCategory);
    }

    public void tapOnAirplaneModeItem() throws AutomationException {
        logger.info("Tap on 'Airplane mode' item");
        mobileTestWrapper.clickControl(airplaneModeItem);
    }

    public void tapOnAirplaneModeDisabledOption() throws AutomationException {
        logger.info("Tap on 'Airplane mode disabled' option");
        mobileTestWrapper.clickControl(airplaneModeDisabledOption);
    }
}
