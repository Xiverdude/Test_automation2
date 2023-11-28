package org.example;

//РАБОЧИЙ АВТОТЕСТ

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//img[@src='https://hhcdn.ru/ichameleon/271669.jpeg']  пример xpath
//*[@src='https://hhcdn.ru/ichameleon/271669.jpeg']

public class Main {
    public static void main(String[] args) {
        String driverPath = "C:\\testATproject\\chromedriver\\chromedriver.exe";
        String chromePath = "C:\\testATproject\\chrome-win64\\chrome.exe";

        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер
        //driver.manage().window().maximize();    //делаем окно браузера на весь экран
        //driver.manage().window().setSize(new Dimension(900, 500)); //указываем размер окна
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//неявное ожидание
        driver.get("https://www.google.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.navigate().to("https://www.selenium.dev/");// указываем ссылку, на которую перейти
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.navigate().back();//возвращаемся на предыдущую страницу
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.navigate().forward();//вернуться обратно на страницу
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.navigate().to("https://www.wikipedia.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        //WebElement link = driver.findElement(By.linkText("Викигид"));//находим сслыку по тексту
        //WebElement link2 = driver.findElement(By.partialLinkText("Скачать"));// находим ссылку по части текста
        //WebElement searchField = driver.findElement(By.name("search"));// поиск элемента по name:search
        //WebElement searchButton = driver.findElement(By.className("\"pure-button pure-button-primary-progressive\""));// поиск элемента по class:
        //WebElement searchById =  driver.findElement(By.id("js-link-box-ru"));//Поиск элемента по id
        //WebElement searchByTag = driver.findElement(By.tagName("input"));//поиск элемента по Тэг-нейму
        //WebElement searchByCssselector = driver.findElement(By.cssSelector("#search-form > fieldset > button"));// поиск по css selector
        //WebElement searchByXpath = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i"));//поиск по xPath




        System.out.println(driver.getTitle());// получаем тайтл
        System.out.println(driver.getCurrentUrl());// получим url страницы и выведем в консоли


        driver.quit();






    }
}