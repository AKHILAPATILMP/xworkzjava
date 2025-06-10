<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Marriage Certificate</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Marriage Certificate Application</h2>
    <form action="marriageCertificate" method="post">
        <div class="mb-3">
            <label>Groom Name:</label>
            <input type="text" name="groomName" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Bride Name:</label>
            <input type="text" name="brideName" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Marriage Location:</label>
            <input type="text" name="location" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Address:</label>
            <textarea name="address" class="form-control" required></textarea>
        </div>
        <div class="mb-3">
            <label>Religion:</label>
            <input type="text" name="religion" class="form-control">
        </div>
        <div class="mb-3">
            <label>Date:</label>
            <input type="date" name="date" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Witness 1:</label>
            <input type="text" name="witness1" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Witness 2:</label>
            <input type="text" name="witness2" class="form-control" required>
        </div>
        <div class="mb-3">
            <label>Officer Present:</label>
            <input type="text" name="officer" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-success">Submit Application</button>
    </form>
</div>
</body>
</html>
