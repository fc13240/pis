package zhuanli.controller.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;


public class WebUtils {
	public static final Object APPID = "wx7f435f9a93844c0d";
	public static final Object APPSECRET = "d98935d6a5311e11db60cefa2a91cbf0";
	
	
	public static void writeJsonStrToResponse(HttpServletResponse response, Object value) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
		try (PrintWriter out = response.getWriter();) {
			out.write(mapper.writeValueAsString(value));
			out.flush();
		}
	}
	
	public static void writeStreamToResponse(HttpServletResponse response, InputStream in) throws IOException {
		int BUFFER_SIZE = 8 * 1024;
		byte[] buffer = new byte[BUFFER_SIZE];
		try (OutputStream out = response.getOutputStream();
				BufferedInputStream bis = new BufferedInputStream(in))
			{
				int bytesRead = -1;
				while ((bytesRead = bis.read(buffer)) != -1) {
					out.write(buffer, 0, bytesRead);
				}
				out.flush();
			}
	}
	
	public static int getPageSize(HttpSession session) {
		final int DEFAULT_PAGE_SIZE = 10;
		if (session.getAttribute("pageSize") == null) {
			return DEFAULT_PAGE_SIZE;
		}
		
		return (int) session.getAttribute("pageSize");
	}
	
	public static boolean isFireFox(HttpServletRequest request) {
		  String UserAgent = request.getHeader("USER-AGENT").toLowerCase();
		    if(UserAgent!=null && UserAgent.indexOf("firefox") >= 0){
		    	return true;
		    }
		    return false;
	}
	
	public static String getPicName(HttpSession session) throws UnsupportedEncodingException {
		String picName = (String) session.getAttribute("picName");
		return picName;
	}
	
	
	public static String loadJSON (String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        yc.getInputStream()));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        return json.toString();
    }
	
	
	 public static void main(String[] args) {
	        String url = "http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo";
	        String json = loadJSON(url);
	        System.out.println();
	    }
	 
	 
	 
	 private static String readAll(Reader rd) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    int cp;
		    while ((cp = rd.read()) != -1) {
		      sb.append((char) cp);
		    }
		    return sb.toString();
		  }
		 
		  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		    InputStream is = new URL(url).openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		      JSONObject json = new JSONObject(jsonText);
		      return json;
		    } finally {
		      is.close();
		    }
		  }
		 
		    public static String roundPassword(int length){
		    	String val = "";
		    	  Random random = new Random();
		    	  for (int i = 0; i < length; i++) {
		    	   // 输出字母还是数字
		    	   String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; 
		    	   // 字符串
		    	   if ("char".equalsIgnoreCase(charOrNum)) {
		    	    // 取得大写字母还是小写字母
		    	    int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; 
		    	    val += (char) (choice + random.nextInt(26));
		    	   } else if ("num".equalsIgnoreCase(charOrNum)) { // 数字
		    	    val += String.valueOf(random.nextInt(10));
		    	   }
		    	  }
		    	  return val;
		    }
}
