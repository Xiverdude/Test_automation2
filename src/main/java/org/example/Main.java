package org.example;

//РАБОЧИЙ АВТОТЕСТ

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        String driverPath = "C:\\testATproject\\chromedriver\\chromedriver.exe";
        String chromePath = "C:\\testATproject\\chrome-win64\\chrome.exe";

        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер
        //driver.manage().window().maximize();    //делаем окно браузера на весь экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.youtube.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement input = driver.findElement(By.cssSelector("#container .style-scope.ytd-searchbox"));
        input.sendKeys("Гантели");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
}