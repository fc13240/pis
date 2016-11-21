<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="security" prefix="se" %>
<%@ taglib uri="c" prefix="c" %>
<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="keywords" content="知识产权,专利交易,商标转让,龙图腾,中外知识产权网" />
<meta name="description" content="龙图腾网（www.lotut.com）是全球领先的知识产权交易平台。为企业提供专业的商标转让、专利交易等服务。拥有国内知识产权资源，全面覆盖了商标、专利、版权等领域的交易平台，让知识产权在流通中创造财富，引领知识产权的创新。" />
<meta itemprop="name" content="" />
<meta http-equiv="cache-control" content="no-transform">

<link href="<s:url value='/mobile_skin/css/ectouch.css'/>" rel="stylesheet" type="text/css" />
<link href="<s:url value='/mobile_skin/css/style.css'/>" rel="stylesheet" type="text/css" />
<link href="<s:url value='/mobile_skin/fonts/iconfont.css'/>" rel="stylesheet" type="text/css" />
<script src="<s:url value='/mobile_skin/js/TouchSlide.1.1.source.js'/>" type="text/javascript"></script>
<script src="<s:url value='/mobile_skin/js/jquery-1.8.2.min.js'/>" type="text/javascript"></script>
<script src="<s:url value='/mobile_skin/js/common_js.js'/>" type="text/javascript"></script>
<script src="<s:url value='/mobile_skin/js/jquery.reveal.js'/>" type="text/javascript"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jquery.mobile-1.3.0.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jquery.mobile-new.css" />
<title>龙图腾_业务付款</title>
</head>
<body class="">
<div class="Layout_style">
	<header id="header">
	 <h1>业务付款 </h1>
	</header>
	<div style="height:150px;"></div>

	<div data-role="page" style="margin-top:50px;">
	  <div data-role="content" style="">
	    <form method="post">
	      <div data-role="fieldcontain">
	        <label for="paymoney">支付金额：</label>
	        <input type="number" name="paymoney" id="paymoney"   placeholder="请输入支付金额.." required>       
	       <!--  <p id="p1">你输入的金额为：</p> -->
	        <a data-role="button" href="javascript:doWeixinPay()" style="background-image: linear-gradient(#de1456, #de1456);color:#ffffff;border: 1px solid #de1456;font-weight:normal;" data-theme="e">提交</a>
	      </div>
	    </form>
	  </div>
	</div>

     <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
     <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.mobile-1.3.0.min.js"></script>
	 <script type="text/javascript">
	    function doWeixinPay(){
	    	var pay=$("#paymoney").val();
	    	if(pay == null || pay == ""){
	    		alert("请输入支付金额！");
	    		return;
	    	}else{
	    		var rate = ${rate};
	    		pay = parseFloat((pay*rate).toPrecision(12)); 
	    		window.location.href="${pageContext.request.contextPath}/wx/userAuth.html?totalFee="+pay;
	    	}
	    }
	 </script>		
	

 <!--底部样式-->
</div>

</body>
</html>