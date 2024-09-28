package implicitWaitHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Hw1ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement b= driver.findElement(By.xpath("//button[@id='show_text_synchronize_three']"));
        b.click();
        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement checkbox: checkboxes){
            if(checkbox.getAttribute("value").equals("Option-1")){
                checkbox.click();
                break;
            }
        }
    }
}
