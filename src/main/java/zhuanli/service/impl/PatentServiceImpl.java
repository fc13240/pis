package zhuanli.service.impl;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


import zhuanli.service.utils.PatentFeeExcelGenerator;

import zhuanli.service.constants.Settings;
import zhuanli.service.utils.ZipUtils;

import net.lingala.zip4j.core.ZipFile;
import zhuanli.dao.PatentDao;
import zhuanli.domain.ColumnCount;
import zhuanli.domain.FirstColumn;
import zhuanli.domain.Notice;
import zhuanli.domain.Page;
import zhuanli.domain.Patent;
import zhuanli.domain.PatentSearchCondition;
import zhuanli.service.PatentService;



public class PatentServiceImpl implements PatentService {
	private PatentDao patentDao;

	
	public PatentServiceImpl(PatentDao patentDao) {
		this.patentDao = patentDao;
	}

	@Override
	public List<Patent> getSecoundColumn(int  patent_column_id) {
		return patentDao.getSecoundColumn(patent_column_id);

	}

	@Override
	public List<Patent> getPatentsByColumn(List<Patent> patent_second_columns) {
		return null;
	}
	@Override
	public Patent getPatentById(long patent_id) {
		return patentDao.getPatentById(patent_id);
	}
	@Override
	public List<Patent> getSonList(int i) {
		return patentDao.getSonList(i);
	}
	@Override
	public int getSonListCount(int j) {
		return patentDao.getSonListCount(j);
	}
	@Override
	public List<FirstColumn> selectAllColumns() {
		return patentDao.selectAllColumns();
	}
	
	@Override
	public List<Patent> getSecoundPatent(int  patent_second_column) {
		return patentDao.getSecoundPatent(patent_second_column);
	}

	@Override
	public List<ColumnCount> getColumnCount() {
		return patentDao.getColumnCount();
	}

	@Override
	public List<FirstColumn> selectAllPatents() {
		return patentDao.selectAllPatents();
	}

	@Override
	public int getFirstId(int patent_second_column_id) {
		return patentDao.getFirstId(patent_second_column_id);
	}
	@Override
	public String getCurrentTypeName(int patent_second_column_id) {
		return patentDao.getCurrentTypeName(patent_second_column_id);
	}

	@Override
	public List<Patent> searchPatents(PatentSearchCondition patentSearchCondition) {

		return patentDao.searchPatents(patentSearchCondition);
	}

	@Override
	public int searchPatentsCount(PatentSearchCondition patentSearchCondition) {

		return patentDao.searchPatentsCount(patentSearchCondition);
	}

	@Override
	public List<Patent> getSecoundColumnPage(Page page) {
		return patentDao.getSecoundColumnPage(page);
	}

	@Override
	public List<Patent> getSecoundPatentPage(Page page) {
		return patentDao.getSecoundPatentPage(page);
	}

	@Override
	public List<Notice> getNoticeByPatentno(long patent_id) {

		return patentDao.getNoticeByPatentno(patent_id);
	}

	@Override
	public Notice getNoticeById(int noticeId) {
		
		return patentDao.getNoticeById(noticeId);
	}

	@Override
	public ZipFile createNoticeZipFile(Notice notice) throws IOException {
		String tempFileName = Settings.TEMP_DIR + notice.getNoticeId() + System.currentTimeMillis() + ".zip"; 
		Path noticePath = Paths.get(Settings.NOTICE_ROOT_PATH, notice.getZipfileName(), notice.getNoticeSequence());
		ZipFile noticeZipFile = ZipUtils.zip(noticePath.toFile(), tempFileName);
		
		return noticeZipFile;
	}
	
	@Override
	public String PatentExportExcel(String excelName) throws IOException {
		List<Patent> patents = patentDao.getAllPatents();
		String exportExcelPath=Settings.TEMP_DIR+excelName;
		PatentFeeExcelGenerator.writeFeeRecordsToExcel(patents, exportExcelPath);
		return exportExcelPath;
	}

	@Override
	public List<Patent> getPatents() {
	
		return patentDao.getPatents();
	}
	
}
