<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>Main</title>
</head>
<body>
	<H1>등록하거라</H1>	
	<div class="container">
	    <form action="newgoods" method="post">
	        <div class="form-group">
	            <label for="name">상품명</label>
	            <input type="text" name="goodsName" placeholder="상품명을 입력하세요"> <br>
	            <label for="name">상품가격</label>
	            <input type="text" name="goodsPrice" placeholder="상품가격 입력하세요"> 원 <br>
	            <label for="name">메모</label>
	            <input type="text" id="rmk" name="rmk" >           
	        </div>
	        
	        <button type="submit">등록</button> </form>
	</div> <!-- /container -->	
</body>
</html>