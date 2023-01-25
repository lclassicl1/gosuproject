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
	<h2>트레이드 게시판 글쓰기</h2>
	<form action='<%=request.getContextPath()%>/helper/tradeWrite.do' method='post'>
		<table border='1'>
			<tr>
			<th>제목</th>
				<td><input type='text' id='tradetitle' name='tradetitle' size=100/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="30" cols="100" id='tradecontent' name='tradecontent'></textarea></td>
			</tr>
		</table>
		<input type='submit' value='작성하기'/>&nbsp;<input type='reset' value='취소'/>
	</form>
</body>
</html>