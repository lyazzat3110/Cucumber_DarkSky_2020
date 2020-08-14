package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

import java.util.List;

public class HomePage extends ElementUtil {


    By today = By.xpath("  //*[@id='week']/a[1]");
    By currentTemp = By.xpath("//*[@class='summary swap']");
    By allTemperature = By.xpath("//div[@id='week']//div[@class='temps']//span[contains(text(),'°')]");


    public String getHomePageTitle() {
        return getPageTitle();
    }

    public void expandToday() throws InterruptedException {
        scrollByPixel("0","700");

         webAction(today);
        clickElementByJS(today);

        Thread.sleep(3000);

    }

    public void findTodaysTemperature() throws InterruptedException {
        List<WebElement> temperatureList = BasePage.get().findElements(allTemperature);

        String currentTemperature = BasePage.get().findElement(currentTemp).getText();
        System.out.println("Current Temp:" + currentTemperature);
        System.out.println("List of all temperature");
        int temperature = Integer.parseInt(currentTemperature.substring(0, 2));

        int maxTemp = temperature;
        int minTem = temperature;

        for (int i = 0; i < temperatureList.size(); i++) {
            String text = temperatureList.get(i).getText().substring(0, 2);
            int listTemp = Integer.parseInt(text);

            System.out.println("instant temperatures : " + listTemp);

            if (listTemp > maxTemp) {
                maxTemp = listTemp;
            }
            if (listTemp < minTem) {
                minTem = listTemp;
            }
        }
        System.out.println("Maximum temperature is : " + maxTemp);
        System.out.println("Minimum temperature is : " + minTem);
        Thread.sleep(3000);
    }
}