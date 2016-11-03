<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="c" prefix="c" %>
<%@ taglib uri="fmt" prefix="fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<meta http-equiv="X-UA-Compatible" content="IE=8" />
<title>调用新闻标题-龙图腾商标专利交易网 </title>
<meta name="keywords" content="知识产权,专利交易,商标转让,龙图腾,中外知识产权网" />
<meta name="description" content="龙图腾网（www.lotut.com）是全球领先的知识产权交易平台。为企业提供专业的商标转让、专利交易等服务。拥有国内知识产权资源，全面覆盖了商标、专利、版权等领域的交易平台，让知识产权在流通中创造财富，引领知识产权的创新。" />
<meta itemprop="name" content="" />
<meta http-equiv="cache-control" content="no-transform">
<script type="text/javascript" src="<s:url value='/js/jquery_from.js'/>"></script>
<script src="<s:url value='/js/jquery.min.js'/>"></script>
<script src="<s:url value='/js/jquery-ui.min.js'/>" type="text/javascript"></script>
<link rel="shortcut icon" href="http://www.lotut.com/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="<s:url value='/css/mll.common.min.css?20160311'/>" />
<link rel="stylesheet" href="<s:url value='/css/index.css'/>" />
<link rel="stylesheet" href="<s:url value='/css/praise.css'/>">
<link rel="stylesheet" href="<s:url value='/css/slander.css'/>">


</head>

<body class="">
<script type="text/javascript">(function(){var screenWidth=window.screen.width;if(screenWidth>=1280){document.body.className=document.body.className+" root_body";;window.LOAD=true;}else{window.LOAD=false;}})()</script>


<div class="header-box">
	<div class="site-nav">
	<%@ include file="_site-nav.jsp"%>
	</div>
	
	<div class="page-header">
	<%@ include file="_page-header.jsp"%>
	</div>
	
	<div class="mll-navigator navigator-index">

		<div class="w clearfix">	
			<ul class="navigator">
		      <li><a href="<s:url value='/'/>" title="龙图腾专利交易">首页</a></li>
		      <li><a href="<s:url value='/business/trademark_list.html'/>" title="商标注册">商标注册</a></li>
		      <li><a  id="JS_mll_head_menu_expr" href="<s:url value='/business/copyright_list.html'/>" title="版权登记">版权登记<img src="<s:url value='/images/hot2015.gif'/>" style="position:absolute;background:none;right:0px;top:-5px;" /></a></li>
		      <li><a href="<s:url value='/business/patent_list.html?type=1'/>" title="专利申请">专利申请</a></li>
		      <li><a  href="<s:url value='/business/business_registration.html'/>" title="工商财务">工商财务</a></li>
		      <li><a target="_blank" href="http://g.lotut.com" title="专利管家">专利管家</a></li>
			   	   
			</ul>
		</div>
	</div>
</div>
<div style="height:10px;border-top:1px solid red;">&nbsp;</div>
<style type="text/css">
.r_detail_about {
    padding: 15px 0;
    border-bottom: 1px solid #ccc;
    margin-bottom: 15px;
    position: relative;
}

.r_detail_about span{
font-family: "微软雅黑", Microsoft YaHei, arial, verdana, sans-serif;
    color: #333;font-size:16px;
}
.r_detail_about a{
font-family: "微软雅黑", Microsoft YaHei, arial, verdana, sans-serif;
    color: #333;font-size:16px;
}
.article-con {
    border: 1px solid #ececec;
    padding: 15px;
}
.h_about_mod5 ul.h_second_list {
    padding: 20px 10px 80px 25px;
}
.h_about_mod5 ul.h_second_list li {
    height: 46px;
    font-size:16px;
    font-family: "微软雅黑", Microsoft YaHei, arial, verdana, sans-serif;
    color: #333;
    line-height: 46px;
    border-bottom: 1px solid #cdd5d8;
    background: url(../images/second_hui.png) no-repeat left;
    padding-left: 15px;
    overflow: hidden;
}
.h_about_mod5 ul.h_second_list li .h_list_deta {
    font-size:16px;
    font-family: "微软雅黑", Microsoft YaHei, arial, verdana, sans-serif;
    color: #333;
    float: right;
    padding-right: 10px;
}
.article-con img {
    max-width: 900px;
}
p{text-indent:2em}

/*评论代码start*/
.comment-div {
	position: relative;
	margin:60px auto;
	width:70%;
}
.textarea-div {
	position: relative;
	transition: height 0.3s;
	height: 158px;
	border: solid 1px #ccc;
	border-radius: 5px;
	overflow: hidden;
	margin: 0;
	padding: 0;
	font: 12px/1.5 "Microsoft YaHei", "\5FAE\8F6F\96C5\9ED1", "Helvetica Neue", Helvetica, tahoma, Arial;
	color: #404040;
	text-align: left;
	font-family: "\5B8B\4F53", sans-serif;
}

.textarea {
	height: 114px;
	resize: none;
	border: none;
	width: 100%;
	box-sizing: border-box;
	font-size: 14px;
	line-height: 24px;
	padding: 4px 14px;
}

.submit-row {
	background-color: #f6f6f6;
	height: 44px;
	overflow: hidden;
}

.submit-btn {
	font-size: 14px;
	font-family: "Microsoft YaHei";
	color: #fff;
	background-color: red;
	width: 130px;
	height: 44px;
	float: right;
	text-align: center;
}

.new-comment {
	margin-top:40px;
	margin-bottom:20px;
	font-size: 20px;
	font-family: "Microsoft YaHei";
	font-weight:700;
	color:#000;
}

.account-td {
	font-size: 12px;
	font-family: "SimSun";
	color:#999;
}

.time-td {	
	font-size: 12px;
	font-family: "SimSun";
	color:#999;
	valign:middle;
}

.comment-td {
	font-size: 14px;
	font-family: "SimSun";
	color:black;
	text-indent:2em;
}


/*评论代码over*/
</style>
<div style="width:1200px;margin:0 auto;">
	<div class="r_detail_about"> 
		<span>当前位置：</span><a href="http://www.lotut.com/">主页</a> &gt; <a href="/news/newsList.html">最新公告</a> &gt;  
	</div>
	<div class="article-con">
		<div class="h_about_mod5"> 
			<div class="mod1_cont" id="mod1_cont" runat="server">
					
				<h2 style="margin: 0px 0px 20px;padding: 0px;line-height: 22px;font-size: 18px;text-indent: 28px;font-family: simsun;text-align: center;">${news.title}</h2>
				<br/>
				<div style="float:left">
					<div style="margin-left: 60px;" >作者：
					<c:if test="${news.author != null}">
						${news.author}
						</c:if>
						<c:if test="${news.author == null}">
						智慧龙图腾知识产权有限公司
						</c:if>
					</div>
					<br/>
					<div style="margin-left: 60px;" >来源：
						<c:if test="${news.source != null}">
						${news.source}
						</c:if>
						<c:if test="${news.source == null}">
						龙图腾信息科技
						</c:if>
					</div>
				</div>
				<div style="float:left;;margin-top: 19px;margin-left: 66%;">
					<span id="bdshare" style=" float:right;" class="bdshare_t bds_tools get-codes-bdshare" data="{'text':'${news.title}'}">
						<a class="bds_qzone" style="height:25px;"> </a>
						<a class="bds_tsina" style="height:25px;"></a>    
						<a class="bds_baidu" style="height:25px;"> </a>
						<a class="bds_tqq" style="height:25px;"></a>
						<a class="bds_renren" style="height:25px;"></a>
						<span class="bds_more" style="height:25px;">更多</span>
					</span>
					<script type="text/javascript" id="bdshare_js" data="type=tools" ></script>
					<script type="text/javascript" id="bdshell_js"></script>
					<script type="text/javascript">
					document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion=" + Math.ceil(new Date()/3600000);
					</script>
				</div>
				<br/>
				<div>
					<HR width="90%" SIZE=1>
				</div>
				<br/>
				<div class="content" style="line-height: 22px;font-size: 14px;text-indent: 28px;font-family: simsun;margin-left: 80px;margin-right: 80px;">
					<p>
						${news.content}					
					</p>
				</div>
				<br/>
				<div>
				<HR  width="90%" SIZE=1>
				</div>
				
				<div>
					<div style="float:left;margin-left: 60px;" ><fmt:formatDate value="${news.publishTime}" pattern="yyyy年MM月dd日 HH:mm"/></div>
				</div>
				
				<div class="praise">
					<span id="praise${news.id}" onclick="praise('${news.id}',${news.upVote})"><img src="<s:url value='/images/zan.png'/>" id="praise-img" class="animation" width="20px;" height="20px;"></span>
					<span id="praise-txt">${news.upVote}</span>
					<span id="add-num"><em>+1</em></span>
				</div> 
				
				<div class="slander">
					<span id="slander${news.id}" onclick="slander('${news.id}',${news.downVote})"><img src="<s:url value='/images/cai.png'/>" id="slander-img" class="animation" width="20px;" height="20px;" style="margin-top:-90px;"></span>
					<span id="slander-txt">${news.downVote}</span>
					<span id="del-num"><em>+1</em></span>
				</div> 
				
				<!-- 评论代码start-->
				<div style="" class="comment-div">
					<div class="textarea-div" >
						<form style="height:114px;margin:0;padding:0;" action="<s:url value='/news/comment/addNewsComment.html'/>" onsubmit="return validateComment();">
							<textarea id="contentArea" class="textarea" name="content"
								placeholder="我来说两句...">
							
							</textarea>
							<div class="submit-row" style="position: relative;">
								<input id="articleId" type="hidden" name="newsId" value="${news.id}"/>            		 
                               	<button class="submit-btn" type="submit">发表评论</button>
								
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
								<tr style="border-bottom:1px dashed #ccc;"></tr>
								<tr style="height:40px;">
									<td class="account-td">${comment.user.username}</td>									
								</tr>
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
		</div>
	</div>	
</div>
<%@ include file="_footer.jsp"%>
<script type="text/javascript">
function praise(id,number){
	var praise_img = $("#praise-img");
	var text_box = $("#add-num");
	var praise_txt = $("#praise-txt");
	var num=parseInt(praise_txt.text());
	$.ajax({
		type:"get",
		url: "<s:url value='/news/praise.html'/>?upVote="+number+"&id="+id, 
	    success: function () {
	    	$("#praise"+id).html("<img src='<s:url value='/images/zan.png'/>' width='20px;' height='20px;' id='praise-img' class='animation' />");
			praise_txt.addClass("hover");
			text_box.show().html("<em class='add-animation'>+1</em>");
			$(".add-animation").addClass("hover");
			num +=1;
			praise_txt.text(num);
			$("#praise"+id).attr("onclick", "null");
	    }
		
	})
}

function slander(id,number){
	var praise_img = $("#slander-img");
	var text_box = $("#del-num");
	var praise_txt = $("#slander-txt");
	var num=parseInt(praise_txt.text());
	$.ajax({
		type:"get",
		url: "<s:url value='/news/slander.html'/>?downVote="+number+"&id="+id, 
	    success: function () {
	    	$("#slander"+id).html("<img src='<s:url value='/images/cai.png'/>' width='20px;' height='20px;' id='slander-img' class='animation' style='margin-top:-90px;'/>");
			praise_txt.addClass("hover");
			text_box.show().html("<em class='del-animation'>+1</em>");
			$(".del-animation").addClass("hover");
			num +=1;
			praise_txt.text(num);
			$("#slander"+id).attr("onclick", "null");
	    }
		
	})
}

$(function() {
	$("#contentArea").val('');
});

function validateComment() {
	if($("#contentArea").val()==""){
		alert("评论不能为空。")
		return false;
	} else {
		return true;
	}
}

</script>
</body>
</html>