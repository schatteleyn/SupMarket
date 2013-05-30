<%-- 
    Document   : all
    Created on : 20 mars 2013, 00:17:01
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
        <script language="javascript" type="text/javascript" src="js/flot/jquery.js"></script>
	<script language="javascript" type="text/javascript" src="js/flot/jquery.flot.js"></script>
        <script language="javascript" type="text/javascript" src="js/flot/jquery.flot.pie.js"></script>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script type="text/javascript">
            google.load('visualization', '1.0', {'packages':['corechart']});
            google.setOnLoadCallback(drawChart);
            function drawChart() {
            var dataBest = new google.visualization.DataTable();
                dataBest.addColumn('string', 'Name');
                dataBest.addColumn('number', 'Number');
                dataBest.addRows([
                <c:forEach items="${bestSoldProduct}" var="sale">
                    [ '${sale[0].prodId.prodName}', ${sale[1]}],
                </c:forEach>
                ]);
                var options = {'title':'Best Sold Products', 'width':400,'height':300};
                var chart = new google.visualization.PieChart(document.getElementById('test'));
                chart.draw(dataBest, options);
           }
           </script>
           <script type="text/javascript">
              google.load('visualization', '1.0', {'packages':['corechart']});
              google.setOnLoadCallback(drawChart);
              function drawChart() { 
              var dataChannel = new google.visualization.DataTable();
              dataChannel.addColumn('string', 'Name');
              dataChannel.addColumn('number', 'Number');
              dataChannel.addRows([
                <c:forEach items="${salesByChannels}" var="sale">
                    ['${sale[0].channelId.channelDesc}', ${sale[1]}],
                </c:forEach>
                ]);
            
             var options = {'title':'Sales by channels', 'width':600,'height':500};
                var chart = new google.visualization.PieChart(document.getElementById('channels'));
                chart.draw(dataChannel, options);
           }
           </script>
           <script type="text/javascript">
              google.load('visualization', '1.0', {'packages':['corechart']});
              google.setOnLoadCallback(drawChart);
              function drawChart() { 
              var dataCountry = new google.visualization.DataTable();
              dataCountry.addColumn('string', 'Name');
              dataCountry.addColumn('number', 'Number');
              dataCountry.addRows([
                <c:forEach items="${salesByCountries}" var="sale">
                    ['${sale[0].prodId.prodName}', ${sale[1]}],
                </c:forEach>
                ]);
            
              var options = {'title':'Sales by countries', 'width':400,'height':300};
                var chart = new google.visualization.PieChart(document.getElementById('countries'));
                chart.draw(dataCountry, options);
           }
           </script>
           <script type="text/javascript">
              google.load('visualization', '1.0', {'packages':['corechart']});
              google.setOnLoadCallback(drawChart);
              function drawChart() {   
              var dataGender = new google.visualization.DataTable();
              dataGender.addColumn('string', 'Gender');
              dataGender.addColumn('number', 'Number');
              dataGender.addRows([
                <c:forEach items="${salesByGenders}" var="sale">
                    ['${sale[0].custId.custGender}', ${sale[1]}],
                </c:forEach>
                ]);
            var options = {'title':'Sales by gender', 'width':400,'height':300};
                var chart = new google.visualization.PieChart(document.getElementById('gender'));
                chart.draw(dataGender, options);
           }
           </script>
           <script type="text/javascript">
              google.load('visualization', '1.0', {'packages':['corechart']});
              google.setOnLoadCallback(drawChart);
              function drawChart() {
              var dataMarital = new google.visualization.DataTable();
              dataMarital.addColumn('string', 'Name');
              dataMarital.addColumn('number', 'Number');
              dataMarital.addRows([
                <c:forEach items="${salesByMaritalStatus}" var="sale">
                    ['${sale[0].custId.custMaritalStatus}', ${sale[1]}],
                </c:forEach>
                ]);
            
              var options = {'title':'Sales by marital status', 'width':400,'height':300};
                var chart = new google.visualization.PieChart(document.getElementById('marital'));
                chart.draw(dataMarital, options);
           }
           </script>
           <script type="text/javascript">
              google.load('visualization', '1.0', {'packages':['corechart']});
              google.setOnLoadCallback(drawChart);
              function drawChart() {
              var dataIncome = new google.visualization.DataTable();
              dataIncome.addColumn('string', 'Name');
              dataIncome.addColumn('number', 'Number');
              dataIncome.addRows([
                <c:forEach items="${salesByIncome}" var="sale">
                    ['${sale[0].custId.custIncomeLevel}', ${sale[1]}],
                </c:forEach>
                ]);           
            
              var options = {'title':'Sales by income level', 'width':400,'height':300};
                var chart = new google.visualization.PieChart(document.getElementById('income'));
                chart.draw(dataIncome, options);
           }
        </script>
        <title>SupMarket</title>
        <title>Dashboard</title>
    </head>
    <body>
        <div class="container">
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
          
       <div class="row">
              <div class="sold">
                  <h4>Total Sales</h4>
                    <span><c:out value="${totalSales}" /></span>
                  
                  <h4>Total Amount Sold</h4>
                    <span><c:out value="${amountSold}" /></span>
              </div>
              
              <div class="soldProducts">
                  <h4>Best and Worst sold products</h4>
                  <div id="test"></div>
                  <table class="table">
                      <tr>
                          <th>Worst Sold Product</th>
                          <th>Quantity Sold</th>
                      </tr>
                      <c:forEach items="${worstSoldProduct}" var="sale">
                      <tr>
                                <td>
                                    <c:out value="${sale[0].prodId.prodName}" />
                                </td>
                                <td>
                                    <c:out value="${sale[1]}" />
                                </td>
                      </tr>
                   </c:forEach>
                      </tr>
                  </table>
              </div>
              <div id="channels">
                  <h4>Sales by channels</h4>
              </div>
              <div id="countries">
                  <h4>Sales by countries</h4>
              </div>
              <div>
                  <table class="table">
                      <tr>
                          <th>Country</th>
                          <th>Quantity Sold</th>
                      </tr>
                      
                        <c:forEach items="${salesByCountries}" var="sale">
                            <tr>
                            <td><c:out value="${sale[0].custId.countryId.countryName}" /></td>
                            <td><c:out value="${sale[1]}" /></td>
                            </tr>
                        </c:forEach>
                      
                  </table> 
              </div>
              <div id="gender"><h4>Sales by genders</h4></div>
              <div id="marital"><h4>Sales by marital status</h4></div>
              <div id="income">
                  <h4>Sales by income level</h4>
                  </div>
              <div>
                 <table class="table">
                      <tr>
                          <th>Product</th>
                          <th>Quantity Sold</th>
                      </tr>
                        <c:forEach items="${salesByIncome}" var="sale">
                            <tr>
                            <td><c:out value="${sale[0].custId.custIncomeLevel}" /></td>
                            <td><c:out value="${sale[1]}" /></td>
                            </tr>
                        </c:forEach>       
                  </table>  
              </div>
              <div>
                  <h4>Most loyal customers</h4>
                 <table class="table">
                      <tr>
                          <th>Customer</th>
                          <th>Quantity Sold</th>
                      </tr>
                      
                        <c:forEach items="${mostLoyal}" var="sale">
                            <tr>
                            <td><c:out value="${sale[0].custId.custFirstName} ${sale[0].custId.custLastName}" /></td>
                            <td><c:out value="${sale[1]}" /></td>
                            </tr>
                        </c:forEach>

                  </table>  
              </div>
              </div>
              
              <div>
                <form class="filter" method="get">
                    <select name="country">
                            <option value="">-- Country --</option>
                            <option value="52769">Singapore</option>
                            <option value="52770">Italy</option>
                            <option value="52771">China</option>
                            <option value="52772">Canada</option>
                            <option value="52773">Argentina</option>
                            <option value="52774">Australia</option>
                            <option value="52775">Brazil</option>
                            <option value="52776">Germany</option>
                            <option value="52777">Denmark</option>
                            <option value="52778">Spain</option>
                            <option value="52779">France</option>
                            <option value="52782">Japan</option>
                            <option value="52785">New Zealand</option>
                            <option value="52786">Poland</option>
                            <option value="52787">Saudi Arabia</option>
                            <option value="52788">Turkey</option>
                            <option value="52789">United Kingdom</option>
                            <option value="52790">United States of America</option>
                        </select>

                    <select name="gender">
                            <option value="">-- Gender --</option>
                            <option value="m">Male</option>
                            <option value="f">Female</option>
                    </select>

                    <select name="stauts">
                            <option value="">-- Marital Status --</option>
                            <option value="Divorc.">Divorc.</option>
                            <option value="divorced">divorced</option>
                            <option value="Mabsent">Mabsent</option>
                            <option value="Mar-AF">Mar-AF</option>
                            <option value="married">married</option>
                            <option value="NeverM">NeverM</option>
                            <option value="Separ.">Separ.</option>
                            <option value="single">single</option>
                            <option value="widow">widow</option>
                            <option value="Widowed">Widowed</option>
                        </select>

                    <select name="income">
                            <option value="">-- Income Level --</option>
                            <option value="A: Below 30,000">A: Below 30,000</option>
                            <option value="B: 30,000 - 49,999">B: 30,000 - 49,999</option>
                            <option value="C: 50,000 - 69,999">C: 50,000 - 69,999</option>
                            <option value="D: 70,000 - 89,999">D: 70,000 - 89,999</option>
                            <option value="E: 90,000 - 109,999">E: 90,000 - 109,999</option>
                            <option value="F: 110,000 - 129,999">F: 110,000 - 129,999</option>
                            <option value="G: 130,000 - 149,999">G: 130,000 - 149,999</option>
                            <option value="H: 150,000 - 169,999">H: 150,000 - 169,999</option>
                            <option value="I: 170,000 - 189,999">I: 170,000 - 189,999</option>
                            <option value="J: 190,000 - 249,999">J: 190,000 - 249,999</option>
                            <option value="K: 250,000 - 299,999">K: 250,000 - 299,999</option>
                            <option value="L: 300,000 and above">L: 300,000 and above</option>
                        </select>


                    <button class="btn" type="submit" value="Filter">Filter</button>
                </form>
            </div>
       </div>
                       
    </body>
</html>
