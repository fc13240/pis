<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div class="w ph-container clearfix">
		<a id="JS_Header_Logo_link_home" href="/" class="phc-logo Left">
			<img src="<s:url value='/images/logo.png'/>" alt="logo">
		</a>

<!-- 		<a onclick="_clickSearchAd()" title="5.1放大招" class="phc-ad Left" href="" target="_blank" rel="nofollow"> -->
<!-- 			<img style="position:relative;top:4px;" width="170" height="60" src="http://image.meilele.com/images/201604/1460678095154533986.gif" alt="5.1放大招"> -->
<!-- 		</a> -->
		
		
		<div class="phc-search Left" style="margin-left:200px;">
			<!-- <form id="JS_search_form" class="search-form" action="<s:url value='/patent/search.html'/>" method="get" onsubmit="return MLL_header_search_submit();"> -->
			<form id="JS_search_form" class="search-form" action="http://so.lotut.com/patent/search/basicSearch.html" method="get" target="_black">	
				 <input type="hidden" name="page.currentPage=1" > 
				<input type="submit" class="submit-btn Right" value="专利搜索">
				<input id="JS_MLL_search_header_input" name="q" value="" autocomplete="off" type="text" maxlength="255" class="search-input" >
			</form>
			<div id="JS_search_suggest" class="suggest">
			</div>
			<div class="search-hot" id="JS_search_hot_links">
			
			</div>

		</div>
		<!-- 
		<div style="position:absolute;top:15px;left:990px;">
			<a href="JavaScript:void(0)"  onclick="exportFees()" style="color:blue;">表格导出</a>

		</div>
		 -->
		<div style="position:absolute;top:15px;left:1090px;">
<!-- WPA Button Begin -->
<script charset="utf-8" type="text/javascript" src="http://wpa.b.qq.com/cgi/wpa.php?key=XzkzODA1NTYyNF80Mzc1OTNfNDAwNjAxMTM1N18"></script>
<!-- WPA Button End --> 
		</div>
	</div>