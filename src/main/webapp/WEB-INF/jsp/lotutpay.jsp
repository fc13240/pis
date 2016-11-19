<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jquery.mobile-1.3.0.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jquery.mobile-new.css" />
</head>
<body>

<div data-role="page">
  <div data-role="header" data-theme="e">
  <h1>业务付款</h1>
  </div>

  <div data-role="content">
    <form method="post">
      <div data-role="fieldcontain">
        <label for="paymoney">支付金额：</label>
        <input type="text" name="paymoney" id="paymoney" placeholder="请输入支付金额..">       
        <p id="p1">你输入的金额为：</p>
        <a data-role="button" href="javascript:doWeixinPay()" data-theme="e">提交</a>
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

</body>
</html>