<%-- 
    Document   : index
    Created on : 8 mars 2013, 14:24:10
    Author     : schatteleyn
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <title>SupMarket</title>
    </head>
    <body>
            <div class="navbar navbar-reverse">
            <div class="navbar-inner">
              <a class="brand" href="#">SupMarket</a>
              <ul class="nav">
              <c:choose>
                <c:when test="${not empty user}">
                <li><a href="/all">Home</a></li>
                <li><a href="/france">France</a></li>
                <li><a href="/api/canada">Canada</a></li>
                <li><a href="/api/japan">Japan</a></li>
                </c:when>
                <c:otherwise>
                    <c:url value="/login" var="loginUrl" />
                    <li><a href="${loginUrl}">Login</a></li>
                </c:otherwise>
              </c:choose>
              </ul>
            </div>
          </div>
        <div class="container"> 
        <ul>
            <c:choose>
                <c:when test="${not empty user}">
                    <c:url value="/france" var="franceUrl" />
                    <li><a href="${franceUrl}">France Stats</a></li>
                    <c:url value="/canada" var="canadaUrl" />
                    <li><a href="${canadaUrl}">Canada Stats</a></li>
                    <c:url value="/japan" var="japanUrl" />
                    <li><a href="${japanUrl}">Japan Stats</a></li>
                    <c:url value="/all" var="allUrl" />
                    <li><a href="${allUrl}">All Agencies Stats</a></li>
                    <c:url value="/logout" var="logoutUrl" />
                    <li><a href="${logoutUrl}">Logout</a></li>
                </c:when>
                <c:otherwise>
                    <c:url value="/login" var="loginUrl" />
                    <li><a href="${loginUrl}">Login</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
        </div>
    </body>
</html>