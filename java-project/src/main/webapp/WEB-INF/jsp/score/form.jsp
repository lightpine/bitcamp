<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<!-- 웹 브라우저가 바라보는 경로! -->
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>

<div class='container'>
<jsp:include page="../header.jsp"/>
<h1><font color="darkgray">성적 상세 정보</font></h1>

<form action='add' method='post'>
<div class='form-group row'>
<label for='name' class='col-sm-2 col-form-label'>name</label>

<div class='col-sm-10'>
<input id='name' class='form-control' type='text' name='name'></div>
</div>
<div class='form-group row'>
<label for='kor' class='col-sm-2 col-form-label'>kor</label>

<div class='col-sm-10'>
<input id='kor' class='form-control' type='number' name='kor'></div>
</div>
<div class='form-group row'>
<label for='eng' class='col-sm-2 col-form-label'>eng</label>

<div class='col-sm-10'>
<input id='eng' class='form-control' type='number' name='eng'></div>
</div>
<div class='form-group row'>
<label for='math' class='col-sm-2 col-form-label'>math</label>

<div class='col-sm-10'>
<input id='math' class='form-control' type='number' name='math'></div>
</div>

<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-outline-info btn-sm'>add</button>
</div>
</div>

</form>
<jsp:include page="../footer.jsp"/>
</div>
<jsp:include page="../jslib.jsp"/>
</body>
</html>
