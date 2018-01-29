<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script  src="http://libs.baidu.com/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		console.log("dsadasd");
		$("form:eq(0)").submit();
	})
</script>
</head>
<body>
<form action="student/paging" method="post">
<input type="hidden" name="pageNow" value="1"/>
<input type="hidden" name="showPage" value="3"/>
</form>
</body>
</html>