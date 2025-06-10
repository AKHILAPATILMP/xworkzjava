<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Death Certificate</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Death Certificate Application</h2>
    <form action="deathCertificate" method="post">
        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="name" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Cause of Death:</label>
            <input type="text" name="cause" class="form-control">
        </div>

        <div class="mb-3">
            <label>Date:</label>
            <input type="date" name="date" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Time:</label>
            <input type="time" name="time" class="form-control" required>
        </div>

        <div class="mb-3">
            <label>Age at Death:</label>
            <input type="text" name="age" class="form-control">
        </div>

        <div class="mb-3">
            <label>Certified By:</label>
            <input type="text" name="certifiedBy" class="form-control">
        </div>

        <div class="mb-3">
            <label>Hospital Name:</label>
            <input type="text" name="hospitalName" class="form-control">
        </div>

        <div class="mb-3">
            <label>Manner of Death:</label>
            <input type="text" name="mannerOfDeath" class="form-control">
        </div>

        <div class="mb-3">
            <label>Gender:</label>
            <select name="gender" class="form-select">
                <option>Male</option>
                <option>Female</option>
                <option>Other</option>
            </select>
        </div>

        <div class="mb-3">
            <label>Marks (if any):</label>
            <input type="text" name="marks" class="form-control">
        </div>

        <button type="submit" class="btn btn-danger">Submit Application</button>
    </form>
</div>
</body>
</html>
