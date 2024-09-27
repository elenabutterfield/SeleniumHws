package explicitWaitHW;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW1ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait-homework.php");

        WebElement click= driver.findElement(By.xpath("//button[@id='changetext_button']"));
        click.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20)) ;
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
        WebElement text= driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(text.getText());

        WebElement click2= driver.findElement(By.xpath("//button[@id='enable_button']"));
        click2.click();
        WebElement enable=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-default'])[3]")));
        enable.click();

        WebElement click3= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        click3.click();
        WebElement checkbox= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']")));
        boolean isChecked=checkbox.isSelected();
        System.out.println(isChecked);


    }
}
