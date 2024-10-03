package calendarHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW1Calendar {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");

        WebElement calendar1 = driver.findElement(By.xpath("//input[@id='from_date']"));
        calendar1.click();

        boolean isfound = false;
        while (!isfound) {
            WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentMonth = month.getText();
            String currentYear = year.getText();
            if (currentMonth.equals("January") && currentYear.equals("2025")) {
                //select the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for (WebElement date : allDates) {
                    if (date.getText().equals("4")) {
                        date.click();
                        isfound = true;
                        break;
                    }
                }
            } else {
                //click on next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }
        WebElement calendar2 = driver.findElement(By.xpath("//input[@id='to_date']"));
        calendar2.click();
        boolean isFound1 = false;
        while (!isFound1) {
            WebElement month1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            WebElement year1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String currentMonth = month1.getText();
            String currentYear = year1.getText();
            if (currentMonth.equals("February") && currentYear.equals("2025")) {
                List<WebElement> allDates1 = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for (WebElement date1 : allDates1) {
                    if (date1.getText().equals("4")) {
                        date1.click();
                        isFound1 = true;
                        break;
                    }
                }
                    } else {
                        WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                        nextBtn.click();
                    }
                }
            }
        }




