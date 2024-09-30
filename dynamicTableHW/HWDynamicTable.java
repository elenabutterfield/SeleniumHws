package dynamicTableHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HWDynamicTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        boolean isnotfound=true;

        while (isnotfound) {
            List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            for (int i = 0; i < ids.size(); i++) {
                if (ids.get(i).getText().equals("111017A")) {
                    WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                    row.click();
                    isnotfound=false;
                }
            }
            if(isnotfound) {

                WebElement nxtBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nxtBtn.click();
            }
        }
    }

    }

