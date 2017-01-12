<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="security" prefix="se" %>
<%@ taglib uri="c" prefix="c" %>
<%@ taglib uri="fmt" prefix="fmt"%>
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
<%@ include file="_top_nav.jsp"%>
<div class="container w1200 ma">
	<div class="nr_cont1 F_Left">

        
		<div class="r_detail_about"> 
		<span>当前位置：</span>
		<a href="<s:url value='/index.html'/>">主页</a> &gt; 
		<a href="<s:url value='/news/newsList.html?typeId=${newsType.typeId }'/>">${newsType.typeName }</a> &gt;  
		</div>         
        	
        <div>
        <c:forEach items="${news}" var="news" varStatus="status">
        <c:if test="${not empty news.smallImgUrl }">
			<div class="plist1 " style="height:161px;">
				<div class="plist1_img F_Left" style="height:140px;">
					<a target="_blank" href="<s:url value='/news/newsPreview.html?newsId=${news.id }'/>"><img src="<s:url value='${news.smallImgUrl}'/>" width="200" height="140" class="dh" /></a>
				</div> 
		        <div class="plist1_p F_Left"> 
					<a href="<s:url value='/news/newsPreview.html?newsId=${news.id }'/>" target="_blank" class="t_zi1"  title="${news.title}" ><h2 style="width:490px;white-space: nowrap;text-overflow: ellipsis;overflow: hidden;">${news.title}</a></h2> 
					<p style="height: 70px;width: 490px;font-size: 12px;color: #989898;overflow: hidden; text-indent:2em;">${news.newsAbstract}</p>
		
					<div class="t_b" style="bottom:20px;"><span><fmt:formatDate value="${news.publishTime }" pattern="yyyy-MM-dd HH:mm"/></span>&nbsp;&nbsp;<span class="tags" tags="${news.keywords }">${news.keywords } </span></div>
		
					<div class="t_i_o2"><div id="bdshare" class="bdshare_t bds_tools get-codes-bdshare" data="{'url':'http://special.ccidnet.com/161206-2','text':'${news.title}','desc':''}"><span class="bds_more" style="background:none !important;"></span></div></div> 
				
				</div>
				<div class="C_Both"></div>
			</div>
			<div class="C_Both"></div>
		</c:if>
		<c:if test="${empty news.smallImgUrl }">
		    <div class="plist11" style="height:161px;">
				<div class="plist11_p F_Left" style="height:140px;"> 
					<h2 style="width:490px;white-space: nowrap;text-overflow: ellipsis;overflow: hidden;"><a href="<s:url value='/news/newsPreview.html?newsId=${news.id }'/>" target="_blank" class="t_zi1"  title="${news.title}" >${news.title}</a></h2> 
					<p style="height: 70px;width: 650px;font-size: 12px;color: #989898;overflow: hidden; text-indent:2em;">${news.newsAbstract}</p>
					<div class="t_b" style="bottom:20px;"><span><fmt:formatDate value="${news.publishTime }" pattern="yyyy-MM-dd HH:mm"/></span>&nbsp;&nbsp;<span class="tags" tags="${news.keywords }">${news.keywords } </span></div>
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
					<a href="?typeId=${newsType.typeId }&currentPage=1">首页</a>
				  <c:choose>
			        <c:when test="${page.currentPage - 1 > 0}"> <a href="?typeId=${newsType.typeId }&currentPage=${page.currentPage - 1}">上一页</a> </c:when>
			        <c:when test="${page.currentPage - 1 <= 0}"> <a href="?typeId=${newsType.typeId }&currentPage=1">上一页</a> </c:when>
			      </c:choose>
			      <c:choose>
			        <c:when test="${page.totalPages==0}"> <a href="?typeId=${newsType.typeId }&currentPage=${page.currentPage}">下一页</a> </c:when>
			        <c:when test="${page.currentPage + 1 < page.totalPages}"> <a href="?typeId=${newsType.typeId }&currentPage=${page.currentPage+1}">下一页</a> </c:when>
			        <c:when test="${page.currentPage + 1 >= page.totalPages}"> <a href="?typeId=${newsType.typeId }&currentPage=${page.totalPages}">下一页</a> </c:when>
			      </c:choose>
			      <c:choose>
			        <c:when test="${page.totalPages==0}"> <a href="?typeId=${newsType.typeId }&currentPage=${page.currentPage}">尾页</a> </c:when>
			        <c:otherwise> <a href="?typeId=${newsType.typeId }&currentPage=${page.totalPages}">尾页</a> </c:otherwise>
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
					<a href="http://r.lotut.com/patent/getPatentDetail.html?patentId=${patent.patent_id }" target="_blank">[${patent.patent_type_name }]${patent.patent_name } - ${patent.app_no }</a>
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
				   		<a href="http://r.lotut.com/brand/getbrandDetail.html?brandId=${brand.id }" target="_blank">
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
							<a href="http://r.lotut.com/brand/getbrandDetail.html?brandId=${brand.id }" target="_blank" title="${brand.name }">${brand.name }</a>
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

<%@ include file="_footer.jsp"%> 
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
		
		var url = "<s:url value='/news/newsList.html'/>?currentPage=" + pageNo + "&typeId=" + ${newsType.typeId };
		
		
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