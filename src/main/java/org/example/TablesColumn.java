package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TablesColumn {
    private WebElement tableElement;//
    private WebDriver driver;

    public TablesColumn(WebElement tableElement, WebDriver driver){    //конструктор с переменно, которую будем сюда передавать
        this.tableElement = tableElement;   //значение эелмента получит конструктор
        this.driver = driver;
    }
    public List<WebElement> getRows(){
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));// строки в таблице
        rows.remove(0);// удаляем 1 строку, потому что это строка заголовка
        return rows;// вернет лист вебэлементов строк
    }
    public List<WebElement> getHeadings(){
        WebElement headingRows = tableElement.findElement(By.xpath(".//tr"));
        List<WebElement> headingColumns = headingRows.findElements(By.xpath(".//th"));
        return headingColumns;//метод возвращает заголовки
    }
    //Разбиваем все наши строки на заголовки(лист листов)
    public List<List<WebElement>> getRowsWithColumns(){
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        for (WebElement row : rows){
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td"));//список столбцов
            rowsWithColumns.add(rowWithColumns);
        }
        return rowsWithColumns;
    }
//метод который позволит использовать метод getRowsWithColumns
    public String getValueFromCell(int rowNumber, int columnNumber);
    List<List<WebElement>> getRowsWithColumns = getRowsWithColumns();
    WebElement cell = getRowsWithColumns.get(rowNumber - 1).get(columnNumber - 1);
    return cell.getText();

}


