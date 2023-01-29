<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
  	<!-- google cdn 방식 jquery-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src='js/bootstrap.js'></script>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css'/>
  <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js'/>
  <link rel='stylesheet' type='text/css' href='<%=request.getContextPath()%>/css/thema.css'/>
 	<title>INDEX</title>
	<style>	</style>
	<script>
		$(function(){
			$('#loginSubmit').click(function(){
				$.ajax({
					type:"post",
					url:"<%=request.getContextPath()%>/helper/main.do"
				});
			});
		});
	
	</script>
</head>
<body>
	<h1>코딩지옥에 오신걸 환영합니다.</h1><br/>
	주소 : contextPath:<%=request.getContextPath() %>
		<div><img src="http://localhost/teamProject/image/mainimg2.jpg"/></div><br/>
		<form action="<%=request.getContextPath()%>/helper/login.do" method='post'>
		<div>아이디<input type='text' id='user_id' name='user_id' class='text1'/><br/>
		비밀번호<input type='password' id='user_pwd' name='user_pwd' class='text1'>
		<input type='submit' value='로그인' class='text1' id='submit'/><br/>
		<input type='button' value='회원가입' id='register'/><input type='button' value='비밀번호찾기' id='findpwd'/></div>
		<div><a href="<%=request.getContextPath()%>/helper/trade.do">트레이드게시판으로</a></div>
		</form>
		<hr/>
		<a href='<%=request.getContextPath()%>/helper/trade.do'>트레이드게시판으로</a>
</body>
</html>