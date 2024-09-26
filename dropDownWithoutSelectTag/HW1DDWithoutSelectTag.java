package dropDownWithoutSelectTag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1DDWithoutSelectTag {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement dropdownElement = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        dropdownElement.click();

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

        for (WebElement option : options) {
            String optionText=option.getText();
            if (optionText.equals("Mango")) {
                Thread.sleep(2000);
                option.click();
                break;
            }
        }
        WebElement dropdownElement1 = driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        dropdownElement1.click();

        List<WebElement> options1 =driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));

        for(WebElement option1: options1){
            String optionText1=option1.getText();
            if(optionText1.equals("Reading")){
                Thread.sleep(2000);
                option1.click();
                break;
            }
        }
    }
}