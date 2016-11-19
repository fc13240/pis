<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="security" prefix="se" %>
<%@ taglib uri="c" prefix="c" %>
<%@ taglib uri="fmt" prefix="fmt"%>
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
<title>${news.title}_龙图腾</title>
</head>
<body class="">
<div class="Layout_style">
 <header id="header">
  <div class="header_l header_return"><a href="#" class="iconfont icon-back"></a></div>
  <h1> ${news.title} </h1>
</header>
<!--产品列表样式-->

<!--产品列表-->
<div class="p_list" style="background:#ffffff;padding:5px;">
	<div class="mod1_cont" id="mod1_cont" runat="server">
		<table class="goods-tb pos-rlt" width="580" border="0" cellspacing="0" cellpadding="0">
       <tr>
       <td colspan="2">
       <span style="line-height: 44px;font-size:20px;collor:#000000;">[${mobilePatent.patentType.typeDescription}]${mobilePatent.name}</span> 
      <caption id="J_detail_title">
            <div id="J_activity_title"></div>
      </caption>
      </td>
      </tr>
      <tr>
        <td width="250px;">专利号：${mobilePatent.appNo}</td>
        <td>第一申请人：<span>${mobilePatent.appPerson}</span>
      </tr>
      <tr>
      	<td>申请日期：<fmt:formatDate value="${mobilePatent.appDate}" pattern="yyyy-MM-dd"/></td>
        
      </tr>
      <tr>
        <td>案件状态：<span>${mobilePatent.patentStatus.statusDescription}</span>
      </tr>

      <tr style="border-bottom:1px dashed #ececec">
        <td height="15"></span>
        <td></td>
      </tr>
      <tr style="border-top:1px dashed #ececec">
        <td>价&nbsp;&nbsp;格：<span style="color:red;font-size:20px;">1200</span>
      </tr>
      </table>

	</div>					
		<p></p>
</div>
<br>
</div>

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
</html>