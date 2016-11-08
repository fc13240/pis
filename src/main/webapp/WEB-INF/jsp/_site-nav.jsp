<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="security" prefix="se" %>
<%@ page import="zhuanli.domain.User" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<div class="w sn-container">
		<div class="snc-wraper Left clearfix">&nbsp;<span id="JS_head_login">您好
		<se:authorize access="isAuthenticated()">
			<se:authentication property="principal.username" />
		</se:authorize>
		，欢迎光临龙图腾！</span>
		</div>
		<ul class="snc-qmenu" id="JS_quick_memu">
			
			<li class="sncq-item">
				<a href="javascript:void(0)" onclick="shoucang()" class="snc-link snc-collect" rel="nofollow">收藏本站</a><s class="snc-line">|</s>
			</li>
			<li class="sncq-item" style="width:225px">
				<span>全国热线：</span><span class="hotLine">0551-65771310</span>
			</li>
			<li class="sncq-item" style="width:225px">
				<span>
				<a href="<s:url value='/user/QQLogin.html'/>" target="_black">QQ登陆</a>
				<se:authorize access="isAnonymous()">
				<a href="<s:url value='/loginForm.html'/>" target="_black">登录</a>
					&nbsp;&nbsp;&nbsp;&nbsp; 
					<a href="<s:url value='/user/registerForm.html'/>" target="_black">注册</a>
				</se:authorize>
			  <se:authorize access="isAuthenticated()">
			  <a href="javascript:$('#logoutForm').submit();" style="color:#666;"><font color="red">退出</font></a>
				</se:authorize > 
			 <form action="<s:url value='/user/logout.html'/>" method="post" id="logoutForm">
			 <input type="submit" style="display:none;" />
			 </form>
				
			</span>
			</li>			
		</ul>
	</div>
	
	
<div style="position:absolute;left:20px;top:0px;width:100px;height:100px;">
	<img src="<s:url value='/images/logo_long.png'/>" width="80px;">
</div>	
	
	
<style>
.sncq-item .hotLine {
font-weight: bold;
color: #c9033b!important;

}
</style>