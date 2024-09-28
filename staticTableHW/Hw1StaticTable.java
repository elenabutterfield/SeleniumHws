package staticTableHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw1StaticTable {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

        List<WebElement>  column= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        int count=1;
        for(WebElement column1: column){
            String value= column1.getText();
            if(value.equals("USA")){
                System.out.println(count);

                WebElement row= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(row.getText());
            }
            count++;
        }


    }
}
