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
<link rel="stylesheet" href="<s:url value='/css/list.css'/>" />
<style type="text/css">

</style>
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
	<div class="logo">
    	<a href=""><img src="<s:url value='/images/logo.png'/>" alt="创意街"></a>
    </div>
</div>

<div class="fx_nav">
   <div class="wrap clearfix">
   
 
   
        <div class="lf1">
          <p>
            <a href="<s:url value='/index.html'/>" target="_blank"><b>首页</b></a>
            </p>

        </div>
        <div class="lf2" >
            <a href="<s:url value='/news/newsList.html'/>" style="margin-left:10px;" target="_blank"><b>科技前沿</b></a>
        </div>	
        <div class="lf3" >
            <a href="<s:url value='/news/newsOriginalityList.html'/>" style="margin-left:10px;" target="_blank"><b>创意街</b></a>
        </div>	
        <div class="lf2" >
            <a href="<s:url value='/news/newsBusinessList.html'/>" style="margin-left:10px;" target="_blank"><b>创业服务</b></a>
        </div>	
        <div class="lf2" >
            <a href="/" style="margin-left:10px;" target="_blank"><b>漫画西游</b></a>
        </div>	
        <div class="lf2" >
            <a href="/" style="margin-left:10px;" target="_blank"><b>爆笑西游</b></a>
        </div>	
        <div class="lf2" >
            <a href="<s:url value='/news/newsPatentList.html'/>" style="margin-left:10px;" target="_blank"><b>专利商标</b></a>
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
	<div class="nr_cont1 F_Left">
		<div class="tittle_x">
            <a href="">首页</a>
            <em>&gt;</em> <a href="">科技前沿</a>
         <!--   <em>&gt;</em> <a href="#">列表</a> --> 
        </div>	
        <div>
        <c:forEach items="${news}" var="news" varStatus="status">
        <c:if test="${not empty news.smallImgUrl }">
			<div class="plist1 ">
				<div class="plist1_img F_Left">
					<img src="<s:url value='${news.smallImgUrl}'/>" width="200" height="130" class="dh" />
				</div> 
		        <div class="plist1_p F_Left"> 
					<h2><a href="" target="_blank" class="t_zi1"  title=""" >${news.title}</a></h2> 
					<p></p> 
		
					<div class="t_b"><span><fmt:formatDate value="${news.publishTime }" pattern="MM-dd HH:mm"/></span><span class="tags" tags="${news.keywords }">${news.keywords } </span></div>
		
					<div class="t_i_o2"><div id="bdshare" class="bdshare_t bds_tools get-codes-bdshare" data="{'url':'http://special.ccidnet.com/161206-2','text':'${news.title}','desc':''}"><span class="bds_more" style="background:none !important;"></span></div></div> 
				
				</div>
				<div class="C_Both"></div>
			</div>
			<div class="C_Both"></div>
		</c:if>
		<c:if test="${empty news.smallImgUrl }">
		    <div class="plist11">
				<div class="plist11_p F_Left"> 
					<h2><a href="" target="_blank" class="t_zi1"  title="" >${news.title}</a></h2> 
					<p></p> 
					<div class="t_b"><span><fmt:formatDate value="${news.publishTime }" pattern="MM-dd HH:mm"/></span><span class="tags" tags="${news.keywords }">${news.keywords } </span></div>
					<div class="t_i_o2"><div id="bdshare" class="bdshare_t bds_tools get-codes-bdshare" data="{'url':'http://special.ccidnet.com/161115-2','text':'${news.title}','desc':''}"><span class="bds_more" style="background:none !important;"></span></div></div> 
				</div>
				<div class="C_Both"></div>
			</div>
			<div class="C_Both"></div>
		</c:if>
		</c:forEach>
		</div>
		<!-- 分页功能 start -->
		<div id="page"> 
			<div style="margin-left:20px;height:60px;">
			 
			<c:if test="${page.totalPages > 1}"> 
				<div class="col-lg-12"> 
					<a>共 ${page.totalPages} 页 </a>
					<a>第 ${page.currentPage} 页 </a>
					<a href="?typeId=2&currentPage=1">首页</a>
				  <c:choose>
			        <c:when test="${page.currentPage - 1 > 0}"> <a href="?typeId=2&currentPage=${page.currentPage - 1}">上一页</a> </c:when>
			        <c:when test="${page.currentPage - 1 <= 0}"> <a href="?typeId=2&currentPage=1">上一页</a> </c:when>
			      </c:choose>
			      <c:choose>
			        <c:when test="${page.totalPages==0}"> <a href="?typeId=2&currentPage=${page.currentPage}">下一页</a> </c:when>
			        <c:when test="${page.currentPage + 1 < page.totalPages}"> <a href="?typeId=2&currentPage=${page.currentPage+1}">下一页</a> </c:when>
			        <c:when test="${page.currentPage + 1 >= page.totalPages}"> <a href="?typeId=2&currentPage=${page.totalPages}">下一页</a> </c:when>
			      </c:choose>
			      <c:choose>
			        <c:when test="${page.totalPages==0}"> <a href="?typeId=2&currentPage=${page.currentPage}">尾页</a> </c:when>
			        <c:otherwise> <a href="?typeId=2&currentPage=${page.totalPages}">尾页</a> </c:otherwise>
			      </c:choose>
			     
			      <a><input type="text" id="page.pageNo" style="width:30px;height:14px" name="currentPage" onKeyDown="gotoPageForEnter(event)"/></a>
			      <a href="javascript:void;" onClick="javascript:gotoPage()">跳转</a> 
		       </div>
		    </c:if>
			</div>
			
		</div>	
		<!-- 分页功能 End -->	
	</div>
<!-- left end	 -->
	<div class="nr_cont2 F_Right">
		<div class="box">
			<h2><a href="#" class="a1 box_hover">专利推荐</a></h2>
			<ul class="h_second_list">
			<c:forEach items="${patents}" var="patent" varStatus="status">
				<li>
				<span class="h_list_tit" style="font-size:14px;">
					<a href="/patent/detail.html?patentId=${patent.patent_id }" target="_blank">[${patent.patent_type_name }]${patent.patent_name } - ${patent.app_no }</a>
				</span> 
				</li>
			</c:forEach>			
		
		</ul>			
		</div>	
		
		<div class="box" style="margin-top:20px;">
			<h2><a href="#" class="a1 box_hover">商标推荐</a></h2>	
			<ul class="good-list-item">
    			<c:forEach items="${brands}" var="brand" varStatus="status">
		    	<li>
				 <dl>
				    <dd class="pic"> 
				   		<a href="<s:url value='/brand/getbrandDetail.html?brandId=${brand.id }'/>" target="_blank">
							<div style="position: relative;width:192px;height:154px;">   
							<c:choose>
							<c:when test="${not empty brand.imageUrl }">
								<img onerror="javascript:this.src='<s:url value="/images/brands_img/${brand.brandCategory.categoryId}_imagemagick_small.jpg"/>'" width="100%" height="100%" no-repeat src="<s:url value='${brand.imageUrl }'/>"/>
							</c:when>
							<c:otherwise>
								<img onerror="javascript:this.src='<s:url value="/images/brands_img/${brand.brandCategory.categoryId}_imagemagick_small.jpg"/>'" width="100%" height="100%" no-repeat src="<s:url value='/images/brands_img/${brand.brandCategory.categoryId}_imagemagick_small.jpg'/>"/>
							</c:otherwise>
							</c:choose> 
							<span style="position: absolute;font-family:Microsoft YaHei;font-size:20px;top: 60px;width:100%;left:0;z-index:1;text-align: center;">${brand.name }</span>
				   			</div>
						</a> 
					</dd>
					<dt class="name"> 
						<div style="width:110px;float:left;">
							<a href="/brand/getbrandDetail.html?brandId=${brand.id }" target="_blank" title="THINKCARD">${brand.name }</a>
						</div> 
						<div class="num" style="float:left;">¥${brand.price }</div>
				 	</dt>
				</dl>
		      </li>
		      </c:forEach>
    
    </ul>				
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
<!--  fen xiang -->
<script type="text/javascript" id="bdshare_js" data="type=tools" ></script>
<script type="text/javascript" id="bdshell_js"></script>
<script type="text/javascript">
	document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000);
	

	function gotoPage() {
		var pageNo = document.getElementById("page.pageNo").value;
		
		if (isNaN(pageNo)) {
			alert("请输入数值");
			return;
		}
		
		if(pageNo==""){
			alert("请输入数值")
			return;
		}
		
		pageNo = parseInt(pageNo);
		
		if (pageNo < 1 || pageNo > parseInt("${page.totalPages}")) {
			alert("只能输入1-${page.totalPages}之间的数值");
			return;
		}
		
		var url = "<s:url value='/news/newsList.html'/>?currentPage=" + pageNo + "&typeId=2";
		
		
		location.href = url
		
	}

	function gotoPageForEnter(event) {
		var e = event ? event : window.event;
				
		if(event.keyCode == 13) {
			gotoPage();
		}
	}
</script>

</body>
</html>