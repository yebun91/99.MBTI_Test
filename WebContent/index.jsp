<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script>

</script>
<link href="css/styles.css" rel="stylesheet" />
</head>
<body>
	<%@ include file="include/header.jsp" %>
	<main>
		<c:if test="${logininfo ne null }">
			<h2 class="main_welcome">${logininfo.name }님 어서오세요.</h2>
			<input type="button" onclick="location.href='test'" value="테스트 시작하기"/>
		</c:if>
		<c:if test="${logininfo eq null }">
			<h2>Login</h2>
			<form action="login" method="post">
				<div>
					<input type="text" placeholder="아이디" name="id" class="input_id"> 
				</div>
				<div>
					<input type="password" placeholder="비밀번호" name="pw" class="input_pw"> 
				</div>
				<input type="submit" value="로그인"/>
				<input type="button" onclick="location.href='join'" value="회원가입"/>
				<c:if test="${error ne null }">
					<p class="error_message">${error }</p>
				</c:if>
			</form>
		</c:if>
	</main>
	<%@ include file="include/footer.jsp" %>
</body>
</html>