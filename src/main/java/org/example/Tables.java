package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tables {
    public static void main(String[] args) {
        String driverPath = Config.DRIVER_PATH;
        String chromePath = Config.DRIVER_PATH;

        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер
        driver.get("https://https://www.w3schools.com/html/html_tables.asp");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));







    }
}
