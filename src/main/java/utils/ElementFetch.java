package utils;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementFetch extends BaseTest{
    public WebElement getWebElement(String indentifierType,String indentifierValue){
        switch (indentifierType){
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(indentifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(indentifierValue));
            case "ID":
                return BaseTest.driver.findElement(By.id(indentifierValue));
            case "NAME":
                return BaseTest.driver.findElement(By.name(indentifierValue));
            default:
                return null;
        }
    }
}
