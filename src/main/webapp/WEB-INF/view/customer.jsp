<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/5/4
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 导入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<!-- 这里是将 BASE 存储容器响应的根目录的路径，以方便该页面中其他地方进行跳转？ -->
<c:set var="BASE" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>客户信息</title>
</head>
<body>

    <h1>客户信息</h1>

    <%-- TODO --%>
    <table>
        <tr>
            <!-- 表头 -->
            <th>客户名称</th>
            <th>联系人</th>
            <th>电话号码</th>
            <th>邮箱地址</th>
            <th>操作</th>
        </tr>
    </table>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <!-- 每行的表数据，这里使用 JSTL标签 + EL表达式 -->
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>
                <a href="${BASE}/customer_edit?id=${customer.id}">编辑</a>
                <a href="${BASE}/customer_delete?id=${customer.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

</body>
</html>
