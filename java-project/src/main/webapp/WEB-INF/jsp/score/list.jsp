<%@page import="java.util.List"%>
<%@page import="java100.app.domain.Score"%>
<%@page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html>
<html>

<head>
<title>성적관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="../header.jsp"/>
<h1>Score List</h1>

<jsp:include page="../listToolbar.jsp"/>

<table class='table table-hover'>

<thead>
<tr>
<th>No</th><th>Name</th><th>Sum</th><th>Aver</th>
</tr>
</thead>

<tbody>
<c:forEach items="${list}" var="score">

<tr>
    <td>${score.no}</td>
    <td><a href='${score.no}'>${score.name}</a></td>
    <td>${score.sum}</td>
    <td><fmt:formatNumber value="${score.aver}" pattern=".0"/></td>
</tr>

</c:forEach>

</table>

<jsp:include page="../prevPage.jsp"/>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
    