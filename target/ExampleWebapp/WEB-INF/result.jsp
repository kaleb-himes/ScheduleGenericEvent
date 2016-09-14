<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="application/json; charset=UTF-8">
    <title>Schedule</title>
</head>
<body>
<h2>Schedule of Events</h2>

    Dates: ${dates}
    <br />
    <br />
    <a href ="http://localhost:9090">Return to Home Page</a>
    <br />
    <br />
    <a href = "/web/events.html">Click to add another event</a>
</body>
</html>
