<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header>
<nav class='navbar navbar-expand-lg navbar-light bg-light'>
  <a class='navbar-brand' href='${contextPath}/index.html'>
    <img src='${contextPath}/images/bootstrap-solid.svg' width='30' height='30' class='d-inline-block align-top' alt=''>
    <font color="gray">bitcamp</font>
  </a>
  
<c:if test="${empty menuVisible or menuVisible == true}">

<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>
<span class='navbar-toggler-icon'></span>
</button>
<div class='collapse navbar-collapse' id='navbarNav'>
<ul class='navbar-nav mr-auto'>
  <li class='nav-item'>
    <a class='nav-link' href='../score/list'>score</a>
  </li>
  <li class='nav-item'>
    <a class='nav-link' href='../member/list'>member</a>
  </li>
  <li class='nav-item'>
    <a class='nav-link' href='../board/list'>board</a>
  </li>
  <li class='nav-item'>
    <a class='nav-link' href='../room/list'>room</a>
  </li>
</ul>

<c:choose>
    <c:when test="${sessionScope.signinUser != null}">
        ${sessionScope.signinUser.name}
        <a href="${contextPath}/app/auth/signout" 
           class='btn btn-light btn-sm'><font color='gray'>signout</font></a>
    </c:when>

    <c:otherwise>
       <a href="${contextPath}/app/auth/signin" 
           class='btn btn-outline-info btn-sm'>signin</a>
    </c:otherwise>
</c:choose>
</div>

</c:if>

</nav>
</header>
