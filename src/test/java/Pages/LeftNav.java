package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav()
    {
        PageFactory.initElements(GWD.getDriver(), this);
    }

        @FindBy(xpath ="(//span[text()='Setup'])[1]")
        private WebElement setupOne;

        @FindBy(xpath ="(//span[text()='Parameters'])")
        private WebElement parameters;

        @FindBy(xpath ="(//span[text()='Countries'])[1]")
        private WebElement countries;

        @FindBy(xpath ="(//span[text()='Citizenships'])[1]")
        private WebElement citizenShips;

        @FindBy(xpath = "//span[text()='Nationalities']")
        private WebElement nationalities;

        WebElement myElement;

        public void findAndClick(String strElement)
        {
            //element get :burda string isimden weblemente ulaşıcam
            switch (strElement)
            {
                case "setupOne" : myElement = setupOne;break;
                case "parameters" : myElement = parameters;break;
                case "countries" : myElement = countries;break;
                case "citizenShips" : myElement = citizenShips;break;
                case "nationalities" : myElement = nationalities;break;
            }

            clickFunction(myElement);
        }


}
