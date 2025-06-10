<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Application Form</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Job Application Form</h2>
    <form action="jobApplication" method="post">
        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="name" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>Email:</label>
            <input type="email" name="email" class="form-control" required />
        </div>
        <div class="mb-3">
            <label>Education:</label>
            <select name="education" class="form-select">
                <option>B.E</option>
                <option>BCA</option>
                <option>B.Sc</option>
                <option>MCA</option>
            </select>
        </div>
        <div class="mb-3">
            <label>Skills:</label>
            <input type="text" name="skills" class="form-control" />
        </div>
        <div class="mb-3">
            <label>Expected Salary:</label>
            <input type="text" name="expectedSalary" class="form-control" />
        </div>
        <div class="mb-3">
            <label>Experience:</label>
            <select name="experience" class="form-select">
                <option>Fresher</option>
                <option>1-2 Years</option>
                <option>3-5 Years</option>
                <option>5+ Years</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Apply</button>
    </form>
</div>
</body>
</html>
