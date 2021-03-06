<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="security" prefix="se" %>
<%@ taglib uri="c" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<meta name="baidu-site-verification" content="J9vVHbIMTr" />
<meta charset="utf-8">
<!-- <meta name="renderer" content="webkit"> -->
<meta name="baidu-site-verification" content="Vq6t0pWr6Z" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title>龙图腾——创意门户 </title>
<meta name="keywords" content="科技门户" />
<meta name="description" content="科技门户" />
<meta itemprop="name" content="" />
<meta http-equiv="cache-control" content="no-transform">
<link rel="shortcut icon" href="http://www.lotut.com/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="<s:url value='/css/index.css'/>" />

<style type="text/css">

</style>
</head>


<body class="">
<%@ include file="_top_nav.jsp"%>
<div class="container w1200 ma">
	<div class="main_wrap mt40 clearfix" style="height:380px;">
		<div class="fl tFocus clearfix" id="tFocus">
			<div class="tFocus_btn">
				<a href="javascript:void(0);" id="prev" class="prev"></a>
				<a href="javascript:void(0);" id="next" class="next"></a>
			</div>
			<ul class="tFocus-pic zoom" id="tFocus-pic">
				<c:forEach items="${hotNews}" var="hotNews" varStatus="status" begin="0" end="0">	
				<li style="z-index: 5; opacity: 1;">
					<div class="s_tit_wrap">
						<a class="s_pic_tit" href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">${hotNews.title}</a>
					</div>
					<span class="slide_num"><em></em><b>1</b><i>5</i></span>
					<p class="s_info">
						${hotNews.newsAbstract}……
					</p>
					<a class="s_pic" target="_blank" title="${hotNews.title}" href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}"><img src="<s:url value='${hotNews.smallImgUrl}'/>"  width="580" height="267" alt="${hotNews.title}"></a>
				</li>					
				</c:forEach>									
				<c:forEach items="${hotNews}" var="hotNews" varStatus="status" begin="1" end="4">	
				<li style="z-index: 0; opacity: 0;">
					<div class="s_tit_wrap">
						<a class="s_pic_tit" href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">${hotNews.title}</a>
					</div>
					<span class="slide_num"><em></em><b>${status.count+1}</b><i>5</i></span>
					<p class="s_info">
						${hotNews.newsAbstract}……
					</p>
					<a class="s_pic" target="_blank" title="${hotNews.title}" href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}"><img src="<s:url value='${hotNews.smallImgUrl}'/>" width="580" height="267" alt="${hotNews.title}"></a>
				</li>						
				</c:forEach>
			</ul>
			<div class="tFocusBtn nodisplay" id="tFocusBtn">
				<a class="tFocus-leftbtn nodisplay" id="tFocus-leftbtn" href="javascript:void(0);"></a>
				<div class="tFocus-btn clearfix" id="tFocus-btn">
					<ul>
						<li class="active"></li>
						<li class=""></li>
						<li class=""></li>
						<li class=""></li>
						<li class=""></li>
					</ul>
				</div>
				<a class="tFocus-rightbtn fr nodisplay" id="tFocus-rightbtn" href="javascript:void(0);">›</a>
			</div>
		</div>

		<div class="fl col_mod_0 ml30 w280">
			<div class="col_tit_wrap">
				<h3 class="col_tit">今日热点</h3>
			</div>
			<div class="col_con mt10">
				<div class="news_mod">
			    	<c:forEach items="${hotNews}" var="hotNews" begin="5" end="5">
					<div class="news_tit">
						<span class="tp_block tb_1	"  target="_blank">头条</span>
						<a href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">${hotNews.title}</a>
					</div>
					<p class="news_dis">${hotNews.newsAbstract}...</p>						
					</c:forEach>				
				</div>
				<div class="news_mod mt20">
			    	<c:forEach items="${hotNews}" var="hotNews" begin="6" end="6">
					<div class="news_tit">
						<span class="tp_block tb_4	"  >热点</span>
						<a href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">${hotNews.title}</a>
					</div>
					<p class="news_dis">${hotNews.newsAbstract}...</p>
						
					</c:forEach>

				</div>
				<ul class="t_n_list mt15">
			    	<c:forEach items="${hotNews}" var="hotNews" begin="7" end="9">
					<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${hotNews.id}" target="_blank">${hotNews.title}</a></li>
						
					</c:forEach>				

				</ul>
			</div>
		</div>
		<div class="fr col_mod w280">
			<div class="col_tit_wrap clearfix">
				<h3 class="fl col_tit"><a href="<s:url value='/news/newsList.html?typeId=2'/>" target="_blank">科技前沿</a></h3>
			</div>
			<div class="col_con">
				<div class="n_p_mod_0 clearfix">
			    	<c:forEach items="${technologyNews}" var="technologyNews" begin="0" end="0">
					<a class="n_pic fl" href="<s:url value='/news/newsPreview.html?newsId='/>${technologyNews.id}" target="_blank"><img src="<s:url value='${technologyNews.smallImgUrl}'/>"  width="125" height="94" alt=""></a>
					<a class="n_tit" href="<s:url value='/news/newsPreview.html?newsId='/>${technologyNews.id}" target="_blank">${technologyNews.title}</a>	
					</c:forEach>					
                </div>
				<ul class="news_list_dot mt25 clearfix">
			    	<c:forEach items="${technologyNews}" var="technologyNews" begin="1" end="7">
					<li>
						<a href="<s:url value='/news/newsPreview.html?newsId='/>${technologyNews.id}" target="_blank">${technologyNews.title}</a>
					</li>					
					</c:forEach>							
				</ul>
			</div>
		</div>
	</div>

	<div class="main_1 mt25 clearfix">
	
		<div class="title">
			<a href="<s:url value='/news/newsOriginalityList.html'/>" title="创意" target="_blank"><img src="<s:url value='/images/t_1.jpg'/>" alt="创意"></a>
			<strong>
			<a href="<s:url value='/news/newsList.html?typeId=5'/>" >创意生活</a>|
			<a href="<s:url value='/news/newsList.html?typeId=6'/>" >创意产品</a>|
			<a href="<s:url value='/news/newsList.html?typeId=7'/>" >创意设计</a>
			</strong>
		</div>	
		
		<div class="images_box">

	    	<c:forEach items="${cartoonNews}" var="cartoonNews">

			<div class="z_box">
				 <a href="<s:url value='/news/newsPreview.html?newsId='/>${cartoonNews.id}" target="_blank">
				<img alt="${cartoonNews.title}" src="<s:url value='${cartoonNews.smallImgUrl}'/>" width="280" height="280">
				<h4>${cartoonNews.title}</h4>
				</a>
			</div>					
			</c:forEach>	
					
	    	<c:forEach items="${laughNews}" var="laughNews">

			<div class="z_box">
				 <a href="<s:url value='/news/newsPreview.html?newsId='/>${laughNews.id}" target="_blank">
				<img alt="${laughNews.title}" src="<s:url value='${laughNews.smallImgUrl}'/>" width="280" height="280">
				<h4>${laughNews.title}</h4>
				</a>
			</div>					
			</c:forEach>
			<div style="clear:both;"></div>		
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
				
				<div class="c4_zgjq" style="margin-top:12px;">
					<a href="<s:url value='/news/newsList.html?typeId=7'/>"><h4 class="com_ltred">创意设计</h4></a>
					<ul class="list_com_tw">
						<!---->

			    	<c:forEach items="${creativeDesignNews}" var="creativeDesignNews" begin="1" end="3">
						<li>
							<span class="p"><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank"><img src="<s:url value='${creativeDesignNews.smallImgUrl}'/>" width="118" height="82"></a></span>
						  <span class="c">
								<h5><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">${creativeDesignNews.title}</a></h5>
								<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeDesignNews.id}" target="_blank">${creativeDesignNews.newsAbstract}[详细]</a></p>
						  </span>
						</li>					
					</c:forEach>						
						
					</ul>
				</div>				
			</div>
			<div class="mid">
				<div class="m4_first">
					<!---->
			    	<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="0" end="0">	
					<h2><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></h2>
					<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.newsAbstract}...[详细]</a></p>										
					</c:forEach>	

					<!---->
					<ul class="list_com">
						<!---->
				    	<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="1" end="5">	
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></li>									
						</c:forEach>						

					</ul>
				</div>
				<div class="m4_bx2">
					<a href="<s:url value='/news/newsList.html?typeId=6'/>"><h4 class="com_ltred">创意产品</h4></a>
					<dl class="list_com_3">

						<!---->
						
			    	<c:forEach items="${creativePrductNews}" var="creativePrductNews" begin="0" end="0">		
						<dt><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">${creativePrductNews.title}</a></dt>
						<dd>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" class="dlimg" target="_blank"><img src="<s:url value='${creativePrductNews.smallImgUrl}'/>" width="146" height="100"></a>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" class="dlintro" target="_blank">${creativePrductNews.newsAbstract}...[详细]</a>
						</dd>										
					</c:forEach>


						<!---->

					</dl>
					<ul class="list_com">

			    	<c:forEach items="${creativePrductNews}" var="creativePrductNews" begin="1" end="4">		
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativePrductNews.id}" target="_blank">${creativePrductNews.title}</a></li>										
					</c:forEach>						
					</ul>
				</div>
			
			</div>
			<div class="right">
				<div class="hq_hqqq">
					<!--环-->
					<h2 class="com_titlebg shenghuo"><a href="<s:url value='/news/newsList.html?typeId=5'/>" target="_blank">更多</a></h2>
					<div class="pdlf8">
						<!---->
						<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="6" end="6">	
						<div class="cc clearfix">
							<span class="r"><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank"><img src="<s:url value='/images/af3054f5c90e3cbcf000e9e2a7f03dc1.jpg'/>" width="86" height="82"></a></span>
							<span class="l" style="height:60px;overflow: hidden;"><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></span>									
						</div>
						<div class="intro com_a_color" style="height:40px;overflow: hidden;">${creativeLifeNews.newsAbstract}..<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}">[详细]</a></div>
						</c:forEach>
						<!---->
						<ul class="list_com_4" style="margin-top:18px;">
							<!---->
							<c:forEach items="${creativeLifeNews}" var="creativeLifeNews" begin="7" end="8">
							<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeLifeNews.id}" target="_blank">${creativeLifeNews.title}</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>			
			
				<div class="hq_ylbg">
					<h2 class="paihang com_titlebg"></h2>

					<ul class="rank_list">
						<c:forEach items="${creativeClickNews}" var="creativeClickNews" varStatus="status" begin="0" end="6">	
						<li>
						<span class="r_num num_${status.count}">0${status.count}</span>
						<a href="<s:url value='/news/newsPreview.html?newsId='/>${creativeClickNews.id}" target="_blank">${creativeClickNews.title}</a>
						</li>						
						</c:forEach>
					</ul>

				</div>			
			
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>
<!---->
	<div class="main_1 mt25 clearfix">
	
		<div class="title">
			<a href="<s:url value='/news/newsBusinessList.html'/>" title="创业" target="_blank"><img src="<s:url value='/images/t_2.jpg'/>" alt="创业"></a>
			<strong>
			<a href="<s:url value='/news/newsList.html?typeId=8'/>" target="_blank">创业者说</a>|
			<a href="<s:url value='/news/newsList.html?typeId=9'/>" target="_blank">创业新闻</a>|
			<a href="<s:url value='/news/newsList.html?typeId=10'/>" target="_blank">创业政策</a>
			</strong>
		</div>	
	
		<div class="c_box4 clearfix mt25">
			<div class="left">
				<div class="c4_datu">
					<!---->
			    	<c:forEach items="${businessSay}" var="businessSay" begin="0" end="0">
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${businessSay.id}" target="_blank">
						<img src="<s:url value='${businessSay.smallImgUrl}'/>" width="360" height="260">
						<b></b>
						<span>${businessSay.title}</span>
					</a>					
					</c:forEach>					
					<!---->
				</div>
				
				<div class="c4_zgjq" style="margin-top:12px;">
					<a href="<s:url value='/news/newsList.html?typeId=8'/>"><h4 class="com_ltred">创业者说</h4></a>
					<ul class="list_com_tw">
						<!---->
			    	<c:forEach items="${businessSay}" var="businessSay" begin="1" end="3">
						<li>
							<span class="p"><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessSay.id}" target="_blank"><img src="<s:url value='${businessSay.smallImgUrl}'/>" width="118" height="82"></a></span>
						  <span class="c">
								<h5><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessSay.id}" target="_blank">${businessSay.title}</a></h5>
								<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessSay.id}" target="_blank">${businessSay.newsAbstract}[详细]</a></p>
						  </span>
						</li>					
					</c:forEach>							
					</ul>
				</div>	
							
			</div>
			<div class="mid">
				<div class="m4_first">
					<!---->
			    	<c:forEach items="${businessPolicy}" var="businessPolicy" begin="0" end="0">	
					<h2><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessPolicy.id}" target="_blank">${businessPolicy.title}</a></h2>
					<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessPolicy.id}" target="_blank">${businessPolicy.newsAbstract}...[详细]</a></p>										
					</c:forEach>	

					<!---->
					<ul class="list_com">
				    	<c:forEach items="${businessPolicy}" var="businessPolicy" begin="1" end="5">	
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessPolicy.id}" target="_blank">${businessPolicy.title}</a></li>									
						</c:forEach>						
					</ul>
				</div>
				<div class="m4_bx2">
					<a href="<s:url value='/news/newsList.html?typeId=8'/>">
						<h4 class="com_ltred">创业新闻</h4>
					</a>	
					<dl class="list_com_3">
						<!---->
			    	<c:forEach items="${businessNews}" var="businessNews" begin="0" end="0">		
						<dt><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessNews.id}" target="_blank">${businessNews.title}</a></dt>
						<dd>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${businessNews.id}" class="dlimg" target="_blank"><img src="<s:url value='${businessNews.smallImgUrl}'/>" width="146" height="100"></a>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${businessNews.id}" class="dlintro" target="_blank">${businessNews.newsAbstract}...[详细]</a>
						</dd>										
					</c:forEach>
						<!---->
					</dl>
					<ul class="list_com">
			    	<c:forEach items="${businessNews}" var="businessNews" begin="1" end="4">		
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessNews.id}" target="_blank">${businessNews.title}</a></li>										
					</c:forEach>						
					</ul>
				</div>
			</div>
			<div class="right">
				<div class="hq_hqqq">
					<!--环-->
					<h2 class="com_titlebg zhengce"><a href="<s:url value='/news/newsList.html?typeId=10'/>" target="_blank">更多</a></h2>
					<div class="pdlf8">
						<c:forEach items="${businessPolicy}" var="businessPolicy" begin="6" end="6">	
						<div class="cc clearfix">
							<span class="r"><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessPolicy.id}" target="_blank"><img src="<s:url value='/images/af3054f5c90e3cbcf000e9e2a7f03dc1.jpg'/>" width="86" height="82"></a></span>
							<span class="l" style="height:60px;overflow: hidden;"><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessPolicy.id}" target="_blank">${businessPolicy.title}</a></span>									
						</div>
						<div class="intro com_a_color" style="height:40px;overflow: hidden;">${businessPolicy.newsAbstract}..<a href="<s:url value='/news/newsPreview.html?newsId='/>${businessPolicy.id}">[详细]</a></div>
						</c:forEach>
						<!---->
						<ul class="list_com_4">
							<c:forEach items="${businessPolicy}" var="businessPolicy" begin="7" end="8">
							<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessPolicy.id}" target="_blank">${businessPolicy.title}</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>			
			
				<div class="hq_ylbg">
					<h2 class="cy_paihang com_titlebg"></h2>
					<ul class="rank_list">
						<c:forEach items="${businessClickNews}" var="businessClickNews" varStatus="status" begin="0" end="6">	
						<li>
						<span class="r_num num_${status.count}">0${status.count}</span><a href="<s:url value='/news/newsPreview.html?newsId='/>${businessClickNews.id}" target="_blank">${businessClickNews.title}</a>
						</li>						
						</c:forEach>					
					</ul>
				</div>			
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>
<!---->	
	<div class="main_1 mt25 clearfix">
	
		<div class="title">
			<a href="<s:url value='/news/newsPatentList.html'/>" title="专利商标" target="_blank">
				<img src="<s:url value='/images/t_3.jpg'/>" alt="专利商标">
			</a>
			<strong>
			<a href="<s:url value='/news/newsList.html?typeId=11'/>" target="_blank">专利新闻</a>|
			<a href="<s:url value='/news/newsList.html?typeId=12'/>" target="_blank">专利学习</a>|
			<a href="<s:url value='/news/newsList.html?typeId=13'/>" target="_blank">商标资讯</a>|
			<a href="<s:url value='/news/newsList.html?typeId=14'/>" target="_blank">商标学习</a>
			</strong>
		</div>	
		
		<div class="images_box">
	    	<c:forEach items="${patentNews}" var="patentNews">
			<div class="z_box">
				 <a href="<s:url value='/news/newsPreview.html?newsId='/>${patentNews.id}" target="_blank">
				<img alt="${patentNews.title}" src="<s:url value='${patentNews.smallImgUrl}'/>" width="280" height="280">
				<h4>${patentNews.title}</h4>
				</a>
			</div>					
			</c:forEach>	
			<div style="clear:both;"></div>		
		</div>
				
		<div class="c_box4 clearfix">
			<div class="left">
				<div class="c4_zgjq">
					<a href="<s:url value='/news/newsList.html?typeId=12'/>">
						<h4 class="com_ltred">专利学习</h4>
					</a>
					<ul class="list_com_tw">
						<!---->
				    	<c:forEach items="${patentStudy}" var="patentStudy">						
						<li>
						  <span class="p">
						  	<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">
						  		<img src="<s:url value='${patentStudy.smallImgUrl}'/>" width="118" height="82">
						  	</a>
						  </span>
						  <span class="c">
							<h5><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">${patentStudy.title}</a></h5>
							<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">${patentStudy.newsAbstract}..[详细]</a></p>
						  </span>
						</li>											
						</c:forEach>						
					</ul>
				</div>			
			</div>
			<div class="mid">

				<div class="c4_zgjq">
					<a href="<s:url value='/news/newsList.html?typeId=14'/>">
						<h4 class="com_ltred">商标学习</h4>
					</a>
					<ul class="list_com_tw">
				    	<c:forEach items="${brandStudy}" var="brandStudy">						
						<li>
							<span class="p">
								<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">
								<img src="<s:url value='${brandStudy.smallImgUrl}'/>" width="118" height="82">
								</a></span>
						  <span class="c">
								<h5><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">${brandStudy.title}</a></h5>
								<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">${brandStudy.newsAbstract}..[详细]</a></p>
						  </span>
						</li>											
						</c:forEach>	
					</ul>
				</div>
			
			</div>
			<div class="right">

				<div class="hq_hqqq">
					<a href="<s:url value='/news/newsList.html?typeId=13'/>">
						<h4 class="com_ltred">商标资讯</h4>
					</a>					
					<div class="pdlf8">
						<!---->
						<c:forEach items="${brandNews}" var="brandNews" begin="0" end="0">	
						<div class="cc clearfix">
							<span class="r">
								<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandNews.id}" target="_blank">
								<img src="<s:url value='${brandNews.smallImgUrl}'/>" width="86" height="82">
								</a>
							</span>
							<span class="l">
								<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandNews.id}" target="_blank">${brandNews.title}</a>
							</span>									
						</div>
						<div class="intro com_a_color">${brandNews.newsAbstract}..
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandNews.id}">[详细]</a>
						</div>
						</c:forEach>
						<!---->
						<ul class="list_com_4">
							<!---->
							<c:forEach items="${brandNews}" var="brandNews" begin="1" end="10">
							<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandNews.id}" target="_blank">${brandNews.title}</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>		
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>	
</div>

<%@ include file="_footer.jsp"%> 
    <script type="text/javascript" src="<s:url value='/js/jquery-1.7.2.min.js'/>"></script>
    <script type="text/javascript" src="<s:url value='/js/index.js'/>"></script>
    <script>
    // slide
    Focus();
    // nav
    navOn(5404);
    </script>
</body>
</html>