<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="spring" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="<s:url value='/js/jquery.min.js'/>"></script>
<title>Insert title here</title>
<style type="text/css">
        .div_list_item {
            margin-top: 30px;
        }
    </style>
   
</head>
<body>
    <div>
        <div class="div_list_item">
            <div>
                <a href="http://shiyousan.com/post/635623857208296120" target="_blank">什么是CSRF攻击</a>
            </div>
            <div class="bdsharebuttonbox">
                <a class="bds_more" href="#" data-cmd="more"></a>
                <a title="分享到QQ空间" class="bds_qzone" href="#" data-cmd="qzone" data-id="635623857208296120"></a>
                <a title="分享到新浪微博" class="bds_tsina" href="#" data-cmd="tsina" data-id="635623857208296120"></a>
                <a title="分享到腾讯微博" class="bds_tqq" href="#" data-cmd="tqq" data-id="635623857208296120"></a>
                <a href="javascript:" class="bds_weixin yc_wx" style="background-image: url(<s:url value='/images/wx_0868d839.png'/>);width: 140px;height: 40px;display: block;background-repeat: no-repeat;background-position: 26px center;font: 14px/40px Microsoft YaHei;color: #222;float: left;margin: 0 8px;text-indent: 64px;-moz-border-radius: 5px;-webkit-border-radius: 5px;border-radius: 5px;cursor: pointer;display: inline;}" data-cmd="weixin" title="分享到微信">微信</a>
            </div>
        </div>
    </div>
	<div>
		<button onclick="IsPC()" type="button">查看客户端类型</button>
	</div>
    <script type="text/javascript">
        //全局变量，动态的文章ID
        var ShareId = "";
        //绑定所有分享按钮所在A标签的鼠标移入事件，从而获取动态ID
        $(function () {
            $(".bdsharebuttonbox a").mouseover(function () {
                ShareId = $(this).attr("data-id");
            });
        });

        /* 
        * 动态设置百度分享URL的函数,具体参数
        * cmd为分享目标id,此id指的是插件中分析按钮的ID
        *，我们自己的文章ID要通过全局变量获取
        * config为当前设置，返回值为更新后的设置。
        */
        function SetShareUrl(cmd, config) {
        	console.log(this);
        	alert($(this).attr('class'));
        	if(IsPC()){
        		 config.bdUrl = "http://www.lotut.com/news/newsPreview.html?newsId=1115";    
        	}else{
        		 config.bdUrl = "http://www.lotut.com/news/newsPreview.html?newsId=1161";
        	}
            //if (ShareId) {
                //config.bdUrl = "http://shiyousan.com/post/" + ShareId;    
               // config.bdUrl = "http://www.lotut.com/news/newsPreview.html?newsId=1115";    
            //}
            return config;
        }

        //插件的配置部分，注意要记得设置onBeforeClick事件，主要用于获取动态的文章ID
        window._bd_share_config = {
            "common": {
                onBeforeClick:SetShareUrl,"bdSnsKey":{},"bdText":"","bdMini":"2"
                ,"bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"24"
            }, "share": {}
        };
        //插件的JS加载部分
        with (document) 0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+ ~(-new Date() / 36e5)];
    </script>
    <script type="text/javascript">
    	function IsPC() {
    	    var userAgentInfo = navigator.userAgent;
    	    var Agents = ["Android", "iPhone",
    	                "SymbianOS", "Windows Phone",
    	                "iPad", "iPod"];
    	    var flag = true;
    	    for (var v = 0; v < Agents.length; v++) {
    	        if (userAgentInfo.indexOf(Agents[v]) > 0) {
    	            flag = false;
    	            break;
    	        }
    	    }
    	    if(flag){
    	    	alert("pc端");
    	    }else{
    	    	alert("手机端");
    	    }
    	    return flag;
    	}
    </script>
</body>
</html>