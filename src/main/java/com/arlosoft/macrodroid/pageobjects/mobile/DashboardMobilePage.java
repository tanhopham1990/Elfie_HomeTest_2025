package com.arlosoft.macrodroid.pageobjects.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.wrappers.MobileTestWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DashboardMobilePage extends AbstractMobilePage {

    private static final Logger logger = LogManager.getLogger(DashboardMobilePage.class.getSimpleName());

    private static String addMacroButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/title\" and @text=\"Add Macro\"]";
    private static String actionBlockButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/title\" and @text=\"Action Blocks\"]";

    public DashboardMobilePage(MobileTestWrapper mobileTestWrapper) throws AutomationException {
        super(mobileTestWrapper);
        if (mobileTestWrapper.isElementPresentNoErrorThrown(skipButton, 3)) {
            tapOnSkipButton();
        }
        if (mobileTestWrapper.isElementPresentNoErrorThrown(backButton, 3)) {
            tapOnBackButton();
        }
    }

    public MacrosMobilePage tapOnAddMacroButton() throws AutomationException {
        logger.info("Tap on 'Add Macro' button");
        mobileTestWrapper.clickControl(addMacroButton);
        return new MacrosMobilePage(mobileTestWrapper);
    }

    public ActionBlocksMobilePage tapOnActionBlocksButton() throws AutomationException {
        logger.info("Tap on 'Action Blocks' button");
        mobileTestWrapper.clickControl(actionBlockButton);
        return new ActionBlocksMobilePage(mobileTestWrapper);
    }

}
