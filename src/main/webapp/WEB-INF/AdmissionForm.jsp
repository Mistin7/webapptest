<%--
  Created by IntelliJ IDEA.
  User: chekuninalexey
  Date: 21.06.17
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Student admission form for engineering courses</h1>
    <form action="/submitAdmissionForm.html" method="post">
        <p>Student's name <input type="text" name="studentName" /></p>
        <p>Student's hobby <input type="text" name="studentHobby" /></p>
        <input type="submit" value="Submit!" />
    </form>
</body>
</html>
