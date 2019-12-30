<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<a href="add.jsp">增加</a>
<table>
    <tr>
        <td>宠物编号</td>
        <td>宠物名称</td>
        <td>宠物价格</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${Pets}" var="pets">
        <tr>
            <td>${pets.pid}</td>
            <td>${pets.pname}</td>
            <td>${pets.price}</td>
            <td>
                <a href="delete?pid=${pets.pid}">删除</a>
                <a href="findOne?pid=${pets.pid}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>