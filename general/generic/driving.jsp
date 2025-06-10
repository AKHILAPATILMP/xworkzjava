<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Driving License Application</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Driving License Application</h2>
    <form action="drivingLicense" method="post">
        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="name" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Address:</label>
            <textarea name="address" class="form-control" required></textarea>
        </div>

        <div class="mb-3">
            <label>Mobile Number:</label>
            <input type="text" name="mobile" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Applied Date:</label>
            <input type="date" name="appliedDate" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Vehicle Type:</label>
            <select name="vehicleType" class="form-select" required>
                <option>Two-Wheeler</option>
                <option>Four-Wheeler</option>
                <option>Heavy Vehicle</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
