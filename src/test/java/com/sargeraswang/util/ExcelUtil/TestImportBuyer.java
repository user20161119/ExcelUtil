/**
 * @author SargerasWang
 */
package com.sargeraswang.util.ExcelUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;

/**
 * The <code>TestImportMap</code>	
 * 
 * @author SargerasWang
 * Created at 2014年9月21日 下午5:06:17
 */
public class TestImportBuyer {
  public static void main(String[] args) throws FileNotFoundException {
    File f=new File("E:/githubRepo/ExcelUtil/src/test/java/com/sargeraswang/util/ExcelUtil/test.xls");
    InputStream inputStream= new FileInputStream(f);
    
    ExcelLogs logs =new ExcelLogs();
    Collection<Buyer> importExcel = ExcelUtil.importExcel(Buyer.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , 0);
    
    for(Buyer m : importExcel){
      System.out.println(m);
    }
    for(ExcelLog log:logs.getErrorLogList()){
      System.out.println(log);
    }
  }
}
