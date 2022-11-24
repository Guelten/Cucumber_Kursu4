package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css="input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    private WebElement password;


    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    WebElement myElement;

    public void findAndSend(String strElement, String value)
    {
        //element get : burda string isimden webelemente ulasacam
        switch (strElement)
        {
            case "username" : myElement = username;break;
            case "password" : myElement = password;break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement)
    {
        //element get : burda string isimden webelemente ulasacam
        switch (strElement)
        {
            case "loginButton" : myElement = loginButton;break;
        }

        clickFunction(myElement);
    }


    public void findAndContainsText(String strElement, String text)
    {
        //element get : burda string isimden webelemente ulasacam
        switch (strElement)
        {
            case "txtTechnoStudy" : myElement = txtTechnoStudy;break;
        }

        verifyContainsTextFunction(myElement, text);
    }




}
