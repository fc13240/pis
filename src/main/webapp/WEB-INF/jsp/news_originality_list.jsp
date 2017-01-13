<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="security" prefix="se" %>
<%@ taglib uri="c" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title>创意街——龙图腾 </title>
<meta name="keywords" content="科技门户" />
<meta name="description" content="科技门户" />
<meta itemprop="name" content="" />
<meta http-equiv="cache-control" content="no-transform">
<link rel="shortcut icon" href="http://www.lotut.com/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="<s:url value='/css/index.css'/>" />

<style type="text/css">
#owl-demo{position:relative;width:580px;height:320px;margin:0px auto 0 auto;}
#owl-demo .item{ position:relative;display:block;}
#owl-demo img{display:block;width:580px;height:320px;}
#owl-demo b{position:absolute;left:0;bottom:0;width:100%;height:38px;background-color:#000;opacity:.5;filter:alpha(opacity=50);}
#owl-demo span{position:absolute;left:0;bottom:3px;width:100%;font:18px/32px "微软雅黑","黑体";color:#fff;text-align:center;}

.owl-pagination{position:absolute;left:0;bottom:10px;width:100%;height:22px;text-align:center;}

.owl-buttons{display:none;}
.owl-buttons div{position:absolute;top:50%;width:40px;height:80px;margin-top:-40px;text-indent:-9999px;}
.owl-prev{left:0;background-image:url(<s:url value='/images/bg17.png'/>);}
.owl-next{right:0;background-image:url(<s:url value='/images/bg18.png'/>);}
.owl-prev:hover{background-image:url(<s:url value='/images/bg19.png'/>);}
.owl-next:hover{background-image:url(<s:url value='/images/bg20.png'/>);}
</style>

<link rel="stylesheet" href="<s:url value='/css/owl.carousel.css'/>" />

<script type="text/javascript" src="<s:url value='/js/jquery-1.8.3.min.js'/>"></script>
<script type="text/javascript" src="<s:url value='/js/owl.carousel.js'/>"></script>
<script type="text/javascript">
$(function(){
	$('#owl-demo').owlCarousel({
		items: 1,
		navigation: true,
		navigationText: ["上一个","下一个"],
		autoPlay: true,
		stopOnHover: true
	}).hover(function(){
		$('.owl-buttons').show();
	}, function(){
		$('.owl-buttons').hide();
	});
});
</script>
</head>

<body class="">
<%@ include file="_top_nav.jsp"%> 
<div class="container w1200 ma">
	<dl class="daohang">
	<dd> <span><a href="<s:url value='/news/newsOriginalityList.html'/>" style="margin-left:0px;">创意街</a> &gt;&gt; </span> 
		<a href="<s:url value='/news/newsList.html?typeId=3'/>" target="_blank">漫画西游</a>| 
		<a href="<s:url value='/news/newsList.html?typeId=4'/>" target="_blank">爆笑西游</a>| 
		<a href="<s:url value='/news/newsList.html?typeId=5'/>" target="_blank">创意生活</a>| 
		<a href="<s:url value='/news/newsList.html?typeId=6'/>" target="_blank">创意产品</a>| 
		<a href="<s:url value='/news/newsList.html?typeId=7'/>" target="_blank">创意设计</a>| 
	</dd>
	</dl>
</div>

 
 
<div class="container w1200 ma">
	<div class="main_wrap mt40 clearfix" style="margin-top:30px;">
	
			
		<div class="fl tFocus clearfix" id="tFocus">
			<div id="owl-demo" class="owl-carousel">
		    	<c:forEach items="${hotNews}" var="hotNews" begin="0" end="5">
				<a class="item" href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">
					<img src="<s:url value='${hotNews.smallImgUrl}'/>" alt="">
					<b></b>
					<span>${hotNews.title}</span>
				</a>	
				</c:forEach>
			</div>
		</div>

		<div class="fl col_mod_0 ml30 w280">
			<div class="col_tit_wrap">
				<h3 class="col_tit">最新资讯</h3>
			</div>
			<div class="col_con mt10">
				<div class="news_mod">
			    	<c:forEach items="${hotNews}" var="hotNews" begin="6" end="6">
					<div class="news_tit">
						<span class="tp_block tb_1	">最新</span>
						<a href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">${hotNews.title}</a>
					</div>
					<p class="news_dis">${hotNews.newsAbstract}...</p>
					</c:forEach>				
				</div>

				<ul class="t_n_list mt15" style="margin-top:10px;">
			    	<c:forEach items="${hotNews}" var="hotNews" begin="7" end="12">
					<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">${hotNews.title}</a></li>
					</c:forEach>				
				</ul>
			</div>
		</div>
		<div class="fr col_mod w280">
			<div class="col_tit_wrap clearfix">
				<h3 class="fl col_tit">热门排行</h3>
			</div>
			<div class="col_con">
				<ul class="rank_list">
					<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" varStatus="status" begin="0" end="6">	
					<li>
					<span class="r_num num_${status.count}">0${status.count}</span>
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a>
					</li>						
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>
	<div class="main_1 mt25 clearfix">
		
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=3'/>" target="_blank">漫画西游</a></b>
			<span class="line"></span>
		</div>
		<div class="mvbk_box">
			<ul>
	    	<c:forEach items="${cartoonNews}" var="cartoonNews">
				<li>
				<a href="<s:url value='/news/newsPreview.html?newsId='/>${cartoonNews.id}" title="${cartoonNews.title}" target="_blank">
					<img alt="${cartoonNews.title}" src="<s:url value='${cartoonNews.smallImgUrl}'/>" width="275" height="320">
				</a>
					<span>${cartoonNews.title}</span>
				</li>							
			</c:forEach>			
			</ul>
		</div>		
	</div>
	<!---->
	<div class="main_1 mt25 clearfix">
		
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=4'/>" target="_blank">爆笑西游</a></b>
			<span class="line"></span>
		</div>
		<div class="mvbk_box">
			<ul>
	    	<c:forEach items="${laughNews}" var="laughNews">
				<li>
				<a href="<s:url value='/news/newsPreview.html?newsId='/>${laughNews.id}" title="${laughNews.title}" target="_blank">
					<img alt="${laughNews.title}" src="<s:url value='${laughNews.smallImgUrl}'/>" width="275" height="320">
				</a>
				<span>${laughNews.title}</span>
				</li>							
			</c:forEach>
			</ul>
		</div>	
				
	</div>
<!--  -->
	<div class="main_1 mt25 clearfix">
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=5'/>" target="_blank">创意生活</a></b>
			<span class="line"></span>
		</div>
		
		<div class="c_box4 clearfix mt25">
			<div class="left">
				<div class="c4_datu">
					<!---->
			    	<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="0" end="0">
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">
						<img src="<s:url value='${creativeLifeNews.smallImgUrl}'/>" width="360" height="260">
						<b></b>
						<span>${creativeLifeNews.title}</span>
					</a>					
					</c:forEach>					
					<!---->
				</div>
			</div>
			<div class="mid">
				<div class="m4_first">
					<!---->
			    	<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="1" end="1">	
					<h2><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></h2>
					<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.newsAbstract}...[详细]</a></p>										
					</c:forEach>	

					<!---->
					<ul class="list_com">
						<!---->
				    	<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="2" end="7">	
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></li>									
						</c:forEach>						

					</ul>
				</div>
			</div>
			<div class="right">
				<div class="hq_hqqq">
					<!--环-->
					<dl class="list_com_3">

						<!---->
						
			    	<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="8" end="8">		
						<dt><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></dt>
						<dd>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" class="dlimg" target="_blank">
								<img src="<s:url value='${creativeLifeNews.smallImgUrl}'/>" width="146" height="100">
							</a>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" class="dlintro" target="_blank">${creativeLifeNews.newsAbstract}...[详细]</a>
						</dd>										
					</c:forEach>


						<!---->

					</dl>
					<ul class="list_com">

			    	<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="9" end="12">		
						<li style="height:30px;"><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></li>										
					</c:forEach>						
					</ul>
				</div>			
			
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>
<!---->
	<div class="main_1 mt25 clearfix">
	
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=6'/>" target="_blank">创意产品</a></b>
			<span class="line"></span>
		</div>
		
		<div class="c_box4 clearfix mt25">
			<div class="left">
				<div class="c4_datu">
					<!---->

			    	<c:forEach items="${creativePrductNews}" var="creativePrductNews" begin="0" end="0">
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">
						<img src="<s:url value='${creativePrductNews.smallImgUrl}'/>" width="360" height="260">
						<b></b>
						<span>${creativePrductNews.title}</span>
					</a>					

					</c:forEach>					
					<!---->
				</div>
								
			</div>
			<div class="mid">
				<div class="m4_first">
					<!---->
			    	<c:forEach items="${creativePrductNews}" var="creativePrductNews" begin="1" end="1">	
					<h2><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">${creativePrductNews.title}</a></h2>
					<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">${creativePrductNews.newsAbstract}...[详细]</a></p>										
					</c:forEach>	

					<!---->
					<ul class="list_com">
						<!---->
				    	<c:forEach items="${creativePrductNews}" var="creativePrductNews" begin="2" end="7">	
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">${creativePrductNews.title}</a></li>									
						</c:forEach>						

					</ul>
				</div>
			</div>
			<div class="right">
				<div class="hq_hqqq">
					<!--环-->
					<dl class="list_com_3">

						<!---->
						
			    	<c:forEach items="${creativePrductNews}" var="creativePrductNews" begin="8" end="8">		
						<dt><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">${creativePrductNews.title}</a></dt>
						<dd>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" class="dlimg" target="_blank"><img src="<s:url value='${creativePrductNews.smallImgUrl}'/>" width="146" height="100"></a>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" class="dlintro" target="_blank">${creativePrductNews.newsAbstract}...[详细]</a>
						</dd>										
					</c:forEach>


						<!---->

					</dl>
					<ul class="list_com">

			    	<c:forEach items="${creativePrductNews}" var="creativePrductNews" begin="9" end="12">		
						<li style="height:30px;"><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">${creativePrductNews.title}</a></li>										
					</c:forEach>						
					</ul>
				</div>			
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>
<!--  -->
	<div class="main_1 mt25 clearfix">
	
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=7'/>" target="_blank">创意设计</a></b>
			<span class="line"></span>
		</div>
		
		<div class="c_box4 clearfix mt25">
			<div class="left">
				<div class="c4_datu">
					<!---->

			    	<c:forEach items="${creativeDesignNews}" var="creativeDesignNews" begin="0" end="0">
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">
						<img src="<s:url value='${creativeDesignNews.smallImgUrl}'/>" width="360" height="260">
						<b></b>
						<span>${creativeDesignNews.title}</span>
					</a>					

					</c:forEach>					
					<!---->
				</div>
								
			</div>
			<div class="mid">
				<div class="m4_first">
					<!---->
			    	<c:forEach items="${creativeDesignNews}" var="creativeDesignNews" begin="1" end="1">	
					<h2><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">${creativeDesignNews.title}</a></h2>
					<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">${creativeDesignNews.newsAbstract}...[详细]</a></p>										
					</c:forEach>	

					<!---->
					<ul class="list_com">
						<!---->
				    	<c:forEach items="${creativeDesignNews}" var="creativeDesignNews" begin="2" end="7">	
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">${creativeDesignNews.title}</a></li>									
						</c:forEach>						
					</ul>
				</div>
			</div>
			<div class="right">
				<div class="hq_hqqq">
					<!--环-->
					<dl class="list_com_3">

						<!---->
						
			    	<c:forEach items="${creativeDesignNews}" var="creativeDesignNews" begin="8" end="8">		
						<dt><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">${creativeDesignNews.title}</a></dt>
						<dd>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" class="dlimg" target="_blank"><img src="<s:url value='${creativeDesignNews.smallImgUrl}'/>" width="146" height="100"></a>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" class="dlintro" target="_blank">${creativeDesignNews.newsAbstract}...[详细]</a>
						</dd>										
					</c:forEach>


						<!---->

					</dl>
					<ul class="list_com" >

			    	<c:forEach items="${creativeDesignNews}" var="creativeDesignNews" begin="9" end="12">		
						<li style="height:30px;"><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">${creativeDesignNews.title}</a></li>										
					</c:forEach>						
					</ul>
				</div>			
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>
<!--  -->	

</div>

<%@ include file="_footer.jsp"%> 

</body>
</html>