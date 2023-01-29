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
	<title></title>
	<style></style>
	<script>
	</script>
</head>
<body>
	<h1>회원가입 성공 페이지</h1>
	<h2>${param.user_name}님 환영합니다</h2>
	회원가입성공한 정보:${param}<br/>
	<div>공지사항</div>
	<div>자유게시판</div>
	<div>코딩해주세요</div>
	<div>코딩해줄게요</div>
	<div><a href='<%=request.getContextPath()%>/helper/trade.do'>중고거래게시판</a></div>
	<div>수업후기게시판</div>
	<div><a href='<%=request.getContextPath()%>/view/register/registerSuccess.jsp'>메인으로</a></div>
	
</body>
</html>