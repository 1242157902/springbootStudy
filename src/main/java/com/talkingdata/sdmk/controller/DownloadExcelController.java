package com.talkingdata.sdmk.controller;

import com.talkingdata.sdmk.excel.ExportExcelUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * User：    ysl
 * Date:   2017/8/14
 * Time:   16:36
 */
@RestController
@RequestMapping("/excel")
public class DownloadExcelController {

    @RequestMapping("/download")
    public void downloadExcel(HttpServletRequest request, HttpServletResponse response,
                              @RequestParam(required = false) String startTime, @RequestParam(required = false) String endTime)throws Exception{

        OutputStream out = null;
        HSSFWorkbook workbook = new HSSFWorkbook();
        out = response.getOutputStream();
        try {
            List<List<String>> data = new ArrayList<List<String>>();
            for (int i = 1; i < 5; i++) {
                List rowData = new ArrayList();
                rowData.add(String.valueOf(i));
                rowData.add("东霖柏鸿");
                data.add(rowData);
            }
            List<List<String>> data1 = new ArrayList<List<String>>();
            for (int i = 1; i < 5; i++) {
                List rowData1 = new ArrayList();
                rowData1.add(String.valueOf(i));
                rowData1.add("东霖柏鸿1");
                data1.add(rowData1);
            }
            List<List<String>> data2 = new ArrayList<List<String>>();
            for (int i = 1; i < 5; i++) {
                List rowData2 = new ArrayList();
                rowData2.add(String.valueOf(i));
                rowData2.add("东霖柏鸿2");
                data2.add(rowData2);
            }
            String[] headers = { "ID", "用户名" };
            ExportExcelUtils eeu = new ExportExcelUtils();

            eeu.exportExcel(workbook, 0, "上海", headers, data, out);
            eeu.exportExcel(workbook, 1, "深圳", headers, data1, out);
            eeu.exportExcel(workbook, 2, "广州", headers, data2, out);
            //原理就是将所有的数据一起写入，然后再关闭输入流。

            String fileName="sdmk服务.xls";
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename="+ URLEncoder.encode(fileName, "utf-8"));
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            out.flush();
            out.close();
            workbook.close();
        }
    }





}
