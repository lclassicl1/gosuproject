<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
  	<!-- google cdn 방식 jquery-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Gosu프로젝트 처음으로 보여질 첫페이지 입니다.</title>
	<style>
		h1 {
			text-align: center;
		}
		
		div {
			text-align: center;
		}
		
		img {
			width: 400px;
			height: 400px;
		}
	</style>
	<script>
		$(function(){
			$('#register').click(function(){
				alert('회원가입버튼');
			});
		});
	</script>
</head>
<body>
	<h1>코딩지옥에 오신걸 환영합니다.</h1><br/>
		<div><img src="image/mainimg2.jpg"/></div><br/>
		<form action="">
		<div>아이디<input type='text' id='userid' name='userid' class='text1'/><br/>
		비밀번호<input type='password' id='userpwd' name='userpwd' class='text1'>
		<input type='submit' value='로그인' class='text1' id='submit'/><br/>
		<input type='button' value='회원가입' id='register'/><input type='button' value='비밀번호찾기' id='findpwd'/></div>
		</form>
</body>
</html>