package com.talkingdata.sdmk.excel;

import com.talkingdata.sdmk.util.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 杨双亮
 * @version V1.0
 * @project: springbootStudy
 * @Package com.talkingdata.sdmk.excel
 * @Description: 月度计量报表相关生成
 * @date 2018/5/29 14:27
 * @email 1242157902@qq.com
 */
public class MonthReportService {



    public static void main(String[] args) throws Exception{
        Workbook workbook = new HSSFWorkbook();

        ExcelUtil excelUtil = new ExcelUtil(workbook);
        //创建sheet
   /*     Sheet totalSheet  = workbook.createSheet("汇总表");
        Sheet detailSheet  = workbook.createSheet("201802明细表");*/

        excelUtil.createSheet();
        excelUtil.setSheetName(0, "汇总表");






        excelUtil.createSheet();
        excelUtil.setSheetName(1,"201802明细表");
        try(OutputStream fileOS = new FileOutputStream("I://众安国际有限公司.xls")){
            workbook.write(fileOS);
        }

    }

}
