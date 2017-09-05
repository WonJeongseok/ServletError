<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href ="../../../css/reset.css" type ="text/css" rel ="stylesheet">
<link href ="../../../css/style.css" type ="text/css" rel ="stylesheet">
</head>
<body>   
	<!-- header부분 -->
	<jsp:include page="../inc/header.jsp"/>
	<!-- visual부분 -->
	<jsp:include page="../customer/inc/visual.jsp"/>
	
	<div id="body" class="clearfix">
		<div class="content-container">
		
		<!-- aside부분 -->
		<jsp:include page="inc/aside.jsp"/>

		<main id= "main">
		<h3 class="main title">가입동의</h3>
		
		<div>
			<h3>경로</h3>
			<ol>
				<li><a href="">home</a></li>
				<li><a href="">고객센터</a></li>
				<li><a href="">공지사항</a></li>
			</ol>
		</div>
		</main>
		<c:if test="${param.error==1}">					<!--*********** ${param.error} 참고**********-->
			<div	style = "clolor:red">
				모든 내용에 동의를 하셔야합니다.
			</div>
		</c:if>
		<form method = "post">
		<div>
			<h3>개인정보 활용 동의</h3>
			<ol>
				<li><a href="">home</a></li>
				<li><a href="">회원정보</a></li>
				<li><a href="">가입동의</a></li>
				<li><a href="">어쩌구저쩌구</a></li>
			</ol>
		</div>
			<input type = "checkbox" name="agree"/>

		</form>
		</main>
	</div>
	</div>
	<!-- footer부분 -->
	<jsp:include page="../inc/footer.jsp"/>

</body>
</html>















