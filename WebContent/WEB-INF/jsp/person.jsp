<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path=request.getContextPath(); %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
</head>
<body>
<table>
<c:forEach items="${stuList}" var="ss">
<tr>

<th>${ss.id}</th>
<th>${ss.name}</th>
<th>${ss.age}</th>


</tr>
</c:forEach>
<a href="<%=path%>/student/paging?pageNow=${page.pageNow-1}">上一页</a>
<a href="<%=path%>/student/paging?pageNow=${page.pageNow+1}">下一页</a>

</table>


<br/>
</body>
</html>