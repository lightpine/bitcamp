<%@page import="java100.app.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>Member List</h1>

<jsp:include page="../listToolbar.jsp"/>

<table class='table table-hover'>
<thead>
<tr>
<th>No</th><th>Name</th><th>Email</th><th>Create Date</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="member">    
        <tr>
        <td>${member.no}</td>
        <td><a href='${member.no}'>${member.name}</a></td>
        <td>${member.email}</td>
        <td>${member.createdDate}</td>
        </tr>
</c:forEach>

</tbody>
</table>

<jsp:include page="../prevPage.jsp"/>

<jsp:include page="../footer.jsp"/>
</div>
<jsp:include page="../jslib.jsp"/>
</body>
</html>

