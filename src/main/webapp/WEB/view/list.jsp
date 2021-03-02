<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 3/2/2021
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculater</title>
</head>
<body>
<form method="post">
<h1>Caculater</h1>
<input type="number" name="mot"><br>
<input type="number" name="hai"><br>
<input type="submit" value="+" name="s">
<input type="submit" value="-" name="s">
<input type="submit" value="*" name="s">
<input type="submit" value="/" name="s">
</form>

<h1>Result: ${rusult} </h1>

</body>
</html>
