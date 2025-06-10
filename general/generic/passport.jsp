<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Passport Application Form</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Passport Application Form</h2>
    <form action="passportApplication" method="post">
        <div class="mb-3">
            <label>Applicant Name:</label>
            <input type="text" name="applicantName" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Aadhar No:</label>
            <input type="text" name="aadharNo" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Address:</label>
            <input type="text" name="address" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>PAN No:</label>
            <input type="text" name="panNo" class="form-control">
        </div>

        <div class="mb-3">
            <label>Country:</label>
            <input type="text" name="country" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>State:</label>
            <input type="text" name="state" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>City:</label>
            <input type="text" name="city" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Pin Code:</label>
            <input type="text" name="pinCode" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Passport Type:</label>
            <select name="passportType" class="form-select">
                <option>Normal</option>
                <option>Tatkal</option>
            </select>
        </div>

        <div class="mb-3">
            <label>Payment Reference No:</label>
            <input type="text" name="paymentRefNo" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-primary">Submit Application</button>
    </form>
</div>
</body>
</html>
