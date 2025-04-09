package com.arlosoft.macrodroid.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.pageobjects.mobile.*;
import com.arlosoft.macrodroid.utils.ExtentManager;
import org.testng.annotations.Test;

public class TC001_Mobile_AddNewMacro extends MobileTestCaseBase {

    @Test
    public void verifyAddNewMacroSuccessfully() throws AutomationException {
        ExtentManager.createTest("Verify add new macro successfully.");

        ExtentManager.log("1. Open application");
        DashboardMobilePage dashboardMobilePage = openArlosoftApp();

        ExtentManager.log("2. On Dashboard Page, tap on click Macro");
        MacrosMobilePage macrosMobilePage = dashboardMobilePage.tapOnAddMacroButton();

        ExtentManager.log("3. On Macro Page, tap on Trigger to add a trigger");
        TriggerMobilePage triggerMobilePage = macrosMobilePage.tapOnAddTriggerButton();

        ExtentManager.log("4. On Trigger Page, tap on Application");
        triggerMobilePage.tapOnApplicationsCategory();

        ExtentManager.log("5. Tap on App Install/Remove/Update");
        triggerMobilePage.tapOnAppInstallRemovalUpdateItem();

        ExtentManager.log("6. Select Application Removed radio button");
        triggerMobilePage.tapOnApplicationRemovedOption();
        triggerMobilePage.tapOnOkButton();

        ExtentManager.log("7. Select Any Application and OK");
        triggerMobilePage.tapOnAnyApplicationOption();
        triggerMobilePage.tapOnOkButton();

        ExtentManager.log("The Trigger Macro should show correct added values");
        macrosMobilePage.validateTriggerName("Application Removed");
        macrosMobilePage.validateTriggerDetail("Any Application");

        ExtentManager.log("8. On Macro Page, tap on Action to add an action");
        ActionMobilePage actionMobilePage = macrosMobilePage.tapOnAddActionButton();

        ExtentManager.log("9. On Action page, tap on Logging");
        actionMobilePage.tapOnLoggingCategory();

        ExtentManager.log("10. Select Clear Log");
        actionMobilePage.tapOnClearLogItem();

        ExtentManager.log("11. Select System Log and OK");
        actionMobilePage.tapOnSystemLogOption();
        actionMobilePage.tapOnOkButton();

        ExtentManager.log("The Action Macro should show correct added values");
        macrosMobilePage.validateActionName("Clear Log");
        macrosMobilePage.validateActionDetail("System Log");

        ExtentManager.log("12. On Macro Page, tap on Constrains to add an contrains");
        ConstraintMobilePage constraintMobilePage = macrosMobilePage.tapOnAddConstraintButton();

        ExtentManager.log("13. Select Device State");
        constraintMobilePage.tapOnDeviceStateCategory();

        ExtentManager.log("14. Select Airplan Mode");
        constraintMobilePage.tapOnAirplaneModeItem();

        ExtentManager.log("15. Select Airplan Mode Disable and OK");
        constraintMobilePage.tapOnAirplaneModeDisabledOption();
        constraintMobilePage.tapOnOkButton();

        ExtentManager.log("The Contrains should show correct added values");
        macrosMobilePage.validateConstraintName("Airplane Mode Disabled");

        ExtentManager.log("16. On Macro Page, select add Local Variable");
        macrosMobilePage.tapOnLocalVariablesButton();
        macrosMobilePage.tapOnAddLocalVariableButton();

        ExtentManager.log("17. Add an Interger Variable with Name “Test Case”");
        macrosMobilePage.enterVariableName("Test Case");
        macrosMobilePage.selectVariableType("Integer");
        macrosMobilePage.tapOnOkButton();

        ExtentManager.log("Select new added Variable, and input Value 1");
        macrosMobilePage.tapOnLocalVariableNameItem();
        macrosMobilePage.enterVariableValue("1");
        macrosMobilePage.tapOnOkButton();

        ExtentManager.log("The Local Varialbe should show correct added values");
        macrosMobilePage.validateLocalVariableName("Test Case");
        macrosMobilePage.validateLocalVariableValue("1");
    }
}
