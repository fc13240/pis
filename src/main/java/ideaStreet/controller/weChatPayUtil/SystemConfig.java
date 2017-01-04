package ideaStreet.controller.weChatPayUtil;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class SystemConfig {
	
private static Properties properties = null;
	
	static{
		try {
			properties = PropertiesLoaderUtils.loadProperties(new ClassPathResource("config/systemConfig.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取收费比例
	 * @return
	 */
	public static String getRateKey(){
		return properties.getProperty("rate");
	}	
	
	public static void main(String[] args) {
		System.out.println(SystemConfig.getRateKey());
	}

}
