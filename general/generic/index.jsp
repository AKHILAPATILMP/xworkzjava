<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>General Application Portal</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<center>
<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">General Forms</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <!-- Job Application -->
                <li class="nav-item">
                    <a class="nav-link" href="job.jsp">Job Application</a>
                </li>

                <!-- Birth Certificate -->
                <li class="nav-item">
                    <a class="nav-link" href="birth.jsp">Birth Certificate</a>
                </li>

                <!-- Passport -->
                <li class="nav-item">
                    <a class="nav-link" href="passport.jsp">Passport</a>
                </li>

                <!-- Death Certificate -->
                <li class="nav-item">
                    <a class="nav-link" href="death.jsp">Death Certificate</a>
                </li>

                <!-- Driving License -->
                <li class="nav-item">
                    <a class="nav-link" href="driving.jsp">Driving License</a>
                </li>

                <!-- Marriage Certificate -->
                <li class="nav-item">
                    <a class="nav-link" href="marriage.jsp">Marriage Certificate</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Welcome Section -->
<div class="container mt-5">
    <h2>Welcome to the General Application Portal</h2>
    <p>Select an application from the navigation bar above to proceed.</p>
</div>

<!-- Bootstrap JS (for navbar collapse) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</center>
</body>
</html>
