<%--
Created by IntelliJ IDEA.
User: Lenovo
Date: 2022/3/27
Time: 14:59
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="UTF-8">
<link href="jquery/bootstrap_3.3.0/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="jquery/jquery-1.11.1-min.js"></script>
<script type="text/javascript" src="jquery/bootstrap_3.3.0/js/bootstrap.min.js"></script>
	<script>
		$(function(){
			$("#loginAct").focus();
			$("#SubmitBtn").click(function () {
				// alert("aaa");
				login();
			});
			//获取的键盘的keyCodee
			// $(window).keydown(function (event) {
			// 	alert(event.keyCode);
			// });
			$(window).keydown(function (event) {
				if(event.keyCode === 13){
					login();
				}
			});
			//自定义的方法需要写在外面 $(function(){})
			function login() {
				const loginAct = $.trim($("#loginAct").val());
				const loginPwd = $.trim($("#loginPwd").val());
				if (loginAct === "" || loginPwd === ""){
					$("#msg").html("账号密码不能为空");
					//如果账号密码为空 则需要及时强行终止该方法
					return false;
				}
				//去后台验证登陆相关的操作
				$.ajax({
					url:"${pageContext.request.contextPath}/user/login.do",
					data:{
						"loginAct":loginAct,
						"loginPwd":loginPwd
					},
					type:"post",
					dataType:"json",
					success(data){
						//data是后台所提供的
						//data{"statu":true/false,"msg":"错误的原因"}
						if(data.success){
							// alert("chengg");
							window.location.href="workbench/index.jsp";
						}else{
							// $("#msg").html("账号密码有误，请重新输入");
							$("#msg").html(data.msg);
						}
					},
					error(){
						alert("出错了");
					}
				})
			}
		})
	</script>
</head>
<body>
	<div style="position: absolute; top: 0px; left: 0px; width: 60%;">
		<img src="image/IMG_7114.JPG" style="width: 100%; height: 90%; position: relative; top: 50px;">
	</div>
	<div id="top" style="height: 50px; background-color: #3C3C3C; width: 100%;">
		<div style="position: absolute; top: 5px; left: 0px; font-size: 30px; font-weight: 400; color: white; font-family: 'times new roman'">CRM &nbsp;<span style="font-size: 12px;">&copy;2022&nbsp;crm</span></div>
	</div>
	
	<div style="position: absolute; top: 120px; right: 100px;width:450px;height:400px;border:1px solid #D5D5D5">
		<div style="position: absolute; top: 0px; right: 60px;">
			<div class="page-header">
				<h1>登录</h1>
			</div>
			<form action="workbench/index.jsp" class="form-horizontal" role="form">
				<div class="form-group form-group-lg">
					<div style="width: 350px;">
						<input class="form-control" type="text" placeholder="用户名" id="loginAct">
					</div>
					<div style="width: 350px; position: relative;top: 20px;">
						<input class="form-control" type="password" placeholder="密码" id="loginPwd">
					</div>
					<div class="checkbox"  style="position: relative;top: 30px; left: 10px;">
						
							<span id="msg" style="color: #2aabd2"></span>
						
					</div>
					<button type="button" id="SubmitBtn" class="btn btn-primary btn-lg btn-block"  style="width: 350px; position: relative;top: 45px;">登录</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>