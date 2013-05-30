<%-- 
    Document   : france
    Created on : 21 mars 2013, 20:37:11
    Author     : schatteleyn
--%>

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
              Bon, sur cette page, tu étais sensé recevoir des données en XML, toussa toussa.<br />
              Malheureusement, je n'ai pas réussi à toruver comment changer l'adresse du webservice et ainsi le faire apparaitre ici !<br />
              Mais tu pourras trouver le code dans com.supinfo.supmarket.api.SoapApi.java<br />
              En espérant que tu jettes un oeil aux sources, et bon courage pour corriger tous les TPs.  
          </div>
                
    </body>
</html>
