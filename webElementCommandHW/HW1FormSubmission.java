package webElementCommandHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class HW1FormSubmission {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement text= driver.findElement(By.xpath("//div[@id='textattr']"));
        String textOfString= text.getText();
        System.out.println(textOfString);

        WebElement radioButton1= driver.findElement(By.xpath("//input[@value='music_festival']"));
        boolean stateOfRb= radioButton1.isEnabled();
        System.out.println(stateOfRb);
        radioButton1.click();

        WebElement radioButton2= driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean stateOfRb2= radioButton2.isEnabled();
        System.out.println(stateOfRb2);

        WebElement button= driver.findElement(By.xpath("//button[@onclick='toggleHiddenRadio(event)']"));
        button.click();

        WebElement radioButton3= driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']"));
        boolean displayChekbox3= radioButton3.isDisplayed();
        if(displayChekbox3){
            System.out.println("is displayed");
        }else{
            System.out.println("isn't displayed");
        }
        radioButton3.click();

        WebElement textElement= driver.findElement(By.xpath("//div[@title='Hover over me to reveal the secert']"));
        String text1=textElement.getText();
        System.out.println(text1);

        WebElement checkbox1= driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean stateOfCheckbox= checkbox1.isEnabled();
        System.out.println(stateOfCheckbox);
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean stateOfCheckbox2=checkbox2.isEnabled();
        System.out.println(stateOfCheckbox2);

        WebElement inputBox= driver.findElement(By.xpath("//input[@id='inputField']"));
        inputBox.clear();
        inputBox.sendKeys("here is the custom text entered");

    }
}
