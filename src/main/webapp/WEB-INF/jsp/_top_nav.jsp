<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="fx_top">
	<div class="wrap">
    		<div class="left">
				<span class="co">科技迷们的网络聚集地 -- 创意街</span>
            </div>

    </div>
</div>

<div style="position: fixed;z-index: 99999; left:20px; top:0px; width:100px; height:100px;">
<img src="<s:url value='/img/logo_long.png'/>" width="80px;">
</div>
<div class="fx_logo clearfix">
	<div class="logo" style="float:left;">
    	<a href="<s:url value='/index.html'/>"><img src="<s:url value='/images/logo.png'/>" alt="创意街"></a>
    </div>
<!-- 新闻搜索部分 -->
	<form class="form-inline" action="<s:url value='/news/searchNews.html'/>" method="get" target="_blank">
		<input type="hidden" id="default.page.nextPage" name="page.currentPage" value="1"/>
		<div class="mc-field-group" style="float:left;width:600px;margin-left:100px;margin-top:15px">
	       <input type="text" placeholder="关键字" name="keyword" class="text" id="mce-EMAIL" style="padding-left:4px;">
	       <input type="submit" value="搜索" id="mc-embedded-subscribe" class="button">
	    </div>
    </form>
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