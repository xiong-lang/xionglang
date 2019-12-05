<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/css.css">
</head>
<body>
	<form action="add" method="post">
		电影名称：<input type="text" name="name"><br><br>
		导演名称：<input type="text" name="director"><br><br>
		发布时间：<input type="date" name="time"><br><br>
		电影类型：
		<c:forEach items="${list}" var="d">
			${d.dname}<input type="checkbox" value="${d.id}" name="array">
		</c:forEach>
		<br><br>
		<input type="submit" value="添加">
	</form>
</body>
</html>