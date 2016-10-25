package zhuanli.service.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import zhuanli.domain.Patent;

public class PatentFeeExcelGenerator {
	
	public static void writeFeeRecordsToExcel(List<Patent> feeRecords, String resultExcelPath) throws IOException {
		final String SHEET_NAME = "格式不对";
		FileOutputStream resultExcelOutputStream = new FileOutputStream(resultExcelPath);
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		HSSFSheet sheet = workbook.createSheet(SHEET_NAME);

		HSSFRow creatRowName = sheet.createRow(0);
		
		writelRowName(creatRowName);

		for (int i = 0; i < feeRecords.size(); i++) {
			Patent feeRecord = feeRecords.get(i);
			HSSFRow row = sheet.createRow(i + 1);
			writeFeeRecordToRow(feeRecord, row, i+1);
		}

		workbook.write(resultExcelOutputStream);
		workbook.close();
	}	
	
	private static void writelRowName( HSSFRow row) {
		HSSFCell seqNoCellRowName = row.createCell(0);
		seqNoCellRowName.setCellValue("序号");
		
		HSSFCell appNoCellRowName = row.createCell(1);
		appNoCellRowName.setCellValue("专利号");
		
		HSSFCell patentNameCellRowName = row.createCell(2);
		patentNameCellRowName.setCellValue("专利名称");
		HSSFCell userNameCellRowName = row.createCell(3);
		
		userNameCellRowName.setCellValue("案件状态");
		
		HSSFCell  patentStatusTextRowName= row.createCell(4);
		patentStatusTextRowName.setCellValue("价格");
		
	}
	
	private static void writeFeeRecordToRow(Patent patent, HSSFRow row, int rowIndex) {
		HSSFCell seqNoCell = row.createCell(0);
		seqNoCell.setCellValue(rowIndex);
		
		HSSFCell appNoCell = row.createCell(1);
		appNoCell.setCellValue(patent.getApp_no());
		
		HSSFCell patentNameCell = row.createCell(2);
		patentNameCell.setCellValue(patent.getPatent_name());
		
		HSSFCell userNameCell = row.createCell(3);
		userNameCell.setCellValue(patent.getPatent_status_desc());
		
		HSSFCell  patentStatusText= row.createCell(4);
		patentStatusText.setCellValue(patent.getPrice());
		
	}
}
