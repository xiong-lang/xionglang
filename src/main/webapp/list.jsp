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
<div align="left"><a href="getDept">发布电影</a></div>
<form action="list" method="post">
	电影名称：<input type="text" name="name" value="${map.name}">
	<input type="submit" value="提交">
</form>
	<table>
		<tr>
			<td>编号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td>上映时间</td>
			<td>电影类型</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${pin.list}" var="m">
			<tr>
				<td>${m.id}</td>
				<td>${m.name}</td>
				<td>${m.director}</td>
				<td>${m.time}</td>
				<td>${m.dname}</td>
				<td><a>详情</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="8">
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${pin.pageNum<1?pin.pageNum:pin.pageNum-1}">上一页</a>
				<a href="?pageNum=${pin.pageNum>pin.pages?pin.pageNum:pin.pageNum+1}">下一页</a>
				<a href="?pageNum=${pin.pages}">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>