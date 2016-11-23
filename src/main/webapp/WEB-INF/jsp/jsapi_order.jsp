<%@ page contentType="text/html; charset=UTF-8"%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="spring" prefix="s" %>

<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript" src="<s:url value='/js/jquery-1.8.3.min.js'/>"></script>
		<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
		<script type="text/javascript">
		function jsApiCall(){
			   WeixinJSBridge.invoke(
			       'getBrandWCPayRequest', {
			           "appId":"${appid}",     //公众号名称，由商户传入     
			           "timeStamp":"${timeStamp}",         //时间戳，自1970年以来的秒数     
			           "nonceStr":"${nonceStr}", //随机串     
			           "package":"${packageValue}",     
			           "signType":"MD5",         //微信签名方式：     
			           "paySign":"${sign}" //微信签名 
			       },
			       function(res){
			    	// 使用以下方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回    ok，但并不保证它绝对可靠。 
			    		if(res.err_msg == "get_brand_wcpay_request:ok") {
			        	   alert("支付成功");
			        	   window.location.href = "${pageContext.request.contextPath}/wx/success.html?orderId=${orderId}&nickname=${nickname}&totalFee=${payPrice}&brandId=${brandId}";
			           }else if(res.err_msg == "get_brand_wcpay_request:fail"){
			       			alert('支付失败');
			       		}else if(res.err_msg == "get_brand_wcpay_request:cancel"){
			       			alert('支付取消');
			       		}else{
			       			alert(res.err_msg);
			       		}
			       }
			   ); 
			}
		
		function callpay()
		{
			if (typeof WeixinJSBridge == "undefined"){
			    if( document.addEventListener ){
			        document.addEventListener('WeixinJSBridgeReady', jsApiCall, false);
			    }else if (document.attachEvent){
			        document.attachEvent('WeixinJSBridgeReady', jsApiCall); 
			        document.attachEvent('onWeixinJSBridgeReady', jsApiCall);
			    }
			}else{
			    jsApiCall();
			}
		}  	
		</script>			
	    <title>订单-支付</title>
	</head>
<body>
    <script type="text/javascript">
    	$(function(){callpay();})
	</script>
</body>
</html>