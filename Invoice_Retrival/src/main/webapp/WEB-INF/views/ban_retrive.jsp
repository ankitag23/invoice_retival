<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../views/jsp/fragments/header.jsp" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form name="f1" method="get" action="ban_details">
<select name="Bandropdown">
<c:forEach items="${ban_details}" var="Ban_Dt">
<option value=${Ban_Dt.ban_number}>${Ban_Dt.ban_number}</option>
</c:forEach>
</select>

<select name="Cycledropdown">
<c:forEach items="${ban_details}" var="Ban_Dt">
<option value=${Ban_Dt.cycle_code}>${Ban_Dt.cycle_code}</option>
</c:forEach>
</select>
<select name="Monthdropdown">
<c:forEach items="${ban_details}" var="Ban_Dt">
<option value=${Ban_Dt.cycle_month}>${Ban_Dt.cycle_month}</option>
</c:forEach>
</select>

<select name="Yeardropdown">
<c:forEach items="${ban_details}" var="Ban_Dt">
<option value=${Ban_Dt.cycle_year}>${Ban_Dt.cycle_year}</option>
</c:forEach>
<input type="submit" name="GetBan Details" value="Get BanDetail" onclick="location.href='/a/''"/>
 <spring:url value="/submitTask/${Ban_Dt.cycle_year}/submit" var="updateUrl" />
 <button class="btn btn-primary" onclick="location.href='/a/''">Submit</button>
</form>
<% 
String ban= request.getParameter("Bandropdown");
String year= request.getParameter("Yeardropdown");
String month= request.getParameter("Monthdropdown");
String code= request.getParameter("Cycledropdown");
out.println("Selected Ban  is : "+ban + "\n");
out.println("<br/>");
out.println("Selected Year  is : \n"+year);
out.println("<br/>");
out.println("Selected Month  is : "+month);
out.println("<br/>");
out.println("Selected Code  is : "+code);
%>

</select>
<table border="1" >
<tr>
<th>Ban</th>
<th width="70">Cycle_Code</th>
<th width="70">Cycle_Month</th>
<th width="70">Cycle_Year</th>
<th width="70">Cycle_Region</th>
<th width="70">Ban Details</th>
</tr>

<c:forEach items="${ban_details}" var="Ban_Dt">
<tr>
<td align="right">${Ban_Dt.ban_number}</td>
<td align="right">${Ban_Dt.cycle_code}</td>
<td align="right">${Ban_Dt.cycle_month}</td>
<td align="right">${Ban_Dt.cycle_year}</td>
<td align="right">${Ban_Dt.region}</td>
<td>
			 <spring:url value="/BanDetails/${Ban_Dt.ban_number}/submit" var="updateUrl" />
			 <button class="btn btn-primary"
                                          onclick="location.href='/a'">Ban Details</button>
			</td>
</tr>
</c:forEach>

</table>
</body>
</html>