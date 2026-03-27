<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Result is: ${result}</h2>
<h2>Result by JSP = <%= request.getAttribute("result") %></h2>

</body>
</html>