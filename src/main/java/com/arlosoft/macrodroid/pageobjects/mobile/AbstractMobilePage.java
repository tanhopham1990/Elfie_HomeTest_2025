package com.arlosoft.macrodroid.pageobjects.mobile;

import com.arlosoft.macrodroid.exception.AutomationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.arlosoft.macrodroid.wrappers.MobileTestWrapper;

public class AbstractMobilePage {

    private static final Logger logger = LogManager.getLogger(AbstractMobilePage.class.getSimpleName());

    protected MobileTestWrapper mobileTestWrapper;

    protected static String skipButton = "//*[@resource-id=\"com.arlosoft.macrodroid:id/button_skip\"]";
    protected static String backButton = "//*[@content-desc=\"Navigate up\"]";
    protected static String okButton = "//*[@resource-id=\"android:id/button1\" or @resource-id=\"com.arlosoft.macrodroid:id/okButton\"]";
    protected static String variableNameTextField = "//*[@resource-id=\"com.arlosoft.macrodroid:id/variable_new_variable_dialog_name\"]";
    protected static String variableValueTextField = "//*[@resource-id=\"com.arlosoft.macrodroid:id/enter_variable_dialog_value\"]";
    protected static String variableTypeDropdown = "//*[@resource-id=\"com.arlosoft.macrodroid:id/variable_new_variable_type_spinner\"]";
    protected static String variableTypeDropdownItem = "//*[@resource-id=\"android:id/text1\" and @text=\"%s\"]";
    protected static String trueRadio = "//*[@resource-id=\"com.arlosoft.macrodroid:id/trueRadio\"]";
    protected static String falseRadio = "//*[@resource-id=\"com.arlosoft.macrodroid:id/falseRadio\"]";

    public AbstractMobilePage(MobileTestWrapper mobileTestWrapper) {
        this.mobileTestWrapper = mobileTestWrapper;
    }

    public void tapOnSkipButton() throws AutomationException {
        logger.info("Tap on Skip button");
        mobileTestWrapper.clickControl(skipButton);
    }

    public void tapOnBackButton() throws AutomationException {
        logger.info("Tap on Back button");
        mobileTestWrapper.clickControl(backButton);
    }

    public void tapOnOkButton() throws AutomationException {
        logger.info("Tap on 'OK' button");
        mobileTestWrapper.clickControl(okButton);
    }

    public void enterVariableName(String variableName) throws AutomationException {
        logger.info("Enter local variable name: {}", variableName);
        mobileTestWrapper.inputText(variableNameTextField, variableName);
    }

    public void enterVariableValue(String value) throws AutomationException {
        logger.info("Enter local variable value: {}", value);
        mobileTestWrapper.inputText(variableValueTextField, value);
    }

    public void tapOnVariableTypeDropdown() throws AutomationException {
        logger.info("Tap on variable type dropdown");
        mobileTestWrapper.clickControl(variableTypeDropdown);
    }

    public void tapOnVariableTypeDropdownItem(String item) throws AutomationException {
        logger.info("Tap on variable type dropdown item: {}", item);
        mobileTestWrapper.clickControl(String.format(variableTypeDropdownItem, item));
    }

    public void selectVariableType(String item) throws AutomationException {
        tapOnVariableTypeDropdown();
        tapOnVariableTypeDropdownItem(item);
    }

    public void tapOnTrueRadioOption() throws AutomationException {
        logger.info("Tap on True radio button");
        mobileTestWrapper.clickControl(trueRadio);
    }

    public void validateTextEquals(String actualText, String expectedText) throws AutomationException {
        logger.info("Validate text equals [{}]", expectedText);
        if (!actualText.equals(expectedText)) {
            throw new AutomationException("Actual text: [%s] / Expected text: [%s]", actualText, expectedText);
        }
    }

}
