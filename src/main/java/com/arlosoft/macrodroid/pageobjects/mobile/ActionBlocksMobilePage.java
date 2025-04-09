package com.arlosoft.macrodroid.pageobjects.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import com.arlosoft.macrodroid.wrappers.MobileTestWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActionBlocksMobilePage extends AbstractMobilePage {
    private static final Logger logger = LogManager.getLogger(ActionBlocksMobilePage.class.getSimpleName());

    private static String addButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/fab\"]";
    private static String actionBlockNameTextField = "//*[@resource-id=\"com.arlosoft.macrodroid:id/actionBlockNameText\"]";
    private static String actionBlockDescriptionTextField = "//*[@resource-id=\"com.arlosoft.macrodroid:id/description\"]";
    private static String addInputVariableButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/addInputVariableButton\"]";
    private static String inputCollapseButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/inputCollapseExpandButton\"]";
    private static String inputVariableName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/inputVarsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_name\"]";
    private static String inputVariableValue = "//*[@resource-id=\"com.arlosoft.macrodroid:id/inputVarsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_detail\"]";
    private static String addActionButton = "//*[@content-desc=\"Add Action\"]";
    private static String addOutputVariableButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/addOutputVariableButton\"]";
    private static String outputCollapseButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/outputCollapseExpandButton\"]";
    private static String outputVariableName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/outputVarsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_name\"]";
    private static String outputVariableValue = "//*[@resource-id=\"com.arlosoft.macrodroid:id/outputVarsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_detail\"]";
    private static String actionName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/actionsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_name\"]";
    private static String actionDetail = "//*[@resource-id=\"com.arlosoft.macrodroid:id/actionsList\"]//*[@resource-id=\"com.arlosoft.macrodroid:id/macro_edit_entry_detail\"]";
    private static String acceptButton = "//*[@content-desc=\"Accept\"]";
    private static String actionBlockName = "//*[@resource-id=\"com.arlosoft.macrodroid:id/name\"]";
    private static String actionBlockDescription = "//*[@resource-id=\"com.arlosoft.macrodroid:id/description\"]";
    
    public ActionBlocksMobilePage(MobileTestWrapper mobileTestWrapper) {
        super(mobileTestWrapper);
    }

    public void tapOnAddButton() throws AutomationException {
        logger.info("Tap on Add button");
        mobileTestWrapper.clickControl(addButton);
    }

    public void enterActionBlockName(String name) throws AutomationException {
        logger.info("Enter action block name: {}", name);
        mobileTestWrapper.inputText(actionBlockNameTextField, name);
    }

    public void enterActionBlockDescription(String description) throws AutomationException {
        logger.info("Enter action block description: {}", description);
        mobileTestWrapper.inputText(actionBlockDescriptionTextField, description);
    }

    public void tapOnAddInputVariableButton() throws AutomationException {
        logger.info("Tap on add input variable button");
        mobileTestWrapper.clickControl(addInputVariableButton);
    }

    public void tapOnInputCollapseButton() throws AutomationException {
        logger.info("Tap on input collapse button");
        mobileTestWrapper.clickControl(inputCollapseButton);
    }

    public void tapOnInputVariableNameItem() throws AutomationException {
        logger.info("Tap on input variable name item");
        mobileTestWrapper.clickControl(inputVariableName);
    }

    public ActionMobilePage tapOnAddActionButton() throws AutomationException {
        logger.info("Tap on add actions button");
        mobileTestWrapper.clickControl(addActionButton);
        return new ActionMobilePage(mobileTestWrapper);
    }

    public void tapOnAddOutputVariableButton() throws AutomationException {
        logger.info("Tap on add output variable button");
        mobileTestWrapper.clickControl(addOutputVariableButton);
    }

    public void tapOnOutputCollapseButton() throws AutomationException {
        logger.info("Tap on output collapse button");
        mobileTestWrapper.clickControl(outputCollapseButton);
    }

    public void tapOnOutputVariableNameItem() throws AutomationException {
        logger.info("Tap on output variable name item");
        mobileTestWrapper.clickControl(outputVariableName);
    }
    
    public void tapOnAcceptButton() throws AutomationException {
        logger.info("Tap on Accept button");
        mobileTestWrapper.clickControl(acceptButton);
    }

    public void validateInputVariableName(String name) throws AutomationException {
        logger.info("Validate input variable name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(inputVariableName), name);
    }

    public void validateInputVariableDetail(String detail) throws AutomationException {
        logger.info("Validate input variable detail: {}", detail);
        validateTextEquals(mobileTestWrapper.getText(inputVariableValue), detail);
    }

    public void validateActionName(String name) throws AutomationException {
        logger.info("Validate action name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(actionName), name);
    }

    public void validateActionDetail(String detail) throws AutomationException {
        logger.info("Validate action detail: {}", detail);
        validateTextEquals(mobileTestWrapper.getText(actionDetail), detail);
    }

    public void validateOutputVariableName(String name) throws AutomationException {
        logger.info("Validate output variable name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(outputVariableName), name);
    }

    public void validateOutputVariableDetail(String detail) throws AutomationException {
        logger.info("Validate output variable detail: {}", detail);
        validateTextEquals(mobileTestWrapper.getText(outputVariableValue), detail);
    }

    public void validateActionBlockName(String name) throws AutomationException {
        logger.info("Validate action block name: {}", name);
        validateTextEquals(mobileTestWrapper.getText(actionBlockName), name);
    }

    public void validateActionBlockDescription(String description) throws AutomationException {
        logger.info("Validate action block description: {}", description);
        validateTextEquals(mobileTestWrapper.getText(actionBlockDescription), description);
    }

}
