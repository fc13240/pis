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

 <!--新品发布-->
 <div class=" floor Hot_product clearfix">

 
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
				<a style="display:block;font-size: 15px;color: #000;font-family: 'Microsoft YaHei';overflow: hidden;text-overflow: ellipsis;" href="<s:url value='/mobileNews/newsPreview.html'/>?newsId=<c:out value='${news.id}'/>" title="${news.title}" target="_blank">
				${news.title}
				</a>
			</div>
			

			<div style="clear:both;"></div>
		</div>	
		<div style="border-top:1px solid #dcdcdc  ">&nbsp;</div>		
    	</c:forEach>			
   </div>
   
   
	  <div class=" floor Hot_product clearfix" style="" >
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
 <div style="height:100px;"></div>
 <!--底部样式-->
<%@ include file="mobile_menu.jsp"%>

</div>
 <!--固定栏目样式-->

</body>
</html>