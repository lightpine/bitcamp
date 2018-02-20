<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<title>도서관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>도서 상세 정보</h1>

<c:if test="${not empty library}">
        <form action='update' method='post' enctype="multipart/form-data">
        
        <div class='form-group row'>
        <label class='col-sm-2 col-form-label'></label>
        <div class='col-sm-10'>
        <c:forEach items='${library.files}' var='file'>
          <img src='${contextPath}/download/${file.filename}' width="190" height="280">
          &nbsp;&nbsp;&nbsp;
        </c:forEach>
        </div>
        </div>

        <div class='form-group row'>
        <label for='no' class='col-sm-2 col-form-label'>번호</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='no' type='number' 
                name='no' value='${library.no}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='title' class='col-sm-2 col-form-label'>제목</label>
        <div class='col-sm-10'>
        <input class='form-control' id='title' type='text' 
                name='title' value='${library.title}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='publisher' class='col-sm-2 col-form-label'>출판사</label>
        <div class='col-sm-10'>
        <textarea class='form-control' id='publisher' 
                    name='publisher'>${library.publisher}</textarea>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='createDate' class='col-sm-2 col-form-label'>출판일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='createDate' type='date' 
                name='createDate'value='${library.createDate}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='price' class='col-sm-2 col-form-label'>가격</label>
        <div class='col-sm-10'>
        <input class='form-control' id='price' type='number' 
                name='price' value='${library.price}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='explanation' class='col-sm-2 col-form-label'>설명</label>
        <div class='col-sm-10'>
        <textarea class='form-control' id='explanation' 
                    name='explanation'>${library.explanation}</textarea>
        </div>
        </div>
        
        <div class='form-group row'>
		<label for='file1' class='col-sm-2 col-form-label'>파일1</label>
		<div class='col-sm-10'>
		<input type="file" class="form-control-file" id="file1" name="file">
		</div>
		</div>
		
		<div class='form-group row'>
		<label for='file2' class='col-sm-2 col-form-label'>파일2</label>
		<div class='col-sm-10'>
		<input type="file" class="form-control-file" id="file2" name="file">
		</div>
		</div>
		
		<div class='form-group row'>
		<label for='file3' class='col-sm-2 col-form-label'>파일3</label>
		<div class='col-sm-10'>
		<input type="file" class="form-control-file" id="file3" name="file">
		</div>
		</div>
        
        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>변경</button>
        <a href='delete?no=${library.no}' class='btn btn-primary btn-sm'>삭제</a>
        </div>
        </div>
        </form>
</c:if>
<c:if test="${empty library}">
        <p>'${param.no}'번 게시물이 없습니다.</p>
</c:if>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
