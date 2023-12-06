package org.example;

//CHECKBOX
//BASKET

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Basket {
    public static void main(String[] args) {
        String driverPath = Config.DRIVER_PATH;
        String chromePath = Config.DRIVER_PATH;

        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер
        driver.navigate().to("https://market.yandex.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("стиральная машина" + Keys.ENTER);//вводим тескт в описковую строку и нажимает ENTER
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//span[text()='Все фильтры']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@data-filter-id='7893318']//input[@type='checkbox']")); // создаем лист , где мы сможешь указывать порядковый номер чекбокса, который мы хотим выбрать

        //checkboxes.get(3).click();checkboxes.get(3).click();// выбираем чекбокс номером 4


        if (checkboxes.size()==12) System.out.println("Its ok!"); //проверяем количество чекбоксов
        else System.out.println("FAIL!");

        for (WebElement checkbox : checkboxes){
            checkbox.click();
            //driver.quit();
        }

    }

}
