<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<meta name="viewport"
	content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="/resource/css/bootstrap.min.css">
</head>
<body>  
<div class="container">
		<dl>
		   <dt><a href="javascript:history.back()">关闭窗口</a></dt>
			<dt>${article.title }</dt>
				<hr>
			
			<dd>${article.content }</dd>
		</dl>
	

</div>


</body>
</html>