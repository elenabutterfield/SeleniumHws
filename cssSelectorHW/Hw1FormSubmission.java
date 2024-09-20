package cssSelectorHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1FormSubmission {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userID= driver.findElement(By.cssSelector("input[id='UserID']"));
        userID.sendKeys("User");

        WebElement userName= driver.findElement(By.cssSelector("input[id='UserName']"));
        userName.sendKeys("User");

        WebElement intro= driver.findElement(By.cssSelector("input[name='LectureIntro']"));
        intro.sendKeys("Hello");

        WebElement feedback= driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        feedback.sendKeys("Good");

        WebElement feedback2= driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        feedback2.sendKeys("Fine");

        WebElement clientID= driver.findElement(By.cssSelector("input[data-ends='CSSModuleconclientID']"));
        clientID.sendKeys("Client");

        WebElement clientEmail= driver.findElement(By.cssSelector("input[name='email']"));
        clientEmail.sendKeys("client@gmail.com");

        WebElement courseTopic= driver.findElement(By.cssSelector("input[name='CourseTopic']"));
        courseTopic.sendKeys("Course");
    }
}
