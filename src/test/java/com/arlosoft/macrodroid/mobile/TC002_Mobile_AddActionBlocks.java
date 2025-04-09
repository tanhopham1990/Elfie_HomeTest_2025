package com.arlosoft.macrodroid.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.pageobjects.mobile.ActionBlocksMobilePage;
import com.arlosoft.macrodroid.pageobjects.mobile.ActionMobilePage;
import com.arlosoft.macrodroid.pageobjects.mobile.DashboardMobilePage;
import com.arlosoft.macrodroid.utils.ExtentManager;
import org.testng.annotations.Test;

public class TC002_Mobile_AddActionBlocks extends MobileTestCaseBase {

    @Test
    public void verifyAddActionBlocksSuccessfully() throws AutomationException {
        ExtentManager.createTest("Verify add new action blocks successfully.");

        ExtentManager.log("1. Open the Macdroid application");
        DashboardMobilePage dashboardMobilePage = openArlosoftApp();

        ExtentManager.log("2. On Dashboard Page, tap on click Macro");
        ActionBlocksMobilePage actionBlocksMobilePage = dashboardMobilePage.tapOnActionBlocksButton();

        ExtentManager.log("3. On Action Blocks Page, add a action block Name");
        actionBlocksMobilePage.tapOnAddButton();
        actionBlocksMobilePage.enterActionBlockName("Block name 123");

        ExtentManager.log("4. Add a action block description");
        actionBlocksMobilePage.enterActionBlockDescription("Block description 1234");

        ExtentManager.log("5. Tap on Add button");

        ExtentManager.log("6. On Action Block Detail Page, Add on a input variable name");
        actionBlocksMobilePage.tapOnAddInputVariableButton();
        actionBlocksMobilePage.enterVariableName("Test Input Variable");

        ExtentManager.log("7. Add Boolean value and ok");
        actionBlocksMobilePage.selectVariableType("Boolean");
        actionBlocksMobilePage.tapOnOkButton();

        ExtentManager.log("8. Select new added input variable");
        actionBlocksMobilePage.tapOnInputCollapseButton();
        actionBlocksMobilePage.tapOnInputVariableNameItem();

        ExtentManager.log("9. Select the Value to True");
        actionBlocksMobilePage.tapOnTrueRadioOption();
        actionBlocksMobilePage.tapOnOkButton();

        ExtentManager.log("10. On Action Blocks Detail Page, tap on Action to add an action");
        ActionMobilePage actionMobilePage = actionBlocksMobilePage.tapOnAddActionButton();

        ExtentManager.log("11. On Action page, tap on Logging");
        actionMobilePage.tapOnLoggingCategory();

        ExtentManager.log("12. Select Clear Log");
        actionMobilePage.tapOnClearLogItem();

        ExtentManager.log("13. Select System Log and OK");
        actionMobilePage.tapOnSystemLogOption();
        actionMobilePage.tapOnOkButton();

        ExtentManager.log("14. On Action Block Detail Page, Add on a out variable name");
        actionBlocksMobilePage.tapOnAddOutputVariableButton();
        actionBlocksMobilePage.enterVariableName("Test Output Variable");

        ExtentManager.log("15. Add String value and ok");
        actionBlocksMobilePage.selectVariableType("String");
        actionBlocksMobilePage.tapOnOkButton();

        ExtentManager.log("16. Select new added output variable");
        actionBlocksMobilePage.tapOnOutputCollapseButton();
        actionBlocksMobilePage.tapOnOutputVariableNameItem();

        ExtentManager.log("17. Add String value = “ This is a testing string”");
        actionBlocksMobilePage.enterVariableValue("This is a testing string");
        actionBlocksMobilePage.tapOnOkButton();

        ExtentManager.log("18. Verify information display in Action Block detail page");
        actionBlocksMobilePage.validateInputVariableName("Test Input Variable");
        actionBlocksMobilePage.validateInputVariableDetail("Default: True");
        actionBlocksMobilePage.validateActionName("Clear Log");
        actionBlocksMobilePage.validateActionDetail("System Log");
        actionBlocksMobilePage.validateOutputVariableName("Test Output Variable");
        actionBlocksMobilePage.validateOutputVariableDetail("Default: This is a testing string");

        ExtentManager.log("19. Tap on “V” button to add the action block");
        actionBlocksMobilePage.tapOnAcceptButton();

        ExtentManager.log("20. In Action Block Page, verify the block name and action block description");
        actionBlocksMobilePage.validateActionBlockName("Block name 123");
        actionBlocksMobilePage.validateActionBlockDescription("Block description 1234");
    }
}
