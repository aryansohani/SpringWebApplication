<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Result is: ${result}</h2>
<h2>Result by jsp = <%= session.getAttribute("result")%>

</body>
</html>