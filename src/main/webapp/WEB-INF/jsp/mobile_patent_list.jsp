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
  <div class="header_l header_return"><a href="#" class="iconfont icon-back"></a></div>
  <h1>专利列表 </h1>
</header>

<div class="p_list" style="background:#ffffff;">


		<c:forEach items="${patents}" var="patent">
			
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">
				<a href="<s:url value='/mobilePatent/patentPreview.html'/>?patentId=<c:out value='${patent.patentId}'/>" target="_blank" title="${patent.name}">
				${patent.name}
				</a>
			</div>
			<div style="clear:both;"></div>
		</div>
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>
			
		</c:forEach>

		
	
</div>
 <!--底部样式-->
<div class="footer">

  <div class="Copyright">
    <a href="#" class="iconfont icon-home1"></a>
   Copyright © 2010-2016  All Rights Reserved.
龙图腾版权所有
<a  href="./index.html" class="iconfont icon-top1"></a>
  </div>
</div>
</div>
 <!--固定栏目样式-->
<div class="global-nav global-nav--current">
  
    <div class="global-nav__operate-wrap">
        <span class="global-nav__yhd-logo"></span>
        <span class="global-nav__operate-cart-num" id="globalId">0</span>
    </div>
   </div>
   <script type="text/javascript">
Zepto(function($){
   var $nav = $('.global-nav'), $btnLogo = $('.global-nav__operate-wrap');
   //点击箭头，显示隐藏导航
   $btnLogo.on('click',function(){
     if($btnLogo.parent().hasClass('global-nav--current')){
       navHide();
     }else{
       navShow();
     }
   });
   var navShow = function(){
     $nav.addClass('global-nav--current');
   }
   var navHide = function(){
     $nav.removeClass('global-nav--current');
   }
   
})
function get_search_box(){
	try{
		document.getElementById('get_search_box').click();
	}catch(err){
		document.getElementById('keywordfoot').focus();
 	}
}
</script>
</div>
</body>
</html>