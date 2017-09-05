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
	<jsp:include page="../../inc/header.jsp"/>
	<!-- visual부분 -->
	<jsp:include page="../../customer/inc/visual.jsp"/>
	
	<div id="body" class="clearfix">
		<div class="content-container">
		
		<!-- aside부분 -->
		<jsp:include page="../inc/aside.jsp"/>

		<main id= "main">
		<h2 class="main title">공지사항</h2>
		
		<div>
			<h3>경로</h3>
			<ol>
				<li><a href="">home</a></li>
				<li><a href="">고객센터</a></li>
				<li><a href="">공지사항</a></li>
			</ol>
		</div>

		</main>
	</div>
	</div>
	<!-- footer부분 -->
	<jsp:include page="../../inc/footer.jsp"/>

</body>
</html>















