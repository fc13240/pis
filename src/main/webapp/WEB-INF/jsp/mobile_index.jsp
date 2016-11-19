<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="security" prefix="se" %>
<%@ taglib uri="c" prefix="c" %>
<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta name="viewport" content="width=device-width,initial-scale=1" />
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
 <!--幻灯片样式-->
 <div id="scwrapper" class="scroll-wrapper">
  <div class="floor new-slider-floor"> 
  <div class="main_visual" id="swiper_wrapper">
                <div class="flicking_con hd">               	
                    <ul></ul>
            </div>
			<div class="main_image bd">
				<ul >			
				
       <c:forEach items="${imageNews}" var="imageNews" varStatus="status">     
      <li><a href="<s:url value='/mobileNews/newsPreview.html'/>?newsId=${imageNews.id}"><img src="<s:url value='${imageNews.smallImgUrl}'/>" /></a></li>
      </c:forEach>				
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
 


<!-- <div class="AD_link"><img src="<s:url value='/mobile_skin/images/AD_10.png'/>" /></div>-->
 <!--新品发布-->
 <div class=" floor Hot_product clearfix">
    <%-- <div class="title"> 知产专利<a href="<s:url value='/mobilePatent/list.html'/>">更多<i class="iconfont icon-right"></i></a></div>
    	<c:forEach items="${patents}" begin="0" end="4" var="patent">		
		<div style="padding:5px;">
			<div style="float:left;line-height:50px;">
				<a href="<s:url value='/mobilePatent/patentPreview.html'/>?patentId=<c:out value='${patent.patentId}'/>" title="${patent.name}" target="_blank">
				${patent.name}
				</a>
			</div>
			<div style="clear:both;"></div>
		</div>	
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>		
    	</c:forEach>			
   </div> --%>
 
  <div class=" floor Hot_product clearfix">
    <div class="title"> 知产新闻<a href="<s:url value='/mobileNews/newsList.html'/>">更多<i class="iconfont icon-right"></i></a></div>
    	<c:forEach items="${news}" begin="0" end="4" var="news">		
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
   </div>
   
   
  <div class=" floor Hot_product clearfix" style="margin-bottom:80px;" >
    <div class="title"> 专利培训<a href="<s:url value='/mobileArticle/articleList.html'/>">更多<i class="iconfont icon-right"></i></a></div>
    	<c:forEach items="${articles}" begin="0" end="4" var="articles">		
		<div style="padding:5px;">
			<div style="float:left;line-height:25px;">
				<a style="font-size: 15px;color: #000;font-family: 'Microsoft YaHei';"  href="<s:url value='/mobileArticle/articlePreview.html'/>?articleId=<c:out value='${articles.id}'/>" title="${articles.title}" target="_blank">
				${articles.title}
				</a>
			</div>
			<div style="clear:both;"></div>
		</div>	
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>		
    	</c:forEach>			
   </div>   
  


  </div> 
 </div>
 <!--底部样式-->
<%@ include file="mobile_menu.jsp"%>

</div>
 <!--固定栏目样式-->
<div class="global-nav global-nav--current">
 <!-- 
    <div class="global-nav__operate-wrap">
        <span class="global-nav__yhd-logo"></span>
        <span class="global-nav__operate-cart-num" id="globalId">0</span>
    </div>
     -->
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