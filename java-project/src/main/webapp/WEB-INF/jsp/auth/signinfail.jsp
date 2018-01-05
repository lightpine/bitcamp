<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh" content="2;signin">
<title>SIGN IN</title>
<!-- 웹 브라우저가 바라보는 경로! -->
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>

<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>sign in fail</h1>
<p>no matching your email or password!</p>

<jsp:include page="../footer.jsp"/>

</div>
<jsp:include page="../jslib.jsp"/>
</body>
</html>
