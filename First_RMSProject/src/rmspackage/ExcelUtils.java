package rmspackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	String path_testdata= "C:\\RMS_workspace\\First_RMSProject\\";
	String File_testdata="RMS data.xlsx";
	public static XSSFWorkbook work;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static FileInputStream fs;
	
  public static void setexcel(String path,String sheetname) throws IOException {
	  try{
	  fs= new FileInputStream(path);
	 work=new XSSFWorkbook(fs);
	  sheet= work.getSheet(sheetname); 
  }
	  catch(Exception e)
	  {
		  throw(e);
	  }
	  }
 /*
  public String storedata(int RowNum,int ColNum)
  {
	  ArrayList<String[][]> list=new ArrayList<String[][]>();
	 /* Iterator<Row> rowiterator=sheet.rowIterator();
	  while(rowiterator.hasNext())
	  {
		  Row row=rowiterator.next();
		  Iterator<Cell> celliterator=row.cellIterator();
		  while(celliterator.hasNext())
		  {
			  Cell cell=celliterator.next();
			  cell=sheet.getRow(RowNum).getCell(ColNum);
			  String cellvalue=cell.getStringCellValue();
			  list[][].add(cellvalue);
			  
			  System.out.println("Cell values are" +cell.getStringCellValue());
			 for (int i=0;i<=list.size();i++)
			 {
				 System.out.println("Value stored at i position is " +list.get(i));
			 }
			 return Excelvalue;
  }
}*/
  
  public static String storedata(int row, int col)
  {
	  try{
	  int Physicalcount = sheet.getPhysicalNumberOfRows();
	    System.out.println("Row count by physicalcount " +Physicalcount);    
	    int Col_count = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("Column count is " +Col_count);
		String cellvalue[][]=new String[Physicalcount][Col_count];
		 for(int i=0;i<=Physicalcount;i++)
		    {
		    	XSSFRow allrow = sheet.getRow(i);
		    	
		    	for(int j=0;j<Col_count;j++)
		    	{
		    		XSSFCell cell = allrow.getCell(j);
		    		 //cell=sheet.getRow(RowNum).getCell(ColNum);
	  
	  cellvalue[i][j]=cell.getStringCellValue();
//	System.out.println("Content is "+cellvalue[row][col]);

	}   	 

		    }
			return cellvalue[row][col];
	  }
		    	 catch(Exception e)
		 		{
		 			throw(e);
		 		}


		    }
  
  public static String getCellData(int RowNum, int ColNum)
  {
	  try{
		  
	  cell=sheet.getRow(RowNum).getCell(ColNum);
	  String cellvalue;
	/*switch (cell.getCellType()) {
	    case XSSFCell.CELL_TYPE_NUMERIC:
	        System.out.println(cell.getRawValue());
	        cellvalue=cell.getRawValue();
	        break;
	    case XSSFCell.CELL_TYPE_BOOLEAN:
	        System.out.println(cell.getBooleanCellValue());
	        cellvalue=cell.getBooleanCellValue();
	        break;
	    case XSSFCell.CELL_TYPE_STRING:
	        System.out.println(cell.getStringCellValue());
	        cellvalue=cell.getStringCellValue();
	        break;
	    default:
	        System.out.println(cell.getRawValue());
	        cellvalue=cell.getRawValue();    
	} */
	
	cellvalue=cell.getStringCellValue();
	return cellvalue;
	  }
	  
	 /* for(int i=0;i<=10;i++)
		{
			XSSFRow allrow = sheet.getRow(i);
			for(int j=0;j<=1;j++)
			{
			XSSFCell allcell = allrow.getCell(j);
			System.out.println("All row values are " +allcell);
			}
			//sheet.getRow(3).getCell(0);
		} 
	  }*/
	  catch(Exception e)
		{
			throw(e);
		}

	
	  }
}
		
	/*  FileOutputStream ofs=new FileOutputStream(path_testdata);
		work.write(ofs);
		fs.close();
		work.close();
		}
		}
  }*/
