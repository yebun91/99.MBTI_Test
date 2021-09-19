<%@page import="com.hanul.test.TestDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hanul.test.TestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/styles.css" rel="stylesheet" />
</head>
<body>
	<%@ include file="../include/header.jsp" %>
	<main>
		<div align="center">
			<h2>${logininfo.name }님의 점수는 ${score * 10}점입니다.</h2>
		</div>
	</main>
	<%@ include file="../include/footer.jsp" %>
</body>
</html>