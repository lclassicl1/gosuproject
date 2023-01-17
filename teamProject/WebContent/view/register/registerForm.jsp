<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
  	<!-- google cdn 방식 jquery-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <meta charset="UTF-8">
  <meta name="description" content="memberboard web app">
  <meta name="keywords" content="article, javascript, board, webProject">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>회원가입</title>
	<style></style>
	<script>
	</script>
</head>
<body>
	<h1>회원가입 페이지입니다.</h1>
	<form action="">
	<ul>
	<li>아이디:<input type='text' id='user_id' name='user_id' placeholder="ID를 입력해주세요"/></li>
	<li>비밀번호:<input type='password' id='user_pwd' name='user_pwd' placeholder="비밀번호를입력해주세요"/></li>
	<li>비밀번호확인:<input type='password' id='re_user_pwd' name='re_user_pwd'/></li>
	<li>이름:<input type='text' id='user_name' name='user_name' placeholder="이름을 입력해주세요"/></li>
	<li>생년월일:<input type='text' id='user_birth' name='user_birth' placeholder="생년월일6자리를 입력하세요"/></li>
	<li>전화번호:<input type='text' id='user_hp' name='user_hp' placeholder="전화번호를 입력해주세요(-제외)"/></li>
	<li>주소:<input type='text' id='user_address' name='user_address' placeholder="주소(시,구)를 입력해주세요"/></li>
	<li>이메일:<input type="email" id='user_email' name='user_email' placeholder="이메일을 입력해주세요"/></li>
	<li><input type="radio" value="남"/>남 </li>
	<li>보유자격증:<input type='text' id='user_skill' name='user_skill' placeholder="보유자격증을 입력해주세요"/></li>
	<li>학력사항:<input type='text' id='user_school' name='user_school' placeholder="최종학력사항을 입력해주세요"/></li>
	<li><input type='submit' value='회원가입하기'/>&nbsp;<input type='button' value='취소' id='cancel' name='cancel'/></li>
	</ul>
	</form>
	
	</body>
</html>