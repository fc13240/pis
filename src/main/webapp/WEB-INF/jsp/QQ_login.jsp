<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="spring" prefix="s" %>
<%@ taglib uri="c" prefix="c" %>
<%@ taglib uri="security" prefix="se" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
	<meta http-equiv="X-UA-Compatible" content="IE=9" />
	<title>龙图腾专利管家－让专利管理更轻松！</title>
<meta name="keywords" content="龙图腾，龙图腾专利，专利管理，知识产权管理，专利管理软件，专利管家，专利监控，专利年费，专利官费，年费代缴，如何缴纳专利年费，通知书，通知书监控，专利费用查询，专利分析，专利代理管理系统，企业专利，高校专利"/>
<meta name="description" content="龙图腾专利管家，最简单的专利全流程管理系统，全程为专利代理机构、专利申请人或专利权人以及发明人的专利申请保驾护航，有效解决通知书答复过期失效，以及专利官费年费多缴、少缴、忘缴的问题。">
<meta name="description" content="QQ login page" />
<script type="text/javascript" src="http://qzonestyle.gtimg.cn/qzone/openapi/qc_loader.js" data-appid="101359853" data-redirecturi="http://www.lotut.com" charset="utf-8"></script>
</head>

	<body >
		<span id="qqLoginBtn"></span>
		<script type="text/javascript">  
        //调用QC.Login方法，指定btnId参数将按钮绑定在容器节点中  
		        QC.Login({  
			            //btnId：插入按钮的节点id，必选  
			            btnId: "qqLoginBtn",  
			            //用户需要确认的scope授权项，可选，默认all  
			            scope: "all",  
			            //按钮尺寸，可用值[A_XL| A_L| A_M| A_S|  B_M| B_S| C_S]，可选，默认B_S  
			            size: "A_XL"  
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
		<%-- QC.Login({
			btnId:"qqLoginBtn"	//插入按钮的节点id
		});
		</script>
		<script type="text/javascript">
			var paras = {};
			QC.api("get_user_info", paras)
				.success(function(s){//成功回调
					alert("获取用户信息成功！当前用户昵称为："+s.data.nickname);
				})
				.error(function(f){//失败回调
					alert("获取用户信息失败！");
				})
				.complete(function(c){//完成请求回调
					alert("获取用户信息完成！");
			}); 
			QC.api("get_user_info", {}) 
			//指定接口访问成功的接收函数，s为成功返回Response对象 
			.success(function(s){ 
					console.log(s); 
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
			 
			//检查是否登录 
			if(QC.Login.check()){//如果已登录 
			QC.Login.getMe(function(openId, accessToken){ 
			alert(["当前登录用户的", "openId为："+openId, "accessToken为："+accessToken].join("\n")); 
			}); 
			//这里可以调用自己的保存接口 
			//... 
			}--%>
		<%-- 
		
		<script type="text/javascript">
			//从页面收集openapi必要的参数
			var paras = {
				images:"http://y.photo.qq.com/img?s=OnbP8BwOF&l=y.jpg",
				title:"#QQ互联JSSDK测试#我是标题啊标题",
				url:"http://connect.qq.com/",
				comment:"我是评论：转发原因",
				summary:"我是摘要：内容说明"
			};
			
			//用jssdk调用openapi
			QC.api("add_share", paras)
				.success(function(s){//请自行改写成功回调
					alert("分享成功，请到空间内查看！");
				})
				.error(function(f){//请自行改写失败回调
					alert("分享失败！");
				})
				.complete(function(c){//请自行改写完成请求回调
					alert("分享完成！");
				});
		</script>
		 --%>
		<script type="text/javascript">
			if(QC.Login.check()){//如果已登录
				QC.Login.getMe(function(openId, accessToken){
					alert(["当前登录用户的", "openId为："+openId, "accessToken为："+accessToken].join("\n"));
				});
				//这里可以调用自己的保存接口
				//...
			}
</script>
	</body>
</html>