package com.arlosoft.macrodroid.pageobjects.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.wrappers.MobileTestWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacrosMobilePage extends AbstractMobilePage {

    private static final Logger logger = LogManager.getLogger(MacrosMobilePage.class.getSimpleName());

    private static String addMacroButton = "//*[@content-desc='Add Macro']";
    private static String addTriggerButton = "//*[@content-desc=\"Add Trigger\"]";
    private static String addActionButton = "//*[@content-desc=\"Add Action\"]";
    private static String addConstraintButton = "//*[@content-desc=\"Add constraint\"]";
    private static String triggerName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/triggersList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_name\"]";
    private static String triggerDetail = "//*[@resource-id=\"com.arlosoft.macrodroid:id/triggersList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_detail\"]";
    private static String actionName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/actionsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_name\"]";
    private static String actionDetail = "//*[@resource-id=\"com.arlosoft.macrodroid:id/actionsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_detail\"]";
    private static String constraintName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/constraintsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_name\"]";
    private static String constraintDetail = "//*[@resource-id=\"com.arlosoft.macrodroid:id/constraintsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_detail\"]";
    private static String localVariablesButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/localVarsLabel\"]";
    private static String addLocalVariableButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/addVariableButton\"]";
    private static String localVariableName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/localVarsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_name\"]";
    private static String localVariableValue = "//*[@resource-id=\"com.arlosoft.macrodroid:id/localVarsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_detail\"]";

    public MacrosMobilePage(MobileTestWrapper mobileTestWrapper) {
        super(mobileTestWrapper);
    }

    public TriggerMobilePage tapOnAddTriggerButton() throws AutomationException {
        logger.info("Tap on 'Add trigger' button");
        mobileTestWrapper.clickControl(addTriggerButton);
        return new TriggerMobilePage(mobileTestWrapper);
    }

    public ActionMobilePage tapOnAddActionButton() throws AutomationException {
        logger.info("Tap on 'Add action' button");
        mobileTestWrapper.clickControl(addActionButton);
        return new ActionMobilePage(mobileTestWrapper);
    }

    public ConstraintMobilePage tapOnAddConstraintButton() throws AutomationException {
        logger.info("Tap on 'Add constraint' button");
        mobileTestWrapper.clickControl(addConstraintButton);
        return new ConstraintMobilePage(mobileTestWrapper);
    }

    public void tapOnLocalVariablesButton() throws AutomationException {
        logger.info("Tap on 'Local variable' button");
        mobileTestWrapper.clickControl(localVariablesButton);
    }

    public void tapOnAddLocalVariableButton() throws AutomationException {
        logger.info("Tap on 'Add Local variable' button");
        mobileTestWrapper.clickControl(addLocalVariableButton);
    }


    public void tapOnLocalVariableNameItem() throws AutomationException {
        logger.info("Tap on local variable name item");
        mobileTestWrapper.clickControl(localVariableName);
    }

    public void validateTriggerName(String name) throws AutomationException {
        logger.info("Validate trigger name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(triggerName), name);
    }

    public void validateTriggerDetail(String detail) throws AutomationException {
        logger.info("Validate trigger detail: {}", detail);
        validateTextEquals(mobileTestWrapper.getText(triggerDetail), detail);
    }

    public void validateActionName(String name) throws AutomationException {
        logger.info("Validate action name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(actionName), name);
    }

    public void validateActionDetail(String detail) throws AutomationException {
        logger.info("Validate action detail: {}", detail);
        validateTextEquals(mobileTestWrapper.getText(actionDetail), detail);
    }

    public void validateConstraintName(String name) throws AutomationException {
        logger.info("Validate constraint name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(constraintName), name);
    }

    public void validateConstraintDetail(String detail) throws AutomationException {
        logger.info("Validate constraint detail: {}", detail);
        validateTextEquals(mobileTestWrapper.getText(constraintDetail), detail);
    }

    public void validateLocalVariableName(String name) throws AutomationException {
        logger.info("Validate local variable name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(localVariableName), name);
    }

    public void validateLocalVariableValue(String value) throws AutomationException {
        logger.info("Validate local variable value: {}", value);
        validateTextEquals(mobileTestWrapper.getText(localVariableValue), value);
    }



}
