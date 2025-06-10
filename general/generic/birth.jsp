<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Birth Certificate Form</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Birth Certificate Form</h2>
    <form action="general" method="post">
        <div class="mb-3">
            <label>Birth ID:</label>
            <input type="text" name="birthId" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>Hospital Name:</label>
            <select name="hospitalName" class="form-select">
                <option>City Hospital</option>
                <option>District Hospital</option>
                <option>Private Clinic</option>
            </select>
        </div>
        <div class="mb-3">
            <label>Father's Name:</label>
            <input type="text" name="fatherName" class="form-control" />
        </div>
        <div class="mb-3">
            <label>Mother's Name:</label>
            <input type="text" name="motherName" class="form-control" />
        </div>
        <div class="mb-3">
            <label>Date and Time of Birth:</label>
            <input type="datetime-local" name="birthDateTime" class="form-control" />
        </div>
        <div class="mb-3">
            <label>Doctor Name:</label>
            <input type="text" name="doctorName" class="form-control" />
        </div>
        <div class="mb-3">
            <label>Nurse Name:</label>
            <input type="text" name="nurseName" class="form-control" />
        </div>
        <div class="mb-3">
            <label>Hospital Type:</label>
            <select name="hospitalType" class="form-select">
                <option>Government</option>
                <option>Private</option>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</div>
</body>
</html>
