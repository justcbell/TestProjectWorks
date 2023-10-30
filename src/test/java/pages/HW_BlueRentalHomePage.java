package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HW_BlueRentalHomePage {
    public HW_BlueRentalHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement login;
}
