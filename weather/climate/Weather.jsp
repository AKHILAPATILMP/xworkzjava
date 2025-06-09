<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Weather Input</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-primary text-white">
            <h4>Record Weather Data</h4>
        </div>
        <div class="card-body">

            <form action="weather" method="post">
                <div class="mb-3">
                    <label class="form-label">Location</label>
                    <input type="text" class="form-control" name="location" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Captured By</label>
                    <input type="text" class="form-control" name="capturedBy" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Temperature (°C)</label>
                    <input type="number" class="form-control" name="temp" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Recorded Date</label>
                    <input type="date" class="form-control" name="recordedDate" required>
                </div>
                <button type="submit" class="btn btn-success">Record</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
