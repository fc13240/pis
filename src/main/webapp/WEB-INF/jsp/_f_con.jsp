<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<style type="text/css">
#owl-demo{position:relative;width:280px;height:228px;margin:10px auto 0 auto;}
#owl-demo .item{ position:relative;display:block;}
#owl-demo img{display:block;width:280px;height:208px;}
#owl-demo b{position:absolute;left:0;bottom:0;width:100%;height:38px;background-color:#000;opacity:.5;filter:alpha(opacity=50);}
#owl-demo span{position:absolute;left:0;bottom:3px;width:100%;font:18px/32px "微软雅黑","黑体";color:#fff;text-align:center;}

.owl-pagination{position:absolute;left:0;bottom:-10px;width:100%;height:22px;text-align:center;}
.owl-page{display:inline-block;width:10px;height:10px;margin:0 5px;background-image:url(<s:url value='/images/bg15.png'/>);*display:inline;*zoom:1;}
.owl-pagination .active{width:25px;background-image:url(<s:url value='/images/bg16.png'/>);}
.owl-buttons{display:none;}
.owl-buttons div{position:absolute;top:35%;width:40px;height:80px;margin-top:-10px;text-indent:-9999px;}
.owl-prev{left:0;background-image:url(<s:url value='/images/bg17.png'/>);}
.owl-next{right:0;background-image:url(<s:url value='/images/bg18.png'/>);}
.owl-prev:hover{background-image:url(<s:url value='/images/bg19.png'/>);}
.owl-next:hover{background-image:url(<s:url value='/images/bg20.png'/>);}
.mybtn14_3 a  
{  
   color:#fff;  
}
li{
　　display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;
　　}  
</style>

<link rel="stylesheet" href="<s:url value='/css/owl.carousel.css'/>" />
<link rel="stylesheet" href="<s:url value='/css/news.css'/>" />
<script type="text/javascript" src="<s:url value='/js/jquery-1.8.3.min.js'/>"></script>
 <script type="text/javascript">
 var $180 = $;
 </script>
<script type="text/javascript" src="<s:url value='/js/owl.carousel.js'/>"></script>
<script type="text/javascript">
$(function(){
	$180('#owl-demo').owlCarousel({
		items: 1,
		navigation: true,
		navigationText: ["上一个","下一个"],
		autoPlay: true,
		stopOnHover: true
	}).hover(function(){
		$180('.owl-buttons').show();
	}, function(){
		$180('.owl-buttons').hide();
	});
});
</script>


<div class="floor_1F">
	<div class="news-info-hd">
	        <div class="floor_num">1F</div>
	        <h2>专利天地</h2>
	        <div style="clear:both;"></div>
	</div>
	<div class="news-info-con">

	<div class="news-info-bd clear">
	    <!--资讯-->
		<div class="slide-wrap">
		  <div id="slideNews" class="slide-news">
				<!-- Demo -->
				<div id="owl-demo" class="owl-carousel">
					<c:forEach items="${newShows}" var="newShows">
						<a class="item" href="<s:url value='/news/newsPreview.html'/>?newsId=<c:out value='${newShows.id}'/>" target="_blank"><img src="<s:url value='${newShows.smallImgUrl}'/>" alt="${newShows.keywords}"><b></b><span>${newShows.title}</span></a>
					</c:forEach>
				</div>
				<!-- Demo end -->	
		  </div>
		  <div class="mod-intro-new">
		  </div> <!-- 虚线 -->
		  <div class="news-list">
			<ul>
				<c:forEach items="${news}" var="news">
					<li><a href="<s:url value='/news/newsPreview.html'/>?newsId=<c:out value='${news.id}'/>" title="${news.keywords}" target="_blank">${news.title}</a></li>
				</c:forEach>
			</ul>
			<div><a href="<s:url value='/news/newsList.html'/>">更多新闻</a></div>
			</div>
		</div>
	
	    <div class="side-r-tab info1">
	     <div class="hd">
	      <ul>
	        <li class="on">专利培训</li>
	      
	      </ul>
	     </div>
	     <div class="tempWrap">
	      <div class="tempWrap" style="overflow:hidden; position:relative; width:474px"><div class="bd" style="width: 948px; left: 0px; position: relative; overflow: hidden; padding: 0px; margin: 0px;">
	      	<!--热点资讯-->
	        <div class="intro-right" style="float: left; width: 474px;">
	          <div class="mod-intro-new">
	          			<c:forEach items="${articleShows}" begin="0" end="1" var="articleShow" >
	          			<div class="top-news">
			              <h2 class="f-fwb"><a href="<s:url value='/article/articlePreview.html'/>?articleId=<c:out value='${articleShow.id}'/>"  target="_blank">${articleShow.title}...</a></h2>
			              <p>${articleShow.articleAbstract}...<a href="<s:url value='/article/articlePreview.html'/>?articleId=<c:out value='${articleShow.id}'/>" title="查看详情" target="_blank">[详情]</a></p>
			            </div>						
						</c:forEach>
		            </div>
	          <div class="news-list">
				<ul>
						 <c:forEach items="${articleShows}" begin="2" var="articleShow" >
							<li><a href="<s:url value='/article/articlePreview.html'/>?articleId=<c:out value='${articleShow.id}'/>" title="${articleShow.keywords}" target="_blank">${articleShow.title}</a></li>
						</c:forEach>	 			
		              </ul>
		              <div><a href="<s:url value='/article/articleList.html'/>">更多</a></div>	
	             </div>
	        </div>
	      
	      </div></div>
	    </div>
	  	</div>
	
	

	
	
	   <div class="side-r-tab info1 info2">
	     <div class="hd patent_type">
	      <ul>
	        <li class="on" style="width:70px;">
	        	<a href="javascript:;"  data="1" class="s-class s-hover">发明授权</a>
	        </li>
	        <li class="" style="width:70px;">
	        	<a href="javascript:;"  data="2" class="s-class s-hover">发明公布</a>
	        </li>
	        <li class="" style="width:70px;">
	        	<a href="javascript:;"  data="3" class="s-class s-hover">实用新型</a>
	        </li>
	        <li class="" style="width:70px;">
	        	<a href="javascript:;"  data="4" class="s-class s-hover">外观设计</a>
	        </li>
	      </ul>
	     </div>
	     <div class="tempWrap">
	     	<div style="margin: 10px 15px 0;">
	     	<form class="form-4" action='http://so.lotut.com/patent/search/basicSearch.html' name="site_search" target="_blank" method="get" id="site_search">
			<div class="mc-field-group">
                <input type="text" placeholder="永久免费的专利搜索引擎" name="q" class="text" id="mce-EMAIL">
                <input type="submit" value="搜索" id="mc-embedded-subscribe" class="button">
			</div>
			</form>
			</div>
	      <div class="tempWrap" style="overflow:hidden; position:relative; width:300px"><div class="bd" style="width: 600px; left: 0px; position: relative; overflow: hidden; padding: 0px; margin: 0px;">
	      	<!--活动专题-->
	      	<!--发明授权-->
	        <div class="special-bd box_1" style="float: left; width: 300px;">
			  <div class="news-side">
	            <div class="new-baike news-list">
	                <ul>
	                	<c:forEach items="${IPG}" var="IPG">
	                		 <li><a href="http://so.lotut.com/patent/search/article.html?patent_id=${IPG.id}" title="商标专利交易" target="_blank">${IPG.patent_name}</a></li>
	                	</c:forEach>
		                   </ul>
	                 </div>
	          </div>
	        </div>
			
	      	<!--发明公布-->
	        <div class="special-bd box_2" style="float: left; width: 300px; display:none;">
			  <div class="news-side">
	            <div class="new-baike news-list">
	               <!-- <img class="lazy" src="/images/shangbiao.jpg" alt="知产百科" width="300" height="110"> -->
	                <ul>
		                 <c:forEach items="${AP}" var="AP">
	                		 <li><a href="http://so.lotut.com/patent/search/article.html?patent_id=${AP.id}" title="商标专利交易" target="_blank">${AP.patent_name}</a></li>
	                	</c:forEach>
		                   </ul>
	                 </div>
	          </div>
	        </div>
	        <!--实用新型-->
	        <div class="special-bd box_3" style="float: left; width: 300px;display:none;">
			  <div class="news-side">
	            <div class="new-baike news-list">
	               <!-- <img class="lazy" src="/images/shangbiao.jpg" alt="知产百科" width="300" height="110"> -->
	                <ul>
		                 <c:forEach items="${UMP}" var="UMP">
	                		 <li><a href="http://so.lotut.com/patent/search/article.html?patent_id=${UMP.id}" title="商标专利交易" target="_blank">${UMP.patent_name}</a></li>
	                	</c:forEach>
		                   </ul>
	                 </div>
	          </div>
	        </div>
	        <!--外观设计-->
	        <div class="special-bd box_4" style="float: left; width: 300px;display:none;">
			  <div class="news-side">
	            <div class="new-baike news-list">
	               <!-- <img class="lazy" src="/images/shangbiao.jpg" alt="知产百科" width="300" height="110"> -->
	                <ul>
		                 <c:forEach items="${ADP}" var="ADP">
	                		 <li><a href="http://so.lotut.com/patent/search/article.html?patent_id=${ADP.id}" title="商标专利交易" target="_blank">${ADP.patent_name}</a></li>
	                	</c:forEach>
		                   </ul>
	                 </div>
	          </div>
	        </div>
	        
	      </div></div>
	    </div>
	  </div>
	</div>


	</div>
	
</div>

<!-- 1Fend -->
<div class="floor_1F">
	<div class="news-info-hd" style="clear:both;height: 50px;">
	        <div class="floor_num">2F</div>
	        <h2>专利推荐</h2>
	</div>
	<div class="news-info-con" style="height: 340px;">
		<div class="news-info-bd clear">
			<div class="left-item">
		      <div class="g-item">
		        <div class="g-dtl"> 
		          <a href="<s:url value='/business/patent_article.html?shopType=1'/>" target="_blank"> 
		          	<img class="d-img" src="<s:url value='/images/patent_type_01.jpg'/>"> 
		          </a>
		          <a href="<s:url value='/business/patent_article.html?shopType=1'/>" target="_blank" title="农业/食品/医疗" class="d-name">
		          	<span style="margin-left:20px;font-size:14px;font-weight:700;line-height:45px;">农业/食品/医疗</span>
		          </a>
	        
				  <div>
					  <div style="float:left;width:100px;">
					  	<strong class="p-money"><sub class="m-mark">¥</sub><span class="m-count JS_async_price">1200</span></strong>
					  </div>
					  <div style="float:right;width:100px;" class="box_buy">
					  <a target="_blank" title="立即抢购" href="<s:url value='/business/patent_article.html?shopType=1'/>" class="btn_buy">立即抢购</a>
					  </div>
				  </div>     
		        </div>
		      </div> 	
			</div>	  
	
			<div class="left-item">
		      <div class="g-item">
		        <div class="g-dtl"> 
		          <a href="<s:url value='/business/patent_article.html?shopType=2'/>" target="_blank"> 
		          	<img class="d-img" src="<s:url value='/images/patent_type_02.jpg'/>"> 
		          </a>
		          <a href="<s:url value='/business/patent_article.html?shopType=2'/>" target="_blank" title="化工/冶金/生物" class="d-name">
		          	<span style="margin-left:20px;font-size:14px;font-weight:700;line-height:45px;">化工/冶金/生物</span>
		          </a>
	        
				  <div>
					  <div style="float:left;width:100px;">
					  	<strong class="p-money"><sub class="m-mark">¥</sub><span class="m-count JS_async_price">1200</span></strong>
					  </div>
					  <div style="float:right;width:100px;" class="box_buy">
					  <a target="_blank" title="立即抢购" href="<s:url value='/business/patent_article.html?shopType=2'/>" class="btn_buy">立即抢购</a>
					  </div>
				  </div>     
		        </div>
		      </div> 	
			</div>	 
	
			<div class="left-item">
		      <div class="g-item">
		        <div class="g-dtl"> 
		          <a href="<s:url value='/business/patent_article.html?shopType=3'/>" target="_blank"> 
		          	<img class="d-img" src="<s:url value='/images/patent_type_03.jpg'/>"> 
		          </a>
		          <a href="<s:url value='/business/patent_article.html?shopType=3'/>" target="_blank" title="交通/包装/建筑" class="d-name">
		          	<span style="margin-left:20px;font-size:14px;font-weight:700;line-height:45px;">交通/包装/建筑</span>
		          </a>
	        
				  <div>
					  <div style="float:left;width:100px;">
					  	<strong class="p-money"><sub class="m-mark">¥</sub><span class="m-count JS_async_price">1200</span></strong>
					  </div>
					  <div style="float:right;width:100px;" class="box_buy">
					  <a target="_blank" title="立即抢购" href="<s:url value='/business/patent_article.html?shopType=3'/>" class="btn_buy">立即抢购</a>
					  </div>
				  </div>     
		        </div>
		      </div> 	
			</div>	 
	
			<div class="left-item">
		      <div class="g-item">
		        <div class="g-dtl"> 
		          <a href="<s:url value='/business/patent_article.html?shopType=4'/>" target="_blank"> 
		          	<img class="d-img" src="<s:url value='/images/patent_type_04.jpg'/>"> 
		          </a>
		          <a href="<s:url value='/business/patent_article.html?shopType=4'/>" target="_blank" title="电力/环保/通讯" class="d-name">
		          	<span style="margin-left:20px;font-size:14px;font-weight:700;line-height:45px;">电力/环保/通讯</span>
		          </a>
	        
				  <div>
					  <div style="float:left;width:100px;">
					  	<strong class="p-money"><sub class="m-mark">¥</sub><span class="m-count JS_async_price">1200</span></strong>
					  </div>
					  <div style="float:right;width:100px;" class="box_buy">
					  <a target="_blank" title="立即抢购" href="<s:url value='/business/patent_article.html?shopType=4'/>" class="btn_buy">立即抢购</a>
					  </div>
				  </div>     
		        </div>
		      </div> 	
			</div>	 			
		
		</div>
	</div>
	
</div>
<!-- 2Fend -->


	<style>
	.content_type .content_type_left{ color:#fff; text-decoration:none; font-size:12px;}
	.content_type{height:20px; padding: 8px 0; display: inline-block;}
	.patent-list .content_type{ padding: 5px 0; }
	.content_type .content_type_left,.content_type span{ height: 20px; line-height: 20px; display: inline-block;}
	.content_type .content_type_left{ background: url("<s:url value='/images/common/content_top_img_left.png'/>") no-repeat; padding-left: 10px;}
	.content_type_pa .content_type_left{background: url("<s:url value='/images/common/content_top_img_left2.png'/>") no-repeat;}
	.content_type .content_type_left span{ background: url("<s:url value='/images/common/content_top_img_right.png'/>") no-repeat right top; padding-right:10px;}
	.content_type_pa .content_type_left span{ background: url("<s:url value='/images/common/content_top_img_right2.png'/>") no-repeat right top;}
	.p-money {color: #c00;font-size: 20px;font-weight: 500;}
	.btn_buy{ display:inline-block; padding:0 5px; background:#ff6600 none; color:#fff; line-height:24px;}
	.box_buy a:hover{color:#fff;}
    .btn_buy:hover{background: rgba(255, 102, 0, 0.9);color:#fff!important;}
.g-item {
width: 235px;
height: 337px;
margin-bottom: 15px;

} 
.g-item1 {
width: 280.5px;
height: 300px;
margin-bottom: 15px;
border: 1px solid #f5f5f5;
float: left;
position: relative;
z-index: 1;
}     	
    .g-item:hover{border: 2px solid #D22A2A;}
   
.list-goods .g-dtl {
width: 266px;
margin: 7px;
margin-bottom: 0;
background: #fff;
position: absolute;
z-index: 2;
}
.g-dtl .d-img {
width: 230px;
height: 230px;
display: block;
margin: 0 auto;
-webkit-transition: opacity .15s ease-out;
}
.left-item{height:340px;border: 1px solid #f5f5f5; float:left;} 
    </style>  


<div class="floor_1F" style="height:1020px;">
	<div class="floor_top clearfix">
		<div class="news-info-hd" style="clear:both;height: 50px;">
		        <div class="floor_num">3F</div>
		        <h2>商标推荐</h2>
		        <div style="clear:both;"></div>
		</div>

		<div  style="width:1188px;height:905px;margin-left:10px; overflow:hidden;position:relative;">
		<iframe width="1180" height="1600" frameborder="0" style="position:relative; top:-740px; float:left; left:-10px;" scrolling="no" src="http://r.lotut.com">
		
		</iframe>
		</div>
	</div>	
</div>


