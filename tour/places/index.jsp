<!DOCTYPE html>
<html>
<head>
    <title>Tourism Certificate Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Tourism Certificate Application</h2>
    <form action="tourism" method="post" class="border p-4 shadow rounded">
        <div class="mb-3">
            <label class="form-label">Applicant Name:</label>
            <input type="text" name="applicantName" class="form-control" required />
        </div>
        <div class="mb-3">
            <label class="form-label">Destination:</label>
            <input type="text" name="destination" class="form-control" required />
        </div>
        <div class="mb-3">
            <label class="form-label">Travel Date:</label>
            <input type="date" name="travelDate" class="form-control" required />
        </div>
        <div class="mb-3">
            <label class="form-label">Return Date:</label>
            <input type="date" name="returnDate" class="form-control" required />
        </div>
        <div class="mb-3">
            <label class="form-label">Guide Name:</label>
            <input type="text" name="guideName" class="form-control" required />
        </div>
        <button type="submit" class="btn btn-success w-100">Apply</button>
    </form>
</div>
</body>
</html>
