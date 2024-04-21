<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Latest Non-Zero Meter Reading</title>
</head>
<body>
    <h2>Latest Non-Zero Meter Reading</h2>
    <c:if test="${latestNonZeroReading ne null}">
        <p>Reading: ${latestNonZeroReading.reading}</p>
        <p>Time: ${latestNonZeroReading.time}</p>
    </c:if>
    <p><a href="/">Home Page</a></p>
</body>
</html>