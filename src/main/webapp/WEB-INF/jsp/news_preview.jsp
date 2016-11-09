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
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<meta http-equiv="X-UA-Compatible" content="IE=8" />
<title>新闻详情-龙图腾商标专利交易网 </title>
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
<%-- <link rel="stylesheet" href="<s:url value='/temp/css/bootstrap.min.css'/>" />
<script src="<s:url value='/plugins/kindeditor/bootstrap.min.js'/>" type="text/javascript"></script>
 --%>
</head>

<body class="">
<script type="text/javascript">(function(){var screenWidth=window.screen.width;if(screenWidth>=1280){document.body.className=document.body.className+" root_body";;window.LOAD=true;}else{window.LOAD=false;}})()</script>


<div class="header-box">
	<div class="site-nav">
	<%@ include file="_site-nav.jsp"%>
	</div>
	
	<div class="page-header" style="margin-top: 12px">
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

p{text-indent:2em}


/*评论代码start*/
.comment-div {
	position: relative;
	margin:60px auto;
	width:95%;
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
.font-article{
	font: 12px/1.5 "Microsoft YaHei", "\5FAE\8F6F\96C5\9ED1", "Helvetica Neue", Helvetica, tahoma, Arial;
	color: #404040;
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
	font-size: 16px;
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

.article-con img {
    max-width: 800px;
}
/*登录*/ 
/* .vlogintitle {
    width: 100%;
    height: 75px;
    overflow: hidden;
    background: #f54343;
    border-top-left-radius: 6px;
	border-top-right-radius: 6px;
}

.vpopLogo {
    width: 220px;
	height: 45px;
	overflow: hidden;
	margin: 16px 0 0 15px;
	display: block;
	text-indent: -99999px;
	float: left;
	max-width: 100%;
	max-height: 100%;
}

#loginError{
	    color:#F00;
	    font-weight:bold;
	    padding-left: 33px;
	    float:left;
}

.vlogboxFrame {
    width: 100%;
    height: 308px;
    position: relative;
    margin-top: 38px;
}

.vlogboxFrame ul li {
    font-family: "Microsoft YaHei";
    overflow: hidden;
    zoom: 1;
    padding-bottom: 20px;
}

.vlogboxFrame ul li label {
    display: inline;
    float: left;
    padding-left: 33px;
    font-size: 14px;
    color: #6a6a6a;
    text-align: left;
    line-height: 30px;
    font-weight:400;
    width: 80px;
}

.vloginpbox {
    color: #515151;
    display: inline;
    float: left;
    width: 190px;
    height: 28px;
    overflow: hidden;
    border: 1px solid #e1e1e1;
    margin-left:10px;
}

.inputbox {
    width: 176px;
    height: 22px;
    line-height: 21px;
    *line-height: 18px;
    padding: 3px 5px;
    margin-left: 4px;
    font-size: 14px;
    border: 0 none;
    background: 0;
    font-family: Arial,Helvetica,sans-serif;
}

.loginAuto {
    padding: 0 0 0 85px;
}

#loginAuto {
    position: relative;
    margin-top: -3px;
}

.loginAuto label {
    display: inline-block;
    cursor: pointer;
    float: none;
    font-size: 12px;
    color: #e1e1e1;
    text-align: left;
    line-height: 18px;
    width: auto;
    padding: 0 0 0 3px;
}

.login_pwd {
    overflow: hidden;
    zoom: 1;
    padding: 26px 0 0 55px;
}

.login_pwd .loginbtn {
    display: inline;
    float: left;
    width: 110px;
    height: 36px;
    overflow: hidden;
    background: url(http://y1.ifengimg.com/global_login_newedtion/login_new_20150828.png) no-repeat 0 -100px;
    text-indent: -99999px;
}
.login_pwd a {
    color: #004a99;
}

.login_pwd .loginregi {
    float: left;
    width: 80px;
    height: 36px;
    margin: 10px 0 0 19px;
    color: #004a99;
}

.login_pwd .registera {
    float: left;
    width: 80px;
    height: 36px;
    margin: 10px;
    color: #004a99;
}

.vlogtips {
    position: absolute;
    top: -24px;
    left: 85px;
    font-size: 12px;
    color: #f54343;
}

.vlogboxMore {
    width: 200px;
    height: 230px;
    padding-left: 24px;
    position: absolute;
    top: 0;
    right: 0;
    border-left: 1px solid #e1e1e1;
    margin-top: 38px;
    font-family: "Microsoft YaHei";
}

.vlogboxMore p {
    font-size: 14px;
    color: #6a6a6a;
    text-indent: 0em;
}
.vlogboxMore .linkqzone {
    display: block;
    width: 112px;
    height: 36px;
    overflow: hidden;
    background: url(http://y1.ifengimg.com/global_login_newedtion/login_new_20150828.png) no-repeat -200px -250px;
    text-indent: -99999px;
    margin-top: 20px;
}

.vlogboxMore .linksina {
    display: block;
    width: 112px;
    height: 36px;
    overflow: hidden;
    background: url(<s:url value='/img/wechat_login.jpg'/>) no-repeat;
    text-indent: -99999px;
    margin-top: 16px;
}

.vlogboxMore .linkcmcc {
    display: block;
    width: 112px;
    height: 36px;
    overflow: hidden;
    background: url(http://p0.ifengimg.com/a/2016/0701/b5115cf2c541eeasize3_w112_h36.png) no-repeat;
    text-indent: -99999px;
    margin-top: 20px;
}
 */
/*评论代码over*/


.con-left{
	width:840px;
	float:left;

}
.con-right{
	width:300px;
	float:right;

}
.line01 {
    border-top: 1px solid #ddd;
    height: 9px;
    overflow: hidden;
    clear: both;
    width: 100%;
}
.titR {
    height: 34px;
    border-bottom: 1px solid #ddd;
    border-top: 3px solid #444;
    position: relative;
}
.pad_btm {
    padding-bottom: 15px;
}
.pad_top5 {
    padding-top: 5px;
}
.listR li {
    line-height: 24px;
    color: #004276;
    padding-left: 7px;
    background: url(http://y0.ifengimg.com/commonpage/1129/v1/all.png) no-repeat 0 -1006px;
}
.adListNew {
    border: 1px solid #ddd;
    border-top: 5px solid #ddd;
    background: #fff;
    padding: 0 14px 10px;
    width: 270px;
    overflow: hidden;
    color: #416571;
    width: 270px;
}
.adListNew h3 {
    padding: 8px 0 4px 0;
    font: normal 14px/22px simsun;
    color: #666;
    border-bottom: 1px solid #ddd;
}
.adContent2 {
    width: 300px;
    padding-bottom: 10px;
}
.adContent2 li {
    float: left;
    width: 130px;
    padding-right: 10px;
    padding-top: 10px;
    line-height: 24px;
    text-align: center;
}
.adContent2 li a {
    color: #666;
}
.txt_share_box {
    position: relative;
    width: 700px;
    margin:0 auto;
}
.txt_share {
    margin-top: 20px;
    padding-left: 16px;
    width: 632px;
}
.share_bar_pop_wx {
    left: 75px;
}
.share_bar_pop_wxq {
    left: 233px;
}
.yc_sina {
    border: 1px solid #f56467;
}
.yc_wx {
    border: 1px solid #8dc81b;
}
.yc_wxq {
    border: 1px solid #71c8d6;
}
.yc_qzone {
    border: 1px solid #f5be3f;
}
.share_bar_popin {
    position: relative;
    padding: 10px 20px 22px 10px;
}
.share_bar_popin img {
    display: block;
    float: left;
}
.share_bar_popin p {
    color: #666;
    line-height: 24px;
    margin-top: 15px;
    float: right;
}
.share_bar_popin .share_bar_close {
    position: absolute;
    right: 0;
    top: 0;
    width: 20px;
    height: 20px;
    cursor: pointer;
}
.share_bar_popin {
    position: relative;
    padding: 10px 20px 22px 10px;
}
.share_bar_popin img {
    display: block;
    float: left;
}
.txt_share a {
    width: 140px;
    height: 40px;
    display: block;
    background-repeat: no-repeat;
    background-position: 26px center;
    font: 14px/40px Microsoft YaHei;
    color: #222;
    float: left;
    margin: 0 8px;
    text-indent: 64px;
    -moz-border-radius: 5px;
    -webkit-border-radius: 5px;
    border-radius: 5px;
    cursor: pointer;
    display: inline;
}
</style>
<div style="width:1200px;margin:0 auto;">
	<div class="r_detail_about"> 
		<span>当前位置：</span><a href="http://www.lotut.com.top/">主页</a> &gt; <a href="<s:url value='/news/newsList.html'/>">新闻列表</a> &gt;  
	</div>

	<div class="article-con">
		<div class="con-left"> 
			<div class="mod1_cont" id="mod1_cont" runat="server">
					
				<h2 style="margin: 0px 0px 20px;padding: 0px;line-height: 22px;font-size: 24px;text-indent: 28px;text-align: center;">${news.title}</h2>
				<br/>
				<div style="width:400px;float:left;">
					<span class="font-article" style="">
					发表时间：<fmt:formatDate  value="${news.createTime}" pattern="yyyy年MM月dd日" />
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


				<%-- <div class="praise">
					<span id="praise${news.id}" onclick="praise('${news.id}',${news.upVote})"><img src="<s:url value='/images/zan.png'/>" id="praise-img" class="animation" width="20px;" height="20px;"></span>
					<span id="praise-txt">${news.upVote}</span>
					<span id="add-num"><em>+1</em></span>
				</div> 
				
				<div class="slander">
					<span id="slander${news.id}" onclick="slander('${news.id}',${news.downVote})"><img src="<s:url value='/images/cai.png'/>" id="slander-img" class="animation" width="20px;" height="20px;" style="margin-top:-90px;"></span>
					<span id="slander-txt">${news.downVote}</span>
					<span id="del-num"><em>+1</em></span>
				</div>  --%>
				
				<!-- 评论代码start-->
				<div style="" class="comment-div">
					<div class="textarea-div" >
						<form style="height:114px;margin:0;padding:0;" action="<s:url value='/news/comment/addNewsComment.html'/>" onsubmit="return validateComment();">
							<textarea id="contentArea" class="textarea" name="content"
								placeholder="我来说两句...">
							
							</textarea>
							<div class="submit-row" style="position: relative;">
								<input id="newsId" type="hidden" name="newsId" value="${news.id}"/>            		 
                               	<se:authorize access="isAuthenticated()">            		 
                               	<button class="submit-btn" type="submit">发表评论</button>
                               	</se:authorize >
                               	<se:authorize access="isAnonymous()">
								<button type="button" class="submit-btn" data-toggle = "modal" data-target = "#commentLoginModal">
                               		 发表评论</button>
                               	</se:authorize>
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
		<div class="con-right">
		
			<div class="adListNew" >
			
				<div id="padhide_2086">
					<h3>相关推荐</h3>
			
				</div>
			
				<div id="padhide_1720">
					<ul class="ul_list01">
					<c:forEach items="${newsRand}" var="newsRand">
						<li class="right_list">
						<a href="<s:url value='/news/newsPreview.html?newsId=${newsRand.id}'/>" target="_blank">${newsRand.title}</a>
						</li>			
					</c:forEach>					
					</ul>
				</div>
			</div>		
		
			<div class="adListNew" style="margin-top:20px;">
			
				<div id="padhide_2086">
				<style type="text/css">
				.right_list{
　　					display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;
　　				} 
				.adContent2{width:300px; padding-bottom:10px;}
				.adContent2 li{float:left;width:130px; padding-right:10px;padding-top:10px; line-height: 24px; text-align: center;}
				.adContent2 li span{ display:block; text-align: center; line-height:22px;}
				.adContent2 li a{color:#666;}
				.adContent2 li a:hover{color:#666;}
				.adContent3{ padding-bottom:10px; width:670px;}
				.adContent3 li{float:left;width:185px; padding-right:32px;padding-top:10px; text-align:center;}
				.adContent3 li span{ display:block; text-align: center; line-height:22px;}
				.adContent3 li a{color:#666;}
				.adContent3 li a:hover{color:#666;}
				.ul_list01 li{ line-height:24px; background:url(http://172.30.23.50/Origin/project/commonpage/images/sq02.gif) no-repeat 0 11px; padding-left:7px;}
				.ul_list01 li a:link,.ul_list01 li a:hover,.ul_list01 li a:visited{ color:#666;}
				</style>
					<h3>专利推荐</h3>
			
				</div>
			
				<div id="padhide_1720">
					<ul class="ul_list01">
					<c:forEach items="${patents}" var="patent">
						<li>
						<a href="<s:url value='/patent/detail.html?patentno=${patent.patent_id}'/>" target="_blank">${patent.patent_name}</a>
						</li>			
					</c:forEach>					
					</ul>
				</div>
			</div>
			
			
			
			
			<div class="adListNew" style="margin-top:20px;">
			
				<div id="padhide_2086">

					<h3>商标推荐</h3>
			
				</div>
			
				<div id="padhide_1720">
						<div  style="width:240px;height:1050px;margin-left:10px; overflow:hidden;position:relative;">
						<iframe width="300" height="1585" frameborder="0" style="position:relative; top:-740px; float:left; left:-10px;" scrolling="no" src="http://r.lotut.com">
						
						</iframe>
						</div>
				</div>
			</div>				
			
	</div>	
	
</div>

<!-- 登录代码start-->
<%-- <div class = "modal fade" id = "commentLoginModal" tabindex = "-1" role = "dialog" 
   aria-labelledby = "myModalLabel" aria-hidden = "true" >
   
   <div class = "modal-dialog" >
      <div class = "modal-content">
         
         <div class = "modal-header" style="padding:0;">           
            
            <div class = "vlogintitle" id = "myModalLabel">
            	<a href="http://www.lotut.com/" target="_blank" title="专利  龙图腾">
            	<img src="<s:url value='/images/logo_white.png'/>" alt="专利  龙图腾" class="vpopLogo"/></a>
            	<button type = "button" class = "close" data-dismiss = "modal" aria-hidden = "true" id="commentLoginModalCloseBtn" style="font-size: 31px;margin-top: 0px;">×</button>
            </div>
         </div>
	         <div class = "modal-body" id="modal-body">
	         <div class = "vlogboxFrame" >
	         
		         <se:csrfInput/>
				 <fieldset>
		         <form action=""  method="post">
		         <ul>
		         <li>
			         <label class="phNo">用户名</label>
			         <input class="vloginpbox"  type="text" id="modalUsername" name="username" autofocus="autofocus"/>
							
		         </li>
		         <li style="padding-bottom: 10px;">
			         <label class="phNo">密&nbsp;&nbsp;&nbsp;码</label>
			         <input class="vloginpbox"  type="password" id="modalPassword" name="password" />
		         </li>
		         	 <span id="loginError">登录失败！请检查用户名或密码！</span>
		         <li>
		         </li>
			   
	             </ul>
	             <input name="comfrom" id="comfrom" value="" type="hidden">
	             <div class="login_pwd">
	                        <button id="loginbtn" type="button" class="loginbtn" onclick="loginValidate()">登录</button>
	                        <a href="<s:url value='/user/user_forget_password.html'/>" target="_blank" class="loginregi">忘记密码？</a>	               
	                        <a href="<s:url value='/user/registerForm.html'/>" target="_blank" class="registera">立刻注册</a>
	                        <p class="pcNo" style="display:block; width:100%; height:30px;"></p>
	             </div>
	             <div id="login_error_message" class="vlogtips" style="display: none;">请输入正确的用户名</div>
					
			</form>
			</fieldset>
	         
	         </div>
	         <div class="vlogboxMore" id="">
                <p>一键登录</p>
                <a class="linkqzone" href="javascript:void(0);"  data-fid="f296fc4cfce"></a>
                <a class="linksina" href="javascript:void(0);"  title="使用微信登录"  onclick="weChat()" data-fid="f5798def9af"></a>
                
            </div>
	         
	        </div>
      </div>
   </div>
</div> --%>
<!-- 登录代码over-->

<%@ include file="_footer.jsp"%>

<script>
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
		/* $("#modalUsername").val("");
    	$("#modalPassword").val("");
		$("#loginError").css("display","none"); */
	});
	
	function validateComment() {
		if($("#contentArea").val()==""){
			alert("评论不能为空。");
			return false;
		} else {
			return true;
		}
	}
	
	/* function loginValidate() {
		var username = $("#modalUsername").val();
		var password = $("#modalPassword").val();
		$.ajax({
			type:"post",
			url: "<s:url value='/user/userLogin.html'/>?username=" + username + "&password=" + password, 
		    success: function () {
		    	$("#commentLoginModalCloseBtn").trigger("click");
		    	location.reload();		    	
		    },
		    error:function(){
		    	$("#modalUsername").val("");
		    	$("#modalPassword").val("");
		    	$("#loginError").css("display","block");
		    }
			
		})		
	} */
	
	
	
</script>
<%-- <script type="text/javascript">
 function weChat(){
	var appid = "wx7f435f9a93844c0d";
    var redirect_uri = encodeURIComponent("http://www.lotut.com/pts/user/weChat.html");
    var scope = "snsapi_login";

    var url = "https://open.weixin.qq.com/connect/qrconnect?appid=" + appid + "&redirect_uri=" + redirect_uri + "&response_type=code&scope=" + scope + "&state=1#wechat_redirect";
    window.location.href = url;
}

	
</script> --%>
</body>
</html>