<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Missing Person Report</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container mt-5">
    <h2>Report Missing Person</h2>
    <form action="missing" method="post">
      <div class="mb-3"><input type="text" name="missingPersonName" class="form-control" placeholder="Missing Person's Name" required></div>
      <div class="mb-3"><input type="text" name="complainteeMobile" class="form-control" placeholder="Your Mobile" required></div>
      <div class="mb-3"><input type="number" name="missingPersonAge" class="form-control" placeholder="Age" required></div>
      <div class="mb-3"><input type="text" name="address" class="form-control" placeholder="Address" required></div>
      <div class="mb-3"><input type="text" name="location" class="form-control" placeholder="Last Seen Location" required></div>
      <div class="mb-3"><input type="text" name="marks" class="form-control" placeholder="Identifiable Marks" required></div>
      <div class="mb-3">
        <select class="form-select" name="gender" required>
          <option value="" disabled selected>Select Gender</option>
          <option>Male</option>
          <option>Female</option>
          <option>Other</option>
        </select>
      </div>
      <div class="mb-3"><input type="text" name="languageKnown" class="form-control" placeholder="Languages Known" required></div>
      <button type="submit" class="btn btn-warning">Submit</button>
    </form>
  </div>
</body>
</html>
