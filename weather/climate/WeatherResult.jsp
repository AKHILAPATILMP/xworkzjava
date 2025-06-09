<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.weather.WeatherDTO" %>
<jsp:useBean id="weather" type="com.weather.WeatherDTO" scope="request" />
<!DOCTYPE html>
<html>
<head>
    <title>Weather Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-info text-white">
            <h4>Weather Data Recorded</h4>
        </div>
        <div class="card-body">
            <p><strong>Location:</strong> ${weather.location}</p>
            <p><strong>Captured By:</strong> ${weather.capturedBy}</p>
            <p><strong>Temperature:</strong> ${weather.temp} °C</p>
            <p><strong>Recorded Date:</strong> ${weather.recordedDate}</p>
            <a href="Weather.jsp" class="btn btn-primary mt-3">Record Another</a>
        </div>
    </div>
</div>
</body>
</html>
