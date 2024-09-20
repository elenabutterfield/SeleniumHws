package XpathHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1FormSubmission {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

       WebElement hobby = driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
       hobby.sendKeys("Java");

        WebElement clickBtn= driver.findElement(By.xpath("//button[@id='display_text']"));
        clickBtn.click();

        WebElement movie= driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        movie.sendKeys("Matrix");

        WebElement text= driver.findElement(By.xpath("//label[contains(text(),'amet consectetur adipisicing')]"));
        String textOfString=text.getText();
        System.out.println(textOfString);

        WebElement city= driver.findElement(By.xpath("//input[@name='yourCity']"));
        city.sendKeys("Vegas");

        WebElement personalEmail= driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        personalEmail.sendKeys("123321@gmail.com");

        WebElement officeEmail= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        officeEmail.sendKeys("123456@gmail.com");

        WebElement professionalEmail= driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        professionalEmail.sendKeys("654321@gmail.com");

        WebElement clientName= driver.findElement(By.xpath("//input[@data-detail='one'and@name='clientName']"));
        clientName.sendKeys("Johnny");

        WebElement clientID = driver.findElement(By.xpath("//input[@data-detail='two'and@name='clientId']"));
        clientID.sendKeys("Johnny Depp");

        WebElement streetNo= driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("5th Ave");

        WebElement houseNo= driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNo.sendKeys("500");

    }
}
