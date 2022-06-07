<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html>
<head>
<title> <h2> Student Registration Form </h2> </title>

</head>
<body>

     <form:form action="processForm" modelAttribute="student">
     First Name : <form:input path="firstName"/>
      <br><br>
      
     Last Name: <form:input path="lastNmae"/>
      <br><br>
      
      <input type="Submit" value ="submit"/>
    
       </form:form>
</body>



</html>