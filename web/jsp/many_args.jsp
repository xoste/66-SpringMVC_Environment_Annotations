<%--
  Created by IntelliJ IDEA.
  User: Xoste
  Date: 2020/12/3
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/demo6" method="post">
    <label>
        <%--<input type="text" name="username">
        <input type="text" name="password">
        <input type="checkbox" name="hover" value="学习"/>
        <input type="checkbox" name="hover" value="写代码"/>
        <input type="checkbox" name="hover" value="看视频"/>
        <input type="checkbox" name="hover" value="看笔记"/>--%>
        <input type="text" name="user.username"/>
            <input type="text" name="user.password"/>
        <input type="submit" value="提交"/>
    </label>
</form>
<a href="${pageContext.request.contextPath}/demo7?username=lisi&password=1234">普通跳转</a><br/>
<a href="${pageContext.request.contextPath}/demo8/zhangsan/123">springMVC方式跳转</a>
</body>
</html>
