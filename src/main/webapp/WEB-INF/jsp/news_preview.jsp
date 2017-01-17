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
<title>${news.title}——龙图腾 </title>
<meta name="keywords" content="科技门户" />
<meta name="description" content="科技门户" />
<meta itemprop="name" content="" />
<meta http-equiv="cache-control" content="no-transform">
<link rel="shortcut icon" href="http://www.lotut.com/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="<s:url value='/css/index.css'/>" />
<link rel="stylesheet" href="<s:url value='/css/list.css'/>" />
<link rel="stylesheet" href="<s:url value='/css/article.css'/>" />
<script src="<s:url value='/js/jquery.min.js'/>"></script>
<style type="text/css">

</style>
</head>

<body class="">
<%@ include file="_top_nav.jsp"%>
<div class="container w1200 ma">
		<div class="r_detail_about"> 
		<span>当前位置：</span>
		<a href="<s:url value='/index.html'/>">主页</a> &gt; 
		<a href="<s:url value='/news/newsList.html?typeId=${news.newsType.typeId }'/>">${news.newsType.typeName }</a> &gt;  
		</div> 
	<div class="nr_cont1 F_Left">     
        <div>
<!--  -->
			<div class="mod1_cont" id="mod1_cont" runat="server">					
				<h2 style="margin: 0px 0px 20px;padding: 0px;line-height: 22px;font-size: 24px;text-indent: 28px;text-align: center;">${news.title}</h2>
				<div style="width:400px;float:left;">
					<span class="font-article" style="">
					发表时间：<fmt:formatDate  value="${news.publishTime}" pattern="yyyy年MM月dd日" />
					</span>
					<span class="font-article" style="margin-left:50px;">
						<c:choose>
							<c:when test="${not empty news.source}">
								来源：${news.source}
							</c:when>
							<c:when test="${not empty news.author}">
								作者：${news.author}
							</c:when>
							<c:otherwise>
								来源：互联网
							</c:otherwise>
						</c:choose>					
					</span>

				</div>
				<div style="width:200px;float:right;">
					<div class="bdsharebuttonbox">
						
						<a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a>
						<a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a>
						<a href="#" class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a>
						<a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a>
						<a href="#" class="bds_more" data-cmd="more"></a>
					</div>
				</div>
				<div style="clear:both;"></div>
				<div class="line01"></div>
				<br/>
				<div class="content" style="line-height: 22px;font-size: 14px;text-indent: 28px;font-family: simsun;">
					<p>
						${news.content}					
					</p>
				</div>
				<br/>
				<div class="box02" style="height:214px;text-align:center;margin-bottom:25px;">
				    <img style="height:100%;" src="<s:url value='/images/gongzhong.png'/>">
				</div>
				
				<div class="txt_share_box">
					<div class="bdsharebuttonbox">
						<a href="#" class="bds_more" data-cmd="more"></a>
						<a href="#" class="bds_qzone yc_qzone" style="background-image: url(<s:url value='/images/qq_581694f4.png'/>);width: 140px;height: 40px;display: block;background-repeat: no-repeat;background-position: 26px center;font: 14px/40px Microsoft YaHei;color: #222;float: left;margin: 0 8px;text-indent: 64px;-moz-border-radius: 5px;-webkit-border-radius: 5px;border-radius: 5px;cursor: pointer;display: inline;}" data-cmd="qzone" title="分享到QQ空间">
						QQ空间
						</a>
						<a href="#" class="bds_tsina yc_sina" style="background-image: url(<s:url value='/images/sina_ed3b5529.png'/>);width: 140px;height: 40px;display: block;background-repeat: no-repeat;background-position: 26px center;font: 14px/40px Microsoft YaHei;color: #222;float: left;margin: 0 8px;text-indent: 64px;-moz-border-radius: 5px;-webkit-border-radius: 5px;border-radius: 5px;cursor: pointer;display: inline;}" data-cmd="tsina" title="分享到新浪微博">
						微博
						</a>
						<a href="#" class="bds_weixin yc_wx" style="background-image: url(<s:url value='/images/wx_0868d839.png'/>);width: 140px;height: 40px;display: block;background-repeat: no-repeat;background-position: 26px center;font: 14px/40px Microsoft YaHei;color: #222;float: left;margin: 0 8px;text-indent: 64px;-moz-border-radius: 5px;-webkit-border-radius: 5px;border-radius: 5px;cursor: pointer;display: inline;}" data-cmd="weixin" title="分享到微信">微信</a>
						<a href="#" class="bds_weixin yc_wxq" style="background-image: url(<s:url value='/images/wxq_d0336192.png'/>);width: 140px;height: 40px;display: block;background-repeat: no-repeat;background-position: 26px center;font: 14px/40px Microsoft YaHei;color: #222;float: left;margin: 0 8px;text-indent: 64px;-moz-border-radius: 5px;-webkit-border-radius: 5px;border-radius: 5px;cursor: pointer;display: inline;}" data-cmd="weixin" title="分享到微信">朋友圈</a>
					
					</div>
<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"32"},"share":{},"image":{"viewList":["qzone","tsina","tqq","renren","weixin"],"viewText":"分享到：","viewSize":"24"},"selectShare":{"bdContainerClass":null,"bdSelectMiniList":["qzone","tsina","tqq","renren","weixin"]}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
                </div>

				
				<!-- 评论代码start-->
				<div style="" class="comment-div">
					<div class="textarea-div" >
						<form style="height:114px;margin:0;padding:0;" action="<s:url value='/news/comment/addNewsComment.html'/>" onsubmit="return validateComment();">
							<textarea id="contentArea" class="textarea" name="content" placeholder="我来说两句..."></textarea>
							<div class="submit-row" style="position: relative;">
								<input id="newsId" type="hidden" name="newsId" value="${news.id}"/>            		 
                               	<button class="submit-btn" type="submit">发表评论</button>
                               	<%-- <se:authorize access="isAuthenticated()">            		 
                               	<button class="submit-btn" type="submit">发表评论</button>
                               	</se:authorize >
                               	<se:authorize access="isAnonymous()">
								<button type="button" class="submit-btn" data-toggle = "modal" data-target = "#commentLoginModal">
                               		 发表评论</button>
                               	</se:authorize> --%>
							</div>
						</form>
						
						
					</div>
					<div class="new-comment">最新评论</div>
					<div class="comment-list">
						<table id="simple-table" style="word-break: break-all; width: 100%;">
							<c:if test="${empty comments}">
				                	暂无新评论。
				            </c:if>
							<c:forEach items="${comments}" var="comment">
								<tr>
									<td style="border-bottom:1px dashed #ccc;"></td>
								</tr>
								<%-- <tr style="height:40px;">
									<td class="account-td">${comment.user.username}</td>									
								</tr> --%>
								<tr>
									<td colspan="2" class="comment-td">${comment.content}</td>
								</tr>
								<tr><td class="time-td" style="height:40px;">
										<fmt:formatDate  value="${comment.createTime}" pattern="yyyy-MM-dd HH:mm:ss" />
									</td>
								</tr>
								
							</c:forEach>
						</table>

					</div>



				</div>  
            <!-- 评论代码over-->
				
			</div> 	
<!--  -->
		</div>
		
	</div>
<!-- left end -->
	<div class="nr_cont2 F_Right" style="margin-top:0px;">
		<div class="box" style="margin-top:0px;">
			<h2><a href="#" class="a1 box_hover">专利推荐</a></h2>
			<ul class="h_second_list">
			<c:forEach items="${patents}" var="patent" varStatus="status">
				<li>
				<span class="h_list_tit" style="font-size:14px;">
					<a href="http://r.lotut.com/patent/getPatentDetail.html?patentId=${patent.patent_id}" target="_blank">[${patent.patent_type_name }]${patent.patent_name } - ${patent.app_no }</a>
				</span> 
				</li>
			</c:forEach>			
		
		</ul>			
		</div>	
		
		<div class="box" style="margin-top:20px;">
			<h2><a href="#" class="a1 box_hover">商标推荐</a></h2>	
			<ul class="good-list-item">
    			<c:forEach items="${brands}" var="brand" varStatus="status">
    			<c:if test="${status.count%2 == 1 }">
		    	<li>
				 <div style="position:absolute;">
				    <dd class="pic"> 
				   		<a href="http://r.lotut.com/brand/getbrandDetail.html?brandId=${brand.id }" target="_blank">
							<div style="position: relative;width:165px;height:145px;">   
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
				</div>
				</li>
				</c:if>
				<c:if test="${status.count%2 == 0 }">
				<li>
				 <div style="position:relative;left:170px;">
				    <dd class="pic"> 
				   		<a href="http://r.lotut.com/brand/getbrandDetail.html?brandId=${brand.id }" target="_blank">
							<div style="position: relative;width:165px;height:145px;">   
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
				</div>
				</li>
				</c:if>

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
	$(function() {
			$("#contentArea").val('');
	});
		
	function validateComment() {
		if($("#contentArea").val()==""){
			alert("评论不能为空。");
			return false;
		} else {
			return true;
		}
	}
</script>

</body>
</html>