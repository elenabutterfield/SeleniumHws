package dropDownHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw1DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select dropdown=new Select(dropdownElement);
        dropdown.selectByVisibleText("Pear");
        List<WebElement> options = dropdown.getOptions();
        for(WebElement option: options){
            System.out.println(option.getText());
        }

        WebElement dropdownElements = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select dropdown1= new Select(dropdownElements);
        if (dropdown1.isMultiple()){
            System.out.println("The dropdown is multi-select");
        }else{
            System.out.println("The dropdown is not multi-select");
        }
        dropdown1.selectByVisibleText("Traveling");
        dropdown1.selectByVisibleText("Cooking");
        dropdown1.selectByVisibleText("Gardening");

        WebElement getAllSelected= driver.findElement(By.xpath("//button[@id='get_all']"));
        getAllSelected.click();

        List<WebElement> selectedOptions = dropdown1.getAllSelectedOptions();
        System.out.println("Selected options:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        Thread.sleep(5000);
        dropdown1.deselectByVisibleText("Traveling");
        getAllSelected.click();

        selectedOptions = dropdown1.getAllSelectedOptions();
        System.out.println("Selected options after deselecting 'Traveling':");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
driver.quit();
    }
}
