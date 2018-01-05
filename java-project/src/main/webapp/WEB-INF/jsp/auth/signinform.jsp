<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
<!DOCTYPE html>
<html>
<head>
<title>SIGN IN</title>
<!-- 웹 브라우저가 바라보는 경로! -->
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>

<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>sign in</h1>

<form action='signin' method='post'>
<div class='form-group row'>
<label for='email' class='col-sm-2 col-form-label'>email</label>
<div class='col-sm-10'>
<input id='email' class='form-control' type='email' 
        name='email' value="${cookie.email.value}"></div>
</div>

<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>password</label>
<div class='col-sm-10'>
<input id='password' class='form-control' type='password' name='password'></div>
</div>

<div class='form-group row'>
<div class='col-sm-2'></div>
<div class='col-sm-10'>
<div class="form-check">
    <input type="checkbox"  
           id="saveEmail" name="saveEmail" class="form-check-input">
    <label class="form-check-label" for="saveEmail">save Email</label>
</div>
</div>
</div>

<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-outline-info btn-sm'>sign in</button>
</div>
</div>

</form>
<jsp:include page="../footer.jsp"/>
</div>
<jsp:include page="../jslib.jsp"/>
</body>
</html>
