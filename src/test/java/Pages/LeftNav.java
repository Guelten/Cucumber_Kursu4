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

        @FindBy(xpath = "(//span[text()='Fees'])[1]")
        private WebElement feesSetup;

        @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
        private WebElement entranceExamsOne;

        @FindBy(xpath = "(//span[text()='Setup'])[2]")
        private WebElement setupTwo;

        @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
        private WebElement entranceExamsTwo;

        @FindBy(xpath = "(//span[text()='Human Resources'])")
        private WebElement humanResources;

        @FindBy(xpath = "(//span[text()='Employees'])")
        private WebElement employees;


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
                case "feesSetup" : myElement = feesSetup;break;
                case "entranceExamsOne" : myElement = entranceExamsOne;break;
                case "setupTwo" : myElement = setupTwo;break;
                case "entranceExamsTwo" : myElement = entranceExamsTwo;break;
                case "humanResources" : myElement = humanResources;break;
                case "employees" : myElement = employees;break;
            }

            clickFunction(myElement);
        }


}
