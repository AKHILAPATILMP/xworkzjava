<%@ page import="com.xworkz.dto.PassportApplicationDTO" %>
<%
    PassportApplicationDTO passport = (PassportApplicationDTO) request.getAttribute("passport");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Passport Application Success</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Passport Application Submitted</h2>
    <p><strong>Applicant Name:</strong> <%= passport.getApplicantName() %></p>
    <p><strong>Aadhar No:</strong> <%= passport.getAadharNo() %></p>
    <p><strong>Address:</strong> <%= passport.getAddress() %></p>
    <p><strong>PAN No:</strong> <%= passport.getPanNo() %></p>
    <p><strong>Country:</strong> <%= passport.getCountry() %></p>
    <p><strong>State:</strong> <%= passport.getState() %></p>
    <p><strong>City:</strong> <%= passport.getCity() %></p>
    <p><strong>Pin Code:</strong> <%= passport.getPinCode() %></p>
    <p><strong>Passport Type:</strong> <%= passport.getPassportType() %></p>
    <p><strong>Payment Ref No:</strong> <%= passport.getPaymentRefNo() %></p>
</div>
</body>
</html>
