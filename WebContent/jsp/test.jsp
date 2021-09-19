<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Page</title>
<link href="css/styles.css" rel="stylesheet" />
</head>
<body>
	<%@ include file="../include/header.jsp" %>
	<main>
	<div align="center">
		<form action="result" method="post" >
		<c:forEach var="i" items="${list }">
			<div align="center" class="tests">
				<h3>${i.num }. ${i.ex }</h3>
				<div class="test_radio">
					<div class="div_radio">
						<input type="radio" name="${i.num }" value="1" />${i.select1 }
					</div>
					<div class="div_radio">
						<input type='radio' name='${i.num }' value='2' />${i.select2 }
					</div>
					<div class="div_radio">
						<input type='radio' name='${i.num }' value='3' />${i.select3 }
					</div>
					<div class="div_radio">
						<input type='radio' name='${i.num }' value='4' />${i.select4 }
					</div>
					<div class="div_radio">
						<input type='radio' name='${i.num }' value='5' />${i.select5 }
					</div>
				</div>
			</div>
		</c:forEach>
		<br/>
		<input type="submit" value="채점하기">
		</form>
	</div>
	</main>
	<%@ include file="../include/footer.jsp" %>
</body>
</html>