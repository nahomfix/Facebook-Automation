import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class autotest {

    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver", "./src/chromedriver.exe");

        WebDriver WDname = new ChromeDriver();

        WDname.get("https://www.facebook.com");

        WebElement email = WDname.findElement(By.name("email"));
        email.sendKeys("nahom65@ovi.com");

        WebElement password = WDname.findElement(By.name("pass"));
        password.sendKeys("password");

        password.submit();

        WebElement notifications = WDname.findElement(By.id("notificationsCountValue"));
        System.out.println("Number of notifications is: " + notifications.getAttribute("innerHTML"));


        try{
            Thread.sleep(2000);

        }catch(Exception e){

        }

        WDname.close();
    }



}
