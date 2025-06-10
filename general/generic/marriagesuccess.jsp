<%@ page import="com.xworkz.dto.MarriageCertificateDTO" %>
<%
    MarriageCertificateDTO marriage = (MarriageCertificateDTO) request.getAttribute("marriage");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Marriage Certificate Submitted</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Marriage Certificate Application Submitted</h2>
    <p><strong>Groom Name:</strong> <%= marriage.getGroomName() %></p>
    <p><strong>Bride Name:</strong> <%= marriage.getBrideName() %></p>
    <p><strong>Location:</strong> <%= marriage.getLocation() %></p>
    <p><strong>Address:</strong> <%= marriage.getAddress() %></p>
    <p><strong>Religion:</strong> <%= marriage.getReligion() %></p>
    <p><strong>Date:</strong> <%= marriage.getDate() %></p>
    <p><strong>Witness 1:</strong> <%= marriage.getWitness1() %></p>
    <p><strong>Witness 2:</strong> <%= marriage.getWitness2() %></p>
    <p><strong>Officer Present:</strong> <%= marriage.getOfficer() %></p>
</div>
</body>
</html>
