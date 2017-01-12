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
<title>创业服务——龙图腾 </title>
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
<div class="fx_top">
	<div class="wrap">
    		<div class="left">
				<span class="co">科技迷们的网络聚集地 -- 创意街</span>
            </div>

    </div>
</div>


<div class="fx_logo clearfix">
	<div class="logo" style="float:left;">
    	<a href="<s:url value='/index.html'/>"><img src="<s:url value='/images/logo.png'/>" alt="创意街"></a>
    </div>
<!--  -->
	<div class="mc-field-group" style="float:left;width:600px;margin-left:100px;margin-top:15px">
       <input type="text" placeholder="关键字" name="q" class="text" id="mce-EMAIL">
       <input type="hidden" name="type" value="">
       <input type="submit" value="搜索" id="mc-embedded-subscribe" class="button">
    </div>
    <div style="clear:both;"></div>
<style>
#mce-EMAIL {
    background: #FFFFFF;
    float: left;
    border: 2px solid #F16059;
    box-shadow: none;
    font-size: 16px;
    height: 40px;
    line-height: 40px;
    margin: 0;
    padding: 3;
    max-width: 400px;
    min-width: 400px;
    width: 400px;
    display: inline-block;
    outline: 0;
}
#mc-embedded-subscribe {
    background: #db000a;
    float: left;
    border: 2px solid #db000a;
    box-shadow: none;
    font-size: 16px;
    height: 44px;
    line-height: 44px;
    
    font-weight: 700;
    color: white;
    margin: 0;
    width: 100px;
    display: inline-block;
    vertical-align: middle;
    outline: 0; 
}
</style>        
    <!--  -->
</div>

<div class="fx_nav">
   <div class="wrap clearfix">
   
 
   
        <div class="lf1">
          <p>
            <a href="<s:url value='/index.html'/>"><b>首页</b></a>
            </p>

        </div>
        <div class="lf2" >
            <a href="<s:url value='/news/newsList.html?typeId=2'/>" style="margin-left:10px;"><b>科技前沿</b></a>
        </div>	
        <div class="lf3" >
            <a href="<s:url value='/news/newsOriginalityList.html'/>" style="margin-left:10px;"><b>创意街</b></a>
        </div>	
        <div class="lf2" >
            <a href="<s:url value='/news/newsBusinessList.html'/>" style="margin-left:10px;"><b>创业服务</b></a>
        </div>	
        <div class="lf2" >
            <a href="<s:url value='/news/newsList.html?typeId=3'/>" style="margin-left:10px;"><b>漫画西游</b></a>
        </div>	
        <div class="lf2" >
            <a href="<s:url value='/news/newsList.html?typeId=4'/>" style="margin-left:10px;"><b>爆笑西游</b></a>
        </div>	
        <div class="lf2" >
            <a href="<s:url value='/news/newsPatentList.html'/>" style="margin-left:10px;"><b>专利商标</b></a>
        </div>	
        <div class="lf2" >
            <a href="http://r.lotut.com/patent/index.html" style="margin-left:10px;" target="_blank"><b>专利交易</b></a>
        </div>	
        <div class="lf2" >
            <a href="http://r.lotut.com/brand/index.html" style="margin-left:10px;" target="_blank"><b>商标交易</b></a>
        </div>			
		
        <div class="lf2" >
            <a href="http://g.lotut.com" style="margin-left:10px;" target="_blank"><b>专利管理</b></a>
        </div>	
        <div class="lf2" >
            <a href="http://so.lotut.com" style="margin-left:10px;" target="_blank"><b>专利检索</b></a>
        </div>			
				
		
	
    </div>
</div> 

<div class="container w1200 ma">
	<dl class="daohang">
	<dd> <span><a href="<s:url value='/news/newsPatentList.html'/>" style="margin-left:0px;">专利商标</a> &gt;&gt; </span> 
	<a href="<s:url value='/news/newsList.html?typeId=11'/>" target="_blank">专利新闻</a>| 
	<a href="<s:url value='/news/newsList.html?typeId=12'/>" target="_blank">专利学习</a>| 
	<a href="<s:url value='/news/newsList.html?typeId=13'/>" target="_blank">商标资讯</a>| 
	<a href="<s:url value='/news/newsList.html?typeId=14'/>" target="_blank">商标学习</a>| 	
	</dd>
	</dl>
</div>

 
 
<div class="container w1200 ma">
	<div class="main_wrap mt40 clearfix" style="margin-top:30px;">
	
			
		<div class="fl tFocus clearfix" id="tFocus">
			<div id="owl-demo" class="owl-carousel">
		    	<c:forEach items="${patentNews}" var="patentNews" begin="0" end="5">
				<a class="item" href="<s:url value='/news/newsPreview.html?newsId='/>${patentNews.id}" target="_blank">
					<img src="<s:url value='${patentNews.smallImgUrl}'/>" alt="">
					<b></b>
					<span>${patentNews.title}</span>
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
			    	<c:forEach items="${patentNews}" var="patentNews" begin="0" end="0">
					<div class="news_tit">
						<span class="tp_block tb_1	" >最新</span>
						<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentNews.id}" target="_blank">${patentNews.title}</a>
					</div>
					<p class="news_dis">${patentNews.newsAbstract}...</p>
						
					</c:forEach>				

				</div>

				<ul class="t_n_list mt15" style="margin-top:10px;">
			    	<c:forEach items="${patentNews}" var="patentNews" begin="0" end="5">
					<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentNews.id}" target="_blank">${patentNews.title}</a></li>
						
					</c:forEach>				

				</ul>
			</div>
		</div>
		<div class="fr col_mod w280">
			<div class="col_tit_wrap clearfix">
				<h3 class="fl col_tit"><a href="" target="_blank">热门排行</a></h3>
			</div>
			<div class="col_con">

				<ul class="rank_list">
					<c:forEach items="${patentNews}" var="patentNews" varStatus="status" begin="0" end="6">	
					<li>
					<span class="r_num num_${status.count}">0${status.count}</span>
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentNews.id}" target="_blank">${patentNews.title}</a>
					</li>						
					</c:forEach>
	
				</ul>
			</div>
		</div>
	</div>

	<div class="main_1 mt25 clearfix">
		
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=11'/>" target="_blank">专利新闻</a></b>
			<span class="line"></span>
		</div>
		<div class="mvbk_box">
			<ul>
	    	<c:forEach items="${patentNews}" var="patentNews" begin="0" end="3">
				<li>
				<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentNews.id}" title="${patentNews.title}" target="_blank"><img alt="${patentNews.title}" src="<s:url value='${patentNews.smallImgUrl}'/>" width="275" height="320"></a>
					<span>${patentNews.title}</span>
				</li>							
			</c:forEach>			

			
			</ul>
		</div>	
			
			
			
	</div>
	<!---->
	<div class="main_1 mt25 clearfix">
	
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=12'/>" target="_blank">专利学习</a></b>
			<span class="line"></span>
		</div>
		
		<div class="c_box4 clearfix mt25">
			<div class="left">
				<div class="c4_datu">
					<!---->

			    	<c:forEach items="${patentStudy}" var="patentStudy" begin="0" end="0">
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">
						<img src="<s:url value='${patentStudy.smallImgUrl}'/>" width="360" height="260">
						<b></b>
						<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}">
							<span>${patentStudy.title}</span>
						</a>
					</a>					
					</c:forEach>					
					<!---->
				</div>
								
			</div>
			<div class="mid">
				<div class="m4_first">
					<!---->
			    	<c:forEach items="${patentStudy}" var="patentStudy" begin="1" end="1">	
					<h2><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">${patentStudy.title}</a></h2>
					<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">${patentStudy.newsAbstract}...[详细]</a></p>										
					</c:forEach>	

					<!---->
					<ul class="list_com">
						<!---->
				    	<c:forEach items="${patentStudy}" var="patentStudy" begin="2" end="6">	
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">${patentStudy.title}</a></li>									
						</c:forEach>						

					</ul>
				</div>
				
			
			</div>
			<div class="right">
				<div class="hq_hqqq">
					<!--环-->
					<dl class="list_com_3">

						<!---->
						
			    	<c:forEach items="${patentStudy}" var="patentStudy" begin="7" end="7">		
						<dt><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">${patentStudy.title}</a></dt>
						<dd>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" class="dlimg" target="_blank"><img src="<s:url value='${patentStudy.smallImgUrl}'/>" width="146" height="100"></a>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" class="dlintro" target="_blank">${patentStudy.newsAbstract}...[详细]</a>
						</dd>										
					</c:forEach>


						<!---->

					</dl>
					<ul class="list_com">

			    	<c:forEach items="${patentStudy}" var="patentStudy" begin="8" end="10">		
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${patentStudy.id}" target="_blank">${patentStudy.title}</a></li>										
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
			<b><a href="<s:url value='/news/newsList.html?typeId=13'/>" target="_blank">商标资讯</a></b>
			<span class="line"></span>
		</div>
		<div class="mvbk_box">
			<ul>
	    	<c:forEach items="${brandNews}" var="brandNews" begin="0" end="3">
				<li>
				<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandNews.id}" title="${brandNews.title}" target="_blank">
					<img alt="${brandNews.title}" src="<s:url value='${brandNews.smallImgUrl}'/>" width="275" height="320">
				</a>
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandNews.id}"><span>${brandNews.title}</span></a>
				</li>							
			</c:forEach>
			</ul>
		</div>	
				
	</div>
<!--  -->

	<div class="main_1 mt25 clearfix">
	
		<div class="m_b_bt">
			<b><a href="<s:url value='/news/newsList.html?typeId=14'/>" target="_blank">商标学习</a></b>
			<span class="line"></span>
		</div>
		
		<div class="c_box4 clearfix mt25">
			<div class="left">
				<div class="c4_datu">
					<!---->
			    	<c:forEach items="${brandStudy}" var="brandStudy" begin="0" end="0">
					<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">
						<img src="<s:url value='${brandStudy.smallImgUrl}'/>" width="360" height="260">
						<b></b>
						<span>${brandStudy.title}</span>
					</a>					
					</c:forEach>					
					<!---->
				</div>				
			</div>
			<div class="mid">
				<div class="m4_first">
					<!---->
			    	<c:forEach items="${brandStudy}" var="brandStudy" begin="1" end="1">	
					<h2><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">${brandStudy.title}</a></h2>
					<p><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">${brandStudy.newsAbstract}...[详细]</a></p>										
					</c:forEach>	

					<!---->
					<ul class="list_com">
						<!---->
				    	<c:forEach items="${brandStudy}" var="brandStudy" begin="2" end="6">	
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">${brandStudy.title}</a></li>									
						</c:forEach>						
					</ul>
				</div>
			</div>
			<div class="right">
				<div class="hq_hqqq">
					<!--环-->
					<dl class="list_com_3">
						<!---->
			    	<c:forEach items="${brandStudy}" var="brandStudy" begin="7" end="7">		
						<dt><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">${brandStudy.title}</a></dt>
						<dd>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" class="dlimg" target="_blank"><img src="<s:url value='${brandStudy.smallImgUrl}'/>" width="146" height="100"></a>
							<a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" class="dlintro" target="_blank">${brandStudy.newsAbstract}...[详细]</a>
						</dd>										
					</c:forEach>
						<!---->
					</dl>
					<ul class="list_com">

			    	<c:forEach items="${brandStudy}" var="brandStudy" begin="8" end="10">		
						<li><a href="<s:url value='/news/newsPreview.html?newsId='/>${brandStudy.id}" target="_blank">${brandStudy.title}</a></li>										
					</c:forEach>						
					</ul>
				</div>			
			</div>
			<div style="clear:both;"></div>
		</div>
	</div>
</div>

<div id="footer">

	<ul class="footer">            
        <li><a onclick="AddFavorite(window.location,document.title)" href="javascript:void(0)">
        		<span style="color:#7d7d7d;">加入收藏</span>
        	</a>
		&nbsp;&nbsp;©&nbsp;&nbsp;2015&nbsp;&nbsp;Lotut&nbsp;&nbsp;使用龙图腾前必读&nbsp;&nbsp;
		皖ICP备123456789号&nbsp;&nbsp;意见箱：lotuto@163.com&nbsp;&nbsp;
		<span style="display:inline-block;position:relative;width:auto;">
		<a href="https://ss.knet.cn/verifyseal.dll?sn=e16072934010064299rolh000000&amp;ct=df&amp;a=1&amp;pa=0.09530572313815355" id="kx_verify" tabindex="-1" target="_blank" kx_type="图标式" style="display:inline-block;">
		<img src="http://rr.knet.cn/static/images/logo/cnnic.png" style="border:none;height:25px;" oncontextmenu="return false;" alt="可信网站">
		</a>
		</span>
		</li>            
     </ul>
</div>
<style>
#footer {
    width: 100%;
    overflow: hidden;
    background: #e7e7e7;
    font-family: SimSun;
}
.footer li {
    text-align: center;
    line-height: 45px;
    height: 45px;
    color: #7d7d7d;
    font-family: "微软雅黑";
}
.footer a {
    text-decoration: none;
    color: #333;
}
</style>

</body>
</html>