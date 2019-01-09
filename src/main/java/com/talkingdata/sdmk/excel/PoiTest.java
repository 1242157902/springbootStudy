package com.talkingdata.sdmk.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PoiTest {

	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("D:\\test.xls");
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
			HSSFWorkbook workbook = new HSSFWorkbook();
			eeu.exportExcel(workbook, 0, "上海", headers, data, out);
			eeu.exportExcel(workbook, 1, "深圳", headers, data1, out);
			eeu.exportExcel(workbook, 2, "广州", headers, data2, out);
			//原理就是将所有的数据一起写入，然后再关闭输入流。
			workbook.write(out);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}