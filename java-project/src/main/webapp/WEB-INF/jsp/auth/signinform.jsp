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
    <fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
    </fb:login-button>
</div>
</div>

</form>
<jsp:include page="../footer.jsp"/>
</div>
<jsp:include page="../jslib.jsp"/>

<script type="text/javascript">
// 로그인 성공한 후 서버에 자동으로 로그인 하
// => 서버에서 페이스북으로 부터 사용자 정보를 가져오기
function autoServerLogin(accessToken) {
    location.href = "facebookLogin?accessToken=" + accessToken;
}

 function statusChangeCallback(response) {
    console.log(response);
    if (response.status === 'connected') { // 로그인이 정상적으로 되었을 때,
        autoServerLogin(response.authResponse.accessToken);
    } else { // 로그인이 되지 않았을 
      console.log("로그인되지 않았음");
    }
  }
  
function checkLoginState(){
    FB.getLoginStatus(function(response) { 
        statusChangeCallback(response);
      });
}

window.fbAsyncInit = function() {
    FB.init({
      appId      : '925694564282234', // 개발자가 등록한 앱 ID
      cookie     : true,  
      xfbml      : true,  
      version    : 'v2.12'
    });
  };

(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));

</script>

</body>
</html>
