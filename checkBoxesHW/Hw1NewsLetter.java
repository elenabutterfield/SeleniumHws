package checkBoxesHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw1NewsLetter {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement checkBox= driver.findElement(By.xpath("//input[@id='newsletter']"));
        if(checkBox.isEnabled()){
            checkBox.click();
        }
        List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@class='cb-element']"));
        for(WebElement checkBox1: checkBoxes){
            String value= checkBox1.getAttribute("value");
            if(value.equals("reading") || value.equals("cooking")){
                if(!checkBox1.isSelected()){
                    checkBox1.click();
                }
            }
        }
        WebElement supportCheckbox = driver.findElement(By.xpath("//input[@value='Support']"));
        WebElement musicCheckbox = driver.findElement(By.xpath("//input[@value='Music']"));
        if (!supportCheckbox.isDisplayed() && !musicCheckbox.isDisplayed()) {
            System.out.println("Support and Music checkboxes are not displayed by default.");
        } else {
            System.out.println("One or both checkboxes are displayed by default.");
        }
        WebElement showCheckboxesButton = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
        showCheckboxesButton.click();

        musicCheckbox = driver.findElement(By.xpath("//input[@value='Music']"));

        if(!musicCheckbox.isSelected()){
            Thread.sleep(2000);
            musicCheckbox.click();
        }
        WebElement receiveNotificationsCheckbox = driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
        if(!receiveNotificationsCheckbox.isEnabled()){
            System.out.println("Receive Notifications checkbox is disabled by default.");
        }else {
            System.out.println("Receive Notifications checkbox is enabled by default.");
        }
        WebElement enableCheckboxesButton = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckboxesButton.click();
        if(!receiveNotificationsCheckbox.isSelected()) {
            receiveNotificationsCheckbox.click();
        }
        driver.quit();


    }
}
