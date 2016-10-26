package zhuanli.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class SearchFieldUtils {
	private static Pattern appNoPattern = Pattern.compile("^\\d{12}\\.?[\\d|X]$", Pattern.CASE_INSENSITIVE);
	private static Pattern publishNoPattern = Pattern.compile("^CN\\d{5}.*", Pattern.CASE_INSENSITIVE);
	private static Pattern appOrpublishNoPattern = Pattern.compile("^.*\\d{5,}.*$", Pattern.CASE_INSENSITIVE);
	private static Pattern datePattern = Pattern.compile("^(19|20)\\d{2}[-/.]?[01]\\d[-/.]?[0123]\\d$", Pattern.CASE_INSENSITIVE);
	private static int APPNO_NO_DOT_LENGTH = 13;
	
	public static boolean isAppNo(String str) {
		return isMatch(appNoPattern, str);
	}
	
	public static boolean isPublishNo(String str) {
		return isMatch(publishNoPattern, str);
	}
	
	public static boolean isAppOrPublishNo(String str) {
		return isMatch(appOrpublishNoPattern, str);
	}
	
	public static boolean isDate(String str) {
		return isMatch(datePattern, str);
	}
	
	private static boolean isMatch(Pattern pattern, String str) {
		if (pattern.matcher(str).matches()) {
			return true;
		}
		
		return false;
	}
	
	public static String getAppNo(String str) {
		if (str.length() == APPNO_NO_DOT_LENGTH) {
			return str.substring(0, 12) + "." + str.substring(12).toUpperCase();
		} 
		
		return str.toUpperCase();
	}
	
	public static String getPublishNo(String str) {
		return str.toUpperCase();
	}
	
	public static Date getDate(String str) {
		String dateStr = str.replaceAll("[./]", "-");
		if (!dateStr.contains("-")) {
			dateStr = dateStr.substring(0, 4) + "-" + dateStr.substring(4, 6) + "-" + dateStr.substring(6);
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return df.parse(dateStr);
		} catch (ParseException e) {
			throw new RuntimeException("Bad date format");
		}
	}
	
	public static long getTimeInMillis(String str) {
		return getDate(str).getTime();
	}
	
	public static void main(String[] args) throws ParseException {
		String str="2003.12.12";
		System.out.println(isDate(str));
	}
}
