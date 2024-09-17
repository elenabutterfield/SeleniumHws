package locatorHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1FormSubmission {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

        WebElement fullName=driver.findElement(By.id("fullName"));
        fullName.sendKeys("shdjk");

        WebElement email=driver.findElement(By.name("yourEmail"));
        email.sendKeys("bdjk@gmail.com");

        WebElement clientName= driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("sdkfk");

        WebElement clientId= driver.findElement(By.id("ClientId"));
        clientId.sendKeys("djr");

        WebElement clientFeedbackId= driver.findElement(By.id("ClientfeedbackId"));
        clientFeedbackId.sendKeys("lkghdgwr");

        WebElement projectName= driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("absdhd mfgkjhlk");

        WebElement projectDeadLine= driver.findElement(By.id("ProjectTimeId"));
        projectDeadLine.sendKeys("sgdhd");

        WebElement currentAddress= driver.findElement(By.name("CurrentAddress"));
        currentAddress.sendKeys("dfdg dhdfjf dgfjfl");

        WebElement permanentAddress= driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys("ryrtythfkgh dhdh");

        WebElement submitBtn= driver.findElement(By.name("btn-submit"));
        submitBtn.click();

        WebElement link= driver.findElement(By.linkText("Click Here."));
        link.click();



    }
}
