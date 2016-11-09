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
<title>龙图腾商标专利交易网--中国商标专利交易专业服务平台 </title>
<meta name="keywords" content="知识产权,专利交易,商标转让,龙图腾,中外知识产权网" />
<meta name="description" content="龙图腾网（www.lotut.com）是全球领先的知识产权交易平台。为企业提供专业的商标转让、专利交易等服务。拥有国内知识产权资源，全面覆盖了商标、专利、版权等领域的交易平台，让知识产权在流通中创造财富，引领知识产权的创新。" />
<meta itemprop="name" content="" />
<meta http-equiv="cache-control" content="no-transform">
<link rel="shortcut icon" href="http://www.lotut.com/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="<s:url value='/css/mll.common.min.css?20160311'/>" />
<link rel="stylesheet" href="<s:url value='/css/index.css'/>" />
<script type="text/javascript" src="<s:url value='/js/jquery_from.js'/>"></script>
<script src="<s:url value='/js/jquery.min.js'/>"></script>
<script src="<s:url value='/js/jquery-ui.min.js'/>" type="text/javascript"></script>
<link rel="stylesheet" href="<s:url value='/temp/css/bootstrap.min.css'/>" />
<script src="<s:url value='/plugins/kindeditor/bootstrap.min.js'/>" type="text/javascript"></script>
<script type="text/javascript" src="http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js" data-appid="101359853" data-redirecturi="http://www.lotut.com" charset="utf-8" data-callback="true"></script>
<style type="text/css">
/*登录*/ 
.vlogintitle {
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
    background: url(<s:url value='/img/wechat_login.jpg'/>) no-repeat ;
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
</style>
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
	<%@ include file="_top_nav.jsp"%>
	</div>
</div>

 <%@ include file="_flash.jsp"%>

 <%@ include file="_f_con.jsp"%>





<div class="w mt20 expr-wrap">
	<div class="expr-floor city-exprs">
		
		
	</div>
</div>


<div class="default_stairs_w">
	<div class="w clearfix" style="position:relative">
		<div class="default_stairs none" id="JS_default_stairs">
			<a href="javascript:;" class="stairs_nav floor1">
				<span class="icon"></span>
				<em class="name">精品<br>服务</em>
				<i class="stairs_line"></i>
			</a>
			<a href="javascript:;" class="stairs_nav floor2">
				<span class="icon"></span>
				<em class="name">专利<br>推荐</em>
				<i class="stairs_line"></i>
			</a>
			<a href="javascript:;" class="stairs_nav floor3">
				<span class="icon"></span>
				<em class="name">商标<br>推荐</em>
				<i class="stairs_line"></i>
			</a>
			<!-- 
			<a href="javascript:;" class="stairs_nav floor4">
				<span class="icon"></span>
				<em class="name">纺织<br>造纸</em>
				<i class="stairs_line"></i>
			</a>
			<a href="javascript:;" class="stairs_nav floor5">
				<span class="icon"></span>
				<em class="name">建材<br>照明</em>
				<i class="stairs_line"></i>
			</a>
			<a href="javascript:;" class="stairs_nav floor6">
				<span class="icon"></span>
				<em class="name">机械<br>加工</em>
				<i class="stairs_line"></i>
			</a>
						<a id="JS_floor_expr" href="javascript:;" class="stairs_nav floor_expr">
				<span class="icon"></span>
				<em class="name">体验馆</em>
				<i class="stairs_line"></i>
			</a>
			 -->
						<div class="stairs-cover"></div>
		</div>
	</div>
</div>


<!-- 登录代码start-->
<div class = "modal fade" id = "commentLoginModal" tabindex = "-1" role = "dialog" 
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
                <span id="qqLoginBtn"></span>
                <a class="linkqzone" href="javascript:void(0);" title="使用QQ号登录" data-fid="f296fc4cfce"></a>
                <a class="linksina" href="javascript:void(0);" title="使用微信登录"  onclick="weChat()" data-fid="f5798def9af"></a>
                
            </div>
	         
	        </div>
      </div>
   </div>
</div>
<!-- 登录代码over-->	

<%@ include file="_footer.jsp"%>

<script src="<s:url value='/js/mll/jq.js?0405'/>"></script> 

<script>window.M = window.M || {};if($.addToCart)M.addToCart = $.addToCart</script>
<script type="text/javascript">
(function(c,b){var a=b("#JS_head_login");a.on("click","#JS_login_out",function(){jQuery.ajax({url:"/user/?act=logout",type:"get",cache:false,dataType:"json",success:function(d){if(d.error==0){window.location.reload();return false;}else{jQuery.alert("注销失败，请重试！");}},error:function(){jQuery.alert("网络异常，请重试！");}});});})(document,jQuery);function _INIT_HEAD_SEARCH(data){var json;try{json=eval(data.html_content);}catch(e){}if(json&&json.length){var url=location.pathname;var wordIndex=-1;var tmpFilter;window.__HEAD_SEARCH_WORDS_ARR=[];window.__HEAD_SEARCH_WORDS_OBJ={};if(/\/jiaju\//.test(url)){wordIndex=0;}else{if(/\/jiancai\//.test(url)){wordIndex=1;}else{if(/\/shipin\//.test(url)){wordIndex=2;}}}for(var k=0,kk=json.length;k<kk;k++){tmpFilter=json[k].type.split("");if(wordIndex==-1||tmpFilter[wordIndex]==1){__HEAD_SEARCH_WORDS_ARR.push(json[k]);__HEAD_SEARCH_WORDS_OBJ[json[k].text]=json[k];}}var inpt=$("#JS_MLL_search_header_input")[0];if(__HEAD_SEARCH_WORDS_ARR.length&&inpt&&inpt.value==""){inpt.value=MLL_Header_search_words();inpt.onfocus=function(){this.value="";this.onfocus=function(){};};inpt.onblur=function(){if(this.value==""){this.value=MLL_Header_search_words();this.onfocus=function(){this.value="";this.onfocus=function(){};};}};}}}function MLL_Header_search_words(){var b=__HEAD_SEARCH_WORDS_ARR,a=Math.floor(Math.random()*b.length);return b[a].text;}function MLL_header_search_submit(){var a=$("#JS_MLL_search_header_input")[0];var b=$("#JS_search_form")[0];var c=a.value+"";c=$.trim(c||"");if(!c){return false;}if(window.__HEAD_SEARCH_WORDS_OBJ&&__HEAD_SEARCH_WORDS_OBJ[c]){location.href=__HEAD_SEARCH_WORDS_OBJ[c].href+(__HEAD_SEARCH_WORDS_OBJ[c].href.indexOf("#")>=0?"&":"#")+"kw="+encodeURIComponent(c);return false;}else{a.value=c;return true;}}function _show_(j,d){if(!j){return;}if(d&&d.source&&d.target){var b=typeof d.source==="string"?$("#"+d.source):$(d.source);var l=typeof d.target==="string"?$("#"+d.target):$(d.target);var f=typeof d.data==="string"?$("#"+d.data):$(d.data);if(b.length&&l.length&&!l.isDone){var h=$(b.val()||sourse.html());if(f.length&&typeof d.templateFunction=="function"){var i=f.val()||f.html();i=$.parseJSON(i);h=d.templateFunction(h,i);f.remove();}l.empty().append(h);b.remove();if(typeof d.callback=="function"){d.callback();}l.isDone=true;}}$(j).addClass("hover");if(d&&d.isLazyLoad&&j.isDone){var g=j.find("img");for(var e=0,c=g.length;e<c;e++){var a=g[e].getAttribute("data-src_index_menu");if(a){g[e].setAttribute("src",a);g[e].removeAttribute("data-src_index_menu");}}j.isDone=true;}}function _hide_(b){if(!b){return;}var a=$(b);if(a.hasClass("hover")){a.removeClass("hover");}}function shoucang(){window._gaq=window._gaq||[];_gaq.push(["_trackEvent","headerAddFavorite",location.href]);var b=window.location.href;var a=document.title;try{window.external.addFavorite(b,a);}catch(c){try{window.sidebar.addPanel(a,b,"");}catch(c){alert("对不起，您的浏览器不支持此操作！\n请您使用菜单栏或Ctrl+D收藏本站。");}}}var car_number=0;function DY_cart_detail_nav_cb(b){Cart.goodsList=1;Cart.saleLimit=b.saleLimit||100;var a=b.goods_list.length;if(a>0){Cart.formatData(b)||{};Cart.info.goodsData=b.goods_list;}Cart.update();}var Cart={};Cart.init=function(){Cart.handdler=$("#JS_cart");Cart.Dom=Cart.handdler.find("#JS_cart_list");Cart.number=Cart.handdler.find("#JS_cart_num");Cart.countArea=Cart.handdler.find("#JS_count_area");Cart.countNum=Cart.handdler.find("#JS_cart_count");Cart.sum=Cart.handdler.find("#JS_count_total");Cart._isIE=!-[1,];Cart.info={goodsData:[],sum:0,goodsNumber:0,giftsNumber:0,kindsNumber:0};Cart.number.html($.cookie("cart_number")||0);};Cart.isLogin=function(){return($.cookie("meilele_login")=="1"||$.cookie("ECS[username]"));};Cart.show=function(){if(Cart.isLogin()&&!Cart.moveToCollect.moved){Cart.moveToCollect(a);}else{a();}function a(b){if(!Cart.goodsList){Cart.Dom.html("")[0].className="cart-list";Cart.countArea.addClass("none");Cart.getCartInfo(null,b);}}Cart.handdler.addClass("hover");if(Cart._isIE){Cart.handdler.find(".cart-arrow").addClass("cart-arrow-ie");}};Cart.getCartInfo=function(b,a){Cart.info={goodsData:[],sum:0,goodsNumber:0,giftsNumber:0,kindsNumber:0};var c={};if(a&&a.length){c.filterGoodsIds=a.join("!");}jQuery.ajax({url:"/mll_api/api/cart_info",dataType:"json",cache:false,data:c,success:function(d){DY_cart_detail_nav_cb(d);b&&b(d);}});};Cart.setCartNum=function(a){jQuery.cookie("cart_number",a||0);};Cart.hide=function(){Cart.handdler.removeClass("hover");if(Cart._isIE){Cart.handdler.find(".cart-arrow").removeClass("cart-arrow-ie");}};Cart.del=function(l,d){var o=l||window.event,m=o.target||o.srcElement;if(d){m=d;}var a=$(m);if(!a.hasClass("Cart_del")){return false;}var j=a.attr("data-index"),b=a.attr("data-rec_id"),h=a.attr("data-num"),i=a.attr("data-goods_price"),n=a.attr("data-act_id");var g=[];var f={};if(n>0){var k=Cart.Dom.find(".JS_cart_list_act_"+n);k.each(function(r,s){var t=$(this);var q=t.data("rec_id");var p=t.data("index");var e=t.data("num");g.push(q);f[q]={index:p,num:e,price:0};});}else{g.push(b);f[b]={index:j,num:h,price:i};}if(!Cart.inDelAjax&&g.length>0){Cart.inDelAjax=true;$.ajax({url:"/add_cart/?step=dropGoods&ajax=1&goods="+g.join("|"),type:"GET",dataType:"json",success:function(e){if(e.error==0){c(g,f);}else{this.error();}},error:function(){alert("删除失败，请稍后再试！");},complete:function(){Cart.inDelAjax=false;}});}function c(q,p){var e=Cart.info;for(var r=0;r<q.length;r++){var t=q[r];var v=p[t].index;var s=p[t].num||0;var u=p[t].price||0;var x=s*u;var w=$(".JS_cart_list_gift_"+t);w.each(function(y){var z=parseInt(w.eq(y).attr("data-num"));e.giftsNumber-=z;});$("#JS_cart_list_index_"+v).remove();w.remove();e.goodsNumber-=s;e.kindsNumber--;e.sum-=x;}Cart.update();}};Cart.formatData=function(c){var b=Cart.info;var f=c.goods_list;var h=0;var d=0;var g=[];for(var i=0,a=f.length;i<a;i++){var e=(f[i].goods_thumb_1)?f[i].goods_thumb_1:f[i].goods_thumb;g.push('<li id="JS_cart_list_index_'+i+'" class="'+(f[i].goods_activity_type!="newgift"?"":"JS_cart_list_gift_"+f[i].activity_par_id)+(f[i].price_activity_id>0?" JS_cart_list_act_"+f[i].price_activity_id:"")+' cart-item" data-num="'+f[i].goods_number+'" data-rec_id="'+f[i].rec_id+'" data-index="'+i+'">');g.push('<a target="_blank" class="cart-link" title="'+f[i].goods_name+'" href="'+f[i].url+'">'+f[i].goods_name+"</a>");if(f[i].goods_activity_type!="newgift"){g.push('<p class="cart-cal"><a data-goods_id="'+f[i].goods_id+'" class="cart-del Right Cart_del" href="javascript:void(0)" data-index="'+i+'" data-rec_id="'+f[i].rec_id+'" data-num="'+f[i].goods_number+'" data-goods_price="'+f[i].goods_price+'" data-act_id="'+(f[i].price_activity_id||0)+'">删除</a><strong class="cart-price red" id="JS_danjia'+i+'">&yen;'+f[i].goods_price+'</strong>×<strong class="black">'+f[i].goods_number+"</strong></p>");b.goodsNumber+=f[i].goods_number-0;b.kindsNumber++;b.sum+=(f[i].goods_number||0)*(f[i].goods_price||0);}else{g.push('<p class="cart-cal"><strong style="margin-left:12px"><span class="cl red">赠品</span>&times;'+f[i].goods_number+"</strong></p>");d+=parseInt(f[i].goods_number)||0;b.giftsNumber+=f[i].goods_number-0;}g.push("</li>");h+=parseInt(f[i].goods_number)||0;}Cart.Dom.html(g.join(""));Cart.update();return b;};Cart.goPreCheckOut=function(){jQuery.showLoginBox(function(){location.href="/flow/?step=pre_checkout&rel=header";});};Cart.moveToCollect=function(a){Cart.countArea.find(".cart-tip").remove();jQuery.ajax({url:"/add_cart/?step=insertCollect",type:"GET",dataType:"JSON",cache:false,success:function(g){if(g&&g.error=="0"&&g.moveToCollect&&g.moveToCollect.length){var c=g.moveToCollect;var d=[];var f=[];f.push('<div class="cart-tip"><span class="red"><b>提示：</b>购物车里有'+c.length+'件商品被移入收藏夹</span><p class="tip-content">');for(var e=0,b=c.length;e<b;e++){if(e<3){f.push('<a target="_blank" class="tip-link" href="'+c[e].goodsLink+'">'+c[e].goodsName+"</a>");}d.push(c[e].goodsId);}f.push('</p><a href="/user/?act=collection_list" target="_blank" class="red">查看收藏夹&gt;&gt;</a></div>');Cart.countArea.append(f.join(""));a&&a(d);}else{this.error();}Cart.moveToCollect.moved=true;},error:function(){a&&a([]);Cart.moveToCollect.moved=false;}});};Cart.update=function(b){var b=b||Cart.info;var a=Number(b.goodsNumber||0)+Number(b.giftsNumber||0);if(a==0){Cart.setCartNum(0);Cart.number.html(0);Cart.Dom.html('<li class="nothing"><b class="common-bg nothing-icon"></b>&nbsp;购物车中还没有商品，赶紧选购吧！</li>');Cart.countArea.addClass("none");Cart.Dom.removeClass("cart-full");return;}Cart.number.html(a);Cart.countNum.html(a);Cart.sum.html("&yen;"+Number(b.sum||0).toFixed(2));Cart.Dom.addClass("cart-full");Cart.countArea.removeClass("none");Cart.setCartNum(a);var c=Cart.Dom.find(".cart-item").length;Cart.Dom.addClass("cart-full"+(c>2?3:c));if(c==0){Cart.Dom[0].className="cart-list";}};function exprCallBackNum(json){if(json&&json.html_content){try{eval("json.html_content="+json.html_content);}catch(e){jQuery("#JS_head_scoll_phone_527").siblings("span.blank").remove();return;}if(!json){return;}var o1=$("#JS_mll_head_menu_expr");var o3=$("#JS_Header_Home_Link");var o4=$("#JS_Header_Logo_link_home");if(json.html_content&&json.html_content.expr_count>0&&json.html_content.pinyin){o1.attr("href","/"+json.html_content.pinyin+"/expr.html").html(json.html_content.city+'体验馆<img src="'+$.__IMG+'/images/hot2015.gif" style="position:absolute;background:none;right:0px;top:-5px;" />');o3.attr("href","/"+json.html_content.pinyin+"/");o4.attr("href","/"+json.html_content.pinyin+"/");}else{jQuery("#JS_head_scoll_phone_527").siblings("span.blank").remove();}var len=exprCallBackNum.callFnArr.length;for(var i=0;i<len;i++){exprCallBackNum.callFnArr[i]&&exprCallBackNum.callFnArr[i](json);}}else{jQuery("#JS_head_scoll_phone_527").siblings("span.blank").remove();}}exprCallBackNum.callFnArr=[];window._headPhoneScroll527Now=0;function Head_scroll_phone_527_fn(){if(window._headPhoneScroll527Lock){return;}var c=window._headPhoneScroll527Dom;var a=window._headPhoneScroll527Length;var b=window._headPhoneScroll527Now;if(c&&a){jQuery(c).animate({marginTop:(b+1)*-22+"px"},300,"linear",function(){window._headPhoneScroll527Now++;if(window._headPhoneScroll527Now>=window._headPhoneScroll527Length/2){window._headPhoneScroll527Dom.css("margin-top","0px");window._headPhoneScroll527Now=0;}});}}var isIE=!-[1,];window._gaq=window._gaq||[];$("#JS_quick_memu").on("mouseenter",".sncq-item",function(){if($(this).hasClass("keep")||$(this).hasClass("terminal")){_gaq.push(["_trackEvent","首页导航二维码",'移入"'+$(this).find(".link-text").text()+'"']);}jQuery(this).addClass("hover");if(isIE){jQuery(this).find(".snc-arrow").addClass("snc-arrow-ie");}}).on("mouseleave",".sncq-item",function(){var a=!-[1,];$(this).removeClass("hover");if(a){jQuery(this).find(".snc-arrow").removeClass("snc-arrow-ie");}}).on("click",".JS_header_ga",function(){_gaq.push(["_trackEvent","首页导航二维码","点击“”"]);}).on("click",".JS_header_gaerCode",function(){_gaq.push(["_trackEvent","首页导航二维码","点击“二维码”"]);}).on("click",".JS_header_gaMoberCode",function(){_gaq.push(["_trackEvent","首页导航二维码","点击“移动客户端二维码”"]);}).on("click",".JS_header_gaMob",function(){_gaq.push(["_trackEvent","首页导航二维码","点击“移动客户端文案”"]);});$("#JS_cart").hover(Cart.show,Cart.hide);Cart.init();(function(a){a.fn.menu=function(c){this.each(function(){b.call(this,c);});return this;};function b(o){var h=a(this),k=null,f=[],j=null,i=null,r=null,e=a.extend({rowSelector:"> li",submenuSelector:"*",submenuDirection:"right",tolerance:75,enter:a.noop,exit:a.noop,activate:a.noop,deactivate:a.noop,exitMenu:a.noop,firstDelay:0},o);var c=3,m=300,l=0;var g=function(w){f.push({x:w.pageX,y:w.pageY});if(f.length>c){f.shift();}};var n=function(){clearTimeout(r);if(i){clearTimeout(i);}if(e.exitMenu(this)){if(k){e.deactivate(k);}}k=null;};var q=function(){(!k)&&clearTimeout(r);};var t=function(w){if(i){clearTimeout(i);}e.enter(this);s(this);},p=function(w){e.exit(this);};var u=function(w){d(this);w.stopPropagation();};var d=function(x){clearTimeout(r);if(k){e.deactivate(k);}if(!k&&e.firstDelay){r=setTimeout(function(){w(x);},e.firstDelay);}else{w(x);}function w(y){e.activate(y);k=y;}};var s=function(x){var w=v();if(w){i=setTimeout(function(){s(x);},w);}else{d(x);}};var v=function(){if(!k||!a(k).is(e.submenuSelector)){return 0;}var A=h.offset(),w={x:A.left,y:A.top-e.tolerance},H={x:A.left+h.outerWidth(),y:w.y},J={x:A.left,y:A.top+h.outerHeight()+e.tolerance},B={x:A.left+h.outerWidth(),y:J.y},C=f[f.length-1],G=f[0];if(!C){return 0;}if(!G){G=C;}if(G.x<A.left||G.x>B.x||G.y<A.top||G.y>B.y){return 0;}if(j&&C.x==j.x&&C.y==j.y){return 0;}function D(L,K){return(K.y-L.y)/(K.x-L.x);}var F=H,x=B;if(e.submenuDirection=="left"){F=J;x=w;}else{if(e.submenuDirection=="below"){F=B;x=J;}else{if(e.submenuDirection=="above"){F=w;x=H;}}}var y=D(C,F),E=D(C,x),I=D(G,F),z=D(G,x);if(y<I&&E>z){j=C;return m;}j=null;return 0;};h.on("mouseleave",n).on("enter",q).find(e.rowSelector).on("mouseenter",t).on("mouseleave",p).on("click",u);a(document).mousemove(g);}})(jQuery);var globalMenu=$("#JS_mll_menu_map");globalMenu.menu({activate:function(b){var d=$(b);if(!d.data("imgLoaded")){var a=d.find(".sub img");a.prop("src",a.attr("menu-lazy-src"));d.data("imgLoaded",1);}d.addClass("hover").find("em").stop().animate({"margin-left":"19px"},200);var c=globalMenu.find("#JS_sub_recommend");if(d.hasClass("recommend")){d.hasClass("recommend")&&c.animate({"padding-left":"11px"},200).show();}else{d.find(".sub").stop().animate({opacity:"1","padding-left":"27px"},200).show();c.css("display")!="none"&&c.animate({"padding-left":"5px"},200).hide();}},deactivate:function(a){var b=$(a);b.removeClass("hover").find("em").stop().animate({"margin-left":"14px"},200);b.find(".sub").stop().animate({opacity:"0.8","padding-left":"17px"},200).hide();},rowSelector:"li.top-item",exitMenu:function(c){var c=$(c);var b=c.find(".hover");var a=b.find(".sub");b.find("em").stop().animate({"margin-left":"14px"},100);a.animate({opacity:"0.8","padding-left":"17px"},100,function(){a.hide();});var d=globalMenu.find("#JS_sub_recommend");d.data("show")?d.stop().animate({"padding-left":"11px"},100).show():d.stop().animate({"padding-left":"5px"},100,function(){d.hide();});b.removeClass("hover");},firstDelay:window._isIndexPage?200:100});(function(b,c){var a=c("#JS_mll_header_menu_panel");if(a.hasClass("forbid")){return;}a.hover(function(){a.addClass("hover").find(".top").show();},function(){a.removeClass("hover").find(".top").hide();});})(window,$);
/*sheqiulin:2015-11-19 16:21:27*/</script>

<style>
.back_to_top .in_box.back_to_top_bonus{background:url(<s:url value='/images/1418433378115509116.gif'/>) -44px 0;}
.back_to_top_hover .in_box.back_to_top_bonus{background-position:0 0;}
</style>


<script language="javascript">
//清空区域下面的class，然后给当前选项加上class   控制内容的显示

$('.patent_type a').bind('click', function(){

    $(this).addClass('s-hover').siblings().removeClass('s-hover');

	var box_id="box_"+$(this).attr("data");
	//alert(box_id);
	$("."+box_id).show().siblings().hide();
});
$('.patent_type li').bind('click', function(){

    $(this).addClass('on').siblings().removeClass('on');
});

$(function() {
	$("#modalUsername").val("");
	$("#modalPassword").val("");
	$("#loginError").css("display","none");
});

function loginValidate() {
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
}

</script>
<script type="text/javascript">
 function weChat(){
	var appid = "wx7f435f9a93844c0d";
    var redirect_uri = encodeURIComponent("http://www.lotut.com/pts/user/weChat.html");
    var scope = "snsapi_login";

    var url = "https://open.weixin.qq.com/connect/qrconnect?appid=" + appid + "&redirect_uri=" + redirect_uri + "&response_type=code&scope=" + scope + "&state=1#wechat_redirect";
    window.location.href = url;
}
</script>


<script type="text/javascript">  
     //调用QC.Login方法，指定btnId参数将按钮绑定在容器节点中  
       QC.Login({  
            //btnId：插入按钮的节点id，必选  
            btnId: "qqLoginBtn",  
            //用户需要确认的scope授权项，可选，默认all  
            scope: "all",  
            //按钮尺寸，可用值[A_XL| A_L| A_M| A_S|  B_M| B_S| C_S]，可选，默认B_S  
            size: "A_M"  
        }, function (reqData, opts) {//登录成功  
            //根据返回数据，更换按钮显示状态方法  
            var dom = document.getElementById(opts['btnId']),  
       _logoutTemplate = [  
            //头像  
            '<span><img src="{figureurl}" class="{size_key}"/></span>',  
            //昵称  
            '<span>{nickname}</span>',  
            //退出  
            '<span><a href="javascript:QC.Login.signOut();">退出</a></span>'  
       ].join("");  
            dom && (dom.innerHTML = QC.String.format(_logoutTemplate, {  
                nickname: QC.String.escHTML(reqData.nickname), //做xss过滤  
                figureurl: reqData.figureurl  
            }));  
        }, function (opts) {//注销成功  
            alert('QQ登录 注销成功');  
        }  
	);
     
</script>
<script type="text/javascript">
//从页面收集OpenAPI必要的参数。get_user_info不需要输入参数，因此paras中没有参数
var paras = {};

//用JS SDK调用OpenAPI
QC.api("get_user_info", paras)
	//指定接口访问成功的接收函数，s为成功返回Response对象
	.success(function(s){
		//成功回调，通过s.data获取OpenAPI的返回数据
		alert("获取用户信息成功！当前用户昵称为："+s.data.nickname);
	})
	//指定接口访问失败的接收函数，f为失败返回Response对象
	.error(function(f){
		//失败回调
		alert("获取用户信息失败！");
	})
	//指定接口完成请求后的接收函数，c为完成请求返回Response对象
	.complete(function(c){
		//完成请求回调
		alert("获取用户信息完成！");
	});
</script>
<script type="text/javascript">
if(QC.Login.check()){//如果已登录
	QC.Login.getMe(function(openId, accessToken){
		alert(["当前登录用户的", "openId为："+openId, "accessToken为："+accessToken].join("\n"));
		saveQQUser(openId);
	});
	//这里可以调用自己的保存接口
	//saveQQUser
	
}



 function saveQQUser(openId){
	$.ajax({
		type:"POST",
		url:"<s:url value='/user/saveQQUser.html'/>",
		data:{"openId":openId},
		async:false,
		success:function(){
			
		}
	});
	location.reload();
} 
</script>

</body>
</html>