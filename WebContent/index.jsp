<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
name : ${name}<br>
session name : ${sessionScope.name}<br>
request name : ${requestScope.name}<br>
page name : ${pageScope.name}<br>
application name : ${applicationScope.name}
</body>
</html>