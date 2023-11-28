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
        String driverPath = Config.DRIVER_PATH;
        String chromePath = Config.DRIVER_PATH;


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

        //driver.navigate().to("https://github.com/");
        driver.navigate().to("https://ru.wikipedia.org/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        //WebElement link = driver.findElement(By.linkText("Викигид"));//находим сслыку по тексту
        //WebElement link2 = driver.findElement(By.partialLinkText("Скачать"));// находим ссылку по части текста
        //WebElement searchField = driver.findElement(By.name("search"));// поиск элемента по name:search
        //WebElement searchButton = driver.findElement(By.className("\"pure-button pure-button-primary-progressive\""));// поиск элемента по class:
        //WebElement searchById =  driver.findElement(By.id("js-link-box-ru"));//Поиск элемента по id
        //WebElement searchByTag = driver.findElement(By.tagName("input"));//поиск элемента по Тэг-нейму
        //WebElement searchByCssselector = driver.findElement(By.cssSelector("#search-form > fieldset > button"));// поиск по css selector
        //WebElement searchByXpath = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i"));//поиск по xPath
        //driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();//поиск по xPath
//        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).click();//поиск по xPath
//        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[4]/main/div[4]/div[1]/div/div[2]/div[2]/div/form/div/button"));//поместили в button, который мы найдем по икспасу
//        if (button.getText().equals("Sign up for GitHub")){//если будет полученная надпись: "Sign up for GitHub"
//            System.out.println("Success!");//то получаем это
//        }
//        else System.out.println("Fail!");
//        driver.findElement(By.xpath("/html/body/div[1]/div[4]/main/div[4]/div[1]/div/div[2]/div[2]/div/form/div/button")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div/a")).click();
        WebElement link = driver.findElement(By.xpath("//*[@id=\"n-help\"]/a/span"));
        System.out.println(link.getText());
        link.click();


//        driver.findElement(By.xpath("//input[@class='vector-search-box-input']")).sendKeys("selenium webdriver");
//        driver.findElement(By.xpath("//input[@class='searchButton']")).click();
//        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("Value"));// выведем значение поля, которое получилось на сайте
//        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();// очищаем поле




        //System.out.println("Button text is " + button.getText());//получаем текст по элементу button
        //button.submit();//нажать кнопку




        System.out.println(driver.getTitle());// получаем тайтл и выведем в консоли
        System.out.println(driver.getCurrentUrl());// получим url страницы и выведем в консоли


//        driver.quit();






    }
}