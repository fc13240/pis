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
<title>龙图腾_新闻列表</title>
</head>
<body class="">
<div class="Layout_style">
 <header id="header">
  <h1> 新闻列表 </h1>
</header>

<div class="p_list" style="background:#ffffff;margin-bottom:150px;">


		<c:forEach items="${news}" var="news">
			
		<div style="padding:5px;">
		
			<c:if test="${not empty news.smallImgUrl}">
			<div style="float:left;">
				<img style="overflow: hidden;" src="<s:url value='${news.smallImgUrl}'/>" width="50" height="50" />
		    </div>
			</c:if>		
		
			<div style="line-height:25px;overflow: hidden;padding:5px;">
				<a style="font-size: 15px;color: #000;font-family: 'Microsoft YaHei';overflow: hidden;text-overflow: ellipsis;" href="<s:url value='/mobileNews/newsPreview.html'/>?newsId=<c:out value='${news.id}'/>" title="${news.title}" target="_blank">
				${news.title}
				</a>
			</div>		

			<div style="clear:both;"></div>
		</div>
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>
			
		</c:forEach>

		<div style="height:100px;"></div>
	
</div>
 <!--底部样式-->
<%@ include file="mobile_menu.jsp"%>
</div>
 <!--固定栏目样式-->
<div class="global-nav global-nav--current">
  

   </div>
   <script type="text/javascript">

</script>
</div>
</body>
</html>