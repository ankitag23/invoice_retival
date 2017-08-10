<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style> 
table { 
width: 30%;
background: Black;
opacity: .4;
position:absolute;
           top:50%;
           left:57%; 
           height:35%;

}
th,td { 
font-style: normal;
color: white;
}
</style>
<title>Login Page</title>
</head>
<body background="<c:url value="/static/Images/pp.jpg"/>" >
       <form action="/Project_Managment/login" method="POST">
     <table  >
		<tr>
		      <a href="https://s3.amazonaws.com/testpdfeast/h_interview.pdf">PDF File</a>
			<th colspan="2"><b3>Welcome to Task Managment</b3></th>
		</tr>
    <tr>
      <td> <label>Name : </label> </td>
       <td> <input name="name" type="text" /></td>
       </tr>
       <tr>
         <td><label>Password :</label> </td>
        <td> <input name="password" type="password" /></td>
           <tr>
           <td >
         <input type="submit" /></td>
         </tr>
         </table>
    </form>
</body>
</html>