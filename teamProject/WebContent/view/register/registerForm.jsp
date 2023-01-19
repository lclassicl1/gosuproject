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
	<style>
	div{
		text-align: center;
	}
	</style>
	<script>
		$(function(){
			$('#moveHome').click(function(){
				location.href='/teamProject/helper/index.do';
			});
		});
	</script>
</head>
<body>
	<div><h1>회원가입</h1></div>
	<form action="/teamProject/helper/register.do" method='post'>
	
	<div>아이디:<input type='text' id='user_id' name='user_id' placeholder="ID를 입력해주세요"/></div>
	<div>비밀번호:<input type='password' id='user_pwd' name='user_pwd' placeholder="비밀번호를입력해주세요"/></div>
	<div>비밀번호확인:<input type='password' id='re_user_pwd' name='re_user_pwd'/></div>
	<div>이름:<input type='text' id='user_name' name='user_name' placeholder="이름을 입력해주세요"/></div>
	<div>생년월일:<input type='text' id='user_birth' name='user_birth' placeholder="생년월일6자리를 입력하세요"/></div>
	<div>전화번호:<input type='text' id='user_hp' name='user_hp' placeholder="전화번호를 입력해주세요(-제외)"/></div>
	<div>주소:<input type='text' id='user_address' name='user_address' placeholder="주소(시,구)를 입력해주세요"/></div>
	<div>이메일:<input type="email" id='user_email' name='user_email' placeholder="이메일을 입력해주세요"/></div>
	<div><label for='user_gender'>남:</label><input type="radio" value="M" id='user_gender' name='user_gender'/>
		<label for='user_gender2'>여:</label><input type='radio' value='F' id='user_gender2' name='user_gender'/></div>
	
	<div><label for='user_skill'>보유자격증:</label><select name='user_skill' id='user_skill'>
					<option value=''>없음</option>
					<option value='정보처리산업기사'>정보처리산업기사</option>
					<option value='정보처리기사'>정보처리기사</option>
					<option value='OCJP'>OCJP</option>
					<option value='OCJD'>OCJD</option>
				</select></div>
	<div><label for='user_school'>학력사항:</label><select name='user_school' id='user_school'>
					<option value='고등학교졸업'>고등학교졸업</option>
					<option value='전문대졸업'>전문대졸업</option>
					<option value='4년대학졸업'>4년대학졸업</option>
					<option value='학사'>학사</option>
					<option value='박사'>박사</option>
				</select></div>
	<div><input type='submit' value='회원가입하기'/>&nbsp;<input type='button' value='취소' id='cancel' name='cancel'/>
		<input type='button' id='moveHome' value='HOME으로'></div>
	</form>
	</body>
</html>