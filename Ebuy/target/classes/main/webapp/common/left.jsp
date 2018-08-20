<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="box">
	<h2>商品分类</h2>
	<dl>
			<c:forEach items="${productBigTypeList}" var="bigtype">
				<dd>${bigtype.name}</dd>
				<c:forEach items="${bigtype.productSmallTypeList}" var="smalltype">
					<dt>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">${smalltype.name}</a></dt>
				</c:forEach>
			</c:forEach>
	</dl>
</div>

<div class="spacer"></div>
<div class="last-view">
	<h2>最近浏览</h2>
	<dl class="clearfix">
	
	</dl>
</div>
</body>
</html>