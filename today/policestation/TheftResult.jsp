<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Theft Report Submitted</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container mt-5">
    <h2>Theft Report Details</h2>
    <ul class="list-group">
      <li class="list-group-item">Name: ${param.name}</li>
      <li class="list-group-item">Mobile: ${param.mobile}</li>
      <li class="list-group-item">Age: ${param.age}</li>
      <li class="list-group-item">Address: ${param.address}</li>
      <li class="list-group-item">Location: ${param.location}</li>
      <li class="list-group-item">Item: ${param.item}</li>
      <li class="list-group-item">Lost On: ${param.lostOn}</li>
    </ul>
  </div>
</body>
</html>
