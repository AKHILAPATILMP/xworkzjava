<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Missing Person Report Result</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container mt-5">
    <h2>Missing Person Details</h2>
    <ul class="list-group">
      <li class="list-group-item">Name: ${param.missingPersonName}</li>
      <li class="list-group-item">Complaintee Mobile: ${param.complainteeMobile}</li>
      <li class="list-group-item">Age: ${param.missingPersonAge}</li>
      <li class="list-group-item">Address: ${param.address}</li>
      <li class="list-group-item">Last Seen Location: ${param.location}</li>
      <li class="list-group-item">Marks: ${param.marks}</li>
      <li class="list-group-item">Gender: ${param.gender}</li>
      <li class="list-group-item">Languages Known: ${param.languageKnown}</li>
    </ul>
  </div>
</body>
</html>
