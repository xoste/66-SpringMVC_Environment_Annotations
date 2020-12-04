<%--
  Created by IntelliJ IDEA.
  User: Xoste
  Date: 2020/12/2
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/demo4" method="post">
    <label>
        用户名：<input type="text" name="username1" placeholder="用户名"><br/>
        密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" placeholder="密码"><br/>
        <input type="submit" value="登陆">
    </label>
</form>
</body>
</html>
