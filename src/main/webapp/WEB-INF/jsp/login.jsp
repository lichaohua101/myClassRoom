<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登录</title>
</head>
<body>

<div>
	<form action="loginCheck" method="post" class="layui-form" >
		 <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
         <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
         <input class="loginin" value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
         <div>
         	<table>
         		<tr>
         			<td><a href="userRegister"><span style="color: black;" class="btn btn-danger  btn-lg">学生注册</span></a></td>
         			<td><a href="AdminRegister"><span style="color: black" class="btn btn-danger  btn-lg">教师注册</span></a></td>
         		</tr>
         	</table>
         </div>
	</form>
</div>

</body>
</html>