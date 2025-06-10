<%@ page import="com.xworkz.dto.DeathCertificateDTO" %>
<%
    DeathCertificateDTO death = (DeathCertificateDTO) request.getAttribute("death");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Death Certificate Success</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Death Certificate Submitted</h2>
    <p><strong>Name:</strong> <%= death.getName() %></p>
    <p><strong>Cause:</strong> <%= death.getCause() %></p>
    <p><strong>Date:</strong> <%= death.getDate() %></p>
    <p><strong>Time:</strong> <%= death.getTime() %></p>
    <p><strong>Age at Death:</strong> <%= death.getAge() %></p>
    <p><strong>Certified By:</strong> <%= death.getCertifiedBy() %></p>
    <p><strong>Hospital Name:</strong> <%= death.getHospitalName() %></p>
    <p><strong>Manner of Death:</strong> <%= death.getMannerOfDeath() %></p>
    <p><strong>Gender:</strong> <%= death.getGender() %></p>
    <p><strong>Marks:</strong> <%= death.getMarks() %></p>
</div>
</body>
</html>
