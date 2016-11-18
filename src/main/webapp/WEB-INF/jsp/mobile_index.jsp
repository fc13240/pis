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
<title>龙图腾专利商标交易网</title>
</head>
<body class="">
<div class="Layout_style">
  <div class="header_home_wrapper" id="index_search_main">
 <div class="search-container on-blur" id="index_search_head">
   <div class="search-box ">
   <div class="search-tb">
     <div class="header_logo flex"><img src="<s:url value='/mobile_skin/images/wap_logo.png'/>">
     <span id="index_search_bar_cancel" class="search-icon-cancel"><i class="sprite-icon"></i></span>
     </div>
     <div class="flex">
        </div>
    </div>
   </div>
 </div>
 </div>
 <!--幻灯片样式-->
 <div id="scwrapper" class="scroll-wrapper">
  <div class="floor new-slider-floor"> 
  <div class="main_visual" id="swiper_wrapper">
                <div class="flicking_con hd">               	
                    <ul></ul>
            </div>
			<div class="main_image bd">
				<ul >					
					<li><a class=""><img src="<s:url value='/mobile_skin/images/ad01.jpg'/>" /></a></li>
					<li><a class=""><img src="<s:url value='/mobile_skin/images/ad02.jpg'/>" /></a></li>
					<li><a class=""><img src="<s:url value='/mobile_skin/images/ad03.jpg'/>" /></a></li>
				</ul>
				<a href="javascript:;" id="btn_prev" ></a>
				<a href="javascript:;" id="btn_next" ></a>
			</div>
			</div>
<script type="text/javascript">
    TouchSlide({ 
	slideCell:"#swiper_wrapper",
	titCell:".hd ul", //开启自动分页 autoPage:true ，此时设置 titCell 为导航元素包裹层
	mainCell:".bd ul", 
	effect:"leftLoop", 
	autoPlay:true,//自动播放
    autoPage:true, //自动分页
    switchLoad:"_src" //切换加载，真实图片路径为"_src"
});
</script>
<!--栏目菜单-->
<div id="quick" class="clearfix">
 <nav class="quick-entry-nav clearfix">
	<a class="quick-entry-link fz12 J_ping" report-eventid="MHome_Icons" report-eventparam="全部商品" page_name="index" href="product_list.html">
    <img width="50" height="50" src="<s:url value='/mobile_skin/images/i_1.png'/>"><span>全部商标</span></a>
	<a class="quick-entry-link fz12 J_ping" report-eventid="MHome_Icons" report-eventparam="品牌介绍" page_name="index" href="#">
    <img width="50" height="50" src="<s:url value='/mobile_skin/images/i_2.png'/>"><span>专利列表</span></a>
	<a class="quick-entry-link fz12 J_ping" report-eventid="MHome_Icons" report-eventparam="限时特卖" page_name="index" href="#">
    <img width="50" height="50" src="<s:url value='/mobile_skin/images/i_3.png'/>"><span>知产新闻</span></a>
	<a class="quick-entry-link fz12 J_ping" report-eventid="MHome_Icons" report-eventparam="购物车" page_name="index" href="#">
    <img width="50" height="50" src="<s:url value='/mobile_skin/images/i_4.png'/>"><span>专利培训</span></a>
  </nav>
 </div>
  <div class="AD_link"><img src="<s:url value='/mobile_skin/images/AD_10.png'/>" /></div>
 <!--新品发布-->
  <div class=" floor Hot_product clearfix">
    <div class="title"> 知产新闻<a href="#">更多<i class="iconfont icon-right"></i></a></div>
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">百度搜狗再次开撕 互诉对方输入法专利侵权</div>
			<div style="float:right;"><img src="<s:url value='/mobile_skin/images/i_1.png'/>" width="50" height="50" /></div>
			<div style="clear:both;"></div>
		</div>
		
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">百度搜狗再次开撕 互诉对方输入法专利侵权</div>
			<div style="float:right;"><img src="<s:url value='/mobile_skin/images/i_1.png'/>" width="50" height="50" /></div>
			<div style="clear:both;"></div>
		</div>
		
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">百度搜狗再次开撕 互诉对方输入法专利侵权</div>
			<div style="float:right;"><img src="<s:url value='/mobile_skin/images/i_1.png'/>" width="50" height="50" /></div>
			<div style="clear:both;"></div>
		</div>
		
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">百度搜狗再次开撕 互诉对方输入法专利侵权</div>
			<div style="float:right;"><img src="<s:url value='/mobile_skin/images/i_1.png'/>" width="50" height="50" /></div>
			<div style="clear:both;"></div>
		</div>
		
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">百度搜狗再次开撕 互诉对方输入法专利侵权</div>
			<div style="float:right;"><img src="<s:url value='/mobile_skin/images/i_1.png'/>" width="50" height="50" /></div>
			<div style="clear:both;"></div>
		</div>
		
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">百度搜狗再次开撕 互诉对方输入法专利侵权</div>
			<div style="float:right;"><img src="<s:url value='/mobile_skin/images/i_1.png'/>" width="50" height="50" /></div>
			<div style="clear:both;"></div>
		</div>
		
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>		

    </ul>
   </div>
   <!--限时团购样式-->
    <div class=" floor Hot_product clearfix">
    <div class="title"> 专利培训<a href="<s:url value='/mobileArticle/articleList.html'/>">更多<i class="iconfont icon-right"></i></a></div>
    	<c:forEach items="${mobileArticles}" begin="0" end="4" var="mobileArticle">
    		<div style="padding:5px;">
			<div style="float:left;line-height:50px;"><a href="<s:url value='/mobileArticle/articlePreview.html'/>?articleId=<c:out value='${mobileArticle.id}'/>" title="${mobileArticle.title}" target="_blank">${mobileArticle.title}</a></div>
			<div style="float:right;"><a href="<s:url value='/mobileArticle/articlePreview.html'/>?articleId=<c:out value='${mobileArticle.id}'/>" title="${mobileArticle.title}" target="_blank"><img src="<s:url value='/mobile_skin/images/i_1.png'/>" width="50" height="50" /></a></div>
			<div style="clear:both;"></div>
		</div>
		<div style="border-top:1px solid #dcdcdc ">&nbsp;</div>
    	</c:forEach>
   </div>
  


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
   <script src="js/zepto.min.js" type="text/javascript"></script>
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