<%--
  Created by IntelliJ IDEA.
  User: xuhaocheng
  Date: 2017/8/1
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/form1.action" method="post">
        username:<input type="text" name="username">
        <br/>
        password:<input type="text" name="password">
        <br/>
        address:<input type="text" name="address">
        <br/>
        <input type="submit" value="提交"／>

    </form>
</body>
</html>
