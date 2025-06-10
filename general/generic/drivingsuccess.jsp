<%@ page import="com.xworkz.dto.DrivingLicenseDTO" %>
<%
    DrivingLicenseDTO dl = (DrivingLicenseDTO) request.getAttribute("dl");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Driving License Success</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Driving License Application Submitted</h2>
    <p><strong>Name:</strong> <%= dl.getName() %></p>
    <p><strong>Address:</strong> <%= dl.getAddress() %></p>
    <p><strong>Mobile:</strong> <%= dl.getMobile() %></p>
    <p><strong>Applied Date:</strong> <%= dl.getAppliedDate() %></p>
    <p><strong>Vehicle Type:</strong> <%= dl.getVehicleType() %></p>
</div>
</body>
</html>
