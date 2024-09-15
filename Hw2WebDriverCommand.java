import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2WebDriverCommand {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://google.com");
        String title=driver.getTitle();
        System.out.println(title);

        driver.navigate().to("https://syntaxprojects.com/");
        String title1=driver.getTitle();
        System.out.println(title1);

        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();


    }
}
