<!DOCTYPE html>
<html>
<head>
    <title>Tourism Certificate Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="alert alert-success shadow rounded">
        <h2 class="mb-4">Tourism Application Submitted Successfully!</h2>
        <p><strong>Applicant Name:</strong> ${tourism.applicantName}</p>
        <p><strong>Destination:</strong> ${tourism.destination}</p>
        <p><strong>Travel Date:</strong> ${tourism.travelDate}</p>
        <p><strong>Return Date:</strong> ${tourism.returnDate}</p>
        <p><strong>Guide Name:</strong> ${tourism.guideName}</p>
        <p><strong>Status:</strong> ${result}</p>
    </div>
</div>
</body>
</html>
