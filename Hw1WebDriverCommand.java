import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1WebDriverCommand {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://syntaxprojects.com/");

        String url =driver.getCurrentUrl();
        System.out.println(url);

        String title=driver.getTitle();
        System.out.println(title);

        driver.close();//
    }
}
