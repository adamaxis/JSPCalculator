<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
Result: <em>${results.getResult()}</em>
<p>${results} contains the following: <br />
${results.getNumberOne()} first number <br />
${results.getNumberTwo()} second number <br />
${results.getOperator()} operator <br />
${results.getResult()} result <br />
</p>
<a href="index.jsp">Perform another calculation...</a>

</body>
</html>