package advancedXpathHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1FormSubmission {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement book1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        book1.sendKeys("The Great Gatsby");

        WebElement book2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        book2.sendKeys("Hamlet");

        WebElement book3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        book3.sendKeys("One Hundred Years of Solitude");

        WebElement favBook1= driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favBook1.sendKeys("1984");

        WebElement favBook2= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favBook2.sendKeys("Slaughterhouse-Five");

        WebElement favBook3= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favBook3.sendKeys("To Kill a Mockingbird");

        WebElement familyTree1= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        familyTree1.sendKeys("grandparent");

        WebElement familyTree2= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        familyTree2.sendKeys("parent");

        WebElement familyTree3= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        familyTree3.sendKeys("child");


    }
}
