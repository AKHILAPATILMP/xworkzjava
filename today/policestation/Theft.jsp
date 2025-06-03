<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Theft Report</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container mt-5">
    <h2>Report Theft</h2>
    <form action="theft" method="post">
      <div class="mb-3"><input type="text" name="name" class="form-control" placeholder="Your Name" required></div>
      <div class="mb-3"><input type="text" name="mobile" class="form-control" placeholder="Mobile Number" required></div>
      <div class="mb-3"><input type="number" name="age" class="form-control" placeholder="Age" required></div>
      <div class="mb-3"><input type="text" name="address" class="form-control" placeholder="Address" required></div>
      <div class="mb-3"><input type="text" name="location" class="form-control" placeholder="Location of Theft" required></div>
      <div class="mb-3"><input type="text" name="item" class="form-control" placeholder="Stolen Item" required></div>
      <div class="mb-3"><input type="date" name="lostOn" class="form-control" required></div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>
</body>
</html>
