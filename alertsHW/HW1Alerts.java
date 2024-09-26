package alertsHW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Alerts {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo-homework.php");

        WebElement alert= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert.click();
        Thread.sleep(2000);
        Alert alert1=driver.switchTo().alert();
        alert1.accept();

        WebElement alertDelete= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertDelete.click();
        Thread.sleep(2000);
        alert1.dismiss();
        WebElement statusMessage= driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        System.out.println(statusMessage.getText());

        WebElement alertEnter= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertEnter.click();

        alert1.sendKeys("Name");
        alert1.accept();
        WebElement name= driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        System.out.println(name.getText());

    }
}