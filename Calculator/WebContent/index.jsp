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
<label><input type="text" name="field1" size="10">Field 1</label><br>
<label><input type="radio" name="operator" value="add" size="10">+</label>
<label><input type="radio" name="operator" value="subtract" size="10">-</label>
<label><input type="radio" name="operator" value="multiply" size="10">*</label>
<label><input type="radio" name="operator" value="divide" size="10">/</label><br>
<label><input type="text" name="field2" size="10">Field 2</label><br>
Please choose an operation to perform on the two numbers:<br>
<input type="submit" value="Do Calculation" /><br>
<a href="index2.jsp">Calculate power instead</a>
</form>
</body>
</html>