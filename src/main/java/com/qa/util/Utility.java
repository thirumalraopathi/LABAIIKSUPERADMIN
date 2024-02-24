//package com.qa.util;
//
//import com.fasterxml.jackson.databind.exc.InvalidFormatException;
//import com.qa.base.DomocranceBase;
////import org.apache.poi.ss.usermodel.Sheet;
////import org.apache.poi.ss.usermodel.Workbook;
////import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.JavascriptExecutor;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class Utility extends DomocranceBase {
//
//	public Utility() throws IOException {
//		super();
//	}
//
//	public void scrollDown() {
//
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,750)", "");
//
//	}
//
//	public void scrollUp() {
//
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,-1500)", "");
//	}
//
//
//	//static Workbook book;
//	//static Sheet sheet;
//
//	//public static String TESTDATA_SHEET_PATH = "C://Users//thirumal.rao//automation//Labaiik_Store//src//main//java//com//qa//testdata/sampledata.xlsx";
//	public static String TESTDATA_SHEET_PATH = "C://Users//thirumal.rao//Automation_workspace//Labaiik_ProductCatelog//src//main//java//com//qa//testdata//Productcatelogtestdata.xlsx";
//
//
//    public static Object[][] getTestData(String sheetName)  {
//
//        FileInputStream file = null;
//        try {
//            file = new FileInputStream(TESTDATA_SHEET_PATH);
//        }catch(FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//		try {
//            try {
////				book=WorkbookFactory.create(file);
////			} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
//            }
//        }
//        }catch(InvalidFormatException e) {
//            e.printStackTrace();
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
//
//
//        Sheet sheet = book.getSheet(sheetName);
//        Object[][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//
//
//        for(int i=0; i<sheet.getLastRowNum();i++) {
//            for(int k=0; k < sheet.getRow(0).getLastCellNum();k++) {
//                data[i][k]= sheet.getRow(i + 1).getCell(k).toString();
//            }
//        }
//        return data;
//
//    }
//
//
//}
