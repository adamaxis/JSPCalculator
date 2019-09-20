<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The World's Worst Calculator</title>
</head>
<body>
<h1>Calculate</h1>
<form action="DoCalculation" method="post">
<label><input type="text" name="field1" size="10">Number</label><br>
<label><input type="text" name="field2" size="10">Power</label><br>
<input type="hidden" name="operator" value="power">
<input type="submit" value="Calculate Power" /><br>
<a href="index.jsp">Simple calculations</a>
</form>
</body>
</html>