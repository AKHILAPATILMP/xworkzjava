<%@ page import="com.xworkz.dto.BirthCertificateDTO" %>
<%
    BirthCertificateDTO birth = (BirthCertificateDTO) request.getAttribute("birth");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Birth Certificate Submitted</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Birth Certificate Submitted Successfully</h2>
    <p><strong>Birth ID:</strong> <%= birth.getBirthId() %></p>
    <p><strong>Hospital:</strong> <%= birth.getHospitalName() %></p>
    <p><strong>Father's Name:</strong> <%= birth.getFatherName() %></p>
    <p><strong>Mother's Name:</strong> <%= birth.getMotherName() %></p>
    <p><strong>Birth DateTime:</strong> <%= birth.getBirthDateTime() %></p>
    <p><strong>Doctor:</strong> <%= birth.getDoctorName() %></p>
    <p><strong>Nurse:</strong> <%= birth.getNurseName() %></p>
    <p><strong>Hospital Type:</strong> <%= birth.getHospitalType() %></p>
</div>
</body>
</html>
