package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        String driverPath = Config.DRIVER_PATH;
        String chromePath = Config.DRIVER_PATH;

        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер


    }

}
