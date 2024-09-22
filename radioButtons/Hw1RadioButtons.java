package radioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw1RadioButtons {
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php ");

            WebElement beverages= driver.findElement(By.xpath("//input[@value='Juice']"));
            beverages.click();

            List<WebElement> workingEnvironment=driver.findElements(By.xpath("//input[@name='working_enviroment']"));
            for (WebElement wE: workingEnvironment ){
                if(wE.getAttribute("value").equals("hybrid")){
                    wE.click();
                }
            }
            WebElement rBSpring= driver.findElement(By.xpath("//input[@value='spring']"));
            WebElement rBEnable= driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
            if (!rBSpring.isEnabled()){
                rBEnable.click();
            }
            if(rBSpring.isEnabled()){
                rBSpring.click();
            }
            WebElement rBWinter= driver.findElement(By.xpath("//input[@value='winter']"));
            WebElement showButton= driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
            if(!rBWinter.isDisplayed()){
                showButton.click();
            }
            if(rBWinter.isDisplayed() && rBWinter.isEnabled()){
                rBWinter.click();
            }
            List<WebElement> radioButtons= driver.findElements(By.xpath("//input[@name='meal']"));
            for(WebElement radioButton: radioButtons){
                if(radioButton.getAttribute("value").equals("lunch")){
                    Thread.sleep(2000);
                    radioButton.click();
                    break;
                }
            }


        }
}
