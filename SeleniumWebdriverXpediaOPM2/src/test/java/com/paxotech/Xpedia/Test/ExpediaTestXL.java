package com.paxotech.Xpedia.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;






import com.paxotech.qa.Xpedia.ScriptsBase;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)


public class ExpediaTestXL extends ScriptsBase{
	@Test
	@UseDataProvider( "excelDataProvider" )
	public void test1(String nameText,String lastNmeText,String emailText,String passwordText,String ConPassword,String msgs){
		Xpredia().homePage().showAccountinfopage();
		Xpredia().homePage().showAccountinfopage();
		Xpredia().regestrationPage().ShowNamebutton(nameText, lastNmeText,emailText,passwordText,ConPassword);
		Xpredia().regestrationPage().verification2(msgs);
	}
	
		
	@DataProvider
	public static Object[][] excelDataProvider() {

		try {
			String inputFile = System.getProperty("user.dir")
					+ "/src/test/resources/DataTest.xml/java.xls";
			File inputWorkbook = new File(inputFile);

			Workbook w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet
			Sheet sheet = w.getSheet(1);

			Object[][] data = new Object[sheet.getRows() - 1][sheet.getColumns()];

			String cellData = null;
			for (int j = 0; j < sheet.getColumns(); j++) {
				for (int i = 1; i < sheet.getRows(); i++) {

					Cell cell = sheet.getCell(j, i);
					CellType type = cell.getType();
					if (type == CellType.LABEL) {
						cellData = cell.getContents();
					}

					if (type == CellType.NUMBER) {
						cellData = cell.getContents().toString();
					}

					data[i - 1][j] = cellData;
				}
			}

			return data;

		} catch (Exception ex) {

		}

		return null;

	}
	
}
