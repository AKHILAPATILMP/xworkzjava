<%@ page import="com.xworkz.dto.JobApplicationDTO" %>
<%
    JobApplicationDTO job = (JobApplicationDTO) request.getAttribute("job");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Application Submitted</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Application Submitted Successfully</h2>
    <p><strong>Name:</strong> <%= job.getName() %></p>
    <p><strong>Email:</strong> <%= job.getEmail() %></p>
    <p><strong>Education:</strong> <%= job.getEducation() %></p>
    <p><strong>Skills:</strong> <%= job.getSkills() %></p>
    <p><strong>Expected Salary:</strong> <%= job.getExpectedSalary() %></p>
    <p><strong>Experience:</strong> <%= job.getExperience() %></p>
</div>
</body>
</html>
