<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save Meter Reading</title>
</head>
<body>
    <h2>Enter Meter Reading</h2>
    <form action="save-meter-reading" method="post">
        <label for="reading">Reading:</label>
        <input type="text" id="reading" name="reading" required><br><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
