<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="security" prefix="se" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="<s:url value='/js/jquery_from.js'/>"></script>
<script src="<s:url value='/js/jquery.min.js'/>"></script>
<script src="<s:url value='/js/jquery-ui.min.js'/>" type="text/javascript"></script>
<link rel="stylesheet" href="<s:url value='/css/mll.common.min.css?20160311'/>" />
<link rel="stylesheet" href="<s:url value='/css/index.css'/>" />
<link rel="stylesheet" href="<s:url value='/temp/css/bootstrap.min.css'/>" />
<script src="<s:url value='/plugins/kindeditor/bootstrap.min.js'/>" type="text/javascript"></script>
<script type="text/javascript" src="http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js" data-appid="101359853" data-redirecturi="http://www.lotut.com" charset="utf-8" data-callback="true"></script>

</head>
<body>
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
    width: 50px;
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
    background: url(<s:url value='/img/submit_btn.png'/>) no-repeat;
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
    margin: 10px 0;
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
    text-align:left;
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
                <span id="qqLoginBtn" style="display:none;"></span>
                <a class="linkqzone" href="javascript:void(0);" title="使用QQ号登录" data-fid="f296fc4cfce" onclick="$('#qqLoginBtn a').click();"></a>
                <a class="linksina" href="javascript:void(0);" title="使用微信登录"  onclick="weChat()" data-fid="f5798def9af"></a>
                
            </div>
	         
	        </div>
      </div>
   </div>
</div>

<script type="text/javascript">
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
     
     
    if(QC.Login.check()){
 	    QC.api("get_user_info")
 	        .success(function(s){//成功回调
 	            QC.Login.getMe(function(openId, accessToken){
 	            	var nickname= s.data.nickname;
 	            	alert("恭喜QQ用户："+nickname+" 登陆成功");
 	            	saveQQUser(openId,s.data.nickname);
 	            })
 	        })
 	        .error(function(f){//失败回调
 	            alert("QQ登录失败！,请重新登陆！");
 	        })
 	        .complete(function(c){//完成请求回调
 	        });
 	}

 	function saveQQUser(openId,nickname){
 		$.ajax({
 			type:"POST",
 			url:"<s:url value='/user/saveQQUser.html'/>",
 			data:{"openId":openId,"nickname":nickname},
 			async:false,
 			success:function(){
 				
 			},error:function (){
 				alert("QQ登陆失败，请重新登陆！");
 			}
 		});
 		location.reload();
 	} 
</script>
</body>
</html>