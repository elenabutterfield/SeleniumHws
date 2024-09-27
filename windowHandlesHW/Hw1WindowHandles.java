package windowHandlesHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Hw1WindowHandles {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");

        WebElement b1= driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        b1.click();
        Thread.sleep(2000);
        String mainWindowHandle= driver.getWindowHandle();
        Set<String> allWindowHandles= driver.getWindowHandles();
        for(String handle:allWindowHandles){
            if(!handle.equals(mainWindowHandle)){
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(2000);

        WebElement textElementB1= driver.findElement(By.xpath("//h2[text()='Welcome to B1! page']"));
        String textB1= textElementB1.getText();
        if(textB1.contains("Welcome to B1! page")){
            System.out.println(textB1);
        }else{
            System.out.println("Text verification for B1 failed: " + textB1);
        }
        driver.close();
        driver.switchTo().window(mainWindowHandle);
        Thread.sleep(2000);

        WebElement b2 = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        b2.click();
        Thread.sleep(2000);
        allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(2000);

        WebElement textElementB2= driver.findElement(By.xpath("//h2[text()='Welcome to B2 page']"));
        String textB2= textElementB2.getText();
        if(textB2.contains("Welcome to B2 page")){
            System.out.println(textB2);
        }else{
            System.out.println("Text verification for B2 failed: " + textB2);
        }
        driver.close();
        driver.switchTo().window(mainWindowHandle);

        driver.quit();


    }
}
