package org.example;
//CHECKBOX
//RADIOBUTTON
//ACTION
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RadioButton {
    public static void main(String[] args) {
        String driverPath = Config.DRIVER_PATH;
        String chromePath = Config.DRIVER_PATH;

        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер
        driver.navigate().to("https://market.yandex.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("стиральная машина" + Keys.ENTER);//вводим тескт в описковую строку и нажимает ENTER
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@data-filter-value-id='44150331']//span[@class='_1ZDAA']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(By.xpath("//div[@data-filter-value-id='44150331']//span[@class='_1ZDAA']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//div[@data-zone-name='catalog']")).click();
//        Actions actions = new Actions(driver);      //создаем Action − интерфейс, абстрагирующий действие (другими словами, некоторую функцию) от визуального компонента
//        WebElement searchBox = driver.findElement(By.xpath("//span[text()='Спорт и отдых']"));
//        actions.moveToElement(searchBox).perform(); //наводим курсор по xpath
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Спорт и отдых']"))).perform();    //более коротокий вариант

//        selectOption(driver,"Каталог", "Спорт и отдых");

        //driver.quit();


    }
//    public static void selectOption(WebDriver driver, String catalog, String sportHobby){
//        String catalogXpath = String.format("//div[@data-zone-name='catalog']", catalog);
//        String SportHobbyXpath = String.format("//span[text()='Спорт и отдых']",sportHobby);
//        driver.findElement(By.xpath(catalog)).click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath(sportHobby))).perform();
//}


}
