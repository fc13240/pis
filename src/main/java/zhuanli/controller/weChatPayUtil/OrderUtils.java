package zhuanli.controller.weChatPayUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 订单工具类
 * @author JeffXu
 * @since 2016-08-11
 */
public class OrderUtils {
	
	public static String genOrderNo(){
		String orderNo = "lotut";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String nowTime = sdf.format(new Date());
		orderNo+=nowTime;
		return orderNo;
	}

}
