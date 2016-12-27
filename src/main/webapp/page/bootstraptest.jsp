
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>bootstrap测试</title>
<link rel="stylesheet"
	href="${url}/resources/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="${url}/resources/jquery-1.10.2.js"></script>
<script type="text/javascript" src="${url}/resources/bootstrap/js/bootstrap.js"></script>
</head>
<body>

<div id="test" style="position:absolute;top:20px;left:40px;background-color: #ffa" class="popover-notitle" data-rel="popover" data-content="我显示啦">点我弹出提示框！</div>


</body>



<script type="text/javascript">
$('#test').popover({html:true});


</script>
</html>