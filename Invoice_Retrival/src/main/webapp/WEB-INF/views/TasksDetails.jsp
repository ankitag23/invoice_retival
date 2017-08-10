<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../views/jsp/fragments/header.jsp" />
<html>
<head>

<style>           
.blue-button{
	background: #34495E;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
 border-collapse: collapse;
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 80%;
}
th {
  background: #566573;
  color: white;
  border: 0.5px solid gray;
}
 td{
 				border: 1px solid #d6dde6;
  				padding: 0.3em;
                border: 0.1px solid gray;
                width: 25%;
                text-align: left;
               
            }
   tr:nth-child(odd) {
  background-color: #ECF0F1;
  color: #000000;
}
</style>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
       <script>
    $(document).ready(function() {
      $("#datepicker").datepicker();
    });
    </script>
</head>
<body  background="<c:url value="/static/Images/pp1.jpg"/>">
<c:if test="${user_type == 'admin'}">
<h3>Welcome ${name}</h3>
<form:form method="post" modelAttribute="tasks" action="/Project_Managment/addTask">

     <table >
		<tr>
			<th colspan="2">Add Task</th>
		</tr>
		<tr>
		 <td><form:label path="application"><b>Application:</b></form:label></td>
         <td><form:input path="application"></form:input></td>
        </tr>
		<tr>
		  <td><form:label path="project"><b>Project:</b></form:label></td>
          <td><form:input path="project"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="emp_name"><b>Assigned to :</b></form:label></td>
          <td><form:input path="emp_name"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="task_description"><b>Task Details:</b></form:label></td>
          <td><form:input path="task_description"></form:input></td>
		</tr>
			<tr>
		  <td><form:label path="Task_Due_Date"><b>Task Due Date:</b></form:label></td>
          <td><form:input type="date" path="Task_Due_Date" format="dd/MM/yyyy" ></form:input></td>
                    </tr>
				<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</c:if>

<h3>Task List</h3>
<c:if test="${!empty listOfTasks}">
	<table class="table table-striped">
	<thead>
	<thead>
	<tr>
		<th width="120">Application</th>
		<th width="120">Project</th>
		<th width="200">Assigned to </th>
		<th width="120">task_description</th>
		<th width="120">Due_Date</th>
		<th width="120">Completed ??</th>
		</tr>
		</thead>
		
	<c:forEach items="${listOfTasks}" var="Task">
		<tr>
		<c:if test="${now} lt ${Task.task_Due_Date}" >
		<style>
		tr:nth-child(odd) {
  background-color: #d6dde6;
  color: #000000;
}</style>
		</c:if>
			<td>${Task.application}</td>
			<td>${Task.project}</td>
			<td>${Task.emp_name}</td>
			<td>${Task.task_description}</td>
			<td>${Task.task_Due_Date}</td>
			 <td style="display:none;">
			 <input name="task_id" type="text" value="${Task.task_Id}" />
			 </td>
			 	<td>
			 <spring:url value="/submitTask/${Task.task_Id}/submit" var="updateUrl" />
			 <button class="btn btn-primary"
                                          onclick="location.href='${updateUrl}'">Submit</button>
			</td>
			</tr>   
	</c:forEach>
			
	</table>
</c:if>

</body>
</html>
